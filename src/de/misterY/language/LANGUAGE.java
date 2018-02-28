package de.misterY.language;

public final class LANGUAGE {

	public static final String EN = "en", DE = "de";

	public static String LOGIN,
				OPTIONS,
				READY,
				STR_LANGUAGE,
				STR_ENGLISH,
				STR_GERMAN,
				CHAT,
				ROUNDSINFO,
				SEND,
				PLAYERINFO,
				CONNECTING,
				CONNECTED,
				CONNECTIONFAILED,
				MISTERYWON,
				DETECTIVESWON,
				FOUNDMISTERY,
				USERNAMEALREADYINUSE,
				MOVEMENTISINVALID,
				INVALIDMOVEMENT,
				ERROROCURRED,
				ERRORCODE,
				ERROR,
				GAMENOTSTARTEDYET,
				ITIS,
				PLAYERSTURN,
				NOTYOURTURN,
				CHOOSEMEANSOFTRANSPORTATION,
				NAME,
				TAXITICKETS,
				BUSTICKETS,
				UNDERGROUNDTICKETS,
				MRY,
				TURN,
				ROUND,
				MISTERYSHOWS,
				MISTERYUSEDTICKETS,
				ALREADYLOGGEDIN,
				CONNECTIONNEEDED,
				ENTERUSERNAME,
				LOGGEDIN,
				SKIP,
				CONNECT,
				ALREADYCONNECTEDTO,
				ENTERIP,
				CHECKIPFORMAT;

