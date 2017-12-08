package de.misterY.client;

import java.util.ArrayList;

import de.misterY.Map;
import de.misterY.Player;
import de.misterY.net.Client;
import de.misterY.net.PROTOCOL;

public class GameClient extends Client {

	private Runnable updateRunnable;
	private ArrayList<Player> players = new ArrayList<Player>();
	private Map map;

	public GameClient(String serverIP, int serverPort) {
		super(serverIP, serverPort);
	}

	@Override
	public void processMessage(String message) {
		System.out.println(message);
		String[] msgParts = message.split(PROTOCOL.SPLIT);

		switch (msgParts[0]) {
		case PROTOCOL.SC.ERROR:

			break;
		case PROTOCOL.SC.OK:

			break;
		case PROTOCOL.SC.CHAT_UPDATE:

			break;
		case PROTOCOL.SC.INFO_UPDATE:
			handleInfoUpdate(msgParts);
			break;
		case PROTOCOL.SC.MAP:
			map = new Map(msgParts[1]);
			break;
		case PROTOCOL.SC.TURN:

			break;
		case PROTOCOL.SC.PLAYER_LEFT:

			break;

		default:
			break;
		}
		if (updateRunnable != null) {
			updateRunnable.run();
		}
	}

	private void handleInfoUpdate(String[] msgParts) {
		String name = msgParts[1];
		int taxiTickets = Integer.parseInt(msgParts[2]);
		int busTickets = Integer.parseInt(msgParts[3]);
		int undergroundTickets = Integer.parseInt(msgParts[4]);
		int currentStationId = Integer.parseInt(msgParts[5]);
		boolean isMrY = Boolean.parseBoolean(msgParts[6]);

		Player player = null;
		for (Player p : players) {
			if (p.getName().equals(name)) {
				player = p;
				break;
			}
		}
		if (player == null) {
			player = new Player(name);
			player.setMap(map);
			players.add(player);
		}
		player.setTaxiTickets(taxiTickets);
		player.setBusTickets(busTickets);
		player.setUndergroundTickets(undergroundTickets);
		player.setCurrentStation(map.getStationById(currentStationId));
		player.setMrY(isMrY);
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setUpdateRunnable(Runnable updateRunnable) {
		this.updateRunnable = updateRunnable;
	}

	public Map getMap() {
		return map;
	}
}