	public static void loadLanguage(String lang) {
		switch (lang) {

		case LANGUAGE.EN:
			LOGIN = LANGUAGE.ENGLISH.LOGIN;
			OPTIONS = LANGUAGE.ENGLISH.OPTIONS;
			READY = LANGUAGE.ENGLISH.READY;
			STR_LANGUAGE = LANGUAGE.ENGLISH.STR_LANGUAGE;
			STR_ENGLISH = LANGUAGE.ENGLISH.STR_ENGLISH;
			STR_GERMAN = LANGUAGE.ENGLISH.STR_GERMAN;
			CHAT = LANGUAGE.ENGLISH.CHAT;
			ROUNDSINFO = LANGUAGE.ENGLISH.ROUNDSINFO;
			SEND = LANGUAGE.ENGLISH.SEND;
			PLAYERINFO = LANGUAGE.ENGLISH.PLAYERINFO;
			CONNECTING = LANGUAGE.ENGLISH.CONNECTING;
			CONNECTED = LANGUAGE.ENGLISH.CONNECTED;
			CONNECTIONFAILED = LANGUAGE.ENGLISH.CONNECTIONFAILED;
			MISTERYWON = LANGUAGE.ENGLISH.MISTERYWON;
			DETECTIVESWON = LANGUAGE.ENGLISH.DETECTIVESWON;
			FOUNDMISTERY = LANGUAGE.ENGLISH.FOUNDMISTERY;
			USERNAMEALREADYINUSE = LANGUAGE.ENGLISH.USERNAMEALREADYINUSE;
			MOVEMENTISINVALID = LANGUAGE.ENGLISH.MOVEMENTISINVALID;
			INVALIDMOVEMENT = LANGUAGE.ENGLISH.INVALIDMOVEMENT;
			ERROROCURRED = LANGUAGE.ENGLISH.ERROROCURRED;
			ERRORCODE = LANGUAGE.ENGLISH.ERRORCODE;
			ERROR = LANGUAGE.ENGLISH.ERRORCODE;
			GAMENOTSTARTEDYET = LANGUAGE.ENGLISH.GAMENOTSTARTEDYET;
			ITIS = LANGUAGE.ENGLISH.ITIS;
			PLAYERSTURN = LANGUAGE.ENGLISH.PLAYERSTURN;
			NOTYOURTURN = LANGUAGE.ENGLISH.NOTYOURTURN;
			CHOOSEMEANSOFTRANSPORTATION = LANGUAGE.ENGLISH.CHOOSEMEANSOFTRANSPORTATION;
			NAME = LANGUAGE.ENGLISH.NAME;
			TAXITICKETS = LANGUAGE.ENGLISH.TAXITICKETS;
			BUSTICKETS = LANGUAGE.ENGLISH.BUSTICKETS;
			UNDERGROUNDTICKETS = LANGUAGE.ENGLISH.UNDERGROUNDTICKETS;
			MRY = LANGUAGE.ENGLISH.MRY;
			TURN = LANGUAGE.ENGLISH.TURN;
			ROUND = LANGUAGE.ENGLISH.ROUND;
			MISTERYSHOWS = LANGUAGE.ENGLISH.MISTERYSHOWS;
			MISTERYUSEDTICKETS = LANGUAGE.ENGLISH.MISTERYUSEDTICKETS;
			ALREADYLOGGEDIN = LANGUAGE.ENGLISH.ALREADYLOGGEDIN;
			CONNECTIONNEEDED = LANGUAGE.ENGLISH.CONNECTIONNEEDED;
			ENTERUSERNAME = LANGUAGE.ENGLISH.ENTERUSERNAME;
			LOGGEDIN = LANGUAGE.ENGLISH.LOGGEDIN;
			SKIP = LANGUAGE.ENGLISH.SKIP;
			CONNECT = LANGUAGE.ENGLISH.CONNECT;
			ALREADYCONNECTEDTO = LANGUAGE.ENGLISH.ALREADYCONNECTEDTO;
			ENTERIP = LANGUAGE.ENGLISH.ENTERIP;
			CHECKIPFORMAT = LANGUAGE.ENGLISH.CHECKIPFORMAT;
			break;

		case LANGUAGE.DE:
			LOGIN = LANGUAGE.GERMAN.LOGIN;
			OPTIONS = LANGUAGE.GERMAN.OPTIONS;
			READY = LANGUAGE.GERMAN.READY;
			STR_LANGUAGE = LANGUAGE.GERMAN.STR_LANGUAGE;
			STR_ENGLISH = LANGUAGE.GERMAN.STR_ENGLISH;
			STR_GERMAN = LANGUAGE.GERMAN.STR_GERMAN;
			CHAT = LANGUAGE.GERMAN.CHAT;
			ROUNDSINFO = LANGUAGE.GERMAN.ROUNDSINFO;
			SEND = LANGUAGE.GERMAN.SEND;
			PLAYERINFO = LANGUAGE.GERMAN.PLAYERINFO;
			CONNECTING = LANGUAGE.GERMAN.CONNECTING;
			CONNECTED = LANGUAGE.GERMAN.CONNECTED;
			CONNECTIONFAILED = LANGUAGE.GERMAN.CONNECTIONFAILED;
			MISTERYWON = LANGUAGE.GERMAN.MISTERYWON;
			DETECTIVESWON = LANGUAGE.GERMAN.DETECTIVESWON;
			FOUNDMISTERY = LANGUAGE.GERMAN.FOUNDMISTERY;
			USERNAMEALREADYINUSE = LANGUAGE.GERMAN.USERNAMEALREADYINUSE;
			MOVEMENTISINVALID = LANGUAGE.GERMAN.MOVEMENTISINVALID;
			INVALIDMOVEMENT = LANGUAGE.GERMAN.INVALIDMOVEMENT;
			ERROROCURRED = LANGUAGE.GERMAN.ERROROCURRED;
			ERRORCODE = LANGUAGE.GERMAN.ERRORCODE;
			ERROR = LANGUAGE.GERMAN.ERRORCODE;
			GAMENOTSTARTEDYET = LANGUAGE.GERMAN.GAMENOTSTARTEDYET;
			ITIS = LANGUAGE.GERMAN.ITIS;
			PLAYERSTURN = LANGUAGE.GERMAN.PLAYERSTURN;
			NOTYOURTURN = LANGUAGE.GERMAN.NOTYOURTURN;
			CHOOSEMEANSOFTRANSPORTATION = LANGUAGE.GERMAN.CHOOSEMEANSOFTRANSPORTATION;
			NAME = LANGUAGE.GERMAN.NAME;
			TAXITICKETS = LANGUAGE.GERMAN.TAXITICKETS;
			BUSTICKETS = LANGUAGE.GERMAN.BUSTICKETS;
			UNDERGROUNDTICKETS = LANGUAGE.GERMAN.UNDERGROUNDTICKETS;
			MRY = LANGUAGE.GERMAN.MRY;
			TURN = LANGUAGE.GERMAN.TURN;
			ROUND = LANGUAGE.GERMAN.ROUND;
			MISTERYSHOWS = LANGUAGE.GERMAN.MISTERYSHOWS;
			MISTERYUSEDTICKETS = LANGUAGE.GERMAN.MISTERYUSEDTICKETS;
			ALREADYLOGGEDIN = LANGUAGE.GERMAN.ALREADYLOGGEDIN;
			CONNECTIONNEEDED = LANGUAGE.GERMAN.CONNECTIONNEEDED;
			ENTERUSERNAME = LANGUAGE.GERMAN.ENTERUSERNAME;
			LOGGEDIN = LANGUAGE.GERMAN.LOGGEDIN;
			SKIP = LANGUAGE.GERMAN.SKIP;
			CONNECT = LANGUAGE.GERMAN.CONNECT;
			ALREADYCONNECTEDTO = LANGUAGE.GERMAN.ALREADYCONNECTEDTO;
			ENTERIP = LANGUAGE.GERMAN.ENTERIP;
			CHECKIPFORMAT = LANGUAGE.GERMAN.CHECKIPFORMAT;
			break;

		default:
			loadLanguage(EN);
			break;
		}
	}

	public final class ENGLISH {
		
		public static final String LOGIN = "Login",
					OPTIONS = "Options",
					READY = "Ready",
					STR_LANGUAGE = "Language",
					STR_ENGLISH = "English",
					STR_GERMAN = "Deutsch",
					CHAT = "Chat",
					ROUNDSINFO = "Rounds info",
					SEND = "Send",
					PLAYERINFO = "Player info",
					CONNECTING = "Connecting",
					CONNECTED = "Connected",
					CONNECTIONFAILED = "Connection failed",
					MISTERYWON = "MisterY won the game",
					DETECTIVESWON = "The detectives won the game",
					FOUNDMISTERY = "found MisterY",
					USERNAMEALREADYINUSE = "This username is already in use! Please use another one.",
					MOVEMENTISINVALID = "This movement is invalid!",
					INVALIDMOVEMENT = "Invalid movement!",
					ERROROCURRED = "An error ocurred.",
					ERRORCODE = "Errorcode:",
					ERROR = "Error",
					GAMENOTSTARTEDYET = "The game has not started yet!",
					ITIS = "It is",
					PLAYERSTURN = "'s turn!",
					NOTYOURTURN = "It is not your turn!",
					CHOOSEMEANSOFTRANSPORTATION = "Choose your means of transportation",
					NAME = "Name",
					TAXITICKETS = "Taxi tickets",
					BUSTICKETS = "Bus tickets",
					UNDERGROUNDTICKETS = "Underground tickets",
					MRY = "MrY",
					TURN = "Turn",
					ROUND = "Round",
					MISTERYSHOWS = "MisterY appears",
					MISTERYUSEDTICKETS = "Ticket used by MisterY",
					ALREADYLOGGEDIN = "You are already logged in!",
					CONNECTIONNEEDED = "You have to be connected to the server!",
					ENTERUSERNAME = "Enter your username:",
					LOGGEDIN = "Logged in.",
					SKIP = "Skip",
					CONNECT = "Connect",
					ALREADYCONNECTEDTO = "Already connected to ",
					ENTERIP = "Enter IP",
					CHECKIPFORMAT = "Check entered IP";
					
					
		
	}

	public final class GERMAN {

		public static final String LOGIN = "Einloggen",
					OPTIONS = "Optionen",
					READY = "Bereit",
					STR_LANGUAGE = "Sprache",
					STR_ENGLISH = "English",
					STR_GERMAN = "Deutsch",
					CHAT = "Plaudern",
					ROUNDSINFO = "Rundeninfos",
					SEND = "Senden",
					PLAYERINFO = "Spielerinfos",
					CONNECTING = "Verbinden",
					CONNECTED = "Verbunden",
					CONNECTIONFAILED = "Verbindung fehlgeschlagen",
					MISTERYWON = "MisterY hat das Spiel gewonnen",
					DETECTIVESWON = "Die Detektive haben das Spiel gewonnen",
					FOUNDMISTERY = "hat MisterY gefunden",
					USERNAMEALREADYINUSE = "Dieser Nutzername wird bereits verwendet! Bitte w\u00e4hle einen anderen",
					MOVEMENTISINVALID = "Dieser Spielzug ist ung\u00fcltig!",
					INVALIDMOVEMENT = "Ung\u00fcltiger Spielzug!",
					ERROROCURRED = "Ein Fehler ist aufgetreten",
					ERRORCODE = "Fehlercode:",
					ERROR = "Fehler",
					GAMENOTSTARTEDYET = "Das Spiel ist noch nicht gestartet!",
					ITIS = "Es ist",
					PLAYERSTURN = "an der Reihe!",
					NOTYOURTURN = "Du bist nicht dran!",
					CHOOSEMEANSOFTRANSPORTATION = "W\u00e4hle ein Transportmittel",
					NAME = "Name",
					TAXITICKETS = "Taxi Tickets",
					BUSTICKETS = "Bus Tickets",
					UNDERGROUNDTICKETS = "U-Bahn Tickets",
					MRY = "MrY",
					TURN = "Spielzug",
					ROUND = "Runde",
					MISTERYSHOWS = "MisterY zeigt sich",
					MISTERYUSEDTICKETS = "Ticket von MisterY genutzt",
					ALREADYLOGGEDIN = "Du bist bereits eingeloggt!",
					CONNECTIONNEEDED = "Du musst mit dem Server verbunden sein!",
					ENTERUSERNAME = "W\u00e4hle einen Nutzernamen:",
					LOGGEDIN = "Eingeloggt.",
					SKIP = "\u00dcberspringen",
					CONNECT = "Verbinden",
					ALREADYCONNECTEDTO = "Bereits verbunden mit ",
					ENTERIP = "Gib IP ein",
					CHECKIPFORMAT = "\u00dcberpr\u00fcfe die IP Eingabe";

	}

}
