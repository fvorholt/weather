package de.dojo.weather.data.repository

object StationRepository {
    private val _stations = listOf(
        WeatherStation(stationId = "EW002", stationName = "Beveringen", region = "Brandenburg"),
        WeatherStation(stationId = "EW003", stationName = "Calvoerde", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "EW004",
            stationName = "Dahlem-Berg",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "EW005", stationName = "Delitzsch", region = "Sachsen"),
        WeatherStation(stationId = "EW006", stationName = "Emden", region = "Niedersachsen"),
        WeatherStation(stationId = "EW007", stationName = "Foehr", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "EW008", stationName = "Freiamt", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "EW009",
            stationName = "Goosefeld",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "EW010",
            stationName = "Hagen-Dahl",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "EW011", stationName = "Hilkenbrook", region = "Niedersachsen"),
        WeatherStation(
            stationId = "EW012",
            stationName = "Kaiser-Wilhelm-Koog",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "EW013", stationName = "Kroppach", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "EW015", stationName = "Podelzig", region = "Brandenburg"),
        WeatherStation(
            stationId = "EW016",
            stationName = "Rakow",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "EW017",
            stationName = "Rosenberg",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "EW018", stationName = "Rothwesten", region = "Hessen"),
        WeatherStation(
            stationId = "EW019",
            stationName = "Ruegen",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "EW020",
            stationName = "St. Peter-Ording",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "EW021", stationName = "Steinlah", region = "Niedersachsen"),
        WeatherStation(stationId = "EW022", stationName = "Steinsdorf", region = "Thüringen"),
        WeatherStation(stationId = "EW024", stationName = "Wangerland", region = "Niedersachsen"),
        WeatherStation(stationId = "EW025", stationName = "Wasbek", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "EW026", stationName = "Weissenburg", region = "Bayern"),
        WeatherStation(
            stationId = "EW027",
            stationName = "Westfehmarn",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "EW028",
            stationName = "Wuennenberg",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "EW029",
            stationName = "Wusterhusen",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "EW030", stationName = "Zapfendorf", region = "Bayern"),
        WeatherStation(stationId = "EW031", stationName = "EW-Lindenberg", region = "Brandenburg"),
        WeatherStation(stationId = "EW032", stationName = "Cabauw", region = "Provinz Flevoland"),
        WeatherStation(stationId = "EW034", stationName = "EW-Hamburg", region = "Hamburg"),
        WeatherStation(stationId = "EW035", stationName = "FINO1"),
        WeatherStation(stationId = "EW036", stationName = "FINO2"),
        WeatherStation(stationId = "EW037", stationName = "FINO3"),
        WeatherStation(stationId = "EW038", stationName = "EW-Risoe", region = "Region Sjælland"),
        WeatherStation(stationId = "EW039", stationName = "EW-Roedeser-Berg", region = "Hessen"),
        WeatherStation(stationId = "10004", stationName = "UFS TW EMS"),
        WeatherStation(stationId = "10007", stationName = "UFS DEUTSCHE BUCHT"),
        WeatherStation(stationId = "10015", stationName = "HELGOLAND"),
        WeatherStation(
            stationId = "10020",
            stationName = "LIST/SYLT",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10022", stationName = "LECK", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "10028", stationName = "ST. PETER ORDING"),
        WeatherStation(
            stationId = "10033",
            stationName = "FLENSBURG",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "10035",
            stationName = "SCHLESWIG",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "10037",
            stationName = "SCHLESWIG-JAGEL",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10038", stationName = "HOHN", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "10042",
            stationName = "OLPENITZ",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10044", stationName = "LEUCHTTURM KIEL"),
        WeatherStation(stationId = "10046", stationName = "KIEL-H.", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "10055",
            stationName = "WESTERMARKELSDORF",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "10091",
            stationName = "ARKONA",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10093",
            stationName = "PUTBUS",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10097",
            stationName = "GREIFSWALDER OIE",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "10113", stationName = "NORDERNEY"),
        WeatherStation(stationId = "10122", stationName = "JEVER", region = "Niedersachsen"),
        WeatherStation(
            stationId = "10126",
            stationName = "WITTMUNDHAVEN",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "10129", stationName = "BREMERHAVEN", region = "Bremen"),
        WeatherStation(
            stationId = "10130",
            stationName = "ELPERSBUETTEL",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10131", stationName = "CUXHAVEN", region = "Niedersachsen"),
        WeatherStation(stationId = "10136", stationName = "NORDHOLZ", region = "Niedersachsen"),
        WeatherStation(stationId = "10139", stationName = "BREMERVOERDE", region = "Niedersachsen"),
        WeatherStation(stationId = "10142", stationName = "ITZEHOE", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "10146",
            stationName = "QUICKBORN",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10147", stationName = "HAMBURG-FU.", region = "Hamburg"),
        WeatherStation(
            stationId = "10150",
            stationName = "DOERNICK",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "10152", stationName = "PELZERHAKEN"),
        WeatherStation(stationId = "10156", stationName = "LUEBECK", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "10161", stationName = "BOLTENHAGEN"),
        WeatherStation(
            stationId = "10162",
            stationName = "SCHWERIN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10168",
            stationName = "GOLDBERG",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10170",
            stationName = "WARNEMUENDE",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10172",
            stationName = "LAAGE",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10180",
            stationName = "BARTH",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10184",
            stationName = "GREIFSWALD",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10193",
            stationName = "UECKERMUENDE",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10200",
            stationName = "EMDEN-FLUGPLATZ",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "10215", stationName = "OLDENBURG", region = "Niedersachsen"),
        WeatherStation(stationId = "10224", stationName = "BREMEN", region = "Bremen"),
        WeatherStation(stationId = "10235", stationName = "SOLTAU", region = "Niedersachsen"),
        WeatherStation(stationId = "10238", stationName = "BERGEN-HOHNE", region = "Niedersachsen"),
        WeatherStation(stationId = "10246", stationName = "FASSBERG", region = "Niedersachsen"),
        WeatherStation(
            stationId = "10249",
            stationName = "BOIZENBURG",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "10253", stationName = "LUECHOW", region = "Niedersachsen"),
        WeatherStation(stationId = "10261", stationName = "SEEHAUSEN", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "10264",
            stationName = "MARNITZ",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "10267", stationName = "KYRITZ", region = "Brandenburg"),
        WeatherStation(
            stationId = "10268",
            stationName = "WAREN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "10270", stationName = "NEURUPPIN", region = "Brandenburg"),
        WeatherStation(
            stationId = "10281",
            stationName = "TROLLENHAGEN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "10282",
            stationName = "FELDBERG/MECKLENBURG",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(stationId = "10289", stationName = "GRUENOW", region = "Brandenburg"),
        WeatherStation(stationId = "10291", stationName = "ANGERMUENDE", region = "Brandenburg"),
        WeatherStation(stationId = "10305", stationName = "LINGEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "10306",
            stationName = "RHEINE-BENTLAGE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10309", stationName = "AHAUS", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "10315",
            stationName = "MUENSTER/OSNABR.",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10320",
            stationName = "GUETERSLOH",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10321", stationName = "DIEPHOLZ", region = "Niedersachsen"),
        WeatherStation(
            stationId = "10325",
            stationName = "BAD SALZUFLEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10334", stationName = "WUNSTORF", region = "Niedersachsen"),
        WeatherStation(stationId = "10335", stationName = "BUECKEBURG", region = "Niedersachsen"),
        WeatherStation(stationId = "10338", stationName = "HANNOVER", region = "Niedersachsen"),
        WeatherStation(stationId = "10343", stationName = "CELLE", region = "Niedersachsen"),
        WeatherStation(stationId = "10348", stationName = "BRAUNSCHWG.", region = "Niedersachsen"),
        WeatherStation(stationId = "10356", stationName = "UMMENDORF", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10359", stationName = "GARDELEGEN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10361", stationName = "MAGDEBURG", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10365", stationName = "GENTHIN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10368", stationName = "WIESENBURG", region = "Brandenburg"),
        WeatherStation(stationId = "10376", stationName = "BARUTH", region = "Brandenburg"),
        WeatherStation(stationId = "10379", stationName = "POTSDAM", region = "Brandenburg"),
        WeatherStation(stationId = "10381", stationName = "BERLIN-DAHLEM", region = "Berlin"),
        WeatherStation(stationId = "10382", stationName = "BERLIN-TEGEL", region = "Berlin"),
        WeatherStation(stationId = "10384", stationName = "BERLIN-TEMPELHOF", region = "Berlin"),
        WeatherStation(
            stationId = "10385",
            stationName = "BERLIN-BRANDENBURG",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "10389", stationName = "BERLIN-ALEX.", region = "Berlin"),
        WeatherStation(stationId = "10393", stationName = "LINDENBERG", region = "Brandenburg"),
        WeatherStation(stationId = "10396", stationName = "MANSCHNOW", region = "Brandenburg"),
        WeatherStation(
            stationId = "10400",
            stationName = "DUESSELDORF",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10404", stationName = "KALKAR", region = "Nordrhein-Westfalen"),
        WeatherStation(stationId = "10410", stationName = "ESSEN", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "10418",
            stationName = "LUEDENSCHEID",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10424", stationName = "WERL", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "10427",
            stationName = "K.ASTEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10430",
            stationName = "BAD LIPPSPRINGE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10433", stationName = "LUEDGE", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "10435",
            stationName = "WARBURG",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "10438", stationName = "KASSEL", region = "Hessen"),
        WeatherStation(stationId = "10439", stationName = "FRITZLAR", region = "Hessen"),
        WeatherStation(stationId = "10442", stationName = "ALFELD", region = "Niedersachsen"),
        WeatherStation(stationId = "10444", stationName = "GOETTINGEN", region = "Niedersachsen"),
        WeatherStation(stationId = "10449", stationName = "LEINEFELDE", region = "Thüringen"),
        WeatherStation(stationId = "10452", stationName = "BRAUNLAGE", region = "Niedersachsen"),
        WeatherStation(stationId = "10453", stationName = "BROCKEN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10454", stationName = "WERNIGERODE", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10458", stationName = "HARZGERODE", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10460", stationName = "ARTERN", region = "Thüringen"),
        WeatherStation(stationId = "10466", stationName = "HALLE", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10469", stationName = "LEIPZIG/SCHKEUDITZ", region = "Sachsen"),
        WeatherStation(stationId = "10471", stationName = "LEIPZIG", region = "Sachsen"),
        WeatherStation(stationId = "10474", stationName = "WITTENBERG", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10476", stationName = "HOLZDORF", region = "Brandenburg"),
        WeatherStation(stationId = "10480", stationName = "OSCHATZ", region = "Sachsen"),
        WeatherStation(stationId = "10488", stationName = "DRESDEN", region = "Sachsen"),
        WeatherStation(
            stationId = "10490",
            stationName = "DOBERLUG-KIRCHHAIN",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "10496", stationName = "COTTBUS", region = "Brandenburg"),
        WeatherStation(stationId = "10499", stationName = "GOERLITZ", region = "Sachsen"),
        WeatherStation(
            stationId = "10500",
            stationName = "GEILENKIRCHEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10502",
            stationName = "NOERVENICH",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10506",
            stationName = "NUERBURG-BARWEILER",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "10513",
            stationName = "KOELN/BONN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10516",
            stationName = "KO-FALKENST.KASERNE",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "10519",
            stationName = "BONN-ROLEBER",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "10526",
            stationName = "B.MARIENBG.",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "10532", stationName = "GIESSEN", region = "Hessen"),
        WeatherStation(
            stationId = "10534",
            stationName = "HOHERODSKOPF (VOGELS",
            region = "Hessen"
        ),
        WeatherStation(stationId = "10540", stationName = "EISENACH", region = "Thüringen"),
        WeatherStation(stationId = "10542", stationName = "BAD HERSFELD", region = "Hessen"),
        WeatherStation(stationId = "10544", stationName = "WASSERKUPPE", region = "Hessen"),
        WeatherStation(stationId = "10548", stationName = "MEININGEN", region = "Thüringen"),
        WeatherStation(stationId = "10552", stationName = "SCHMUECKE", region = "Thüringen"),
        WeatherStation(stationId = "10554", stationName = "ERFURT", region = "Thüringen"),
        WeatherStation(stationId = "10557", stationName = "NEUHAUS A.R.", region = "Thüringen"),
        WeatherStation(stationId = "10564", stationName = "SCHLEIZ", region = "Thüringen"),
        WeatherStation(stationId = "10565", stationName = "OSTERFELD", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "10567", stationName = "GERA", region = "Thüringen"),
        WeatherStation(stationId = "10569", stationName = "PLAUEN", region = "Sachsen"),
        WeatherStation(stationId = "10574", stationName = "CARLSFELD", region = "Sachsen"),
        WeatherStation(stationId = "10577", stationName = "CHEMNITZ", region = "Sachsen"),
        WeatherStation(stationId = "10578", stationName = "FICHTELBERG", region = "Sachsen"),
        WeatherStation(stationId = "10579", stationName = "MARIENBERG", region = "Sachsen"),
        WeatherStation(stationId = "10582", stationName = "ZINNWALD-G.", region = "Sachsen"),
        WeatherStation(stationId = "10591", stationName = "LICHTENHAIN", region = "Sachsen"),
        WeatherStation(stationId = "10609", stationName = "TRIER", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "10613", stationName = "BUECHEL", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "10615", stationName = "DEUSELBACH", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "10616", stationName = "HAHN", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "10618",
            stationName = "IDAR-OBERSTEIN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "10628", stationName = "GEISENHEIM", region = "Hessen"),
        WeatherStation(stationId = "10635", stationName = "KL.FELDBG./TS.", region = "Hessen"),
        WeatherStation(stationId = "10637", stationName = "FRANKFURT/M", region = "Hessen"),
        WeatherStation(
            stationId = "10641",
            stationName = "OFFENBACH-WETTERPARK",
            region = "Hessen"
        ),
        WeatherStation(stationId = "10646", stationName = "NEUHUETTEN/SPESSART", region = "Bayern"),
        WeatherStation(stationId = "10648", stationName = "MICHELSTADT-V.", region = "Hessen"),
        WeatherStation(stationId = "10655", stationName = "WUERZBURG", region = "Bayern"),
        WeatherStation(stationId = "10658", stationName = "KISSINGEN", region = "Bayern"),
        WeatherStation(stationId = "10671", stationName = "COBURG", region = "Bayern"),
        WeatherStation(stationId = "10675", stationName = "BAMBERG", region = "Bayern"),
        WeatherStation(stationId = "10685", stationName = "HOF", region = "Bayern"),
        WeatherStation(
            stationId = "10686",
            stationName = "WUNSIEDEL-SCHOENBRUN",
            region = "Bayern"
        ),
        WeatherStation(stationId = "10688", stationName = "WEIDEN", region = "Bayern"),
        WeatherStation(stationId = "10704", stationName = "BERUS", region = "Saarland"),
        WeatherStation(stationId = "10706", stationName = "THOLEY", region = "Saarland"),
        WeatherStation(stationId = "10708", stationName = "SAARBRUECKEN", region = "Saarland"),
        WeatherStation(stationId = "10724", stationName = "WEINBIET", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "10729", stationName = "MANNHEIM", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "10733",
            stationName = "WAIBSTADT",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10736",
            stationName = "MUEHLACKER",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10738",
            stationName = "STUTTGART-ECHT.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10739",
            stationName = "STUTTGART-SCHN.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10742",
            stationName = "OEHRINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10743",
            stationName = "NIEDERSTETTEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "10756", stationName = "FEUCHTWANGEN", region = "Bayern"),
        WeatherStation(stationId = "10761", stationName = "WEISSENBURG-EMETZH.", region = "Bayern"),
        WeatherStation(stationId = "10763", stationName = "NUERNBERG", region = "Bayern"),
        WeatherStation(stationId = "10765", stationName = "ROTH", region = "Bayern"),
        WeatherStation(stationId = "10771", stationName = "KUEMMERSBRUCK", region = "Bayern"),
        WeatherStation(stationId = "10776", stationName = "REGENSBURG", region = "Bayern"),
        WeatherStation(stationId = "10777", stationName = "GELBELSEE", region = "Bayern"),
        WeatherStation(stationId = "10782", stationName = "WALDMUENCHEN", region = "Bayern"),
        WeatherStation(stationId = "10788", stationName = "STRAUBING", region = "Bayern"),
        WeatherStation(stationId = "10791", stationName = "GR.ARBER", region = "Bayern"),
        WeatherStation(stationId = "10796", stationName = "ZWIESEL", region = "Bayern"),
        WeatherStation(stationId = "10803", stationName = "FREIBURG", region = "Baden-Württemberg"),
        WeatherStation(stationId = "10805", stationName = "LAHR", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "10815",
            stationName = "FREUDENST.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10818",
            stationName = "KLIPPENECK",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "10827",
            stationName = "MESSSTETTEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "10836", stationName = "STOETTEN", region = "Baden-Württemberg"),
        WeatherStation(stationId = "10837", stationName = "LAUPHEIM", region = "Baden-Württemberg"),
        WeatherStation(stationId = "10838", stationName = "ULM", region = "Baden-Württemberg"),
        WeatherStation(stationId = "10850", stationName = "HARBURG", region = "Bayern"),
        WeatherStation(stationId = "10852", stationName = "AUGSBURG", region = "Bayern"),
        WeatherStation(stationId = "10853", stationName = "NEUBURG/DONAU", region = "Bayern"),
        WeatherStation(stationId = "10856", stationName = "LECHFELD", region = "Bayern"),
        WeatherStation(stationId = "10857", stationName = "LANDSBERG", region = "Bayern"),
        WeatherStation(stationId = "10860", stationName = "INGOLSTADT", region = "Bayern"),
        WeatherStation(stationId = "10863", stationName = "WEIHENSTEPHAN", region = "Bayern"),
        WeatherStation(stationId = "10865", stationName = "MUENCHEN STADT", region = "Bayern"),
        WeatherStation(stationId = "10870", stationName = "MUENCHEN-FL.", region = "Bayern"),
        WeatherStation(stationId = "10872", stationName = "GOTTFRIEDING", region = "Bayern"),
        WeatherStation(stationId = "10875", stationName = "MUEHLDORF", region = "Bayern"),
        WeatherStation(stationId = "10895", stationName = "FUERSTENZELL", region = "Bayern"),
        WeatherStation(
            stationId = "10908",
            stationName = "FELDBERG/S.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "10929", stationName = "KONSTANZ", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "10945",
            stationName = "LEUTKIRCH-HERLAZHFN.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "10946", stationName = "KEMPTEN", region = "Bayern"),
        WeatherStation(stationId = "10948", stationName = "OBERSTDORF", region = "Bayern"),
        WeatherStation(stationId = "10954", stationName = "ALTENSTADT", region = "Bayern"),
        WeatherStation(stationId = "10961", stationName = "ZUGSPITZE", region = "Tirol"),
        WeatherStation(stationId = "10962", stationName = "HOHENPEISS.BG", region = "Bayern"),
        WeatherStation(stationId = "10963", stationName = "GARMISCH", region = "Bayern"),
        WeatherStation(stationId = "10980", stationName = "WENDELSTEIN", region = "Bayern"),
        WeatherStation(stationId = "10982", stationName = "CHIEMING", region = "Bayern"),
        WeatherStation(stationId = "01311", stationName = "BERGEN", region = "Vestland"),
        WeatherStation(stationId = "01338", stationName = "VANGSNES", region = "Vestland"),
        WeatherStation(stationId = "01347", stationName = "SOGNDAL", region = "Vestland"),
        WeatherStation(stationId = "01384", stationName = "OSLO/GARDERMOEN", region = "Viken"),
        WeatherStation(stationId = "01385", stationName = "HAMAR-STAVSBERG", region = "Innlandet"),
        WeatherStation(stationId = "01403", stationName = "UTSIRA FYR", region = "Rogaland"),
        WeatherStation(stationId = "01415", stationName = "STAVANGER", region = "Rogaland"),
        WeatherStation(stationId = "01452", stationName = "KRISTIANSAND", region = "Agder"),
        WeatherStation(
            stationId = "01481",
            stationName = "MELSOM",
            region = "Vestfold og Telemark"
        ),
        WeatherStation(stationId = "01488", stationName = "OSLO/FORNEBU", region = "Viken"),
        WeatherStation(stationId = "01492", stationName = "OSLO-BLINDERN", region = "Oslo"),
        WeatherStation(stationId = "01493", stationName = "SARPSBORG", region = "Viken"),
        WeatherStation(stationId = "01494", stationName = "RYGGE", region = "Viken"),
        WeatherStation(stationId = "02418", stationName = "KARLSTAD", region = "Värmlands län"),
        WeatherStation(stationId = "02458", stationName = "UPPSALA", region = "Uppsala län"),
        WeatherStation(stationId = "02464", stationName = "STOCKHOLM", region = "Stockholms län"),
        WeatherStation(stationId = "02469", stationName = "TULLINGE", region = "Stockholms län"),
        WeatherStation(stationId = "02476", stationName = "FLODA", region = "Södermanlands län"),
        WeatherStation(stationId = "02490", stationName = "SVANBERGA", region = "Stockholms län"),
        WeatherStation(stationId = "02493", stationName = "SOEDERARM"),
        WeatherStation(
            stationId = "02500",
            stationName = "NORDKOSTER",
            region = "Västra Götalands län"
        ),
        WeatherStation(
            stationId = "02505",
            stationName = "MASESKAR",
            region = "Västra Götalands län"
        ),
        WeatherStation(
            stationId = "02513",
            stationName = "GOETEBORG",
            region = "Västra Götalands län"
        ),
        WeatherStation(
            stationId = "02520",
            stationName = "SATENAS",
            region = "Västra Götalands län"
        ),
        WeatherStation(stationId = "02550", stationName = "JONKOPING", region = "Jönköpings län"),
        WeatherStation(stationId = "02559", stationName = "GLADHAMMAR", region = "Kalmar län"),
        WeatherStation(
            stationId = "02562",
            stationName = "LINKOPING",
            region = "Östergötlands län"
        ),
        WeatherStation(
            stationId = "02574",
            stationName = "NORRKOPING",
            region = "Östergötlands län"
        ),
        WeatherStation(stationId = "02590", stationName = "VISBY", region = "Gotlands län"),
        WeatherStation(stationId = "02603", stationName = "BROEN", region = "Hallands län"),
        WeatherStation(stationId = "02607", stationName = "ANGELHOLM", region = "Skåne län"),
        WeatherStation(stationId = "02611", stationName = "HELSINGBORG", region = "Skåne län"),
        WeatherStation(stationId = "02616", stationName = "FALSTERBO", region = "Skåne län"),
        WeatherStation(stationId = "02628", stationName = "HANO"),
        WeatherStation(stationId = "02635", stationName = "MALMO", region = "Skåne län"),
        WeatherStation(stationId = "02636", stationName = "MALMO/STURUP", region = "Skåne län"),
        WeatherStation(stationId = "02664", stationName = "RONNEBY", region = "Blekinge län"),
        WeatherStation(stationId = "02670", stationName = "KALMAR", region = "Kalmar län"),
        WeatherStation(stationId = "02680", stationName = "HOBURG", region = "Gotlands län"),
        WeatherStation(stationId = "02944", stationName = "TAMPERE", region = "Pirkanmaa"),
        WeatherStation(stationId = "02952", stationName = "PORI", region = "Satakunta"),
        WeatherStation(stationId = "02958", stationName = "LAPPEENRANTA", region = "Südkarelien"),
        WeatherStation(stationId = "02965", stationName = "LAHTI", region = "Päijät-Häme"),
        WeatherStation(stationId = "02966", stationName = "UTTI", region = "Kymenlaakso"),
        WeatherStation(stationId = "02972", stationName = "TURKU", region = "Varsinais-Suomi"),
        WeatherStation(stationId = "02974", stationName = "HELSINKI/VANTAA", region = "Uusimaa"),
        WeatherStation(stationId = "02982", stationName = "HANKO", region = "Uusimaa"),
        WeatherStation(stationId = "03005", stationName = "LERWICK"),
        WeatherStation(stationId = "03017", stationName = "KIRKWALL"),
        WeatherStation(stationId = "03026", stationName = "STORNOWAY"),
        WeatherStation(stationId = "03041", stationName = "AONACH MOR", region = "Schottland"),
        WeatherStation(stationId = "03044", stationName = "ALTNAHARRA", region = "Schottland"),
        WeatherStation(stationId = "03063", stationName = "AVIEMORE", region = "Schottland"),
        WeatherStation(stationId = "03065", stationName = "CAIRNGORM", region = "Schottland"),
        WeatherStation(stationId = "03066", stationName = "KINLOSS", region = "Schottland"),
        WeatherStation(stationId = "03068", stationName = "LOSSIEMOUTH"),
        WeatherStation(stationId = "03075", stationName = "WICK"),
        WeatherStation(stationId = "03091", stationName = "ABERDEEN"),
        WeatherStation(stationId = "03100", stationName = "TIREE"),
        WeatherStation(stationId = "03132", stationName = "WEST FREUGH", region = "England"),
        WeatherStation(stationId = "03136", stationName = "PRESTWICK/RNAS", region = "Schottland"),
        WeatherStation(stationId = "03158", stationName = "CHARTERHALL"),
        WeatherStation(stationId = "03162", stationName = "ESKDALEMUIR", region = "Schottland"),
        WeatherStation(stationId = "03171", stationName = "LEUCHARS"),
        WeatherStation(stationId = "03204", stationName = "ISLE OF MAN/ROUAL."),
        WeatherStation(stationId = "03220", stationName = "CARLISLE"),
        WeatherStation(stationId = "03257", stationName = "LEEMING", region = "England"),
        WeatherStation(stationId = "03261", stationName = "DISHFORTH AIRFIELD", region = "England"),
        WeatherStation(stationId = "03265", stationName = "TOPCLIFFE", region = "England"),
        WeatherStation(stationId = "03266", stationName = "LINTON-ON-OUSE", region = "England"),
        WeatherStation(stationId = "03275", stationName = "LOFTUS SAMOS"),
        WeatherStation(stationId = "03292", stationName = "BRIDLINGTON"),
        WeatherStation(stationId = "03302", stationName = "VALLEY", region = "Wales"),
        WeatherStation(stationId = "03313", stationName = "RHYL", region = "England"),
        WeatherStation(stationId = "03321", stationName = "HAWARDEN", region = "England"),
        WeatherStation(stationId = "03354", stationName = "NOTTINGHAM/MET", region = "England"),
        WeatherStation(stationId = "03377", stationName = "WADDINGTON"),
        WeatherStation(stationId = "03379", stationName = "CRANWELL"),
        WeatherStation(stationId = "03385", stationName = "DONNA NOOK", region = "England"),
        WeatherStation(stationId = "03405", stationName = "ABERDARON", region = "Wales"),
        WeatherStation(stationId = "03414", stationName = "SHAWBURY", region = "England"),
        WeatherStation(stationId = "03462", stationName = "WITTERING", region = "England"),
        WeatherStation(stationId = "03482", stationName = "MARHAM", region = "England"),
        WeatherStation(stationId = "03502", stationName = "ABERPORTH", region = "Wales"),
        WeatherStation(stationId = "03503", stationName = "TRAWSCOED", region = "England"),
        WeatherStation(stationId = "03520", stationName = "SHOBDON", region = "England"),
        WeatherStation(stationId = "03560", stationName = "BEDFORD", region = "England"),
        WeatherStation(stationId = "03590", stationName = "WATTISHAM", region = "England"),
        WeatherStation(stationId = "03604", stationName = "MILFORD HAVEN", region = "Wales"),
        WeatherStation(stationId = "03628", stationName = "BRISTOL/FILTON", region = "England"),
        WeatherStation(stationId = "03647", stationName = "LITTLE RISSINGTON", region = "England"),
        WeatherStation(stationId = "03649", stationName = "BRIZE NORTON", region = "England"),
        WeatherStation(stationId = "03672", stationName = "NORTHOLT", region = "England"),
        WeatherStation(stationId = "03707", stationName = "CHIVENOR", region = "England"),
        WeatherStation(stationId = "03740", stationName = "LYNEHAM", region = "England"),
        WeatherStation(stationId = "03743", stationName = "LARKHILL", region = "England"),
        WeatherStation(stationId = "03768", stationName = "FARNBOROUGH", region = "England"),
        WeatherStation(stationId = "03772", stationName = "LONDON"),
        WeatherStation(stationId = "03781", stationName = "KENLEY", region = "England"),
        WeatherStation(stationId = "03797", stationName = "MANSTON", region = "England"),
        WeatherStation(stationId = "03803", stationName = "SCILLY"),
        WeatherStation(stationId = "03808", stationName = "CAMBORNE"),
        WeatherStation(stationId = "03809", stationName = "CULDROSE"),
        WeatherStation(stationId = "03827", stationName = "PLYMOUTH", region = "England"),
        WeatherStation(stationId = "03853", stationName = "YEOVILTON", region = "England"),
        WeatherStation(stationId = "03862", stationName = "BOURNEMOUTH/HURN"),
        WeatherStation(stationId = "03866", stationName = "ST.CATHERINE'S POINT"),
        WeatherStation(stationId = "03882", stationName = "HERSTMONCEUX", region = "England"),
        WeatherStation(stationId = "03894", stationName = "GUERNSEY", region = "Normandie"),
        WeatherStation(stationId = "03895", stationName = "JERSEY-AIRPORT"),
        WeatherStation(stationId = "03903", stationName = "ST. ANGELO", region = "Nordirland"),
        WeatherStation(stationId = "03917", stationName = "BELFAST", region = "Nordirland"),
        WeatherStation(stationId = "03953", stationName = "VALENTIA", region = "Niedersachsen"),
        WeatherStation(stationId = "03955", stationName = "CORK AIRPORT"),
        WeatherStation(stationId = "03962", stationName = "SHANNON", region = "County Kilkenny"),
        WeatherStation(stationId = "03969", stationName = "DUBLIN"),
        WeatherStation(stationId = "03971", stationName = "MULLINGAR", region = "County Meath"),
        WeatherStation(
            stationId = "03976",
            stationName = "BELMULLET",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "03980", stationName = "MALIN HEAD"),
        WeatherStation(stationId = "06030", stationName = "ALBORG", region = "Region Nordjylland"),
        WeatherStation(stationId = "06041", stationName = "SKAGEN"),
        WeatherStation(
            stationId = "06052",
            stationName = "THYBORON",
            region = "Region Midtjylland"
        ),
        WeatherStation(stationId = "06060", stationName = "KARUP", region = "Region Midtjylland"),
        WeatherStation(
            stationId = "06070",
            stationName = "TIRSTRUP",
            region = "Region Midtjylland"
        ),
        WeatherStation(stationId = "06080", stationName = "ESBJERG", region = "Region Syddanmark"),
        WeatherStation(stationId = "06104", stationName = "BILLUND", region = "Region Syddanmark"),
        WeatherStation(
            stationId = "06110",
            stationName = "SKRYDSTRUP",
            region = "Region Syddanmark"
        ),
        WeatherStation(stationId = "06119", stationName = "KEGNAES"),
        WeatherStation(stationId = "06120", stationName = "ODENSE", region = "Region Syddanmark"),
        WeatherStation(stationId = "06169", stationName = "GNIBEN"),
        WeatherStation(
            stationId = "06170",
            stationName = "KOEBENHAVN/ROSKILDE",
            region = "Region Sjælland"
        ),
        WeatherStation(
            stationId = "06180",
            stationName = "KOPENHAGEN",
            region = "Region Hovedstaden"
        ),
        WeatherStation(
            stationId = "06190",
            stationName = "ROENNE/BORNH.",
            region = "Region Hovedstaden"
        ),
        WeatherStation(stationId = "06210", stationName = "VALKENBURG", region = "Südholland"),
        WeatherStation(stationId = "06235", stationName = "KOOY", region = "Nordholland"),
        WeatherStation(stationId = "06240", stationName = "AMSTERDAM", region = "Nordholland"),
        WeatherStation(stationId = "06242", stationName = "VLIELAND"),
        WeatherStation(stationId = "06260", stationName = "DE BILT", region = "Utrecht"),
        WeatherStation(stationId = "06270", stationName = "LEEUWARDEN", region = "Friesland"),
        WeatherStation(stationId = "06275", stationName = "DEELEN", region = "Gelderland"),
        WeatherStation(stationId = "06279", stationName = "HOOGEVEEN", region = "Drenthe"),
        WeatherStation(stationId = "06280", stationName = "GRONINGEN", region = "Drenthe"),
        WeatherStation(stationId = "06290", stationName = "TWENTHE", region = "Provinz Overijssel"),
        WeatherStation(stationId = "06310", stationName = "VLISSINGEN"),
        WeatherStation(stationId = "06330", stationName = "HOEK V.HOLL.", region = "Südholland"),
        WeatherStation(stationId = "06344", stationName = "ROTTERDAM", region = "Südholland"),
        WeatherStation(stationId = "06350", stationName = "GILZE RIJEN", region = "Nordbrabant"),
        WeatherStation(stationId = "06370", stationName = "EINDHOVEN", region = "Nordbrabant"),
        WeatherStation(stationId = "06375", stationName = "VOLKEL", region = "Nordbrabant"),
        WeatherStation(stationId = "06380", stationName = "MAASTRICHT", region = "Limburg"),
        WeatherStation(stationId = "06407", stationName = "OOSTENDE", region = "Flämische Region"),
        WeatherStation(stationId = "06431", stationName = "GENT", region = "Flämische Region"),
        WeatherStation(
            stationId = "06449",
            stationName = "CHARLEROI",
            region = "Wallonische Region"
        ),
        WeatherStation(stationId = "06450", stationName = "ANTWERPEN", region = "Flämische Region"),
        WeatherStation(stationId = "06451", stationName = "BRUESSEL", region = "Flämische Region"),
        WeatherStation(
            stationId = "06456",
            stationName = "FLORENNES",
            region = "Wallonische Region"
        ),
        WeatherStation(
            stationId = "06458",
            stationName = "BEAUVECHAIN",
            region = "Wallonische Region"
        ),
        WeatherStation(
            stationId = "06476",
            stationName = "ST.HUBERT",
            region = "Wallonische Region"
        ),
        WeatherStation(stationId = "06478", stationName = "BIERSET", region = "Wallonische Region"),
        WeatherStation(
            stationId = "06479",
            stationName = "KLEINE BROGEL",
            region = "Flämische Region"
        ),
        WeatherStation(
            stationId = "06490",
            stationName = "SPA/LA SAUVENIERE",
            region = "Wallonische Region"
        ),
        WeatherStation(
            stationId = "06496",
            stationName = "ELSENBORN",
            region = "Wallonische Region"
        ),
        WeatherStation(
            stationId = "06590",
            stationName = "LUXEMBURG",
            region = "Distrikt Luxemburg"
        ),
        WeatherStation(stationId = "06601", stationName = "BASEL", region = "Basel-Landschaft"),
        WeatherStation(stationId = "06604", stationName = "NEUCHATEL", region = "Neuenburg"),
        WeatherStation(stationId = "06605", stationName = "CHASSERAL", region = "Bern"),
        WeatherStation(stationId = "06606", stationName = "CRESSIER", region = "Neuenburg"),
        WeatherStation(stationId = "06609", stationName = "MOLESON", region = "Freiburg"),
        WeatherStation(stationId = "06610", stationName = "PAYERNE", region = "Waadt"),
        WeatherStation(
            stationId = "06612",
            stationName = "LA CHAUX DE FONDS",
            region = "Neuenburg"
        ),
        WeatherStation(
            stationId = "06616",
            stationName = "FAHY",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(stationId = "06619", stationName = "LA FRETAZ", region = "Waadt"),
        WeatherStation(stationId = "06620", stationName = "SCHAFFHAUSEN", region = "Schaffhausen"),
        WeatherStation(stationId = "06621", stationName = "GUETTINGEN", region = "Thurgau"),
        WeatherStation(stationId = "06623", stationName = "SALEN-REUTENEN", region = "Thurgau"),
        WeatherStation(stationId = "06624", stationName = "HALLAU", region = "Schaffhausen"),
        WeatherStation(stationId = "06625", stationName = "FRIBOURG POSIEUX", region = "Freiburg"),
        WeatherStation(stationId = "06626", stationName = "GOESGEN (KKW)", region = "Solothurn"),
        WeatherStation(
            stationId = "06628",
            stationName = "PLAFFEIEN-OBERSCH.",
            region = "Freiburg"
        ),
        WeatherStation(stationId = "06629", stationName = "MUEHLEBERG / STOCKER", region = "Bern"),
        WeatherStation(stationId = "06631", stationName = "BERN-LIEBEFELD", region = "Bern"),
        WeatherStation(stationId = "06632", stationName = "GRENCHEN", region = "Solothurn"),
        WeatherStation(stationId = "06633", stationName = "BUCHS-SUHR", region = "Aargau"),
        WeatherStation(stationId = "06635", stationName = "KOPPIGEN", region = "Bern"),
        WeatherStation(stationId = "06636", stationName = "MUEHLEBERG (KKW)", region = "Bern"),
        WeatherStation(stationId = "06637", stationName = "MEIRINGEN", region = "Bern"),
        WeatherStation(stationId = "06638", stationName = "LANGNAU I.E.", region = "Bern"),
        WeatherStation(stationId = "06639", stationName = "NAPF", region = "Bern"),
        WeatherStation(stationId = "06641", stationName = "MOEHLIN", region = "Aargau"),
        WeatherStation(stationId = "06643", stationName = "WYNAU", region = "Bern"),
        WeatherStation(
            stationId = "06645",
            stationName = "RUENENBERG",
            region = "Basel-Landschaft"
        ),
        WeatherStation(stationId = "06646", stationName = "BEZNAU", region = "Aargau"),
        WeatherStation(stationId = "06648", stationName = "EGOLZWIL", region = "Luzern"),
        WeatherStation(stationId = "06650", stationName = "LUZERN", region = "Luzern"),
        WeatherStation(stationId = "06651", stationName = "SCHUEPFHEIM", region = "Luzern"),
        WeatherStation(stationId = "06655", stationName = "ENGELBERG", region = "Obwalden"),
        WeatherStation(stationId = "06657", stationName = "GISWIL", region = "Obwalden"),
        WeatherStation(stationId = "06659", stationName = "PILATUS", region = "Nidwalden"),
        WeatherStation(
            stationId = "06660",
            stationName = "ZUERICH (TOWN/VILLE)",
            region = "Zürich"
        ),
        WeatherStation(stationId = "06664", stationName = "RECKENHOLZ", region = "Zürich"),
        WeatherStation(stationId = "06666", stationName = "LEIBSTADT (KKW)", region = "Aargau"),
        WeatherStation(stationId = "06669", stationName = "LAEGERN", region = "Zürich"),
        WeatherStation(stationId = "06670", stationName = "ZUERICH", region = "Zürich"),
        WeatherStation(stationId = "06672", stationName = "ALTDORF", region = "Uri"),
        WeatherStation(stationId = "06673", stationName = "WAEDENSwl", region = "Zürich"),
        WeatherStation(stationId = "06674", stationName = "CHAM", region = "Zug"),
        WeatherStation(stationId = "06675", stationName = "EINSIEDELN", region = "Schwyz"),
        WeatherStation(stationId = "06676", stationName = "OBERAEGERI", region = "Zug"),
        WeatherStation(stationId = "06679", stationName = "TAENIKON", region = "Thurgau"),
        WeatherStation(
            stationId = "06680",
            stationName = "SAENTIS",
            region = "Appenzell Innerrhoden"
        ),
        WeatherStation(stationId = "06681", stationName = "ST.GALLEN", region = "Sankt Gallen"),
        WeatherStation(stationId = "06682", stationName = "ELM", region = "Glarus"),
        WeatherStation(stationId = "06683", stationName = "SCHMERIKON", region = "Sankt Gallen"),
        WeatherStation(stationId = "06685", stationName = "GLARUS", region = "Glarus"),
        WeatherStation(stationId = "06687", stationName = "QUINTEN", region = "Sankt Gallen"),
        WeatherStation(stationId = "06688", stationName = "CRAP MASEGN", region = "Graubünden"),
        WeatherStation(stationId = "06689", stationName = "HOERNLI", region = "Zürich"),
        WeatherStation(stationId = "06693", stationName = "EBNAT-KAPPEL", region = "Sankt Gallen"),
        WeatherStation(stationId = "06700", stationName = "GENF", region = "Genf"),
        WeatherStation(stationId = "06702", stationName = "LA DOLE", region = "Waadt"),
        WeatherStation(stationId = "06704", stationName = "BIERE", region = "Waadt"),
        WeatherStation(stationId = "06705", stationName = "CHANGINS", region = "Waadt"),
        WeatherStation(stationId = "06711", stationName = "PULLY", region = "Waadt"),
        WeatherStation(stationId = "06712", stationName = "AIGLE", region = "Wallis"),
        WeatherStation(stationId = "06717", stationName = "GRAND-ST-BERNARD", region = "Wallis"),
        WeatherStation(stationId = "06720", stationName = "SION", region = "Wallis"),
        WeatherStation(stationId = "06722", stationName = "EVOLENE-VILLAZ", region = "Wallis"),
        WeatherStation(stationId = "06724", stationName = "MONTANA", region = "Wallis"),
        WeatherStation(stationId = "06727", stationName = "VISP", region = "Wallis"),
        WeatherStation(stationId = "06730", stationName = "JUNGFRAUJOCH", region = "Wallis"),
        WeatherStation(stationId = "06734", stationName = "INTERLAKEN", region = "Bern"),
        WeatherStation(stationId = "06735", stationName = "ADELBODEN", region = "Bern"),
        WeatherStation(stationId = "06744", stationName = "GRIMSEL-HOSPIZ", region = "Bern"),
        WeatherStation(stationId = "06745", stationName = "ULRICHEN", region = "Wallis"),
        WeatherStation(stationId = "06748", stationName = "ZERMATT", region = "Wallis"),
        WeatherStation(stationId = "06750", stationName = "GUETSCH", region = "Uri"),
        WeatherStation(stationId = "06751", stationName = "ROBIEI", region = "Tessin"),
        WeatherStation(stationId = "06753", stationName = "PIOTTA", region = "Tessin"),
        WeatherStation(stationId = "06756", stationName = "COMPROVASCO", region = "Tessin"),
        WeatherStation(stationId = "06759", stationName = "CIMETTA", region = "Tessin"),
        WeatherStation(stationId = "06760", stationName = "LOCARNO-MONTI", region = "Tessin"),
        WeatherStation(stationId = "06762", stationName = "LOCARNO", region = "Tessin"),
        WeatherStation(stationId = "06770", stationName = "LUGANO", region = "Tessin"),
        WeatherStation(stationId = "06771", stationName = "STABIO", region = "Tessin"),
        WeatherStation(stationId = "06778", stationName = "BUFFALORA", region = "Graubünden"),
        WeatherStation(stationId = "06780", stationName = "WEISSFLUHJOCH", region = "Graubünden"),
        WeatherStation(stationId = "06782", stationName = "DISENTIS", region = "Graubünden"),
        WeatherStation(stationId = "06783", stationName = "SAN BERNARDINO", region = "Graubünden"),
        WeatherStation(stationId = "06784", stationName = "DAVOS", region = "Graubünden"),
        WeatherStation(stationId = "06786", stationName = "CHUR", region = "Graubünden"),
        WeatherStation(stationId = "06791", stationName = "CORVATSCH", region = "Graubünden"),
        WeatherStation(stationId = "06792", stationName = "SAMEDAN", region = "Graubünden"),
        WeatherStation(stationId = "06793", stationName = "VALBELLA", region = "Graubünden"),
        WeatherStation(stationId = "06794", stationName = "ROBBIA", region = "Graubünden"),
        WeatherStation(stationId = "06795", stationName = "PIZ MARTEGNAS", region = "Graubünden"),
        WeatherStation(
            stationId = "06796",
            stationName = "STA. MARIA VAL MUEST",
            region = "Graubünden"
        ),
        WeatherStation(stationId = "06798", stationName = "SCOULS", region = "Graubünden"),
        WeatherStation(
            stationId = "06799",
            stationName = "NALUNS / SCHLIVERA",
            region = "Graubünden"
        ),
        WeatherStation(stationId = "06990", stationName = "VADUZ FL.", region = "Vaduz"),
        WeatherStation(stationId = "07002", stationName = "BOULOGNE", region = "Hauts-de-France"),
        WeatherStation(stationId = "07005", stationName = "ABBEVILLE", region = "Hauts-de-France"),
        WeatherStation(stationId = "07015", stationName = "LILLE", region = "Hauts-de-France"),
        WeatherStation(stationId = "07017", stationName = "CAMBRAI", region = "Hauts-de-France"),
        WeatherStation(stationId = "07020", stationName = "LA HAGUE"),
        WeatherStation(stationId = "07024", stationName = "CHERBOURG"),
        WeatherStation(stationId = "07027", stationName = "CAEN", region = "Normandie"),
        WeatherStation(stationId = "07028", stationName = "LA HEVE", region = "Normandie"),
        WeatherStation(stationId = "07037", stationName = "ROUEN", region = "Normandie"),
        WeatherStation(stationId = "07038", stationName = "EVREUX", region = "Normandie"),
        WeatherStation(stationId = "07040", stationName = "DIEPPE", region = "Normandie"),
        WeatherStation(stationId = "07055", stationName = "BEAUVAIS", region = "Hauts-de-France"),
        WeatherStation(
            stationId = "07061",
            stationName = "SAINT-QUENTIN",
            region = "Hauts-de-France"
        ),
        WeatherStation(stationId = "07070", stationName = "REIMS", region = "Grand Est"),
        WeatherStation(stationId = "07075", stationName = "CHARLEVILLE", region = "Grand Est"),
        WeatherStation(stationId = "07090", stationName = "METZ", region = "Grand Est"),
        WeatherStation(stationId = "07100", stationName = "OUESSANT"),
        WeatherStation(stationId = "07110", stationName = "BREST", region = "Bretagne"),
        WeatherStation(stationId = "07120", stationName = "ST.BRIEUC", region = "Normandie"),
        WeatherStation(stationId = "07125", stationName = "DINARD APT", region = "Bretagne"),
        WeatherStation(stationId = "07130", stationName = "RENNES", region = "Pays de la Loire"),
        WeatherStation(stationId = "07133", stationName = "POINTE DU ROC", region = "Normandie"),
        WeatherStation(stationId = "07139", stationName = "ALENCON", region = "Normandie"),
        WeatherStation(stationId = "07143", stationName = "CHARTRES", region = "Centre"),
        WeatherStation(stationId = "07149", stationName = "PARIS", region = "Île-de-France"),
        WeatherStation(
            stationId = "07157",
            stationName = "PARIS CH.D.GAULLE",
            region = "Île-de-France"
        ),
        WeatherStation(stationId = "07168", stationName = "TROYES", region = "Grand Est"),
        WeatherStation(stationId = "07169", stationName = "ST. DIZIER", region = "Grand Est"),
        WeatherStation(stationId = "07180", stationName = "NANCY", region = "Grand Est"),
        WeatherStation(stationId = "07190", stationName = "STRASSBURG", region = "Grand Est"),
        WeatherStation(stationId = "07200", stationName = "PENMARCH", region = "Bretagne"),
        WeatherStation(stationId = "07201", stationName = "QUIMPER", region = "Bretagne"),
        WeatherStation(stationId = "07205", stationName = "LANN BIHOUE", region = "Bretagne"),
        WeatherStation(stationId = "07222", stationName = "NANTES", region = "Pays de la Loire"),
        WeatherStation(stationId = "07235", stationName = "LE MANS", region = "Pays de la Loire"),
        WeatherStation(stationId = "07240", stationName = "TOURS", region = "Centre"),
        WeatherStation(stationId = "07249", stationName = "ORLEANS", region = "Centre"),
        WeatherStation(stationId = "07255", stationName = "BOURGES", region = "Centre"),
        WeatherStation(
            stationId = "07260",
            stationName = "NEVERS",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(
            stationId = "07265",
            stationName = "AUXERRE",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(
            stationId = "07280",
            stationName = "DIJON",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(
            stationId = "07288",
            stationName = "BESANCON",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(stationId = "07299", stationName = "BASEL-MLH.", region = "Grand Est"),
        WeatherStation(
            stationId = "07306",
            stationName = "LA ROCHE-SUR-YON",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(
            stationId = "07315",
            stationName = "LA ROCHELLE",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(
            stationId = "07335",
            stationName = "POITIERS",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(stationId = "07354", stationName = "CHATEAUROUX", region = "Centre"),
        WeatherStation(
            stationId = "07379",
            stationName = "SAINT-YAN.",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(
            stationId = "07385",
            stationName = "MACON",
            region = "Bourgogne-Franche-Comté"
        ),
        WeatherStation(stationId = "07434", stationName = "LIMOGES", region = "Nouvelle-Aquitaine"),
        WeatherStation(
            stationId = "07460",
            stationName = "CLERMONT",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07475",
            stationName = "ST. ETIENNE",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07480",
            stationName = "LYON/BRON",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07481",
            stationName = "LYON/SATOLAS",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07486",
            stationName = "GRENOBLE",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07491",
            stationName = "CHAMBERY - AIX",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07497",
            stationName = "BOURG-ST-M",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07510",
            stationName = "BORDEAUX",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(stationId = "07558", stationName = "MILLAU", region = "Okzitanien"),
        WeatherStation(
            stationId = "07577",
            stationName = "MONTELIMAR",
            region = "Auvergne-Rhône-Alpes"
        ),
        WeatherStation(
            stationId = "07579",
            stationName = "ORANGE",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(
            stationId = "07588",
            stationName = "ST.AUBAN",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(stationId = "07600", stationName = "SOCOA", region = "Nouvelle-Aquitaine"),
        WeatherStation(
            stationId = "07602",
            stationName = "BIARRITZ",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(stationId = "07610", stationName = "PAU", region = "Okzitanien"),
        WeatherStation(stationId = "07621", stationName = "TARBES/OSSUN", region = "Okzitanien"),
        WeatherStation(stationId = "07622", stationName = "AUCH", region = "Okzitanien"),
        WeatherStation(stationId = "07630", stationName = "TOULOUSE", region = "Okzitanien"),
        WeatherStation(stationId = "07635", stationName = "CARCASSONNE", region = "Okzitanien"),
        WeatherStation(stationId = "07638", stationName = "BEZIER-VIAS", region = "Okzitanien"),
        WeatherStation(stationId = "07643", stationName = "MONTPELLIER", region = "Okzitanien"),
        WeatherStation(
            stationId = "07645",
            stationName = "NIMES/COURBESSAC",
            region = "Okzitanien"
        ),
        WeatherStation(
            stationId = "07648",
            stationName = "SALON",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(stationId = "07650", stationName = "MARSEILLE"),
        WeatherStation(
            stationId = "07667",
            stationName = "HYERES/ALMANARRE",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(
            stationId = "07670",
            stationName = "PORQUEROLLES",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(
            stationId = "07675",
            stationName = "LE LUC",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(
            stationId = "07684",
            stationName = "CANNES",
            region = "Provence-Alpes-Côte d'Azur"
        ),
        WeatherStation(stationId = "07690", stationName = "NIZZA"),
        WeatherStation(stationId = "07747", stationName = "PERPIGNAN", region = "Okzitanien"),
        WeatherStation(stationId = "07754", stationName = "CALVI", region = "Korsika"),
        WeatherStation(stationId = "07761", stationName = "AJACCIO", region = "Korsika"),
        WeatherStation(
            stationId = "07770",
            stationName = "PERTUSATO / CORSICA",
            region = "Korsika"
        ),
        WeatherStation(stationId = "07780", stationName = "FIGARI", region = "Korsika"),
        WeatherStation(stationId = "07785", stationName = "CAP CORSE", region = "Korsika"),
        WeatherStation(stationId = "07790", stationName = "BASTIA", region = "Korsika"),
        WeatherStation(stationId = "08001", stationName = "LA CORUNA", region = "Galicien"),
        WeatherStation(stationId = "08014", stationName = "GIJON"),
        WeatherStation(stationId = "08015", stationName = "OVIEDO", region = "Kantabrien"),
        WeatherStation(stationId = "08021", stationName = "SANTANDER/PARAYAS"),
        WeatherStation(stationId = "08023", stationName = "SANTANDER"),
        WeatherStation(stationId = "08025", stationName = "BILBAO", region = "Nouvelle-Aquitaine"),
        WeatherStation(
            stationId = "08027",
            stationName = "SAN SEBASTIAN/IGUEL.",
            region = "Autonome Gemeinschaft Baskenland"
        ),
        WeatherStation(
            stationId = "08029",
            stationName = "SAN SEBASTIAN/FUENT.",
            region = "Nouvelle-Aquitaine"
        ),
        WeatherStation(stationId = "08042", stationName = "SANTIAGO", region = "Galicien"),
        WeatherStation(stationId = "08045", stationName = "VIGO/PEINADOR", region = "Galicien"),
        WeatherStation(stationId = "08055", stationName = "LEON", region = "Kastilien und León"),
        WeatherStation(stationId = "08075", stationName = "BURGOS-VILLAFRIA", region = "La Rioja"),
        WeatherStation(
            stationId = "08080",
            stationName = "VITORIA OBSERVATORI",
            region = "Navarra"
        ),
        WeatherStation(
            stationId = "08140",
            stationName = "VALLADOLID",
            region = "Kastilien und León"
        ),
        WeatherStation(
            stationId = "08141",
            stationName = "VALLADOLID",
            region = "Kastilien und León"
        ),
        WeatherStation(stationId = "08160", stationName = "ZARAGOZA", region = "Aragonien"),
        WeatherStation(stationId = "08171", stationName = "LERIDA", region = "Katalonien"),
        WeatherStation(stationId = "08175", stationName = "REUS", region = "Katalonien"),
        WeatherStation(stationId = "08181", stationName = "BARCELONA", region = "Katalonien"),
        WeatherStation(
            stationId = "08184",
            stationName = "GERONA/COST.BRAVA",
            region = "Katalonien"
        ),
        WeatherStation(
            stationId = "08202",
            stationName = "SALAMANCA/MATACAN",
            region = "Kastilien und León"
        ),
        WeatherStation(
            stationId = "08221",
            stationName = "MADRID/BARAJAS",
            region = "Kastilien-La Mancha"
        ),
        WeatherStation(
            stationId = "08272",
            stationName = "TOLEDO BUENAVISTA",
            region = "Kastilien-La Mancha"
        ),
        WeatherStation(
            stationId = "08280",
            stationName = "ALBACETE/LOS LLANOS",
            region = "Land Valencia"
        ),
        WeatherStation(stationId = "08284", stationName = "VALENCIA"),
        WeatherStation(stationId = "08286", stationName = "CASTELLON DE LA PLAN"),
        WeatherStation(stationId = "08306", stationName = "PALMA", region = "Balearische Inseln"),
        WeatherStation(stationId = "08314", stationName = "MENORCA", region = "Balearische Inseln"),
        WeatherStation(
            stationId = "08330",
            stationName = "BADAJOZ/TALAVERA",
            region = "Extremadura"
        ),
        WeatherStation(stationId = "08360", stationName = "ALICANTE"),
        WeatherStation(stationId = "08373", stationName = "IBIZA", region = "Balearische Inseln"),
        WeatherStation(stationId = "08383", stationName = "HUELVA", region = "Andalusien"),
        WeatherStation(
            stationId = "08391",
            stationName = "SEVILLA/SAN PABLO",
            region = "Andalusien"
        ),
        WeatherStation(
            stationId = "08397",
            stationName = "MORON DE LA FRONTERA",
            region = "Andalusien"
        ),
        WeatherStation(stationId = "08410", stationName = "CORDOBA", region = "Andalusien"),
        WeatherStation(
            stationId = "08419",
            stationName = "GRANADA/AEROPUERTO",
            region = "Andalusien"
        ),
        WeatherStation(stationId = "08430", stationName = "MURCIA", region = "Land Valencia"),
        WeatherStation(stationId = "08433", stationName = "MURCIA/SAN JAVIER"),
        WeatherStation(
            stationId = "08451",
            stationName = "JEREZ DE LA FRONTERA",
            region = "Andalusien"
        ),
        WeatherStation(stationId = "08482", stationName = "MALAGA"),
        WeatherStation(stationId = "08487", stationName = "ALMERIA"),
        WeatherStation(stationId = "08495", stationName = "GIBRALTAR"),
        WeatherStation(
            stationId = "08532",
            stationName = "SINTRA/GRANJA",
            region = "Distrikt Santarém"
        ),
        WeatherStation(
            stationId = "08540",
            stationName = "MONTE REAL",
            region = "Distrikt Castelo Branco"
        ),
        WeatherStation(
            stationId = "08541",
            stationName = "SINES (MONTES CHAOS)",
            region = "Andalusien"
        ),
        WeatherStation(stationId = "08545", stationName = "PORTO", region = "Distrikt Bragança"),
        WeatherStation(
            stationId = "08546",
            stationName = "PORTO/SERRA DO PILAR",
            region = "Distrikt Viseu"
        ),
        WeatherStation(
            stationId = "08548",
            stationName = "COIMBRA/CERVACHE",
            region = "Distrikt Castelo Branco"
        ),
        WeatherStation(
            stationId = "08551",
            stationName = "VIANA DO CASTELO",
            region = "Distrikt Bragança"
        ),
        WeatherStation(stationId = "08554", stationName = "FARO", region = "Andalusien"),
        WeatherStation(stationId = "08562", stationName = "BEJA", region = "Extremadura"),
        WeatherStation(
            stationId = "08567",
            stationName = "VILA REAL",
            region = "Kastilien und León"
        ),
        WeatherStation(stationId = "08571", stationName = "PORTALEGRE", region = "Extremadura"),
        WeatherStation(
            stationId = "08579",
            stationName = "LISBOA/GAGO COUTINHO",
            region = "Distrikt Santarém"
        ),
        WeatherStation(stationId = "11001", stationName = "WOLFSEGG", region = "Oberösterreich"),
        WeatherStation(stationId = "11008", stationName = "ROHRBACH", region = "Oberösterreich"),
        WeatherStation(stationId = "11010", stationName = "LINZ FL.", region = "Oberösterreich"),
        WeatherStation(
            stationId = "11012",
            stationName = "KREMSMUENSTER",
            region = "Oberösterreich"
        ),
        WeatherStation(stationId = "11015", stationName = "FREISTADT", region = "Oberösterreich"),
        WeatherStation(stationId = "11018", stationName = "AMSTETTEN", region = "Niederösterreich"),
        WeatherStation(
            stationId = "11019",
            stationName = "ALLENSTEIG",
            region = "Niederösterreich"
        ),
        WeatherStation(stationId = "11020", stationName = "ZWETTL", region = "Niederösterreich"),
        WeatherStation(stationId = "11021", stationName = "LITSCHAU", region = "Niederösterreich"),
        WeatherStation(stationId = "11022", stationName = "RETZ", region = "Niederösterreich"),
        WeatherStation(stationId = "11030", stationName = "TULLN", region = "Niederösterreich"),
        WeatherStation(stationId = "11032", stationName = "POYSDORF", region = "Niederösterreich"),
        WeatherStation(stationId = "11034", stationName = "WIEN/CITY", region = "Wien"),
        WeatherStation(stationId = "11035", stationName = "WIEN/HOHE WARTE", region = "Wien"),
        WeatherStation(stationId = "11036", stationName = "WIEN FL.", region = "Niederösterreich"),
        WeatherStation(
            stationId = "11040",
            stationName = "WIEN/UNTERLAA",
            region = "Niederösterreich"
        ),
        WeatherStation(
            stationId = "11053",
            stationName = "RIED IM INNKREIS",
            region = "Oberösterreich"
        ),
        WeatherStation(stationId = "11055", stationName = "SCHAERDING", region = "Bayern"),
        WeatherStation(stationId = "11060", stationName = "LINZ", region = "Oberösterreich"),
        WeatherStation(stationId = "11070", stationName = "KREMS", region = "Niederösterreich"),
        WeatherStation(
            stationId = "11075",
            stationName = "LANGENLOIS",
            region = "Niederösterreich"
        ),
        WeatherStation(
            stationId = "11078",
            stationName = "LILIENFELD/TARSCHBER",
            region = "Niederösterreich"
        ),
        WeatherStation(
            stationId = "11082",
            stationName = "GUMPOLDSKIRCHEN",
            region = "Niederösterreich"
        ),
        WeatherStation(stationId = "11101", stationName = "BREGENZ", region = "Vorarlberg"),
        WeatherStation(stationId = "11105", stationName = "FELDKIRCH", region = "Vorarlberg"),
        WeatherStation(stationId = "11109", stationName = "ST.ANTON AM ARLBERG", region = "Tirol"),
        WeatherStation(stationId = "11110", stationName = "GALZIG", region = "Tirol"),
        WeatherStation(stationId = "11112", stationName = "LANDECK", region = "Tirol"),
        WeatherStation(stationId = "11120", stationName = "INNSBRUCK FL.", region = "Tirol"),
        WeatherStation(stationId = "11128", stationName = "BRENNER", region = "Tirol"),
        WeatherStation(stationId = "11130", stationName = "KUFSTEIN", region = "Tirol"),
        WeatherStation(stationId = "11140", stationName = "LOFER", region = "Salzburg"),
        WeatherStation(stationId = "11141", stationName = "BISCHOFSHOFEN", region = "Salzburg"),
        WeatherStation(stationId = "11144", stationName = "ZELL A.SEE", region = "Salzburg"),
        WeatherStation(stationId = "11146", stationName = "SONNBLICK", region = "Kärnten"),
        WeatherStation(stationId = "11148", stationName = "ST.MICHAEL/LUNGAU", region = "Salzburg"),
        WeatherStation(stationId = "11149", stationName = "OBERTAUERN", region = "Salzburg"),
        WeatherStation(stationId = "11150", stationName = "SALZBURG FL.", region = "Salzburg"),
        WeatherStation(stationId = "11154", stationName = "GMUNDEN", region = "Oberösterreich"),
        WeatherStation(stationId = "11156", stationName = "BAD ISCHL", region = "Oberösterreich"),
        WeatherStation(stationId = "11157", stationName = "AIGEN/ENNS", region = "Steiermark"),
        WeatherStation(stationId = "11165", stationName = "ZELTWEG", region = "Steiermark"),
        WeatherStation(stationId = "11170", stationName = "LUNZ", region = "Niederösterreich"),
        WeatherStation(stationId = "11174", stationName = "ST.MICHAEL", region = "Steiermark"),
        WeatherStation(
            stationId = "11182",
            stationName = "WIENER NEUSTADT",
            region = "Niederösterreich"
        ),
        WeatherStation(stationId = "11190", stationName = "EISENSTADT", region = "Burgenland"),
        WeatherStation(stationId = "11192", stationName = "KLEINZICKEN", region = "Burgenland"),
        WeatherStation(stationId = "11194", stationName = "NEUSIEDL AM SEE", region = "Burgenland"),
        WeatherStation(stationId = "11201", stationName = "SILLIAN", region = "Tirol"),
        WeatherStation(stationId = "11204", stationName = "LIENZ", region = "Tirol"),
        WeatherStation(stationId = "11212", stationName = "VILL.ALPE", region = "Kärnten"),
        WeatherStation(stationId = "11213", stationName = "VILLACH", region = "Kärnten"),
        WeatherStation(stationId = "11231", stationName = "KLAGENFURT FL.", region = "Kärnten"),
        WeatherStation(stationId = "11240", stationName = "GRAZ FL.", region = "Steiermark"),
        WeatherStation(
            stationId = "11248",
            stationName = "BAD RADKERSBURG",
            region = "Gornja Radgona"
        ),
        WeatherStation(stationId = "11270", stationName = "DELLACH IM DRAUTAL", region = "Kärnten"),
        WeatherStation(stationId = "11292", stationName = "LASSNITZHOEHE", region = "Steiermark"),
        WeatherStation(stationId = "11308", stationName = "WARTH", region = "Vorarlberg"),
        WeatherStation(stationId = "11312", stationName = "GALTUER", region = "Tirol"),
        WeatherStation(stationId = "11350", stationName = "SALZBURG", region = "Salzburg"),
        WeatherStation(stationId = "11354", stationName = "BAD GOISERN", region = "Oberösterreich"),
        WeatherStation(
            stationId = "11355",
            stationName = "WINDISCHGARSTEN",
            region = "Oberösterreich"
        ),
        WeatherStation(stationId = "11357", stationName = "ST. WOLFGANG", region = "Salzburg"),
        WeatherStation(
            stationId = "11380",
            stationName = "REICHENAU/RAX",
            region = "Niederösterreich"
        ),
        WeatherStation(stationId = "11406", stationName = "EGER", region = "Karlovarský kraj"),
        WeatherStation(stationId = "11414", stationName = "KARLSBAD", region = "Karlovarský kraj"),
        WeatherStation(stationId = "11423", stationName = "PRIMDA", region = "Plzeňský kraj"),
        WeatherStation(stationId = "11438", stationName = "TUSIMICE", region = "Ústecký kraj"),
        WeatherStation(
            stationId = "11450",
            stationName = "PLZEN (AUT. STATION)",
            region = "Plzeňský kraj"
        ),
        WeatherStation(stationId = "11457", stationName = "CHURANOV", region = "Jihočeský kraj"),
        WeatherStation(stationId = "11487", stationName = "KOCELOVICE", region = "Jihočeský kraj"),
        WeatherStation(stationId = "11502", stationName = "AUSSIG", region = "Ústecký kraj"),
        WeatherStation(stationId = "11509", stationName = "DOKSANY", region = "Ústecký kraj"),
        WeatherStation(stationId = "11518", stationName = "PRAG FL.", region = "Středočeský kraj"),
        WeatherStation(stationId = "11520", stationName = "PRAG", region = "Prag"),
        WeatherStation(stationId = "11538", stationName = "TEMELIN", region = "Jihočeský kraj"),
        WeatherStation(stationId = "11567", stationName = "PRAHA (KBELI AIRP.)", region = "Prag"),
        WeatherStation(stationId = "11603", stationName = "LIBEREC", region = "Liberecký kraj"),
        WeatherStation(stationId = "11624", stationName = "CASLAV", region = "Středočeský kraj"),
        WeatherStation(
            stationId = "11628",
            stationName = "KRAMOLIN-KOSETICE",
            region = "Kraj Vysočina"
        ),
        WeatherStation(
            stationId = "11643",
            stationName = "PEC POD SNEZKOU",
            region = "Královéhradecký kraj"
        ),
        WeatherStation(stationId = "11652", stationName = "PARDUBICE", region = "Pardubický kraj"),
        WeatherStation(stationId = "11659", stationName = "PRIBYSLAW", region = "Kraj Vysočina"),
        WeatherStation(
            stationId = "11679",
            stationName = "USTI NAD ORLICI",
            region = "Pardubický kraj"
        ),
        WeatherStation(stationId = "11683", stationName = "SVRATOUCH", region = "Pardubický kraj"),
        WeatherStation(
            stationId = "11692",
            stationName = "NAMEST NAD OSLAVOU",
            region = "Kraj Vysočina"
        ),
        WeatherStation(stationId = "11693", stationName = "DUKOVANY", region = "Kraj Vysočina"),
        WeatherStation(
            stationId = "11698",
            stationName = "KUCHAROVICE",
            region = "Jihomoravský kraj"
        ),
        WeatherStation(stationId = "11710", stationName = "LUKA", region = "Olomoucký kraj"),
        WeatherStation(stationId = "11723", stationName = "BRUENN", region = "Jihomoravský kraj"),
        WeatherStation(stationId = "11774", stationName = "HOLESOV", region = "Zlínský kraj"),
        WeatherStation(
            stationId = "11782",
            stationName = "OSTRAVA/MOSNOV",
            region = "Moravskoslezský kraj"
        ),
        WeatherStation(
            stationId = "11787",
            stationName = "LYSA HORA/RIESENGEB.",
            region = "Moravskoslezský kraj"
        ),
        WeatherStation(
            stationId = "11816",
            stationName = "BRATISLAVA",
            region = "Bratislavský kraj"
        ),
        WeatherStation(
            stationId = "11819",
            stationName = "JASLOVSKE BOHUNICE",
            region = "Trnavský kraj"
        ),
        WeatherStation(stationId = "11826", stationName = "PIESTANY", region = "Trnavský kraj"),
        WeatherStation(stationId = "11855", stationName = "NITRA", region = "Nitriansky kraj"),
        WeatherStation(stationId = "11856", stationName = "MOCHOVCE", region = "Nitriansky kraj"),
        WeatherStation(stationId = "11858", stationName = "HURBANOVO", region = "Nitriansky kraj"),
        WeatherStation(stationId = "11867", stationName = "PRIEVIDZA", region = "Trenčiansky kraj"),
        WeatherStation(
            stationId = "11880",
            stationName = "DUDINCE",
            region = "Banskobystrický kraj"
        ),
        WeatherStation(stationId = "11903", stationName = "SLIAC", region = "Banskobystrický kraj"),
        WeatherStation(
            stationId = "11927",
            stationName = "LUCENEC",
            region = "Banskobystrický kraj"
        ),
        WeatherStation(
            stationId = "11933",
            stationName = "STREBSKE PLESO",
            region = "Prešovský kraj"
        ),
        WeatherStation(stationId = "11934", stationName = "POPRAD/T.", region = "Prešovský kraj"),
        WeatherStation(
            stationId = "11938",
            stationName = "TELGART",
            region = "Banskobystrický kraj"
        ),
        WeatherStation(stationId = "11968", stationName = "KOSICE", region = "Košický kraj"),
        WeatherStation(
            stationId = "11976",
            stationName = "STROPKOV,TISINEC",
            region = "Prešovský kraj"
        ),
        WeatherStation(stationId = "11978", stationName = "MILHOSTOV", region = "Košický kraj"),
        WeatherStation(
            stationId = "11993",
            stationName = "KAMENICA NAD C.",
            region = "Prešovský kraj"
        ),
        WeatherStation(
            stationId = "12105",
            stationName = "KOSZALIN",
            region = "Woiwodschaft Westpommern"
        ),
        WeatherStation(stationId = "12120", stationName = "LEBA", region = "Woiwodschaft Pommern"),
        WeatherStation(stationId = "12135", stationName = "HEL", region = "Woiwodschaft Pommern"),
        WeatherStation(
            stationId = "12160",
            stationName = "ELBLAG",
            region = "Woiwodschaft Ermland-Masuren"
        ),
        WeatherStation(
            stationId = "12185",
            stationName = "KETRZYN",
            region = "Woiwodschaft Ermland-Masuren"
        ),
        WeatherStation(
            stationId = "12195",
            stationName = "SUWALKI",
            region = "Woiwodschaft Podlachien"
        ),
        WeatherStation(
            stationId = "12200",
            stationName = "SWINEMUENDE",
            region = "Woiwodschaft Westpommern"
        ),
        WeatherStation(
            stationId = "12205",
            stationName = "STETTIN",
            region = "Woiwodschaft Westpommern"
        ),
        WeatherStation(
            stationId = "12210",
            stationName = "RESKO",
            region = "Woiwodschaft Westpommern"
        ),
        WeatherStation(stationId = "12230", stationName = "PILA", region = "Großpolen"),
        WeatherStation(
            stationId = "12235",
            stationName = "CHOJNICE",
            region = "Woiwodschaft Pommern"
        ),
        WeatherStation(
            stationId = "12250",
            stationName = "TORUN",
            region = "Woiwodschaft Kujawien-Pommern"
        ),
        WeatherStation(
            stationId = "12270",
            stationName = "MLAWA",
            region = "Woiwodschaft Masowien"
        ),
        WeatherStation(
            stationId = "12280",
            stationName = "MIKOLAJKI",
            region = "Woiwodschaft Ermland-Masuren"
        ),
        WeatherStation(
            stationId = "12295",
            stationName = "BIALYSTOK",
            region = "Woiwodschaft Podlachien"
        ),
        WeatherStation(stationId = "12300", stationName = "GORZOW WLKP", region = "Drossen"),
        WeatherStation(stationId = "12310", stationName = "SLUBICE", region = "Drossen"),
        WeatherStation(stationId = "12330", stationName = "POSEN", region = "Großpolen"),
        WeatherStation(stationId = "12345", stationName = "KOLO", region = "Großpolen"),
        WeatherStation(
            stationId = "12360",
            stationName = "PLOCK",
            region = "Woiwodschaft Masowien"
        ),
        WeatherStation(
            stationId = "12375",
            stationName = "WARSCHAU",
            region = "Woiwodschaft Masowien"
        ),
        WeatherStation(
            stationId = "12385",
            stationName = "SIEDLCE",
            region = "Woiwodschaft Masowien"
        ),
        WeatherStation(stationId = "12400", stationName = "ZIELONA GORA", region = "Drossen"),
        WeatherStation(
            stationId = "12415",
            stationName = "LEGNICA BARTOSZOW",
            region = "Woiwodschaft Niederschlesien"
        ),
        WeatherStation(stationId = "12418", stationName = "LESZNO", region = "Großpolen"),
        WeatherStation(
            stationId = "12424",
            stationName = "WROCLAW II",
            region = "Woiwodschaft Niederschlesien"
        ),
        WeatherStation(stationId = "12435", stationName = "KALISZ", region = "Großpolen"),
        WeatherStation(stationId = "12455", stationName = "WIELUN", region = "Woiwodschaft Łódź"),
        WeatherStation(stationId = "12465", stationName = "LODZ", region = "Woiwodschaft Łódź"),
        WeatherStation(stationId = "12469", stationName = "SULEJOW", region = "Woiwodschaft Łódź"),
        WeatherStation(
            stationId = "12488",
            stationName = "KOZIENICE",
            region = "Woiwodschaft Masowien"
        ),
        WeatherStation(
            stationId = "12495",
            stationName = "LUBLIN RADAWIEC",
            region = "Woiwodschaft Lublin"
        ),
        WeatherStation(
            stationId = "12500",
            stationName = "JELENIA GORA",
            region = "Woiwodschaft Niederschlesien"
        ),
        WeatherStation(
            stationId = "12510",
            stationName = "SNIEZKA",
            region = "Královéhradecký kraj"
        ),
        WeatherStation(
            stationId = "12520",
            stationName = "KLODZKO",
            region = "Woiwodschaft Niederschlesien"
        ),
        WeatherStation(stationId = "12530", stationName = "OPOLE", region = "Oppeln"),
        WeatherStation(
            stationId = "12540",
            stationName = "RACIBORZ",
            region = "Woiwodschaft Schlesien"
        ),
        WeatherStation(
            stationId = "12550",
            stationName = "CZESTOCHOWA",
            region = "Woiwodschaft Schlesien"
        ),
        WeatherStation(
            stationId = "12560",
            stationName = "KATOWICE",
            region = "Woiwodschaft Schlesien"
        ),
        WeatherStation(
            stationId = "12566",
            stationName = "KRAKOW",
            region = "Woiwodschaft Kleinpolen"
        ),
        WeatherStation(stationId = "12570", stationName = "KIELCE", region = "Heiligkreuz"),
        WeatherStation(
            stationId = "12580",
            stationName = "RZESZOW-JASIONKA",
            region = "Woiwodschaft Karpatenvorland"
        ),
        WeatherStation(stationId = "12585", stationName = "SANDOMIERZ", region = "Heiligkreuz"),
        WeatherStation(
            stationId = "12600",
            stationName = "BIELSKO-BIALA",
            region = "Woiwodschaft Schlesien"
        ),
        WeatherStation(
            stationId = "12625",
            stationName = "ZAKOPANE",
            region = "Woiwodschaft Kleinpolen"
        ),
        WeatherStation(
            stationId = "12660",
            stationName = "NOWY SACZ",
            region = "Woiwodschaft Kleinpolen"
        ),
        WeatherStation(
            stationId = "12690",
            stationName = "LESKO",
            region = "Woiwodschaft Karpatenvorland"
        ),
        WeatherStation(
            stationId = "12766",
            stationName = "JOSVAFO",
            region = "Borsod-Abaúj-Zemplén"
        ),
        WeatherStation(
            stationId = "12772",
            stationName = "MISKOLC",
            region = "Borsod-Abaúj-Zemplén"
        ),
        WeatherStation(stationId = "12805", stationName = "SOPRON", region = "Győr-Moson-Sopron"),
        WeatherStation(
            stationId = "12815",
            stationName = "MOSONMAGYAROVAR",
            region = "Győr-Moson-Sopron"
        ),
        WeatherStation(stationId = "12822", stationName = "GYOR", region = "Győr-Moson-Sopron"),
        WeatherStation(stationId = "12825", stationName = "PAPA", region = "Wesprim"),
        WeatherStation(stationId = "12830", stationName = "VESZPREM", region = "Wesprim"),
        WeatherStation(stationId = "12843", stationName = "BUDAPEST/LORINC", region = "Budapest"),
        WeatherStation(stationId = "12846", stationName = "AGARD", region = "Weißenburg"),
        WeatherStation(stationId = "12882", stationName = "DEBRECEN", region = "Hajdú-Bihar"),
        WeatherStation(stationId = "12910", stationName = "SZENTGOTTHARD", region = "Eisenburg"),
        WeatherStation(stationId = "12922", stationName = "SARMELLEK", region = "Komitat Zala"),
        WeatherStation(stationId = "12925", stationName = "NAGYKANIZSA", region = "Komitat Zala"),
        WeatherStation(stationId = "12935", stationName = "SIOFOK", region = "Komitat Somogy"),
        WeatherStation(
            stationId = "12942",
            stationName = "PECS/POGANY",
            region = "Komitat Baranya"
        ),
        WeatherStation(stationId = "12970", stationName = "KECSKEMET", region = "Bács-Kiskun"),
        WeatherStation(stationId = "12982", stationName = "SZEGED", region = "Csongrád"),
        WeatherStation(stationId = "12992", stationName = "BEKESCSABA", region = "Békés"),
        WeatherStation(stationId = "13168", stationName = "NOVI SAD", region = "Wojwodina"),
        WeatherStation(stationId = "13262", stationName = "LOZNICA"),
        WeatherStation(stationId = "13269", stationName = "VALJEVO"),
        WeatherStation(stationId = "13272", stationName = "BEOGRAD/SURCIN"),
        WeatherStation(stationId = "13274", stationName = "BELGRAD"),
        WeatherStation(stationId = "13278", stationName = "KRAGUJEVAC"),
        WeatherStation(stationId = "13295", stationName = "NEGOTIN"),
        WeatherStation(stationId = "13367", stationName = "ZLATIBOR"),
        WeatherStation(stationId = "13376", stationName = "KRALJEVO"),
        WeatherStation(stationId = "13378", stationName = "KOPAONIK"),
        WeatherStation(stationId = "13388", stationName = "NIS"),
        WeatherStation(stationId = "13389", stationName = "LESKOVAC"),
        WeatherStation(
            stationId = "13455",
            stationName = "HERCEGNOVI",
            region = "Herceg Novi Municipality"
        ),
        WeatherStation(
            stationId = "13462",
            stationName = "PODGORICA/GOLUBOBCI",
            region = "Großgemeinde Podgorica"
        ),
        WeatherStation(stationId = "13489", stationName = "VRANJE"),
        WeatherStation(
            stationId = "13586",
            stationName = "SKOPJE",
            region = "Municipality of Ilinden"
        ),
        WeatherStation(stationId = "13600", stationName = "SHKODRA", region = "Qark Shkodra"),
        WeatherStation(stationId = "13610", stationName = "KUKES", region = "Qark Kukës"),
        WeatherStation(stationId = "13611", stationName = "DURRES"),
        WeatherStation(stationId = "13615", stationName = "TIRANA", region = "Qark Tirana"),
        WeatherStation(stationId = "14014", stationName = "LJUBLJANA/BRNIK", region = "Kranj"),
        WeatherStation(
            stationId = "14026",
            stationName = "MARIBOR/SLIVNICA",
            region = "Administrative unit Maribor"
        ),
        WeatherStation(stationId = "14236", stationName = "ZAGREB/GRIC", region = "Zagreb"),
        WeatherStation(
            stationId = "14241",
            stationName = "ZAGREB/PLESO",
            region = "Gespanschaft Zagreb"
        ),
        WeatherStation(
            stationId = "14256",
            stationName = "BILOGORA",
            region = "Gespanschaft Virovitica-Podravina"
        ),
        WeatherStation(
            stationId = "14280",
            stationName = "OSIJEK-CEPIN",
            region = "Gespanschaft Osijek-Baranja"
        ),
        WeatherStation(stationId = "14307", stationName = "PULA", region = "Gespanschaft Istrien"),
        WeatherStation(stationId = "14317", stationName = "RIJEKA", region = "Primorje-Gorski"),
        WeatherStation(
            stationId = "14330",
            stationName = "GOSPIC",
            region = "Gespanschaft Lika-Senj"
        ),
        WeatherStation(stationId = "14431", stationName = "ZADAR", region = "Zadar"),
        WeatherStation(
            stationId = "14442",
            stationName = "KNIN",
            region = "Gespanschaft Šibenik-Knin"
        ),
        WeatherStation(
            stationId = "14444",
            stationName = "SPLIT/RESNIK",
            region = "Gespanschaft Split-Dalmatien"
        ),
        WeatherStation(stationId = "14445", stationName = "SPLIT/MARJAN"),
        WeatherStation(
            stationId = "14474",
            stationName = "DUBROVNIK",
            region = "Gespanschaft Dubrovnik-Neretva"
        ),
        WeatherStation(
            stationId = "14528",
            stationName = "BIHAC",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14537",
            stationName = "SANSKI MOST",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14542",
            stationName = "BANJA LUKA",
            region = "Republika Srpska"
        ),
        WeatherStation(
            stationId = "14543",
            stationName = "JAJCE",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14544",
            stationName = "BUGOJNO",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14549",
            stationName = "ZENICA",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14554",
            stationName = "GRADACAC",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14557",
            stationName = "TUZLA",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14640",
            stationName = "LIVNO",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14648",
            stationName = "MOSTAR",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14650",
            stationName = "IVAN SEDLO",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14652",
            stationName = "BJELASNICA",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(
            stationId = "14654",
            stationName = "SARAJEVO-BEJELAVE",
            region = "Föderation Bosnien und Herzegowina"
        ),
        WeatherStation(stationId = "15020", stationName = "BOTOSANI", region = "Kreis Botoșani"),
        WeatherStation(stationId = "15080", stationName = "ORADEA", region = "Kreis Bihor"),
        WeatherStation(stationId = "15120", stationName = "CLUJ-NAPOCA", region = "Kreis Cluj"),
        WeatherStation(stationId = "15145", stationName = "TIRGU MURES", region = "Kreis Mureș"),
        WeatherStation(stationId = "15150", stationName = "BACAU", region = "Barchau"),
        WeatherStation(stationId = "15200", stationName = "ARAD", region = "Kreis Arad"),
        WeatherStation(stationId = "15235", stationName = "FAGARAS", region = "Kreis Brașov"),
        WeatherStation(stationId = "15247", stationName = "TIMISOARA", region = "Kreis Timiș"),
        WeatherStation(stationId = "15260", stationName = "SIBIU", region = "Hermannstadt"),
        WeatherStation(stationId = "15302", stationName = "PREDEAL", region = "Kreis Brașov"),
        WeatherStation(
            stationId = "15338",
            stationName = "ORAVITA",
            region = "Kreis Caraș-Severin"
        ),
        WeatherStation(stationId = "15420", stationName = "BUKAREST", region = "Kreis Ilfov"),
        WeatherStation(
            stationId = "15421",
            stationName = "BUKAREST/OTOPENI",
            region = "Kreis Ilfov"
        ),
        WeatherStation(stationId = "15480", stationName = "CONSTANTA", region = "Kreis Constanța"),
        WeatherStation(stationId = "15552", stationName = "VARNA", region = "Oblast Warna"),
        WeatherStation(stationId = "15614", stationName = "SOFIA", region = "Oblast Sofia-Stadt"),
        WeatherStation(stationId = "15655", stationName = "BURGAS"),
        WeatherStation(
            stationId = "16008",
            stationName = "RESCHENPASS",
            region = "Trentino-Südtirol"
        ),
        WeatherStation(stationId = "16020", stationName = "BOZEN", region = "Trentino-Südtirol"),
        WeatherStation(
            stationId = "16021",
            stationName = "PASSO ROLLE",
            region = "Trentino-Südtirol"
        ),
        WeatherStation(
            stationId = "16022",
            stationName = "PAGANELLA",
            region = "Trentino-Südtirol"
        ),
        WeatherStation(stationId = "16033", stationName = "DOBBIACO", region = "Trentino-Südtirol"),
        WeatherStation(
            stationId = "16036",
            stationName = "AVIANO",
            region = "Friaul-Julisch Venetien"
        ),
        WeatherStation(
            stationId = "16040",
            stationName = "TARVISIO",
            region = "Friaul-Julisch Venetien"
        ),
        WeatherStation(
            stationId = "16045",
            stationName = "UDINE/RIVOLTO",
            region = "Friaul-Julisch Venetien"
        ),
        WeatherStation(stationId = "16052", stationName = "PIAN ROSA", region = "Aostatal"),
        WeatherStation(stationId = "16054", stationName = "AOSTA", region = "Aostatal"),
        WeatherStation(stationId = "16059", stationName = "TURIN", region = "Piemont"),
        WeatherStation(stationId = "16066", stationName = "MILANO/MALPENSA", region = "Lombardei"),
        WeatherStation(stationId = "16076", stationName = "BERGAMO", region = "Lombardei"),
        WeatherStation(stationId = "16080", stationName = "MAILAND", region = "Lombardei"),
        WeatherStation(stationId = "16084", stationName = "PIACENZA", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16088", stationName = "BRESCIA/GHEDI", region = "Lombardei"),
        WeatherStation(stationId = "16090", stationName = "VERONA", region = "Venetien"),
        WeatherStation(stationId = "16105", stationName = "VENEDIG", region = "Venetien"),
        WeatherStation(stationId = "16110", stationName = "TRIEST"),
        WeatherStation(stationId = "16117", stationName = "CUNEO LEVALDIGI", region = "Piemont"),
        WeatherStation(stationId = "16120", stationName = "GENUA", region = "Ligurien"),
        WeatherStation(stationId = "16125", stationName = "SARZANA/LUNI", region = "Ligurien"),
        WeatherStation(stationId = "16130", stationName = "PARMA", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16138", stationName = "FERRARA", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16140", stationName = "BOLOGNA", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16146", stationName = "PUNTA MARINA"),
        WeatherStation(stationId = "16147", stationName = "FORLI", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16149", stationName = "RIMINI", region = "Emilia-Romagna"),
        WeatherStation(stationId = "16158", stationName = "PISA-S.GIUSTO", region = "Toskana"),
        WeatherStation(stationId = "16170", stationName = "FLORENZ", region = "Toskana"),
        WeatherStation(stationId = "16191", stationName = "FALCONARA", region = "Marken"),
        WeatherStation(stationId = "16206", stationName = "GROSSETO", region = "Toskana"),
        WeatherStation(stationId = "16219", stationName = "MONTE TERMINILLO", region = "Latium"),
        WeatherStation(stationId = "16226", stationName = "L'AQUILA", region = "Abruzzen"),
        WeatherStation(stationId = "16230", stationName = "PESCARA", region = "Abruzzen"),
        WeatherStation(stationId = "16242", stationName = "ROM", region = "Latium"),
        WeatherStation(stationId = "16244", stationName = "FROSINONE", region = "Latium"),
        WeatherStation(stationId = "16245", stationName = "PRATICA DI MARE", region = "Latium"),
        WeatherStation(stationId = "16252", stationName = "CAMPOBASSO", region = "Molise"),
        WeatherStation(stationId = "16261", stationName = "AMENDOLA", region = "Apulien"),
        WeatherStation(stationId = "16270", stationName = "BARI", region = "Apulien"),
        WeatherStation(stationId = "16280", stationName = "PONZA"),
        WeatherStation(stationId = "16289", stationName = "NEAPEL", region = "Kampanien"),
        WeatherStation(stationId = "16292", stationName = "PONTECAGNANO", region = "Kampanien"),
        WeatherStation(stationId = "16294", stationName = "CAPRI", region = "Kampanien"),
        WeatherStation(stationId = "16320", stationName = "BRINDISI", region = "Apulien"),
        WeatherStation(stationId = "16325", stationName = "MARINA DI GINOSA", region = "Apulien"),
        WeatherStation(stationId = "16362", stationName = "LAMEZIA TERME", region = "Kalabrien"),
        WeatherStation(stationId = "16405", stationName = "PALERMO", region = "Sizilien"),
        WeatherStation(stationId = "16420", stationName = "MESSINA", region = "Sizilien"),
        WeatherStation(stationId = "16422", stationName = "REGGIO CALABRIA", region = "Kalabrien"),
        WeatherStation(stationId = "16429", stationName = "TRAPANI/BIRGI", region = "Sizilien"),
        WeatherStation(stationId = "16434", stationName = "PRIZZI", region = "Sizilien"),
        WeatherStation(stationId = "16453", stationName = "GELA", region = "Sizilien"),
        WeatherStation(stationId = "16460", stationName = "CATANIA", region = "Sizilien"),
        WeatherStation(stationId = "16464", stationName = "SIRACUSA /SICI", region = "Sizilien"),
        WeatherStation(
            stationId = "16531",
            stationName = "OLBIA/COSTA SMERALDA",
            region = "Sardinien"
        ),
        WeatherStation(stationId = "16549", stationName = "CARLOFORTE / ISOLA"),
        WeatherStation(stationId = "16550", stationName = "CAPO BELLAVISTA"),
        WeatherStation(stationId = "16560", stationName = "CAGLIARI", region = "Sardinien"),
        WeatherStation(stationId = "16597", stationName = "MALTA"),
        WeatherStation(
            stationId = "16606",
            stationName = "SERRAI",
            region = "Decentralized Administration of Macedonia and Thrace"
        ),
        WeatherStation(
            stationId = "16622",
            stationName = "THESSALONIKI",
            region = "Decentralized Administration of Macedonia and Thrace"
        ),
        WeatherStation(
            stationId = "16624",
            stationName = "CHRYSOUPOLI",
            region = "Decentralized Administration of Macedonia and Thrace"
        ),
        WeatherStation(
            stationId = "16627",
            stationName = "ALEXANDROUPOLI",
            region = "Decentralized Administration of Macedonia and Thrace"
        ),
        WeatherStation(
            stationId = "16632",
            stationName = "KOZANI",
            region = "Dezentralisierte Verwaltung von Epirus und Westmakedonien"
        ),
        WeatherStation(
            stationId = "16641",
            stationName = "KORFU",
            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
        ),
        WeatherStation(
            stationId = "16642",
            stationName = "IOANNINA NATIONAL",
            region = "Dezentralisierte Verwaltung von Epirus und Westmakedonien"
        ),
        WeatherStation(
            stationId = "16648",
            stationName = "LARISSA",
            region = "Decentralized Administration of Thessaly and Central Greece"
        ),
        WeatherStation(
            stationId = "16650",
            stationName = "LIMNOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(stationId = "16667", stationName = "MYTILINI/AIRPORT"),
        WeatherStation(
            stationId = "16675",
            stationName = "STYLIS LAMIA",
            region = "Decentralized Administration of Thessaly and Central Greece"
        ),
        WeatherStation(
            stationId = "16682",
            stationName = "ANDRAVIDA",
            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
        ),
        WeatherStation(
            stationId = "16684",
            stationName = "SKYROS",
            region = "Decentralized Administration of Thessaly and Central Greece"
        ),
        WeatherStation(
            stationId = "16685",
            stationName = "KEFALHNIA",
            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
        ),
        WeatherStation(
            stationId = "16706",
            stationName = "CHIOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(
            stationId = "16710",
            stationName = "TRIPOLIS/INTL",
            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
        ),
        WeatherStation(stationId = "16716", stationName = "ATHEN", region = "Attika"),
        WeatherStation(
            stationId = "16723",
            stationName = "SAMOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(
            stationId = "16726",
            stationName = "KALAMATA",
            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
        ),
        WeatherStation(
            stationId = "16732",
            stationName = "NAXOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(
            stationId = "16741",
            stationName = "PAROS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(
            stationId = "16742",
            stationName = "KOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(stationId = "16743", stationName = "KYTHIRA", region = "Attika"),
        WeatherStation(stationId = "16746", stationName = "SOUDA/AIRPORT"),
        WeatherStation(
            stationId = "16749",
            stationName = "RHODOS",
            region = "Decentralized Administration of the Aegean"
        ),
        WeatherStation(stationId = "16754", stationName = "HERAKLION", region = "Kreta"),
        WeatherStation(stationId = "16759", stationName = "TYMBAKION", region = "Kreta"),
        WeatherStation(stationId = "16765", stationName = "KARPATHOS"),
        WeatherStation(stationId = "17022", stationName = "ZONGULDAK", region = "Zonguldak"),
        WeatherStation(stationId = "17024", stationName = "INEBOLU"),
        WeatherStation(stationId = "17026", stationName = "SINOP", region = "Sinop"),
        WeatherStation(stationId = "17030", stationName = "SAMSUN", region = "Samsun"),
        WeatherStation(stationId = "17031", stationName = "CARSAMBA/SAMSUN", region = "Samsun"),
        WeatherStation(stationId = "17050", stationName = "EDIRNE", region = "Edirne"),
        WeatherStation(stationId = "17056", stationName = "TEKIRDAG", region = "Tekirdağ"),
        WeatherStation(stationId = "17060", stationName = "ISTANBUL", region = "Istanbul"),
        WeatherStation(stationId = "17070", stationName = "BOLU", region = "Bolu"),
        WeatherStation(stationId = "17090", stationName = "SIVAS", region = "Sivas"),
        WeatherStation(stationId = "17116", stationName = "BURSA", region = "Bursa"),
        WeatherStation(stationId = "17128", stationName = "ANKARA", region = "Ankara"),
        WeatherStation(stationId = "17195", stationName = "KAYSERI/ERKILET", region = "Kayseri"),
        WeatherStation(stationId = "17219", stationName = "IZMIR/ADNAN MENDERE", region = "Izmir"),
        WeatherStation(stationId = "17240", stationName = "ISPARTA", region = "Isparta"),
        WeatherStation(stationId = "17244", stationName = "KONYA", region = "Konya"),
        WeatherStation(stationId = "17260", stationName = "GAZIANTEP", region = "Gaziantep"),
        WeatherStation(stationId = "17290", stationName = "BODRUM"),
        WeatherStation(stationId = "17295", stationName = "MUGLA/DALAMAN", region = "Muğla"),
        WeatherStation(stationId = "17300", stationName = "ANTALYA"),
        WeatherStation(stationId = "17350", stationName = "ADANA", region = "Adana"),
        WeatherStation(
            stationId = "17600",
            stationName = "PAPHOS AIRPORT",
            region = "Bezirk Paphos"
        ),
        WeatherStation(
            stationId = "17601",
            stationName = "AKROTIRI",
            region = "Akrotiri und Dekelia"
        ),
        WeatherStation(stationId = "17609", stationName = "LARNAKA", region = "Bezirk Larnaka"),
        WeatherStation(stationId = "26038", stationName = "TALLIN", region = "Kreis Harju"),
        WeatherStation(
            stationId = "26063",
            stationName = "ST.PETERSBURG",
            region = "Sankt Petersburg"
        ),
        WeatherStation(stationId = "26115", stationName = "RISTNA", region = "Kreis Hiiu"),
        WeatherStation(stationId = "26242", stationName = "TARTU", region = "Kreis Tartu"),
        WeatherStation(stationId = "26298", stationName = "BOLOGOE", region = "Oblast Twer"),
        WeatherStation(stationId = "26314", stationName = "VENTSPILS", region = "Ventspils"),
        WeatherStation(stationId = "26406", stationName = "LIEPAJA", region = "City of Liepāja"),
        WeatherStation(stationId = "26422", stationName = "RIGA", region = "Riga"),
        WeatherStation(stationId = "26509", stationName = "KLAIPEDA", region = "Bezirk Klaipėda"),
        WeatherStation(stationId = "26524", stationName = "SIAULIAI", region = "Bezirk Šiauliai"),
        WeatherStation(
            stationId = "26554",
            stationName = "VERKHNEDVINSK",
            region = "Wizebskaja Woblasz"
        ),
        WeatherStation(
            stationId = "26629",
            stationName = "KAUNAS POCIUNAI",
            region = "Bezirk Kaunas"
        ),
        WeatherStation(stationId = "26659", stationName = "LEPEL", region = "Wizebskaja Woblasz"),
        WeatherStation(stationId = "26666", stationName = "VITEBSK", region = "Wizebskaja Woblasz"),
        WeatherStation(
            stationId = "26702",
            stationName = "KOENIGSBERG",
            region = "Oblast Kaliningrad"
        ),
        WeatherStation(stationId = "26730", stationName = "VILNIUS", region = "Bezirk Vilnius"),
        WeatherStation(
            stationId = "26825",
            stationName = "GRODNO",
            region = "Hrodsenskaja Woblasz"
        ),
        WeatherStation(stationId = "26850", stationName = "MINSK", region = "Minskaja Woblasz"),
        WeatherStation(
            stationId = "26863",
            stationName = "MOGILEV YERM.",
            region = "Mahiljouskaja Woblasz"
        ),
        WeatherStation(
            stationId = "26887",
            stationName = "KOSTUCKOVICHI",
            region = "Mahiljouskaja Woblasz"
        ),
        WeatherStation(stationId = "33008", stationName = "BREST", region = "Breszkaja Woblasz"),
        WeatherStation(
            stationId = "33027",
            stationName = "ZHITCKOVICHI",
            region = "Homelskaja Woblasz"
        ),
        WeatherStation(stationId = "33041", stationName = "GOMEL", region = "Homelskaja Woblasz"),
        WeatherStation(stationId = "33261", stationName = "KONOTOP", region = "Sumy"),
        WeatherStation(stationId = "33345", stationName = "KIEW", region = "Kyiv city"),
        WeatherStation(
            stationId = "33526",
            stationName = "IVANO-FRANKIVSK",
            region = "Iwano-Frankiwsk"
        ),
        WeatherStation(
            stationId = "33791",
            stationName = "KRYVYI RIH",
            region = "Oblast Dnipropetrowsk"
        ),
        WeatherStation(
            stationId = "33815",
            stationName = "KISHINEV/KICHINAU",
            region = "Rajon Criuleni"
        ),
        WeatherStation(stationId = "33837", stationName = "ODESSA", region = "Odessa"),
        WeatherStation(stationId = "33990", stationName = "JALTA"),
        WeatherStation(stationId = "34300", stationName = "KHARKIV", region = "Oblast Charkiw"),
        WeatherStation(
            stationId = "34504",
            stationName = "DNIPROPETROVSK",
            region = "Oblast Dnipropetrowsk"
        ),
        WeatherStation(stationId = "40007", stationName = "ALEPPO", region = "Aleppo"),
        WeatherStation(
            stationId = "40080",
            stationName = "DAMASCUS",
            region = "Gouvernement Rif Dimaschq"
        ),
        WeatherStation(stationId = "40100", stationName = "BEIRUT"),
        WeatherStation(stationId = "40180", stationName = "TEL AVIV", region = "Zentralbezirk"),
        WeatherStation(stationId = "40199", stationName = "EILAT", region = "Südbezirk"),
        WeatherStation(stationId = "40270", stationName = "AMMAN", region = "Gouvernement Amman"),
        WeatherStation(
            stationId = "40272",
            stationName = "AMMAN/QUENN ALIA",
            region = "Gouvernement Amman"
        ),
        WeatherStation(stationId = "60101", stationName = "TANGER"),
        WeatherStation(stationId = "60115", stationName = "OUJDA", region = "Saida"),
        WeatherStation(stationId = "60135", stationName = "RABAT", region = "Fès-Meknès"),
        WeatherStation(stationId = "60141", stationName = "FES-SAIS", region = "Oriental"),
        WeatherStation(stationId = "60150", stationName = "MEKNES", region = "Fès-Meknès"),
        WeatherStation(
            stationId = "60155",
            stationName = "CASABLANCA",
            region = "Rabat-Salé-Kénitra"
        ),
        WeatherStation(
            stationId = "60156",
            stationName = "CASABLANCA/MOHAMED",
            region = "Rabat-Salé-Kénitra"
        ),
        WeatherStation(stationId = "60230", stationName = "MARRAKECH", region = "Marrakesch-Safi"),
        WeatherStation(
            stationId = "60252",
            stationName = "AGADIR/AL MASSIRA",
            region = "Souss-Massa"
        ),
        WeatherStation(stationId = "60338", stationName = "MELILLA", region = "Ain Temouchent"),
        WeatherStation(stationId = "60360", stationName = "ANNABA", region = "Annaba"),
        WeatherStation(stationId = "60390", stationName = "ALGIER", region = "Algier"),
        WeatherStation(stationId = "60419", stationName = "CONSTANTINE", region = "Constantine"),
        WeatherStation(stationId = "60475", stationName = "TEBESSA", region = "Tebessa"),
        WeatherStation(stationId = "60490", stationName = "ORAN/ES SENIA", region = "Relizane"),
        WeatherStation(stationId = "60566", stationName = "GHARDAIA", region = "Ghardaia"),
        WeatherStation(stationId = "60571", stationName = "BECHAR", region = "Bechar"),
        WeatherStation(stationId = "60590", stationName = "EL-GOLEA", region = "Ghardaia"),
        WeatherStation(
            stationId = "60710",
            stationName = "TABARKA",
            region = "Gouvernement Jendouba"
        ),
        WeatherStation(stationId = "60715", stationName = "TUNIS", region = "Gouvernement Tunis"),
        WeatherStation(
            stationId = "60725",
            stationName = "JENDOUBA",
            region = "Gouvernement Jendouba"
        ),
        WeatherStation(
            stationId = "60735",
            stationName = "KAIROUAN",
            region = "Gouvernement Kairouan"
        ),
        WeatherStation(
            stationId = "60740",
            stationName = "MONASTIR/HABIB BOUR",
            region = "Gouvernement Monastir"
        ),
        WeatherStation(stationId = "60750", stationName = "SFAX EL-MAOU", region = "sfaks"),
        WeatherStation(stationId = "60760", stationName = "TOZEUR", region = "Gouvernement Tozeur"),
        WeatherStation(stationId = "60765", stationName = "GABES", region = "Gabès"),
        WeatherStation(stationId = "60769", stationName = "DJERBA"),
        WeatherStation(stationId = "62010", stationName = "TRIPOLI", region = "Tripolis"),
        WeatherStation(stationId = "62019", stationName = "SIRTE", region = "Munizip Surt"),
        WeatherStation(stationId = "62053", stationName = "BENGHAZI", region = "Munizip Bengasi"),
        WeatherStation(
            stationId = "62305",
            stationName = "SALLUM PLATEAU",
            region = "Gouvernement Matruh"
        ),
        WeatherStation(
            stationId = "62306",
            stationName = "MERSA MATRUH",
            region = "Gouvernement Matruh"
        ),
        WeatherStation(
            stationId = "62318",
            stationName = "ALEXANDRIA/NOUZHA",
            region = "Gouvernement al-Iskandariyya"
        ),
        WeatherStation(
            stationId = "62332",
            stationName = "PORT SAID",
            region = "Gouvernement Bur Saʿid"
        ),
        WeatherStation(
            stationId = "62366",
            stationName = "KAIRO",
            region = "Gouvernement Al-Qahira"
        ),
        WeatherStation(stationId = "A051 ", stationName = "WEESBY", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A112 ",
            stationName = "WRIXUM/FOEHR",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A138 ",
            stationName = "BORDELUM",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A159 ", stationName = "EGGEBEK", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A160 ",
            stationName = "FLENSBURG (SCHAEFERH",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A173 ", stationName = "SATRUP", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A191 ",
            stationName = "WAGERSROTT",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A201 ",
            stationName = "HALLIG HOOGE",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A216 ", stationName = "STRUCKLAHNUNGSHOERN"),
        WeatherStation(
            stationId = "A226 ",
            stationName = "HATTSTEDT",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A345 ",
            stationName = "GROSS WITTENSEE",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A351 ", stationName = "ERFDE", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A397 ",
            stationName = "GROSSENBRODE",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A411 ", stationName = "KREMPEL", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A443 ",
            stationName = "OSTENFELD (RENDSBURG",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A473 ", stationName = "KOEHN", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "A480 ", stationName = "PUTLOS"),
        WeatherStation(
            stationId = "A481 ",
            stationName = "HOHWACHT",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A505 ", stationName = "BUESUM"),
        WeatherStation(stationId = "A536 ", stationName = "HAALE", region = "Schleswig-Holstein"),
        WeatherStation(
            stationId = "A653 ",
            stationName = "PADENSTEDT (PONY-PAR",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A699 ",
            stationName = "TRAVEMUENDE",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A752 ",
            stationName = "WEDDELBROOK",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A762 ",
            stationName = "WITTENBORN",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(
            stationId = "A791 ",
            stationName = "SCHWARTAU,BAD -GROSS",
            region = "Schleswig-Holstein"
        ),
        WeatherStation(stationId = "A940 ", stationName = "SPRENGE", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "A981 ", stationName = "GRAMBEK", region = "Schleswig-Holstein"),
        WeatherStation(stationId = "B006 ", stationName = "HIDDENSEE-VITTE"),
        WeatherStation(
            stationId = "B040 ",
            stationName = "DARSSER ORT (SWN)",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B085 ",
            stationName = "SAGARD",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B158 ",
            stationName = "STEINHAGEN-NEGAST",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B203 ",
            stationName = "BASTORF-KAEGSDORF (S",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B258 ",
            stationName = "TRIBSEES",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B308 ",
            stationName = "KIRCHDORF/POEL",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B320 ",
            stationName = "GERSDORF",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B334 ",
            stationName = "GROSS LUESEWITZ",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B365 ",
            stationName = "SUEDERHOLZ-NEUENDORF",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B382 ",
            stationName = "KARLSHAGEN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B482 ",
            stationName = "GROSS KIESOW-SCHLAGT",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B488 ",
            stationName = "ANKLAM",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B511 ",
            stationName = "GREVESMUEHLEN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B525 ",
            stationName = "VENTSCHOW",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B531 ",
            stationName = "BAUMGARTEN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B544 ",
            stationName = "PARUM",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B556 ",
            stationName = "TETEROW",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B587 ",
            stationName = "RATHEBUR",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B629 ",
            stationName = "GOLDENBOW",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B670 ",
            stationName = "FRIEDLAND",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B687 ",
            stationName = "ROTHEMUEHL",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B710 ",
            stationName = "DODOW",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B728 ",
            stationName = "NEUSTADT-GLEWE-FRIED",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B747 ",
            stationName = "PLAU AM SEE",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B766 ",
            stationName = "GROSS LUKOW",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B818 ",
            stationName = "REDEFIN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B853 ",
            stationName = "RECHLIN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B898 ",
            stationName = "GRAMBOW-SCHWENNENZ",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B926 ",
            stationName = "MALK GOEHREN",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "B951 ",
            stationName = "KRUEMMEL",
            region = "Mecklenburg-Vorpommern"
        ),
        WeatherStation(
            stationId = "C720 ",
            stationName = "HAMBURG-NEUWIEDENTH.",
            region = "Hamburg"
        ),
        WeatherStation(
            stationId = "E006 ",
            stationName = "BORKUM-SUEDERSTRASSE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E008 ",
            stationName = "BORKUM-FLUGPLATZ",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E025 ", stationName = "DORNUM", region = "Niedersachsen"),
        WeatherStation(stationId = "E031 ", stationName = "SPIEKEROOG (SWN)"),
        WeatherStation(stationId = "E043 ", stationName = "WANGERLAND-HOOKSIEL"),
        WeatherStation(
            stationId = "E067 ",
            stationName = "LANGEN-HOLSSEL, KREI",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E078 ",
            stationName = "STEINAU,KR.CUXHAVEN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E082 ",
            stationName = "FREIBURG/ELBE",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E087 ", stationName = "LAMSTEDT", region = "Niedersachsen"),
        WeatherStation(stationId = "E091 ", stationName = "DROCHTERSEN", region = "Niedersachsen"),
        WeatherStation(stationId = "E095 ", stationName = "RUTHENSTROM", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E099 ",
            stationName = "MITTELNKIRCHEN-HOHEN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E103 ",
            stationName = "NORDEN-LEYBUCHTPOLDE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E145 ",
            stationName = "BUTJADINGEN-INTE",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E158 ", stationName = "BEVERSTEDT", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E200 ",
            stationName = "BOCKHORN-GRABSTEDE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E207 ",
            stationName = "DOLLART-KANALPOLDER",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E212 ",
            stationName = "MOORMERLAND-NEERMOOR",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E229 ", stationName = "WESTERSTEDE", region = "Niedersachsen"),
        WeatherStation(stationId = "E232 ", stationName = "OVELGOENNE", region = "Niedersachsen"),
        WeatherStation(stationId = "E234 ", stationName = "RASTEDE", region = "Niedersachsen"),
        WeatherStation(stationId = "E235 ", stationName = "BRAKE", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E246 ",
            stationName = "SCHWANEWEDE-NEUENKIR",
            region = "Bremen"
        ),
        WeatherStation(
            stationId = "E254 ",
            stationName = "WORPSWEDE-HUETTENBUS",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E277 ", stationName = "KOENIGSMOOR", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E297 ",
            stationName = "BLECKEDE-WALMSBURG",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E298 ",
            stationName = "WENDISCH EVERN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E335 ",
            stationName = "HUDE/OLDENBURG",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E342 ",
            stationName = "OTTERSBERG-OTTERSTED",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E355 ",
            stationName = "ROTENBURG (WÜMME)",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E364 ",
            stationName = "HEESLINGEN-WIERSDORF",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E387 ", stationName = "ZERNIEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E426 ",
            stationName = "GROSSENKNETEN-AHL.",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E438 ", stationName = "BASSUM", region = "Niedersachsen"),
        WeatherStation(stationId = "E445 ", stationName = "SCHWARME", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E451 ",
            stationName = "VERDEN-DAUELSEN",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E475 ", stationName = "UELZEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E501 ",
            stationName = "TWIST-HEBELERMEER",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E513 ",
            stationName = "GROSS BERSSEN",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E525 ", stationName = "LOENINGEN", region = "Niedersachsen"),
        WeatherStation(stationId = "E545 ", stationName = "BARNSTORF", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E564 ",
            stationName = "FRANKENFELD-HEDERN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E571 ",
            stationName = "FALLINGBOSTEL, BAD",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E586 ",
            stationName = "SCHARNHORST-MARWEDE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E601 ",
            stationName = "RINGE-GROSSRINGE",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E626 ", stationName = "ALFHAUSEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E651 ",
            stationName = "KIRCHDORF, KREIS DIE",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E652 ", stationName = "NIENBURG", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E659 ",
            stationName = "REHBURG-LOCCUM",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E662 ", stationName = "ESSEL", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E667 ",
            stationName = "NEUSTADT AM RUEBENBE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E672 ",
            stationName = "WEDEMARK-ELZE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E673 ",
            stationName = "CELLE (STADT)",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E688 ", stationName = "UETZE", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E691 ",
            stationName = "WITTINGEN-VORHOP",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E704 ",
            stationName = "BENTHEIM, BAD",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E727 ",
            stationName = "ROTHENFELDE, BAD",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E732 ", stationName = "HAMELN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E738 ",
            stationName = "RINTELN-VOLKSEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "E739 ",
            stationName = "HAMELN-HASTENBECK",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E744 ",
            stationName = "BARSINGHAUSEN-HOHENB",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E748 ",
            stationName = "SALZHEMMENDORF-LAUEN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E755 ",
            stationName = "HANNOVER-HERRENHAUSE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E756 ",
            stationName = "HANNOVER-KIRCHRODE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E762 ",
            stationName = "LEHRTE-SIEVERSHAUSEN",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E764 ", stationName = "SPRINGE", region = "Niedersachsen"),
        WeatherStation(stationId = "E792 ", stationName = "SUEPPLINGEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E799 ",
            stationName = "CREMLINGEN-DESTEDT",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E805 ", stationName = "OTTENSTEIN", region = "Niedersachsen"),
        WeatherStation(stationId = "E818 ", stationName = "BEVERN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E835 ",
            stationName = "EIMEN-VORWOHLE",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E839 ",
            stationName = "MORINGEN-LUTTERBECK",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E857 ",
            stationName = "NORTHEIM-STOECKHEIM",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E858 ",
            stationName = "NORTHEIM-IMBSHAUSEN",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E864 ", stationName = "SEESEN", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E871 ",
            stationName = "LIEBENBURG-OTHFRESEN",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E884 ",
            stationName = "LANGELSHEIM-ASTFELD",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E897 ", stationName = "BAD HARZBURG", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E902 ",
            stationName = "BODENFELDE-AMELITH",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "E944 ", stationName = "HERZBERG", region = "Niedersachsen"),
        WeatherStation(
            stationId = "E950 ",
            stationName = "HERZBERG-LONAU",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E955 ",
            stationName = "LAUTERBERG,BAD-BARTO",
            region = "Niedersachsen"
        ),
        WeatherStation(
            stationId = "E970 ",
            stationName = "DRANSFELD-OSSENFELD",
            region = "Niedersachsen"
        ),
        WeatherStation(stationId = "F020 ", stationName = "MEYENBURG", region = "Brandenburg"),
        WeatherStation(
            stationId = "F050 ",
            stationName = "UCKERLAND-KARLSTEIN",
            region = "Brandenburg"
        ),
        WeatherStation(
            stationId = "F069 ",
            stationName = "HOHENREINKENDORF",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F105 ", stationName = "LENZEN/ELBE", region = "Brandenburg"),
        WeatherStation(
            stationId = "F108 ",
            stationName = "KARSTAEDT/PRIGNITZ",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F125 ", stationName = "KUHBIER", region = "Brandenburg"),
        WeatherStation(
            stationId = "F143 ",
            stationName = "WITTSTOCK-ROTE MÜHLE",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F151 ", stationName = "MENZ", region = "Brandenburg"),
        WeatherStation(
            stationId = "F172 ",
            stationName = "MITTENWALDE/UCKERMAR",
            region = "Brandenburg"
        ),
        WeatherStation(
            stationId = "F178 ",
            stationName = "NEURUPPIN-GUEHLEN GL",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F191 ", stationName = "PASSOW", region = "Brandenburg"),
        WeatherStation(
            stationId = "F199 ",
            stationName = "BERKHOLZ-MEYENBURG",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F210 ", stationName = "PERLEBERG", region = "Brandenburg"),
        WeatherStation(stationId = "F263 ", stationName = "ZEHDENICK", region = "Brandenburg"),
        WeatherStation(
            stationId = "F280 ",
            stationName = "FRIEDRICHSWALDE",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F305 ", stationName = "KLESSEN", region = "Brandenburg"),
        WeatherStation(
            stationId = "F325 ",
            stationName = "KREMMEN-GROSS ZIETHE",
            region = "Brandenburg"
        ),
        WeatherStation(
            stationId = "F338 ",
            stationName = "MARWITZ (WASSERWERK)",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F361 ", stationName = "HECKELBERG", region = "Brandenburg"),
        WeatherStation(stationId = "F385 ", stationName = "WUSTROW", region = "Brandenburg"),
        WeatherStation(stationId = "F419 ", stationName = "WUSTERWITZ", region = "Brandenburg"),
        WeatherStation(stationId = "F431 ", stationName = "BERGE", region = "Brandenburg"),
        WeatherStation(stationId = "F448 ", stationName = "STAAKEN", region = "Berlin"),
        WeatherStation(stationId = "F451 ", stationName = "AHRENSFELDE", region = "Brandenburg"),
        WeatherStation(stationId = "F470 ", stationName = "STRAUSBERG", region = "Brandenburg"),
        WeatherStation(stationId = "F475 ", stationName = "MUENCHEBERG", region = "Brandenburg"),
        WeatherStation(
            stationId = "F518 ",
            stationName = "BRANDENBURG/HAVEL",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F520 ", stationName = "GROSS KREUTZ", region = "Brandenburg"),
        WeatherStation(stationId = "F545 ", stationName = "THYROW", region = "Brandenburg"),
        WeatherStation(stationId = "F598 ", stationName = "POHLITZ", region = "Brandenburg"),
        WeatherStation(
            stationId = "F620 ",
            stationName = "BRUECK-GOEMNIGK",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F635 ", stationName = "FELGENTREU", region = "Brandenburg"),
        WeatherStation(stationId = "F660 ", stationName = "MUENCHEHOFE", region = "Brandenburg"),
        WeatherStation(stationId = "F681 ", stationName = "NEU MADLITZ", region = "Brandenburg"),
        WeatherStation(stationId = "F695 ", stationName = "COSCHEN", region = "Brandenburg"),
        WeatherStation(stationId = "F707 ", stationName = "LANGENLIPSDORF", region = "Brandenburg"),
        WeatherStation(stationId = "F736 ", stationName = "HOHENBUCKO", region = "Brandenburg"),
        WeatherStation(
            stationId = "F742 ",
            stationName = "LUEBBEN-BLUMENFELDE",
            region = "Brandenburg"
        ),
        WeatherStation(
            stationId = "F757 ",
            stationName = "BISCHDORF, KREIS OBE",
            region = "Brandenburg"
        ),
        WeatherStation(stationId = "F770 ", stationName = "LIEBEROSE", region = "Brandenburg"),
        WeatherStation(stationId = "F878 ", stationName = "GRAUSTEIN", region = "Brandenburg"),
        WeatherStation(stationId = "F925 ", stationName = "ELSTERWERDA", region = "Brandenburg"),
        WeatherStation(stationId = "F951 ", stationName = "KLETTWITZ", region = "Brandenburg"),
        WeatherStation(stationId = "G002 ", stationName = "BERLIN-BUCH", region = "Berlin"),
        WeatherStation(stationId = "G005 ", stationName = "BERLIN-MARZAHN", region = "Berlin"),
        WeatherStation(stationId = "G006 ", stationName = "BERLIN-KANISWALL", region = "Berlin"),
        WeatherStation(
            stationId = "H009 ",
            stationName = "WESTERKAPPELN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H012 ",
            stationName = "RAHDEN-VARL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H027 ",
            stationName = "PETERSHAGEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H058 ",
            stationName = "STEINFURT-BURGSTEINF",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H061 ",
            stationName = "HOERSTEL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H081 ",
            stationName = "ESPELKAMP-ISENSTEDT",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H119 ",
            stationName = "COESFELD",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H142 ",
            stationName = "LIENEN-KATTENVENNE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H145 ",
            stationName = "OSTBEVERN-SCHIRLHEID",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H170 ", stationName = "ENGER", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H174 ",
            stationName = "BIELEFELD-DEPPENDORF",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H203 ", stationName = "KLEVE", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H212 ",
            stationName = "DAHLEM-SCHMIDTHEIM",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H235 ",
            stationName = "REKEN-GROSS REKEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H247 ",
            stationName = "LUEDINGHAUSEN-BROCH.",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H257 ",
            stationName = "DRENSTEINFURT",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H261 ",
            stationName = "HARSEWINKEL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H265 ",
            stationName = "GUETERSLOH/EMS",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H281 ",
            stationName = "LAGE, KREIS LIPPE-HO",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H311 ", stationName = "XANTEN", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H330 ",
            stationName = "HALTERN (WASSERWERK)",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H333 ", stationName = "OLFEN", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H361 ",
            stationName = "BECKUM-UNTERBERG",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H372 ",
            stationName = "DELBRUECK",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H376 ",
            stationName = "SALZKOTTEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H377 ",
            stationName = "LIPPSTADT-BOEKENFOER",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H391 ", stationName = "BRAKEL", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H401 ",
            stationName = "GELDERN-WALBECK",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H411 ",
            stationName = "BORKEN/WESTFALEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H419 ",
            stationName = "DUISBURG-BAERL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H420 ",
            stationName = "DINSLAKEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H432 ", stationName = "BOCHUM", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H443 ",
            stationName = "WALTROP-ABDINGHOF",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H450 ",
            stationName = "FROENDENBERG-HOHENHE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H460 ",
            stationName = "SASSENDORF, BAD-BEUS",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H475 ",
            stationName = "RUETHEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H477 ",
            stationName = "WUENNENBERG-EILERN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H492 ",
            stationName = "BORGENTREICH",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H512 ",
            stationName = "NETTETAL-HUELST",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H522 ",
            stationName = "TOENISVORST",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H542 ",
            stationName = "GEVELSBERG-OBERB.",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H543 ",
            stationName = "BRECKERFELD-WENGEBER",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H547 ",
            stationName = "BUCHENHOFEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H568 ",
            stationName = "NEUENRADE-BLINTROP",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H572 ",
            stationName = "ARNSBERG-NEHEIM",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H573 ",
            stationName = "ARNSBERG-MUESCHEDE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "H579 ", stationName = "ESLOHE", region = "Nordrhein-Westfalen"),
        WeatherStation(
            stationId = "H581 ",
            stationName = "WARSTEIN-HIRSCHBERG",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H591 ",
            stationName = "BRILON-THÜLEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H606 ",
            stationName = "HEINSBERG-SCHLEIDEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H612 ",
            stationName = "REICHSHOF-ECKENHAGEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H635 ",
            stationName = "DORMAGEN-ZONS",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H641 ",
            stationName = "SOLINGEN-HOHENSCHEID",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H655 ",
            stationName = "WIPPERFUERTH-GARDEWE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H658 ",
            stationName = "MEINERZHAGEN-REDLEND",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H669 ",
            stationName = "ATTENDORN-NEULISTERN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H678 ",
            stationName = "LENNESTADT-THETEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H681 ",
            stationName = "SCHMALLENBERG-SELLIN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H695 ",
            stationName = "MEDEBACH-BERGE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H718 ",
            stationName = "JUELICH (KLAERANLAGE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H721 ",
            stationName = "BEDBURG-WEILER HOHEN",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H755 ",
            stationName = "OVERATH-BOEKE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H768 ",
            stationName = "MOENCHENGLADBACH-HIL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H777 ",
            stationName = "WENDEN-DOERNSCHEID",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H791 ",
            stationName = "BERLEBURG, BAD-ARFEL",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H795 ",
            stationName = "BAD BERLEBURG-STÜNZE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H827 ",
            stationName = "NIDEGGEN-SCHMIDT",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H862 ",
            stationName = "NEUNKIRCHEN-SEELSCHE",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H883 ",
            stationName = "SIEGEN (KLÄRANLAGE)",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H884 ",
            stationName = "BIRKELBACH",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H889 ",
            stationName = "BURBACH-WUERGENDORF",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H908 ",
            stationName = "MONSCHAU-KALTERHERBE",
            region = "Wallonische Region"
        ),
        WeatherStation(
            stationId = "H932 ",
            stationName = "WEILERSWIST-LOMMERSU",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(
            stationId = "H981 ",
            stationName = "KALL-SISTIG",
            region = "Nordrhein-Westfalen"
        ),
        WeatherStation(stationId = "J702 ", stationName = "PERL-NENNIG", region = "Saarland"),
        WeatherStation(stationId = "J709 ", stationName = "MERZIG", region = "Saarland"),
        WeatherStation(stationId = "J728 ", stationName = "WEISKIRCHEN/SAAR", region = "Saarland"),
        WeatherStation(
            stationId = "J731 ",
            stationName = "NOHFELDEN-GONNESWEIL",
            region = "Saarland"
        ),
        WeatherStation(
            stationId = "J812 ",
            stationName = "SCHMELZ-HUETTERSDORF",
            region = "Saarland"
        ),
        WeatherStation(
            stationId = "J815 ",
            stationName = "NEUNKIRCHEN-WELLESW.",
            region = "Saarland"
        ),
        WeatherStation(stationId = "J846 ", stationName = "HOMBURG/SAAR", region = "Saarland"),
        WeatherStation(
            stationId = "J908 ",
            stationName = "SAARBRUECKEN-BURBACH",
            region = "Saarland"
        ),
        WeatherStation(stationId = "K017 ", stationName = "HILGENROTH", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K026 ",
            stationName = "WALLMENROTH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K038 ",
            stationName = "BAD NEUENAHR-AHRWEIL",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K057 ", stationName = "HUEMMERICH", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K081 ",
            stationName = "HACHENBURG/WESTERWAL",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K132 ", stationName = "SINZIG", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K170 ",
            stationName = "HOEHR-GRENZHAUSEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K172 ",
            stationName = "SELTERS, WESTERWALDK",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K191 ",
            stationName = "WESTERBURG/RHLPF.",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K210 ",
            stationName = "SCHNEIFELFORSTHAUS",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K212 ",
            stationName = "ROTH BEI PRUEM",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K219 ", stationName = "LISSENDORF", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K230 ", stationName = "RODDER", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K240 ",
            stationName = "KALTENBORN, HOHE ACH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K259 ",
            stationName = "POLCH, KR. MAYEN-KOB",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K272 ",
            stationName = "NASSAU (KLAERANLAGE)",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K282 ", stationName = "MONTABAUR", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K290 ",
            stationName = "EPPENROD/BORNBACH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K295 ",
            stationName = "HOLZHEIM BEI DIEZ",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K300 ",
            stationName = "WINTERSPELT",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K308 ",
            stationName = "LAUPERATH-SCHEIDCHEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K310 ",
            stationName = "PRUEM-WATZERATH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K317 ",
            stationName = "WEISSENSEIFEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K318 ", stationName = "DENSBORN", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K322 ",
            stationName = "KIRCHWEILER",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K326 ",
            stationName = "OBERSTADTFELD",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K339 ", stationName = "STROHN", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K354 ", stationName = "KAIL", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K380 ",
            stationName = "OBERBACHHEIM",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K381 ",
            stationName = "SINGHOFEN (KLAERANLA",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K386 ", stationName = "NASTÄTTEN", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K419 ", stationName = "OLSDORF", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K428 ", stationName = "BITBURG", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K431 ", stationName = "MEISBURG", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K440 ",
            stationName = "MANDERSCHEID",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K446 ", stationName = "WITTLICH", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K463 ",
            stationName = "BLANKENRATH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K475 ",
            stationName = "LINGERHAHN (WWV RLP)",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K501 ",
            stationName = "KIRCHBERG, RHEIN-HUN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K509 ", stationName = "NEWEL", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K511 ", stationName = "SPEICHER", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K515 ",
            stationName = "ZEMMER (FORSTHAUS MU",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K517 ",
            stationName = "BEUREN (HOCHWALD)",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K531 ",
            stationName = "BERNKASTEL-KUES",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K533 ",
            stationName = "KLEINICH, KR. BERNKA",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K539 ",
            stationName = "BRUCHWEILER, KR. BIR",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K557 ",
            stationName = "SEESBACH, KR. BAD KR",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K568 ",
            stationName = "BAD KREUZNACH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K584 ",
            stationName = "MAINZ (ZDF)",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K589 ", stationName = "HAHNHEIM", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K611 ",
            stationName = "TRIER-ZEWEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K612 ",
            stationName = "TRIER-IRSCH",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K633 ",
            stationName = "HUETTGESWASEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K650 ", stationName = "KIRN", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K666 ",
            stationName = "BAYERFELD-STECKWEILE",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K685 ", stationName = "ALZEY", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K699 ", stationName = "WORMS", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K701 ",
            stationName = "KIRF-BEUREN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K711 ", stationName = "OBERZERF", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K744 ",
            stationName = "KUSEL (KLAERANLAGE)",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K747 ", stationName = "HENSCHTAL", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K755 ", stationName = "EINOELLEN", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K761 ",
            stationName = "DOERRMOSCHEL-FELSBER",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K762 ",
            stationName = "RUPPERTSECKEN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K764 ",
            stationName = "HOMBERG-SCHOENBORNER",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K767 ", stationName = "ENKENBACH", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K784 ", stationName = "GRUENSTADT", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K863 ",
            stationName = "KAISERSLAUTERN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K866 ",
            stationName = "TRIPPSTADT-NEUHOF",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K881 ",
            stationName = "BAD DUERKHEIM",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(
            stationId = "K918 ",
            stationName = "ZWEIBRUECKEN (KLAERA",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "K925 ", stationName = "PIRMASENS", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K969 ", stationName = "RUELZHEIM", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K984 ", stationName = "HIRSCHTHAL", region = "Rheinland-Pfalz"),
        WeatherStation(stationId = "K986 ", stationName = "BUNDENTHAL", region = "Rheinland-Pfalz"),
        WeatherStation(
            stationId = "K988 ",
            stationName = "BAD BERGZABERN",
            region = "Rheinland-Pfalz"
        ),
        WeatherStation(stationId = "L021 ", stationName = "TRENDELBURG", region = "Hessen"),
        WeatherStation(
            stationId = "L031 ",
            stationName = "WESTERTAL-LIPPOLDSB.",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L071 ", stationName = "LIEBENAU-HAUEDA", region = "Hessen"),
        WeatherStation(
            stationId = "L101 ",
            stationName = "WILLINGEN/HOCHSAUERL",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L113 ", stationName = "KORBACH-RHENA", region = "Hessen"),
        WeatherStation(
            stationId = "L121 ",
            stationName = "TWISTETAL-MUEHLHAUS.",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L125 ", stationName = "WALDECK-ALRAFT", region = "Hessen"),
        WeatherStation(stationId = "L130 ", stationName = "AROLSEN-LANDAU", region = "Hessen"),
        WeatherStation(
            stationId = "L131 ",
            stationName = "AROLSEN-VOLKHARDINGH",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L171 ",
            stationName = "WITZENHAUSEN-ZIEGENH",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L201 ",
            stationName = "BATTENBERG-HOF KARLS",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L215 ", stationName = "FRANKENBERG-GEISMAR", region = "Hessen"),
        WeatherStation(stationId = "L217 ", stationName = "BURGWALD-BOTTENDORF", region = "Hessen"),
        WeatherStation(stationId = "L222 ", stationName = "VOEHL-BUCHENBERG", region = "Hessen"),
        WeatherStation(stationId = "L245 ", stationName = "WABERN-HEBEL", region = "Hessen"),
        WeatherStation(
            stationId = "L271 ",
            stationName = "HESSISCH LICHTENAU-F",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L286 ", stationName = "SONTRA", region = "Hessen"),
        WeatherStation(stationId = "L291 ", stationName = "ESCHWEGE", region = "Hessen"),
        WeatherStation(
            stationId = "L292 ",
            stationName = "ESCHWEGE-ELTMANNSHAU",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L299 ",
            stationName = "HERLESHAUSEN-ARCHFEL",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L312 ",
            stationName = "WETTER/HESSEN-AMOENA",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L319 ", stationName = "COELBE", region = "Hessen"),
        WeatherStation(
            stationId = "L340 ",
            stationName = "GILSERBERG-MOISCHEID",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L355 ",
            stationName = "NEUKIRCHEN-HAUPTSCHW",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L409 ", stationName = "DRIEDORF", region = "Hessen"),
        WeatherStation(stationId = "L411 ", stationName = "DILLENBURG", region = "Hessen"),
        WeatherStation(
            stationId = "L442 ",
            stationName = "AMOENEBURG-RUEDIGHEI",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L463 ", stationName = "ALSFELD", region = "Hessen"),
        WeatherStation(stationId = "L464 ", stationName = "ALSFELD-EIFA", region = "Hessen"),
        WeatherStation(stationId = "L483 ", stationName = "HAUNETAL-WEHRDA", region = "Hessen"),
        WeatherStation(stationId = "L505 ", stationName = "WALDBRUNN-LAHR", region = "Hessen"),
        WeatherStation(stationId = "L511 ", stationName = "LOEHNBERG-OBERSH.", region = "Hessen"),
        WeatherStation(
            stationId = "L521 ",
            stationName = "ASSLAR KLEIN-ALTENST",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L555 ", stationName = "SCHOTTEN", region = "Hessen"),
        WeatherStation(stationId = "L561 ", stationName = "LAUTERTAL-HOERGENAU", region = "Hessen"),
        WeatherStation(stationId = "L582 ", stationName = "PETERSBERG-MARBACH", region = "Hessen"),
        WeatherStation(stationId = "L592 ", stationName = "TANN/RHOEN", region = "Hessen"),
        WeatherStation(stationId = "L602 ", stationName = "RUNKEL-ENNERICH", region = "Hessen"),
        WeatherStation(stationId = "L612 ", stationName = "WEILMUENSTER", region = "Hessen"),
        WeatherStation(stationId = "L617 ", stationName = "CAMBERG, BAD", region = "Hessen"),
        WeatherStation(stationId = "L631 ", stationName = "MUENZENBERG-GAMBACH", region = "Hessen"),
        WeatherStation(stationId = "L635 ", stationName = "BAD NAUHEIM", region = "Hessen"),
        WeatherStation(stationId = "L652 ", stationName = "GEDERN-SCHOENHAUSEN", region = "Hessen"),
        WeatherStation(stationId = "L678 ", stationName = "SCHLÜCHTERN-HEROLZ", region = "Hessen"),
        WeatherStation(stationId = "L685 ", stationName = "GREBENSTEIN", region = "Hessen"),
        WeatherStation(
            stationId = "L714 ",
            stationName = "HOHENSTEIN-BREITHARD",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L722 ", stationName = "WALDEMS-REINBORN", region = "Hessen"),
        WeatherStation(
            stationId = "L732 ",
            stationName = "HOMBURG, BAD (FILTER",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L744 ",
            stationName = "VILBEL, BAD-DORTELWE",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L751 ", stationName = "NIDDERAU-ERBSTADT", region = "Hessen"),
        WeatherStation(
            stationId = "L771 ",
            stationName = "GRUENDAU-BREITENBORN",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L773 ", stationName = "WAECHTERSBACH", region = "Hessen"),
        WeatherStation(
            stationId = "L781 ",
            stationName = "SODEN,BAD-SALMUENSTE",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L803 ", stationName = "RUEDESHEIM-PRESBERG", region = "Hessen"),
        WeatherStation(stationId = "L819 ", stationName = "WIESBADEN-BIEBRICH", region = "Hessen"),
        WeatherStation(stationId = "L821 ", stationName = "WIESBADEN-AURINGEN", region = "Hessen"),
        WeatherStation(stationId = "L829 ", stationName = "RAUNHEIM", region = "Hessen"),
        WeatherStation(stationId = "L850 ", stationName = "MUEHLHEIM/MAIN", region = "Hessen"),
        WeatherStation(
            stationId = "L865 ",
            stationName = "GROSS-GERAU-WALLERST",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L886 ", stationName = "DARMSTADT", region = "Hessen"),
        WeatherStation(
            stationId = "L891 ",
            stationName = "ROEDERMARK-OBER-RODE",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L892 ",
            stationName = "REINHARDSHAGEN-VAAKE",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L894 ",
            stationName = "SCHAAFHEIM-SCHLIERB.",
            region = "Hessen"
        ),
        WeatherStation(
            stationId = "L926 ",
            stationName = "LAUTERTAL/ODENWALD-R",
            region = "Hessen"
        ),
        WeatherStation(stationId = "L930 ", stationName = "REINHEIM", region = "Hessen"),
        WeatherStation(stationId = "L947 ", stationName = "MICHELSTADT", region = "Hessen"),
        WeatherStation(stationId = "L979 ", stationName = "BIRKENAU", region = "Hessen"),
        WeatherStation(stationId = "L988 ", stationName = "BEERFELDEN", region = "Hessen"),
        WeatherStation(stationId = "M031 ", stationName = "ELLRICH-WERNA", region = "Thüringen"),
        WeatherStation(stationId = "M056 ", stationName = "REINHOLTERODE", region = "Thüringen"),
        WeatherStation(
            stationId = "M146 ",
            stationName = "HELBEDUENDORF-KEULA",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M225 ",
            stationName = "MÜHLHAUSEN-GÖRMAR",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M259 ", stationName = "FREIENBESSINGEN", region = "Thüringen"),
        WeatherStation(stationId = "M281 ", stationName = "ETZLEBEN", region = "Thüringen"),
        WeatherStation(stationId = "M299 ", stationName = "OLBERSLEBEN", region = "Thüringen"),
        WeatherStation(
            stationId = "M301 ",
            stationName = "SUEDEICHSFELD-WENDEH",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M348 ", stationName = "DACHWIG", region = "Thüringen"),
        WeatherStation(stationId = "M357 ", stationName = "ALPERSTEDT", region = "Thüringen"),
        WeatherStation(
            stationId = "M405 ",
            stationName = "MOORGRUND-GRAEFENDOR",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M412 ",
            stationName = "HOERSELBERG-HAINICH-",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M448 ",
            stationName = "WEIMAR-SCHOENDORF",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M473 ",
            stationName = "CROSSEN/ELSTER-NICKE",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M480 ", stationName = "MEUSELWITZ", region = "Thüringen"),
        WeatherStation(stationId = "M488 ", stationName = "TEGKWITZ", region = "Thüringen"),
        WeatherStation(stationId = "M500 ", stationName = "PONITZ", region = "Thüringen"),
        WeatherStation(stationId = "M520 ", stationName = "WALTERSHAUSEN", region = "Thüringen"),
        WeatherStation(
            stationId = "M552 ",
            stationName = "JENA (STERNWARTE)",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M557 ", stationName = "BUCHA", region = "Thüringen"),
        WeatherStation(stationId = "M565 ", stationName = "BOBECK", region = "Thüringen"),
        WeatherStation(
            stationId = "M620 ",
            stationName = "KLEINER INSELBERG",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M640 ",
            stationName = "DREI GLEICHEN-MUEHLB",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M651 ", stationName = "ILMTAL-DIENSTEDT", region = "Thüringen"),
        WeatherStation(
            stationId = "M691 ",
            stationName = "HARTH-POELLNITZ NEUN",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M700 ", stationName = "GEISA", region = "Thüringen"),
        WeatherStation(stationId = "M721 ", stationName = "SCHMALKALDEN", region = "Thüringen"),
        WeatherStation(stationId = "M732 ", stationName = "MARTINRODA", region = "Thüringen"),
        WeatherStation(stationId = "M756 ", stationName = "SCHWARZBURG", region = "Thüringen"),
        WeatherStation(stationId = "M765 ", stationName = "ROCKENDORF", region = "Thüringen"),
        WeatherStation(
            stationId = "M772 ",
            stationName = "SCHMIERITZ-WELTWITZ",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M799 ", stationName = "GOETTENDORF", region = "Thüringen"),
        WeatherStation(stationId = "M805 ", stationName = "BIRX", region = "Thüringen"),
        WeatherStation(stationId = "M833 ", stationName = "FRAUENWALD", region = "Thüringen"),
        WeatherStation(stationId = "M834 ", stationName = "SCHLEUSINGEN", region = "Thüringen"),
        WeatherStation(stationId = "M846 ", stationName = "KATZHUETTE", region = "Thüringen"),
        WeatherStation(
            stationId = "M909 ",
            stationName = "ROEMHILD-SUELZDORF",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M927 ", stationName = "VEILSDORF", region = "Thüringen"),
        WeatherStation(
            stationId = "M938 ",
            stationName = "FRANKENBLICK-MENGERS",
            region = "Thüringen"
        ),
        WeatherStation(
            stationId = "M945 ",
            stationName = "JUDENBACH-NEUENBAU",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "M965 ", stationName = "BAD LOBENSTEIN", region = "Thüringen"),
        WeatherStation(stationId = "M978 ", stationName = "HIRSCHBERG", region = "Bayern"),
        WeatherStation(
            stationId = "M998 ",
            stationName = "NEUHAUS-SCHIERSCHNIT",
            region = "Thüringen"
        ),
        WeatherStation(stationId = "N104 ", stationName = "DIESDORF", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N135 ",
            stationName = "WINTERFELD-SALLENTHI",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N158 ", stationName = "BALLERSTEDT", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N182 ", stationName = "SCHWARZHOLZ", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N199 ", stationName = "SCHOLLENE", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N214 ", stationName = "KOECKTE", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N268 ", stationName = "GRIEBEN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N272 ", stationName = "DEMKER", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N305 ", stationName = "BOESDORF", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N315 ", stationName = "BORN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N345 ", stationName = "ZIELITZ", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N366 ",
            stationName = "BURG-BLUMENTHAL",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N398 ",
            stationName = "DREWITZ BEI BURG",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N426 ",
            stationName = "WEISSENFELS-WENGELSD",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N435 ",
            stationName = "BOTTMERSDORF-KLEIN G",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N440 ",
            stationName = "SCHACKENSLEBEN",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N463 ", stationName = "KOENIGSBORN", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N500 ",
            stationName = "BUEHNE-RIMBECK",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N520 ", stationName = "PABSTORF", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N532 ",
            stationName = "HECKLINGEN-GROSS BOE",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N543 ",
            stationName = "WALTERNIENBURG-RONNE",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N548 ",
            stationName = "BERNBURG/SAALE",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N553 ",
            stationName = "BADEWITZ BEI ZERBST",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N563 ", stationName = "DUEBEN", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N566 ", stationName = "JESSNITZ", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N587 ",
            stationName = "NAUNDORF BEI SEYDA",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N601 ", stationName = "SCHIERKE", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N616 ",
            stationName = "OBERHARZ AM BROCKEN",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N620 ", stationName = "QUEDLINBURG", region = "Sachsen-Anhalt"),
        WeatherStation(
            stationId = "N632 ",
            stationName = "MEHRINGEN/ASL",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N652 ",
            stationName = "KOETHEN (ANHALT)",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N671 ",
            stationName = "KEMBERG-RADIS",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N714 ",
            stationName = "SUEDHARZ-DIETERSDORF",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N731 ",
            stationName = "MANSFELD-ANNARODE",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N748 ",
            stationName = "QUERFURT-LODERSL.",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N750 ",
            stationName = "SEEGEBIET MANSFELDER",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N815 ",
            stationName = "BIBRA, BAD-ALTENRODA",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(
            stationId = "N855 ",
            stationName = "FREYBURG/UNSTRUT-ZEU",
            region = "Sachsen-Anhalt"
        ),
        WeatherStation(stationId = "N924 ", stationName = "KREIPITZSCH", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "N977 ", stationName = "ZEITZ", region = "Sachsen-Anhalt"),
        WeatherStation(stationId = "O025 ", stationName = "BAD MUSKAU", region = "Sachsen"),
        WeatherStation(
            stationId = "O039 ",
            stationName = "SCHOENWOELKAU-BRINNI",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O057 ",
            stationName = "KLITSCHEN BEI TORGAU",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O099 ", stationName = "HAEHNICHEN-TREBUS", region = "Sachsen"),
        WeatherStation(stationId = "O141 ", stationName = "BELGERSHAIN", region = "Sachsen"),
        WeatherStation(stationId = "O182 ", stationName = "BOXBERG", region = "Sachsen"),
        WeatherStation(
            stationId = "O204 ",
            stationName = "MARKRANSTAEDT-GROSSL",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O248 ", stationName = "HEYDA BEI RIESA", region = "Sachsen"),
        WeatherStation(stationId = "O251 ", stationName = "STRAUCH", region = "Sachsen"),
        WeatherStation(
            stationId = "O268 ",
            stationName = "SCHOENTEICHEN-CUNNER",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O305 ", stationName = "PEGAU", region = "Sachsen"),
        WeatherStation(stationId = "O322 ", stationName = "GRIMMA-KLEINBOTHEN", region = "Sachsen"),
        WeatherStation(
            stationId = "O348 ",
            stationName = "GARSEBACH BEI MEISSE",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O384 ",
            stationName = "KUBSCHUETZ,KR.BAUTZ.",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O457 ", stationName = "DRESDEN-STREHLEN", region = "Sachsen"),
        WeatherStation(stationId = "O458 ", stationName = "DRESDEN-HOSTERWITZ", region = "Sachsen"),
        WeatherStation(stationId = "O461 ", stationName = "PULSNITZ", region = "Sachsen"),
        WeatherStation(stationId = "O484 ", stationName = "SOHLAND/SPREE", region = "Sachsen"),
        WeatherStation(stationId = "O499 ", stationName = "OSTRITZ", region = "Sachsen"),
        WeatherStation(stationId = "O510 ", stationName = "ALTGERINGSWALDE", region = "Sachsen"),
        WeatherStation(stationId = "O536 ", stationName = "NOSSEN", region = "Sachsen"),
        WeatherStation(stationId = "O543 ", stationName = "WILSDRUFF-MOHORN", region = "Sachsen"),
        WeatherStation(stationId = "O566 ", stationName = "LOHMEN/SACHSEN", region = "Sachsen"),
        WeatherStation(stationId = "O580 ", stationName = "DUERRHENNERSDORF", region = "Sachsen"),
        WeatherStation(stationId = "O598 ", stationName = "BERTSDORF-HOERNITZ", region = "Sachsen"),
        WeatherStation(
            stationId = "O625 ",
            stationName = "FRANKENBERG-ALTENHAI",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O660 ",
            stationName = "DIPPOLDISWALDE-REIN.",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O708 ",
            stationName = "CRIMMITSCHAU-MANNICH",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O725 ",
            stationName = "SANKT EGIDIEN-KUHSCH",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O795 ", stationName = "ROSENTHAL-BIELATAL", region = "Sachsen"),
        WeatherStation(stationId = "O805 ", stationName = "LICHTENTANNE", region = "Sachsen"),
        WeatherStation(
            stationId = "O842 ",
            stationName = "DEUTSCHNEUDORF-BRUED",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O846 ",
            stationName = "MARIENBERG-RUEBENAU",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O868 ", stationName = "TREUEN", region = "Sachsen"),
        WeatherStation(
            stationId = "O877 ",
            stationName = "STUETZENGRUEN-HUNDSH",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O882 ", stationName = "TANNENBERG", region = "Sachsen"),
        WeatherStation(stationId = "O888 ", stationName = "RASCHAU", region = "Sachsen"),
        WeatherStation(
            stationId = "O950 ",
            stationName = "WEISCHLITZ-HEINERSGR",
            region = "Sachsen"
        ),
        WeatherStation(
            stationId = "O974 ",
            stationName = "KLINGENTHAL-KAMERUN",
            region = "Sachsen"
        ),
        WeatherStation(stationId = "O980 ", stationName = "ELSTER, BAD-SOHL", region = "Sachsen"),
        WeatherStation(stationId = "O993 ", stationName = "ERLBACH-EUBABRUNN", region = "Sachsen"),
        WeatherStation(
            stationId = "P004 ",
            stationName = "OBERLEICHTERSBACH-MO",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P013 ", stationName = "SANDBERG", region = "Bayern"),
        WeatherStation(stationId = "P022 ", stationName = "OSTHEIM V.D. RHOEN", region = "Bayern"),
        WeatherStation(stationId = "P025 ", stationName = "NEUSTADT, BAD", region = "Bayern"),
        WeatherStation(stationId = "P029 ", stationName = "MASSBACH", region = "Bayern"),
        WeatherStation(stationId = "P032 ", stationName = "AUBSTADT", region = "Bayern"),
        WeatherStation(stationId = "P033 ", stationName = "BAD KOENIGSHOFEN", region = "Bayern"),
        WeatherStation(
            stationId = "P038 ",
            stationName = "SULZDORF AN DER LEDE",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P041 ",
            stationName = "RODACH (KLAERANLAGE)",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P048 ",
            stationName = "PFARRWEISACH-LOHR (P",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P051 ", stationName = "MEEDER-OTTOWIND", region = "Bayern"),
        WeatherStation(stationId = "P052 ", stationName = "NEUSTADT BEI COBURG", region = "Bayern"),
        WeatherStation(stationId = "P058 ", stationName = "ITZGRUND-HERRETH", region = "Bayern"),
        WeatherStation(
            stationId = "P062 ",
            stationName = "LUDWIGSSTADT-LAUENST",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P066 ", stationName = "KRONACH", region = "Bayern"),
        WeatherStation(stationId = "P068 ", stationName = "BURGKUNSTADT", region = "Bayern"),
        WeatherStation(stationId = "P071 ", stationName = "TEUSCHNITZ", region = "Bayern"),
        WeatherStation(stationId = "P073 ", stationName = "STEBEN, BAD", region = "Bayern"),
        WeatherStation(stationId = "P079 ", stationName = "LUDWIGSCHORGAST", region = "Bayern"),
        WeatherStation(stationId = "P086 ", stationName = "HELMBRECHTS", region = "Bayern"),
        WeatherStation(
            stationId = "P088 ",
            stationName = "STAMMBACH-QUERENBACH",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P095 ", stationName = "REHAU", region = "Bayern"),
        WeatherStation(stationId = "P098 ", stationName = "SELB/OBERFRANKEN", region = "Bayern"),
        WeatherStation(stationId = "P099 ", stationName = "SELB-SPIELBERG", region = "Bayern"),
        WeatherStation(stationId = "P100 ", stationName = "KAHL (MAIN)", region = "Bayern"),
        WeatherStation(stationId = "P104 ", stationName = "HEINRICHSTHAL", region = "Bayern"),
        WeatherStation(stationId = "P106 ", stationName = "GROSSOSTHEIM", region = "Bayern"),
        WeatherStation(stationId = "P113 ", stationName = "LOHR/MAIN-HALSBACH", region = "Bayern"),
        WeatherStation(
            stationId = "P120 ",
            stationName = "GRAEFENDORF,KR.MAIN-",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P122 ", stationName = "HAMMELBURG", region = "Bayern"),
        WeatherStation(stationId = "P125 ", stationName = "ARNSTEIN-MUEDESHEIM", region = "Bayern"),
        WeatherStation(stationId = "P131 ", stationName = "SCHONUNGEN-MAINBERG", region = "Bayern"),
        WeatherStation(stationId = "P137 ", stationName = "KOLITZHEIM", region = "Bayern"),
        WeatherStation(
            stationId = "P141 ",
            stationName = "KOENIGSBERG/BAYERN-H",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P147 ",
            stationName = "OBERAURACH-FATSCHENB",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P148 ", stationName = "EBRACH", region = "Bayern"),
        WeatherStation(
            stationId = "P151 ",
            stationName = "RENTWEINSDORF-TREINF",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P158 ",
            stationName = "SCHESSLITZ-KOETTENSD",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P164 ", stationName = "THURNAU-TANNFELD", region = "Bayern"),
        WeatherStation(stationId = "P165 ", stationName = "STADELHOFEN", region = "Bayern"),
        WeatherStation(stationId = "P168 ", stationName = "AUFSESS-HOCHSTAHL", region = "Bayern"),
        WeatherStation(stationId = "P173 ", stationName = "PRESSECK", region = "Bayern"),
        WeatherStation(
            stationId = "P175 ",
            stationName = "HEINERSREUTH-VOLLHOF",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P179 ", stationName = "CREUSSEN-BUEHL", region = "Bayern"),
        WeatherStation(
            stationId = "P182 ",
            stationName = "FICHTELBERG/OBERFRA.",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P185 ",
            stationName = "WALDERSHOF-SCHAFBRUC",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P188 ", stationName = "KEMNATH", region = "Bayern"),
        WeatherStation(stationId = "P189 ", stationName = "PRESSATH-MUEHLBERG", region = "Bayern"),
        WeatherStation(stationId = "P190 ", stationName = "HOHENBERG/EGER", region = "Bayern"),
        WeatherStation(stationId = "P197 ", stationName = "MAEHRING", region = "Bayern"),
        WeatherStation(
            stationId = "P198 ",
            stationName = "TIRSCHENREUTH-LODERM",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P208 ", stationName = "AMORBACH-NEUDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P212 ",
            stationName = "HASLOCH/MAIN (SCHIRR",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P222 ",
            stationName = "ALTERTHEIM-OBERALTER",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P228 ", stationName = "BUETTHARD", region = "Bayern"),
        WeatherStation(stationId = "P232 ", stationName = "KITZINGEN", region = "Bayern"),
        WeatherStation(
            stationId = "P233 ",
            stationName = "SCHWARZACH/MAIN (KLA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P236 ", stationName = "MARKT BIBART", region = "Bayern"),
        WeatherStation(stationId = "P238 ", stationName = "GOLLHOFEN", region = "Bayern"),
        WeatherStation(
            stationId = "P243 ",
            stationName = "SCHLUESSELFELD (KLAE",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P249 ",
            stationName = "WILHELMSDORF/MITTELF",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P252 ",
            stationName = "ALTENDORF/OBERFRANKE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P257 ", stationName = "MOEHRENDORF-KLSEE.", region = "Bayern"),
        WeatherStation(stationId = "P262 ", stationName = "GOESSWEINSTEIN", region = "Bayern"),
        WeatherStation(stationId = "P265 ", stationName = "GRAEFENBERG-KASBERG", region = "Bayern"),
        WeatherStation(
            stationId = "P266 ",
            stationName = "LAUF/PEGNITZ (KLAERA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P270 ", stationName = "PLECH", region = "Bayern"),
        WeatherStation(
            stationId = "P271 ",
            stationName = "PEGNITZ (KLAERANLAGE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P280 ", stationName = "NEUSTADT AM KULM", region = "Bayern"),
        WeatherStation(
            stationId = "P287 ",
            stationName = "FREIHUNG-GROSSSCHOEN",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P292 ",
            stationName = "PLOESSBERG-LIEBENSTE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P294 ", stationName = "FLOSSENBUERG", region = "Bayern"),
        WeatherStation(stationId = "P298 ", stationName = "WAIDHAUS-PFRENTSCH", region = "Bayern"),
        WeatherStation(
            stationId = "P299 ",
            stationName = "SCHOENSEE-DIETERSDOR",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P300 ",
            stationName = "SIMMERSHOFEN-ADELHOF",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P302 ", stationName = "BURGBERNHEIM", region = "Bayern"),
        WeatherStation(
            stationId = "P305 ",
            stationName = "ROTHENBURG OB DER TA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P306 ", stationName = "COLMBERG-BINZWANGEN", region = "Bayern"),
        WeatherStation(
            stationId = "P308 ",
            stationName = "NEUBURG/KAMMEL-LANGE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P310 ", stationName = "WINDSHEIM, BAD", region = "Bayern"),
        WeatherStation(stationId = "P317 ", stationName = "WEIHENZELL-GRUEB", region = "Bayern"),
        WeatherStation(
            stationId = "P318 ",
            stationName = "HERRIEDEN (KLAERANLA",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P319 ",
            stationName = "WEIDENBACH-WEIHERSCH",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P321 ", stationName = "LANGENZENN", region = "Bayern"),
        WeatherStation(
            stationId = "P327 ",
            stationName = "ROHR/MITTELFRANKEN-D",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P333 ", stationName = "NUERNBERG-NETZSTALL", region = "Bayern"),
        WeatherStation(
            stationId = "P337 ",
            stationName = "WENDELSTEIN-KLEINSCH",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P339 ", stationName = "FREYSTADT-OBERNDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P343 ",
            stationName = "POMMELSBRUNN-MITTEL.",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P348 ", stationName = "NEUMARKT/OBERPFALZ", region = "Bayern"),
        WeatherStation(stationId = "P352 ", stationName = "EDELSFELD", region = "Bayern"),
        WeatherStation(
            stationId = "P354 ",
            stationName = "AMBERG-UNTERAMMERSR.",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P355 ", stationName = "ROELLBACH", region = "Bayern"),
        WeatherStation(
            stationId = "P356 ",
            stationName = "KASTL, KREIS AMBERG-",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P359 ", stationName = "SCHMIDMUEHLEN", region = "Bayern"),
        WeatherStation(
            stationId = "P362 ",
            stationName = "NABBURG (FLUSSMEISTE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P363 ", stationName = "SCHMIDGADEN", region = "Bayern"),
        WeatherStation(stationId = "P366 ", stationName = "SCHWANDORF", region = "Bayern"),
        WeatherStation(stationId = "P370 ", stationName = "TRAUSNITZ-REISACH", region = "Bayern"),
        WeatherStation(stationId = "P372 ", stationName = "OBERVIECHTACH", region = "Bayern"),
        WeatherStation(stationId = "P374 ", stationName = "ALTENDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P376 ",
            stationName = "NEUNBURG VORM WALD-E",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P379 ", stationName = "RODING-NEUBAEU", region = "Bayern"),
        WeatherStation(stationId = "P380 ", stationName = "RODING-WETTERFELD", region = "Bayern"),
        WeatherStation(
            stationId = "P382 ",
            stationName = "TREFFELSTEIN-WITZELS",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P389 ",
            stationName = "WEIDING, KREIS CHAM-",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P396 ",
            stationName = "NEUKIRCHEN BEI HEILI",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P405 ",
            stationName = "DINKELSBUEHL-OBERWIN",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P410 ",
            stationName = "BECHHOFEN/MITTELFRAN",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P411 ",
            stationName = "HAUNDORF-OBERERLBACH",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P417 ",
            stationName = "WASSERTRUEDINGEN (KL",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P418 ",
            stationName = "POLSINGEN-DOECKINGEN",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P420 ",
            stationName = "PLEINFELD-MANDLESMUE",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P422 ",
            stationName = "ROTHSEE BEI ALLERSBE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P425 ", stationName = "THALMAESSING", region = "Bayern"),
        WeatherStation(stationId = "P433 ", stationName = "BERCHING", region = "Bayern"),
        WeatherStation(stationId = "P441 ", stationName = "PARSBERG/OBERPFALZ", region = "Bayern"),
        WeatherStation(stationId = "P444 ", stationName = "BERATZHAUSEN", region = "Bayern"),
        WeatherStation(stationId = "P448 ", stationName = "RIEDENBURG", region = "Bayern"),
        WeatherStation(
            stationId = "P449 ",
            stationName = "KELHEIM (KANALSCHLEU",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P451 ",
            stationName = "TEUBLITZ (KLAERANLAG",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P453 ", stationName = "NITTENAU-HARTING", region = "Bayern"),
        WeatherStation(stationId = "P460 ", stationName = "HAGELSTADT", region = "Bayern"),
        WeatherStation(
            stationId = "P463 ",
            stationName = "SCHORNDORF-KNOEBLING",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P466 ", stationName = "STALLWANG", region = "Bayern"),
        WeatherStation(
            stationId = "P467 ",
            stationName = "WIESENFELDEN-UTZENZE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P468 ", stationName = "AHOLFING", region = "Bayern"),
        WeatherStation(stationId = "P472 ", stationName = "PRACKENBACH", region = "Bayern"),
        WeatherStation(stationId = "P477 ", stationName = "SANKT ENGLMAR", region = "Bayern"),
        WeatherStation(stationId = "P481 ", stationName = "LAM-LAMBACH", region = "Bayern"),
        WeatherStation(stationId = "P485 ", stationName = "LINDBERG-BUCHENAU", region = "Bayern"),
        WeatherStation(stationId = "P486 ", stationName = "TEISNACH", region = "Bayern"),
        WeatherStation(stationId = "P501 ", stationName = "REIMLINGEN", region = "Bayern"),
        WeatherStation(stationId = "P505 ", stationName = "AURA IM SINNGRUND", region = "Bayern"),
        WeatherStation(
            stationId = "P515 ",
            stationName = "DONAUWOERTH-OSTERWE.",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P517 ",
            stationName = "BISSINGEN (KLAERANLA",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P521 ",
            stationName = "TAGMERSHEIM-BLOSSENA",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P522 ",
            stationName = "EICHSTAETT-LANDERSH.",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P532 ", stationName = "KOESCHING", region = "Bayern"),
        WeatherStation(
            stationId = "P535 ",
            stationName = "INGOLSTADT (FLUSSMEI",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P542 ",
            stationName = "MARKT ERLBACH-MOSBA.",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P546 ",
            stationName = "SIEGENBURG (KLAERANL",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P548 ", stationName = "ELSENDORF-HORNECK", region = "Bayern"),
        WeatherStation(
            stationId = "P549 ",
            stationName = "GEISENFELD-EICHELBER",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P551 ",
            stationName = "LANGQUAID-OBERSCHNEI",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P557 ", stationName = "HOHENTHANN", region = "Bayern"),
        WeatherStation(
            stationId = "P568 ",
            stationName = "PILSTING-BAECKERMUEH",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P571 ", stationName = "BOGEN-PFELLING", region = "Bayern"),
        WeatherStation(stationId = "P572 ", stationName = "METTEN", region = "Bayern"),
        WeatherStation(
            stationId = "P576 ",
            stationName = "MOOS,KR. DEGGENDORF-",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P581 ",
            stationName = "KIRCHBERG/NIEDERBAYE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P585 ", stationName = "OSTERHOFEN-THUNDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P586 ",
            stationName = "SALDENBURG-ENTSCHENR",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P594 ", stationName = "GRAINERT-REHBERG", region = "Bayern"),
        WeatherStation(stationId = "P597 ", stationName = "BUECHLBERG-TANNOED", region = "Bayern"),
        WeatherStation(stationId = "P599 ", stationName = "SONNEN", region = "Bayern"),
        WeatherStation(
            stationId = "P602 ",
            stationName = "DILLINGEN-FRISTINGEN",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P606 ", stationName = "GUENZBURG", region = "Bayern"),
        WeatherStation(stationId = "P609 ", stationName = "ZUSMARSHAUSEN", region = "Bayern"),
        WeatherStation(stationId = "P611 ", stationName = "WERTINGEN", region = "Bayern"),
        WeatherStation(
            stationId = "P618 ",
            stationName = "DIEDORF/SCHWABEN-BIB",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P621 ",
            stationName = "RAIN AM LECH-WALLERD",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P626 ",
            stationName = "DASING (KLAERANLAGE)",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P627 ", stationName = "SCHROBENHAUSEN", region = "Bayern"),
        WeatherStation(
            stationId = "P629 ",
            stationName = "ALTOMUENSTER-MAISBRU",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P637 ", stationName = "SCHEYERN", region = "Bayern"),
        WeatherStation(stationId = "P639 ", stationName = "FAHRENZHAUSEN", region = "Bayern"),
        WeatherStation(
            stationId = "P642 ",
            stationName = "SCHWEITENKIRCHEN-SUE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P645 ", stationName = "NANDLSTADT", region = "Bayern"),
        WeatherStation(stationId = "P655 ", stationName = "LANDSHUT-REITHOF", region = "Bayern"),
        WeatherStation(
            stationId = "P656 ",
            stationName = "VILSHEIM-MUENCHSDORF",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P658 ",
            stationName = "STEINKIRCHEN-HOFSTAR",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P659 ", stationName = "OBERSCHLEISSHEIM", region = "Bayern"),
        WeatherStation(stationId = "P661 ", stationName = "LOICHING", region = "Bayern"),
        WeatherStation(
            stationId = "P663 ",
            stationName = "MAMMING-SCHNEIDERBER",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P664 ",
            stationName = "MARKLKOFEN (BETRIEBS",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P666 ", stationName = "VILSBIBURG", region = "Bayern"),
        WeatherStation(
            stationId = "P668 ",
            stationName = "GANGKOFEN (KLAERANLA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P669 ", stationName = "NEUMARKT-SANKT VEIT", region = "Bayern"),
        WeatherStation(stationId = "P672 ", stationName = "EICHENDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P674 ",
            stationName = "FALKENBERG,KR.ROTTAL",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P677 ", stationName = "EGGENFELDEN", region = "Bayern"),
        WeatherStation(
            stationId = "P678 ",
            stationName = "WURMANNSQUICK-EGELSB",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P681 ",
            stationName = "ALDERSBACH-KRIESTORF",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P682 ",
            stationName = "EGING AM SEE-ROHRBAC",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P687 ", stationName = "PFARRKIRCHEN", region = "Bayern"),
        WeatherStation(
            stationId = "P688 ",
            stationName = "ROTTHALMUENSTER (LAN",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P689 ", stationName = "POCKING", region = "Bayern"),
        WeatherStation(
            stationId = "P697 ",
            stationName = "UNTERGRIESBACH-SCHAI",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P699 ",
            stationName = "UNTERGRIESBACH-GLOTZ",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P702 ",
            stationName = "WEISSENHORN-OBERREIC",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P718 ",
            stationName = "BREITENBRUNN-FUERBUC",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P724 ", stationName = "SCHWABMUENCHEN", region = "Bayern"),
        WeatherStation(stationId = "P732 ", stationName = "MERING (BAUHOF)", region = "Bayern"),
        WeatherStation(stationId = "P741 ", stationName = "MAISACH-GALGEN", region = "Bayern"),
        WeatherStation(stationId = "P760 ", stationName = "NASSENFELS", region = "Bayern"),
        WeatherStation(
            stationId = "P761 ",
            stationName = "ADELSDORF (KLAERANLA",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P764 ",
            stationName = "HAIMHAUSEN-OTTERSHAU",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P765 ", stationName = "ISEN-WESTACH", region = "Bayern"),
        WeatherStation(stationId = "P768 ", stationName = "EBERSBERG-HALBING", region = "Bayern"),
        WeatherStation(stationId = "P769 ", stationName = "FINSING (KRAFTWERK)", region = "Bayern"),
        WeatherStation(
            stationId = "P771 ",
            stationName = "DORFEN (KLAERANLAGE)",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P777 ", stationName = "JETTENBACH", region = "Bayern"),
        WeatherStation(
            stationId = "P781 ",
            stationName = "AMPFING (KLAERANLAGE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P785 ", stationName = "TUESSLING", region = "Bayern"),
        WeatherStation(stationId = "P788 ", stationName = "TACHERTING-SPREIT", region = "Bayern"),
        WeatherStation(stationId = "P794 ", stationName = "SIMBACH/INN", region = "Bayern"),
        WeatherStation(stationId = "P803 ", stationName = "OTTOBEUREN", region = "Bayern"),
        WeatherStation(stationId = "P804 ", stationName = "ATTENKAM", region = "Bayern"),
        WeatherStation(
            stationId = "P811 ",
            stationName = "OBERSTAUFEN-THALKIRC",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P817 ", stationName = "KAUFBEUREN", region = "Bayern"),
        WeatherStation(stationId = "P818 ", stationName = "KRAFTISRIED", region = "Bayern"),
        WeatherStation(stationId = "P821 ", stationName = "BUCHLOE", region = "Bayern"),
        WeatherStation(
            stationId = "P824 ",
            stationName = "VILGERTSHOFEN-PFLUGD",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P825 ", stationName = "EBERFING", region = "Bayern"),
        WeatherStation(
            stationId = "P829 ",
            stationName = "STEINGADEN-LAUTERBAC",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P830 ",
            stationName = "OBERHACHING-LAUFZORN",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P831 ", stationName = "WIELENBACH", region = "Bayern"),
        WeatherStation(
            stationId = "P833 ",
            stationName = "DIESSEN/AMMERSEE-DET",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P846 ", stationName = "SCHAEFTLARN-KLOSTER", region = "Bayern"),
        WeatherStation(
            stationId = "P850 ",
            stationName = "UTTING-ACHSELSCHWANG",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P856 ", stationName = "HOLZKIRCHEN", region = "Bayern"),
        WeatherStation(
            stationId = "P860 ",
            stationName = "DEISENHOFEN, KREIS M",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P862 ",
            stationName = "FELDKIRCHEN-WESTERHA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P870 ", stationName = "IRSCHENBERG-KASTHUB", region = "Bayern"),
        WeatherStation(
            stationId = "P873 ",
            stationName = "VOGTAREUTH (KLAERANL",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P874 ", stationName = "AMERANG-PFAFFING", region = "Bayern"),
        WeatherStation(
            stationId = "P875 ",
            stationName = "CHIEMSEE-HERRENCHIEM",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P877 ", stationName = "ROSENHEIM", region = "Bayern"),
        WeatherStation(stationId = "P881 ", stationName = "TROSTBERG", region = "Bayern"),
        WeatherStation(
            stationId = "P887 ",
            stationName = "SIGMARSZELL-ZEISERTS",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P892 ", stationName = "WAGING AM SEE", region = "Bayern"),
        WeatherStation(stationId = "P893 ", stationName = "TEISENDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P894 ",
            stationName = "WAGING AM SEE-SCHNOE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P903 ", stationName = "LINDAU (SWN)"),
        WeatherStation(stationId = "P904 ", stationName = "SIEGSDORF-HOELL", region = "Bayern"),
        WeatherStation(
            stationId = "P905 ",
            stationName = "WEILER-SIMMERBERG (K",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P908 ", stationName = "OBERREUTE", region = "Bayern"),
        WeatherStation(stationId = "P914 ", stationName = "IMMENSTADT-REUTE", region = "Bayern"),
        WeatherStation(stationId = "P915 ", stationName = "OBERSTDORF-ROHRMOOS", region = "Bayern"),
        WeatherStation(stationId = "P916 ", stationName = "BALDERSCHWANG", region = "Bayern"),
        WeatherStation(
            stationId = "P917 ",
            stationName = "SONTHOFEN (FLUSSMEIS",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P919 ", stationName = "MINDELHEIM", region = "Bayern"),
        WeatherStation(
            stationId = "P923 ",
            stationName = "MARKTOBERDORF-SULZSC",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P924 ",
            stationName = "OY-MITTELBERG-PETERS",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P927 ", stationName = "HINDELANG-UNTERJOCH", region = "Bayern"),
        WeatherStation(
            stationId = "P929 ",
            stationName = "SCHWANGAU-HORN (LFW)",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P931 ",
            stationName = "BERNBEUREN-PRACHTSRI",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P934 ", stationName = "HALBLECH-TRAUCHGAU", region = "Bayern"),
        WeatherStation(stationId = "P936 ", stationName = "SEEG (KLAERANLAGE)", region = "Bayern"),
        WeatherStation(stationId = "P937 ", stationName = "ETTAL-LINDERHOF", region = "Bayern"),
        WeatherStation(stationId = "P942 ", stationName = "BAD KOHLGRUB", region = "Bayern"),
        WeatherStation(stationId = "P944 ", stationName = "OBERAMMERGAU", region = "Bayern"),
        WeatherStation(stationId = "P945 ", stationName = "SCHLEHDORF", region = "Bayern"),
        WeatherStation(
            stationId = "P946 ",
            stationName = "MEHRING, KR. ALTOETT",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P947 ",
            stationName = "KOCHEL-EINSIEDL (KRA",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P948 ", stationName = "Mittenwald-B.wiesen", region = "Bayern"),
        WeatherStation(stationId = "P949 ", stationName = "MITTENWALD/OBB.", region = "Bayern"),
        WeatherStation(stationId = "P950 ", stationName = "KRUEN", region = "Bayern"),
        WeatherStation(stationId = "P956 ", stationName = "JACHENAU-TANNERN", region = "Bayern"),
        WeatherStation(
            stationId = "P957 ",
            stationName = "LENGGRIES (SYLVENSTE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P958 ", stationName = "KREUTH-GLASHUETTE", region = "Bayern"),
        WeatherStation(
            stationId = "P960 ",
            stationName = "WAAKIRCHEN-DEMMELBER",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P962 ", stationName = "FEILNBACH, BAD", region = "Bayern"),
        WeatherStation(stationId = "P963 ", stationName = "ASSLING", region = "Bayern"),
        WeatherStation(
            stationId = "P965 ",
            stationName = "MIESBACH (KLAERANLAG",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P966 ",
            stationName = "OBERE FIRSTALM/SCHLI",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "P971 ",
            stationName = "BRANNENBURG-DEGERNDO",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P972 ", stationName = "TEISENDORF-BABING", region = "Bayern"),
        WeatherStation(
            stationId = "P973 ",
            stationName = "TEISENDORF-NEUKIRCHE",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P974 ", stationName = "ASCHAU-STEIN", region = "Bayern"),
        WeatherStation(stationId = "P975 ", stationName = "KIEFERSFELDEN", region = "Bayern"),
        WeatherStation(stationId = "P979 ", stationName = "SAMERBERG-GEISENKAM", region = "Bayern"),
        WeatherStation(
            stationId = "P981 ",
            stationName = "UNTERWOESSEN-HINTERW",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P982 ", stationName = "REIT IM WINKEL 2", region = "Bayern"),
        WeatherStation(
            stationId = "P983 ",
            stationName = "RUHPOLDING (KLAERANL",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P986 ", stationName = "INZELL", region = "Bayern"),
        WeatherStation(stationId = "P987 ", stationName = "GRASSAU", region = "Bayern"),
        WeatherStation(
            stationId = "P988 ",
            stationName = "ALTUSRIED-MUTHMANNSH",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P989 ", stationName = "TITTMONING", region = "Oberösterreich"),
        WeatherStation(stationId = "P990 ", stationName = "LAUFEN/OBB.-LEBENAU", region = "Bayern"),
        WeatherStation(stationId = "P991 ", stationName = "PIDING", region = "Bayern"),
        WeatherStation(stationId = "P994 ", stationName = "MARKTSCHELLENBERG", region = "Bayern"),
        WeatherStation(
            stationId = "P995 ",
            stationName = "RAMSAU-SCHWARZECK/SC",
            region = "Bayern"
        ),
        WeatherStation(stationId = "P996 ", stationName = "BERCHTESGADEN", region = "Bayern"),
        WeatherStation(
            stationId = "P997 ",
            stationName = "BERCHTESGADEN/JENNER",
            region = "Bayern"
        ),
        WeatherStation(
            stationId = "Q027 ",
            stationName = "NECKARGEMUEND-KLEING",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q033 ",
            stationName = "KOENIGHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q047 ",
            stationName = "ELZTAL-RITTERSBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q053 ",
            stationName = "WALLDUERN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q055 ",
            stationName = "BUCHEN,KR.NECKAR-OD.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q056 ",
            stationName = "BETZWEILER-WAELDE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q059 ", stationName = "SECKACH", region = "Baden-Württemberg"),
        WeatherStation(stationId = "Q060 ", stationName = "STOCKACH", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q061 ",
            stationName = "NOTZINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q062 ",
            stationName = "FREUDENBERG/MAIN-BOX",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q066 ",
            stationName = "LAUDA-KOENIGSHOFEN-H",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q067 ",
            stationName = "WIESENSTEIG",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q076 ",
            stationName = "BAD MERGENTHEIM-NEUN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q077 ",
            stationName = "SAULGAU,BAD",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q104 ",
            stationName = "WAGHAEUSEL-KIRRLACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q152 ",
            stationName = "MOECKMUEHL (LUBW)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q165 ",
            stationName = "INGELFINGEN-STACHEN.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q171 ",
            stationName = "KUPFERZELL-RECHBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q218 ",
            stationName = "BRETTEN, KREIS KARLS",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q221 ",
            stationName = "EPPINGEN-ELSENZ",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q222 ",
            stationName = "KOENIGSBACH-STEIN, E",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q242 ",
            stationName = "OBERSULM-WILLSBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q261 ",
            stationName = "WUESTENROT-OBERHEIMB",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q292 ",
            stationName = "KIRCHBERG-JAGST",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q293 ",
            stationName = "CRAILSHEIM (LUBW)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q295 ",
            stationName = "STIMPFACH-WEIPERTSHO",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q318 ",
            stationName = "WILDBAD, BAD-CALMBAC",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q327 ",
            stationName = "HERRENALB, BAD (LUBW",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q332 ",
            stationName = "PFORZHEIM-ISPRINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q333 ",
            stationName = "BRUCHSAL-HEIDELSHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q334 ",
            stationName = "ABTSGMUEND-UNTERGROE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q340 ",
            stationName = "VAIHINGEN/ ENZ",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q341 ",
            stationName = "SACHSENHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q351 ",
            stationName = "GROSSENLACH MANNENW.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q358 ",
            stationName = "STUTTGART NECKARTAL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q367 ",
            stationName = "WELZHEIM (LUBW)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q375 ",
            stationName = "WINTERBACH/REMSTAL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q378 ",
            stationName = "SCHWB.-GMND/WEILER",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q382 ",
            stationName = "ELLWANGEN-RINDELBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q395 ",
            stationName = "LAUCHHEIM (BERGHOF)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q404 ",
            stationName = "RHEINAU-MEMPRECHTSH.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q408 ",
            stationName = "KEHL-ODELSHOFEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q409 ",
            stationName = "BAIERSBRONN-RUHESTEI",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q410 ",
            stationName = "HORNISGRINDE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q411 ",
            stationName = "BADEN-BADEN-GEROLDSA",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q412 ", stationName = "IHRINGEN", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q414 ",
            stationName = "FORBACH (LUBW)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q424 ",
            stationName = "ENZKLOESTERLE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q437 ",
            stationName = "NEUBULACH-OBERHAUGST",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q440 ",
            stationName = "RENNG. IHINGER-HOF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q461 ",
            stationName = "BALTMANNSWEILER-HOHE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q481 ",
            stationName = "BLUMBERG-RANDEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q485 ",
            stationName = "HERMARINGEN-ALLEWIND",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q491 ",
            stationName = "NATTHEIM-FLEINHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q511 ",
            stationName = "DURBACH-EBERSWEIER",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q518 ", stationName = "OHLSBACH", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q522 ",
            stationName = "BAIERSBRONN-MITTELTA",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q529 ",
            stationName = "RIPPOLDSAU, BAD",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q541 ", stationName = "NAGOLD", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q554 ",
            stationName = "ROTTENBURG-KIEBINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q571 ",
            stationName = "URACH, BAD",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q574 ",
            stationName = "WESTERHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q579 ",
            stationName = "MERKLINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q622 ", stationName = "WOLFACH", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q625 ",
            stationName = "SCHILTACH (LUBW)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q637 ",
            stationName = "OBERNDORF/NECKAR",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q642 ",
            stationName = "HAIGERLOCH-WEILDORF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q651 ",
            stationName = "HECHINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q655 ",
            stationName = "BURLADINGEN-HAUSEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q663 ",
            stationName = "HOHENSTEIN-BERNLOCH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q671 ",
            stationName = "MÜNSINGEN-APFELSTETT",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q672 ",
            stationName = "BIRENBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q679 ",
            stationName = "EHINGEN-KIRCHEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q702 ",
            stationName = "EMMENDINGEN-MUNDING.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q703 ",
            stationName = "WEISWEIL-WALDECKHOF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q711 ", stationName = "WINDEN", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q712 ",
            stationName = "ELZACH-FISNACHT",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q713 ",
            stationName = "HERRENBERG",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q715 ",
            stationName = "HASLACH IM KINZIGTAL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q716 ",
            stationName = "SIMONSWALD-OBERSIMON",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q731 ",
            stationName = "ESCHBRONN-MARIAZELL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q733 ", stationName = "ROTTWEIL", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q738 ",
            stationName = "VILLINGEN-SCHWENNING",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q739 ",
            stationName = "NEUHAUSEN OB ECK-UNT",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q751 ",
            stationName = "ALBSTADT-BADKAP",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q755 ",
            stationName = "SCHWENNINGEN, KREIS",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q762 ",
            stationName = "LANGENENSLINGEN-ITTE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q763 ",
            stationName = "MENGEN-ENNETACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q771 ",
            stationName = "RIEDLINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q786 ",
            stationName = "BIBERACH AN DER RISS",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q788 ",
            stationName = "SIGMARINGEN-LAIZ",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q790 ",
            stationName = "DEGGENHAUSERTAL-AZEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q811 ",
            stationName = "BUCHENBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q813 ", stationName = "BREITNAU", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q822 ",
            stationName = "EISENBACH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q823 ",
            stationName = "LENZKIRCH-RUHBUEHL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q864 ",
            stationName = "PFULLENDORF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q870 ",
            stationName = "DONAUESCHINGEN (LAND",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q873 ",
            stationName = "ALTSHAUSEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q879 ",
            stationName = "WEINGARTEN BEI RAVEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q885 ",
            stationName = "WALDSEE, BAD-REUTE",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q887 ",
            stationName = "MUELLHEIM",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q891 ",
            stationName = "ROT AN DER ROT-BUCH",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q902 ",
            stationName = "MALSBURG-MARZELL",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q903 ",
            stationName = "KANDERN-GUPF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q909 ",
            stationName = "RHEINFELDEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q911 ", stationName = "TODTMOOS", region = "Baden-Württemberg"),
        WeatherStation(stationId = "Q913 ", stationName = "DOGERN", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q922 ",
            stationName = "UEHLINGEN-BIRKENDORF",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q925 ",
            stationName = "WEILHEIM-BIERBRONNEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q926 ",
            stationName = "WUTOESCHINGEN-OFTER.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q942 ", stationName = "SINGEN", region = "Baden-Württemberg"),
        WeatherStation(
            stationId = "Q945 ",
            stationName = "GAILINGEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Q946 ", stationName = "GOTTMADINGEN", region = "Schaffhausen"),
        WeatherStation(
            stationId = "Q951 ",
            stationName = "SIPPLINGEN (SWN)",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q976 ",
            stationName = "FRIEDRICHSHAFEN",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q978 ",
            stationName = "FRIEDRICHSHFN UNTER.",
            region = "Baden-Württemberg"
        ),
        WeatherStation(
            stationId = "Q999 ",
            stationName = "WANGEN/ALLGAEU-UNTER",
            region = "Baden-Württemberg"
        ),
        WeatherStation(stationId = "Z001 ", stationName = "GRAMAIS/OESTERREICH", region = "Tirol"),
        WeatherStation(stationId = "Z002 ", stationName = "HINTERHORNBACH/OESTE", region = "Tirol"),
        WeatherStation(stationId = "Z003 ", stationName = "UNTERGSCHWEND/OESTER", region = "Tirol"),
        WeatherStation(stationId = "Z004 ", stationName = "ACHENKIRCH/OESTERREI", region = "Tirol"),
        WeatherStation(stationId = "01368", stationName = "FAGERNES", region = "Innlandet"),
        WeatherStation(stationId = "01475", stationName = "SKIEN", region = "Vestfold og Telemark"),
        WeatherStation(stationId = "02378", stationName = "SODERHAMN", region = "Gävleborgs län"),
        WeatherStation(stationId = "02404", stationName = "ARVIKA", region = "Värmlands län"),
        WeatherStation(stationId = "02435", stationName = "BORLANGE", region = "Dalarnas län"),
        WeatherStation(
            stationId = "02460",
            stationName = "STOCKHOLM/ARLANDA",
            region = "Stockholms län"
        ),
        WeatherStation(stationId = "02481", stationName = "SALA", region = "Västmanlands län"),
        WeatherStation(
            stationId = "02512",
            stationName = "GOETEBORG",
            region = "Västra Götalands län"
        ),
        WeatherStation(
            stationId = "02527",
            stationName = "GOTEBORG/LANDVETTER",
            region = "Västra Götalands län"
        ),
        WeatherStation(
            stationId = "02542",
            stationName = "HALLUM",
            region = "Västra Götalands län"
        ),
//        WeatherStation(stationId = "02566", stationName = "MALILLA", region = "Kalmar län"),
//        WeatherStation(stationId = "02584", stationName = "GOTSKA SANDON"),
//        WeatherStation(stationId = "02586", stationName = "HARSTENA"),
//        WeatherStation(stationId = "02595", stationName = "ROMA/GOTLAND", region = "Gotlands län"),
//        WeatherStation(stationId = "02604", stationName = "HALMSTAD", region = "Hallands län"),
//        WeatherStation(stationId = "02620", stationName = "TORUP", region = "Hallands län"),
//        WeatherStation(stationId = "02623", stationName = "HORBY", region = "Skåne län"),
//        WeatherStation(stationId = "02625", stationName = "SKILLINGE"),
//        WeatherStation(stationId = "02641", stationName = "VAXJO", region = "Kronobergs län"),
//        WeatherStation(stationId = "02648", stationName = "VAEXJOE", region = "Kronobergs län"),
//        WeatherStation(stationId = "02651", stationName = "KRISTIANSTAD", region = "Skåne län"),
//        WeatherStation(stationId = "02970", stationName = "MARIEHAMN", region = "Åländer Land"),
//        WeatherStation(stationId = "02975", stationName = "HELSINKI", region = "Uusimaa"),
//        WeatherStation(stationId = "03059", stationName = "INVERNESS", region = "Schottland"),
//        WeatherStation(stationId = "03094", stationName = "ROSEHEARTY"),
//        WeatherStation(stationId = "03114", stationName = "OBAN", region = "Schottland"),
//        WeatherStation(stationId = "03135", stationName = "PRESTWICK", region = "Schottland"),
//        WeatherStation(stationId = "03140", stationName = "GLASGOW", region = "Schottland"),
//        WeatherStation(stationId = "03154", stationName = "DUMFRIES", region = "England"),
//        WeatherStation(stationId = "03160", stationName = "EDINBURGH", region = "Schottland"),
//        WeatherStation(stationId = "03235", stationName = "BOLTSHOPE PARK", region = "England"),
//        WeatherStation(stationId = "03245", stationName = "NEWCASTLE/AIRPORT"),
//        WeatherStation(stationId = "03246", stationName = "NEWCASTLE"),
//        WeatherStation(stationId = "03262", stationName = "TYNEMOUTH"),
//        WeatherStation(stationId = "03318", stationName = "BLACKPOOL", region = "England"),
//        WeatherStation(stationId = "03334", stationName = "MANCHESTER", region = "England"),
//        WeatherStation(stationId = "03347", stationName = "LEEDS/MET", region = "England"),
//        WeatherStation(stationId = "03453", stationName = "COTTESMORE", region = "England"),
//        WeatherStation(stationId = "03492", stationName = "NORWICH-W.C.", region = "England"),
//        WeatherStation(stationId = "03495", stationName = "COLTISHALL", region = "England"),
//        WeatherStation(stationId = "03496", stationName = "HEMSBY", region = "England"),
//        WeatherStation(stationId = "03499", stationName = "SM.KNOLL"),
//        WeatherStation(stationId = "03534", stationName = "BIRMINGHAM/AIRPORT", region = "England"),
//        WeatherStation(stationId = "03683", stationName = "STANSTED", region = "England"),
//        WeatherStation(stationId = "03715", stationName = "CARDIFF-WALES", region = "England"),
//        WeatherStation(stationId = "03726", stationName = "BRISTOL/MET.", region = "England"),
//        WeatherStation(stationId = "03776", stationName = "LONDON/GATWICK", region = "England"),
//        WeatherStation(
//            stationId = "03779",
//            stationName = "LONDON WEATHER CENT.",
//            region = "England"
//        ),
//        WeatherStation(stationId = "03817", stationName = "ST. MAWGAN", region = "England"),
//        WeatherStation(stationId = "03839", stationName = "EXETER APT", region = "England"),
//        WeatherStation(stationId = "03865", stationName = "SOUTHAMPTON", region = "England"),
//        WeatherStation(stationId = "03890", stationName = "OXFORD", region = "England"),
//        WeatherStation(stationId = "03908", stationName = "BALLYKELLY", region = "Nordirland"),
//        WeatherStation(stationId = "03914", stationName = "PORTRUSH"),
//        WeatherStation(stationId = "03930", stationName = "LIVERPOOL", region = "England"),
//        WeatherStation(stationId = "03957", stationName = "ROSSLARE"),
//        WeatherStation(stationId = "03958", stationName = "COVENTRY", region = "England"),
//        WeatherStation(stationId = "03960", stationName = "KILKENNY", region = "County Carlow"),
//        WeatherStation(stationId = "03961", stationName = "CARLOW OAK PARK"),
//        WeatherStation(stationId = "06062", stationName = "SKIVE", region = "Region Midtjylland"),
//        WeatherStation(stationId = "06078", stationName = "ANHOLT", region = "Region Midtjylland"),
//        WeatherStation(stationId = "06141", stationName = "ABED", region = "Region Sjælland"),
//        WeatherStation(
//            stationId = "06147",
//            stationName = "VINDEBAEK KYST",
//            region = "Region Sjælland"
//        ),
//        WeatherStation(
//            stationId = "06160",
//            stationName = "VAERLOESE",
//            region = "Region Hovedstaden"
//        ),
//        WeatherStation(
//            stationId = "06174",
//            stationName = "TESSEBOELLE",
//            region = "Region Sjælland"
//        ),
//        WeatherStation(stationId = "06250", stationName = "TERSCHELLING", region = "Friesland"),
//        WeatherStation(stationId = "06630", stationName = "BERN", region = "Bern"),
//        WeatherStation(stationId = "06690", stationName = "ALTENRHEIN", region = "Sankt Gallen"),
//        WeatherStation(stationId = "06710", stationName = "LAUSANNE", region = "Waadt"),
//        WeatherStation(stationId = "06775", stationName = "LUGANO", region = "Tessin"),
//        WeatherStation(stationId = "06787", stationName = "ANDEER", region = "Graubünden"),
//        WeatherStation(stationId = "06788", stationName = "HINTERRHEIN", region = "Graubünden"),
//        WeatherStation(stationId = "06790", stationName = "ST.MORITZ", region = "Graubünden"),
//        WeatherStation(stationId = "07173", stationName = "EPINAL", region = "Grand Est"),
//        WeatherStation(stationId = "07197", stationName = "COLMAR", region = "Grand Est"),
//        WeatherStation(
//            stationId = "07593",
//            stationName = "BRIANCON",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "07680",
//            stationName = "ST.RAPHAEL",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "07695",
//            stationName = "CAP FERRAT",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(stationId = "08009", stationName = "RIBADEO", region = "Asturien"),
//        WeatherStation(stationId = "08013", stationName = "AVILES/DIV.PAST"),
//        WeatherStation(stationId = "08040", stationName = "FISTERRA", region = "Galicien"),
//        WeatherStation(stationId = "08183", stationName = "SABADELL", region = "Katalonien"),
//        WeatherStation(stationId = "08227", stationName = "MADRID", region = "Kastilien-La Mancha"),
//        WeatherStation(stationId = "08307", stationName = "POLLENSA"),
//        WeatherStation(
//            stationId = "08370",
//            stationName = "JAVEA/YUNTAMIEN",
//            region = "Land Valencia"
//        ),
//        WeatherStation(stationId = "08390", stationName = "SEVILLA", region = "Andalusien"),
//        WeatherStation(stationId = "08432", stationName = "AGUILAS"),
//        WeatherStation(stationId = "08485", stationName = "MOTRIL/CLUB NAUTICO"),
//        WeatherStation(stationId = "08536", stationName = "LISSABON", region = "Distrikt Santarém"),
//        WeatherStation(stationId = "08538", stationName = "SAGRES"),
//        WeatherStation(stationId = "08547", stationName = "AVEIRO", region = "Distrikt Guarda"),
//        WeatherStation(
//            stationId = "10018",
//            stationName = "WESTERLAND",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "10026", stationName = "HUSUM", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "10034", stationName = "EGGEBEK", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "10063",
//            stationName = "PUTTGARDEN",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "10125",
//            stationName = "WILHELMSHAVEN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "10143",
//            stationName = "NEUMUENSTER",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "10177",
//            stationName = "TETEROW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "10181",
//            stationName = "PAROW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "10203", stationName = "EMDEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "10210",
//            stationName = "FRIESOYTHE-ALTENOYTH",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "10218", stationName = "AHLHORN", region = "Niedersachsen"),
//        WeatherStation(stationId = "10234", stationName = "ROTENBURG", region = "Niedersachsen"),
//        WeatherStation(stationId = "10272", stationName = "WITTSTOCK", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "10273",
//            stationName = "BASEPOHL",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "10277", stationName = "NEUGLOBSOW", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "10280",
//            stationName = "NEUBRANDENBURG",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "10312", stationName = "BELM", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "10314",
//            stationName = "HOPSTEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "10317", stationName = "OSNABRUECK", region = "Niedersachsen"),
//        WeatherStation(stationId = "10324", stationName = "MINDEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "10326",
//            stationName = "BIELEFELD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10401",
//            stationName = "BRUEGGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10403",
//            stationName = "MOENCHENGLADBACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10405",
//            stationName = "NIEDERRHEIN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10406",
//            stationName = "BOCHOLT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10416",
//            stationName = "DORTMUND",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10426",
//            stationName = "PADERBORN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10432",
//            stationName = "KOETERBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "10441",
//            stationName = "SCHAUENBURG-ELGERSH.",
//            region = "Hessen"
//        ),
//        WeatherStation(stationId = "10457", stationName = "COCHSTEDT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "10487", stationName = "DRESDEN-STADT", region = "Sachsen"),
//        WeatherStation(
//            stationId = "10492",
//            stationName = "COTTBUS/FLUGPLATZ",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "10493", stationName = "PRESCHEN", region = "Brandenburg"),
//        WeatherStation(stationId = "10495", stationName = "HOYERSWERDA", region = "Sachsen"),
//        WeatherStation(stationId = "10501", stationName = "AACHEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "10505",
//            stationName = "AACHEN-ORSBACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "10510", stationName = "NUERBURG", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "10514", stationName = "MENDIG", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "10515",
//            stationName = "KOBLENZ-BEND.",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "10517",
//            stationName = "BONN-FRIESDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "10520", stationName = "ANDERNACH", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "10521",
//            stationName = "ROTHAARGEBIRGE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "10535", stationName = "WAHLEN", region = "Hessen"),
//        WeatherStation(stationId = "10536", stationName = "FULDA", region = "Hessen"),
//        WeatherStation(stationId = "10537", stationName = "NEU-ULRICHSTEIN", region = "Hessen"),
//        WeatherStation(stationId = "10546", stationName = "KALTENNORDHEIM", region = "Thüringen"),
//        WeatherStation(stationId = "10555", stationName = "WEIMAR", region = "Thüringen"),
//        WeatherStation(stationId = "10558", stationName = "SONNEBERG", region = "Thüringen"),
//        WeatherStation(stationId = "10575", stationName = "AUE", region = "Sachsen"),
//        WeatherStation(
//            stationId = "10617",
//            stationName = "TRABEN-TRARBACH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "10633", stationName = "WIESBADEN", region = "Hessen"),
//        WeatherStation(stationId = "10640", stationName = "OFFENBACH", region = "Hessen"),
//        WeatherStation(stationId = "10645", stationName = "BREITSOL", region = "Bayern"),
//        WeatherStation(stationId = "10677", stationName = "BAYREUTH", region = "Bayern"),
//        WeatherStation(stationId = "10684", stationName = "HOF/FLUGHAFEN", region = "Bayern"),
//        WeatherStation(
//            stationId = "10714",
//            stationName = "ZWEIBRUECKEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "10722",
//            stationName = "KARLSR./BADEN-BADEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "10727",
//            stationName = "KARLSRUHE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "10731",
//            stationName = "RHEINSTETTEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "10735", stationName = "SINSHEIM", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "10747",
//            stationName = "KAISERSBACH-CRONHUET",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "10755", stationName = "ANSBACH", region = "Bayern"),
//        WeatherStation(
//            stationId = "10828",
//            stationName = "SIGMARINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "10840",
//            stationName = "ULM-MAEHRINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "10858", stationName = "FUERSTENFELDBRUCK", region = "Bayern"),
//        WeatherStation(stationId = "10893", stationName = "PASSAU", region = "Bayern"),
//        WeatherStation(
//            stationId = "10935",
//            stationName = "FRIEDRICHSHAFEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "10947", stationName = "MEMMINGEN", region = "Bayern"),
//        WeatherStation(
//            stationId = "11028",
//            stationName = "ST. POELTEN",
//            region = "Niederösterreich"
//        ),
//        WeatherStation(stationId = "11132", stationName = "ST.JOHANN/TIROL", region = "Tirol"),
//        WeatherStation(stationId = "11134", stationName = "GERLOS", region = "Tirol"),
//        WeatherStation(stationId = "11143", stationName = "ZELL A.SEE FL.", region = "Salzburg"),
//        WeatherStation(stationId = "11145", stationName = "BAD GASTEIN", region = "Salzburg"),
//        WeatherStation(stationId = "11172", stationName = "MARIAZELL", region = "Steiermark"),
//        WeatherStation(stationId = "11176", stationName = "KAPFENBERG", region = "Steiermark"),
//        WeatherStation(stationId = "11210", stationName = "MALLNITZ", region = "Kärnten"),
//        WeatherStation(stationId = "11245", stationName = "GLEICHENBERG", region = "Steiermark"),
//        WeatherStation(stationId = "11295", stationName = "LEIBNITZ", region = "Steiermark"),
//        WeatherStation(stationId = "11322", stationName = "MAYRHOFEN", region = "Tirol"),
//        WeatherStation(stationId = "11448", stationName = "PILSEN", region = "Plzeňský kraj"),
//        WeatherStation(
//            stationId = "12150",
//            stationName = "DANZIG",
//            region = "Woiwodschaft Pommern"
//        ),
//        WeatherStation(
//            stationId = "12555",
//            stationName = "KATOWICE/PYRZOWICE",
//            region = "Woiwodschaft Schlesien"
//        ),
//        WeatherStation(
//            stationId = "12839",
//            stationName = "BUDAPEST/FERIHEGY",
//            region = "Komitat Pest"
//        ),
//        WeatherStation(stationId = "12840", stationName = "BUDAPEST", region = "Budapest"),
//        WeatherStation(stationId = "13473", stationName = "PEC"),
//        WeatherStation(stationId = "13477", stationName = "PRIZREN"),
//        WeatherStation(stationId = "13481", stationName = "PRISTINA"),
//        WeatherStation(stationId = "14301", stationName = "POREC", region = "Gespanschaft Istrien"),
//        WeatherStation(stationId = "14536", stationName = "PRIJEDOR", region = "Republika Srpska"),
//        WeatherStation(stationId = "14551", stationName = "DOBOJ", region = "Republika Srpska"),
//        WeatherStation(
//            stationId = "14653",
//            stationName = "SARAJEWO",
//            region = "Föderation Bosnien und Herzegowina"
//        ),
//        WeatherStation(stationId = "14655", stationName = "GACKO", region = "Republika Srpska"),
//        WeatherStation(stationId = "14658", stationName = "SOKOLAC", region = "Republika Srpska"),
//        WeatherStation(stationId = "15481", stationName = "KOGALNICEANU"),
//        WeatherStation(stationId = "15625", stationName = "PLOVDIV", region = "Oblast Plowdiw"),
//        WeatherStation(stationId = "16072", stationName = "MONTE BISBINO", region = "Lombardei"),
//        WeatherStation(stationId = "16085", stationName = "PORTO TORRES", region = "Sardinien"),
//        WeatherStation(stationId = "16094", stationName = "VICENZA", region = "Venetien"),
//        WeatherStation(stationId = "16122", stationName = "ALBENGA", region = "Ligurien"),
//        WeatherStation(stationId = "16136", stationName = "PASSO PORRETTA"),
//        WeatherStation(stationId = "16164", stationName = "VOLTERRA", region = "Toskana"),
//        WeatherStation(stationId = "16181", stationName = "PERUGIA", region = "Umbrien"),
//        WeatherStation(stationId = "16216", stationName = "VITERBO", region = "Latium"),
//        WeatherStation(stationId = "16239", stationName = "ROMA-CIAMPINO", region = "Latium"),
//        WeatherStation(stationId = "16300", stationName = "POTENZA", region = "Basilikata"),
//        WeatherStation(stationId = "16350", stationName = "CROTONE", region = "Kalabrien"),
//        WeatherStation(stationId = "16538", stationName = "FONNI", region = "Sardinien"),
//        WeatherStation(
//            stationId = "16666",
//            stationName = "MYKONOS",
//            region = "Decentralized Administration of the Aegean"
//        ),
//        WeatherStation(stationId = "16689", stationName = "PATRAS"),
//        WeatherStation(
//            stationId = "16699",
//            stationName = "ANAGRA",
//            region = "Decentralized Administration of Thessaly and Central Greece"
//        ),
//        WeatherStation(
//            stationId = "16740",
//            stationName = "SIROS",
//            region = "Decentralized Administration of the Aegean"
//        ),
//        WeatherStation(
//            stationId = "16744",
//            stationName = "SANTORINI",
//            region = "Decentralized Administration of the Aegean"
//        ),
//        WeatherStation(stationId = "17117", stationName = "BURSA/YENISEHIR", region = "Bursa"),
//        WeatherStation(
//            stationId = "17255",
//            stationName = "KAHRAMANMARES",
//            region = "Kahramanmaraş"
//        ),
//        WeatherStation(stationId = "17610", stationName = "NICOSIA"),
//        WeatherStation(stationId = "26058", stationName = "NARVA", region = "Kreis Ida-Viru"),
//        WeatherStation(stationId = "26231", stationName = "PARNU-SAUGA", region = "Kreis Pärnu"),
//        WeatherStation(stationId = "26346", stationName = "ALUKSNE", region = "Bezirk Alūksne"),
//        WeatherStation(stationId = "26416", stationName = "SALDUS", region = "Bezirk Saldus"),
//        WeatherStation(stationId = "26424", stationName = "DOBELE", region = "Bezirk Dobele"),
//        WeatherStation(stationId = "26429", stationName = "BAUSKA", region = "Bezirk Bauska"),
//        WeatherStation(stationId = "26502", stationName = "PALANGA", region = "Bezirk Klaipėda"),
//        WeatherStation(stationId = "26529", stationName = "PANEVEZYS", region = "Bezirk Panevėžys"),
//        WeatherStation(stationId = "26603", stationName = "NIDA", region = "Bezirk Klaipėda"),
//        WeatherStation(stationId = "26630", stationName = "KAUNAS", region = "Bezirk Kaunas"),
//        WeatherStation(stationId = "26636", stationName = "SVECIONYS", region = "Bezirk Vilnius"),
//        WeatherStation(
//            stationId = "26714",
//            stationName = "MARIJAMPOLE",
//            region = "Bezirk Marijampolė"
//        ),
//        WeatherStation(stationId = "26846", stationName = "STOLBTSY", region = "Minskaja Woblasz"),
//        WeatherStation(stationId = "26851", stationName = "MINSK 2", region = "Minskaja Woblasz"),
//        WeatherStation(
//            stationId = "27613",
//            stationName = "MOSCOW/SHEREMETYEVO",
//            region = "Oblast Moskau"
//        ),
//        WeatherStation(stationId = "33347", stationName = "KIEW/BORISPOL", region = "Oblast Kiew"),
//        WeatherStation(
//            stationId = "33846",
//            stationName = "NIKOLAYEV MATVEYEVKA",
//            region = "Oblast Mykolajiw"
//        ),
//        WeatherStation(stationId = "33983", stationName = "KERCH"),
//        WeatherStation(stationId = "34712", stationName = "MARIUPOL WEST AIRP."),
//        WeatherStation(stationId = "40155", stationName = "HAIFA", region = "Haifa"),
//        WeatherStation(stationId = "40184", stationName = "JERUSALEM", region = "Bezirk Jerusalem"),
//        WeatherStation(
//            stationId = "40341",
//            stationName = "AQABA (PORT)",
//            region = "Gouvernement Aqaba"
//        ),
//        WeatherStation(
//            stationId = "60250",
//            stationName = "AGADIR/INEZGANE",
//            region = "Souss-Massa"
//        ),
//        WeatherStation(stationId = "60535", stationName = "DJELFA", region = "El Djelfa"),
//        WeatherStation(
//            stationId = "62450",
//            stationName = "SUEZ",
//            region = "Gouvernement As-Suwais"
//        ),
//        WeatherStation(stationId = "62456", stationName = "TABA/RAS", region = "Schimal Sina'"),
//        WeatherStation(
//            stationId = "69679",
//            stationName = "RAJLOVAC",
//            region = "Föderation Bosnien und Herzegowina"
//        ),
//        WeatherStation(stationId = "K1060", stationName = "AURICH", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1083", stationName = "BORKUM"),
//        WeatherStation(stationId = "K1091", stationName = "DOERPEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "K1115",
//            stationName = "GELSENKIRCHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "K1140", stationName = "LOENINGEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1161", stationName = "BOCHUM", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "K1170",
//            stationName = "SOLINGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1171",
//            stationName = "LEVERKUSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1174",
//            stationName = "HEINSBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "K1176", stationName = "KLEVE", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "K1188",
//            stationName = "DUISBURG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1407",
//            stationName = "WYK/FOEHR",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "K1445",
//            stationName = "HEIDE/HOLSTEIN",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "K1481", stationName = "ELSFLETH", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "K1484",
//            stationName = "GLUECKSTADT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "K1489",
//            stationName = "BUCHHOLZ I.D. NORDH.",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "K1511", stationName = "CLOPPENBURG", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1514", stationName = "MELLE", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "K1520",
//            stationName = "RAHDEN-VARL",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1524",
//            stationName = "HERFORD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "K1546", stationName = "HILDESHEIM", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1547", stationName = "HAMELN", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1550", stationName = "HOLZMINDEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "K1579", stationName = "MELSUNGEN", region = "Hessen"),
//        WeatherStation(stationId = "K1584", stationName = "AROLSEN", region = "Hessen"),
//        WeatherStation(
//            stationId = "K1585",
//            stationName = "ARNSBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "K1586", stationName = "WILLINGEN/UPLAND", region = "Hessen"),
//        WeatherStation(stationId = "K1596", stationName = "FRANKENBERG/EDER", region = "Hessen"),
//        WeatherStation(
//            stationId = "K1597",
//            stationName = "LENNESTADT-ALTENHUND",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1599",
//            stationName = "BAD BERLEBURG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K1705",
//            stationName = "OSTENFELD",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "K2107", stationName = "VOELKLINGEN", region = "Saarland"),
//        WeatherStation(
//            stationId = "K2204",
//            stationName = "JUELICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K2221",
//            stationName = "KOELN (BOTAN.GART.)",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K2226",
//            stationName = "EUSKIRCHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "K2245",
//            stationName = "BAD NEUENAHR-AHRWL.",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K2247",
//            stationName = "NEUWIED-WOLLENDORF",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K2259", stationName = "MAYEN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K2265",
//            stationName = "MANDERSCHEID",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K2269",
//            stationName = "BAD BERTRICH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K2270", stationName = "DAUN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K2274",
//            stationName = "BAD KREUZNACH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K2286",
//            stationName = "WOLFSTEIN/PFALZ",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K2288",
//            stationName = "KAISERSLAUTERN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K2290", stationName = "PIRMASENS", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K2301",
//            stationName = "OFFENBURG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2309", stationName = "KEHL", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2360",
//            stationName = "SCHAUINSLAND",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2507", stationName = "MICHELSTADT", region = "Hessen"),
//        WeatherStation(
//            stationId = "K2561",
//            stationName = "FRANKFURT/PALMENGAR.",
//            region = "Hessen"
//        ),
//        WeatherStation(stationId = "K2588", stationName = "BAD SCHWALBACH", region = "Hessen"),
//        WeatherStation(stationId = "K2596", stationName = "DARMSTADT", region = "Hessen"),
//        WeatherStation(stationId = "K2601", stationName = "SIEGEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "K2611", stationName = "MARBURG", region = "Hessen"),
//        WeatherStation(stationId = "K2613", stationName = "MAINZ", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K2614", stationName = "ALZEY", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K2630", stationName = "SCHLUECHTERN", region = "Hessen"),
//        WeatherStation(stationId = "K2635", stationName = "WORMS", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K2637", stationName = "GELNHAUSEN", region = "Hessen"),
//        WeatherStation(stationId = "K2644", stationName = "WALDEMS", region = "Hessen"),
//        WeatherStation(stationId = "K2646", stationName = "LIMBURG", region = "Hessen"),
//        WeatherStation(stationId = "K2649", stationName = "KOENIGSTEIN/TS.", region = "Hessen"),
//        WeatherStation(stationId = "K2667", stationName = "BEERFELDEN", region = "Hessen"),
//        WeatherStation(stationId = "K2671", stationName = "LOHR", region = "Bayern"),
//        WeatherStation(
//            stationId = "K2679",
//            stationName = "BAD MERGENTHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2688",
//            stationName = "BAD BERGZABERN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K2689",
//            stationName = "HEILBRONN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2693",
//            stationName = "HEIDELBERG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2696",
//            stationName = "PHILIPPSBURG (KKW)",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2701",
//            stationName = "BADEN BADEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2706",
//            stationName = "BAD HERRENALB",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2711",
//            stationName = "PFORZHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2714",
//            stationName = "LUDWIGSBURG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2718",
//            stationName = "KIRCHHEIM/TECK",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2719", stationName = "WELZHEIM", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2721",
//            stationName = "MURRHARDT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2724",
//            stationName = "SCHWAEBISCH HALL",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2727",
//            stationName = "SCHWAEB.GMUEND",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2729",
//            stationName = "MERKLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2735", stationName = "SCHONACH", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "K2736", stationName = "WOLFACH", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2739",
//            stationName = "VILLINGEN SCHWENN.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2753",
//            stationName = "MUENSINGEN-APPELST.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2757", stationName = "ROTTWEIL", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2760",
//            stationName = "SIGMARINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2761", stationName = "BONNDORF", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "K2765", stationName = "BIBERACH", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2767",
//            stationName = "TITISEE-NEUSTADT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2778", stationName = "WALDSHUT", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2780",
//            stationName = "DONAUESCHINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2786",
//            stationName = "PFULLENDORF-BRUNNHS.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2787",
//            stationName = "UEBERLINGEN/BODENSEE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2791",
//            stationName = "RAVENSBURG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2796", stationName = "LINDENBERG/ALLGAEU", region = "Bayern"),
//        WeatherStation(stationId = "K2798", stationName = "STOCKACH", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2832",
//            stationName = "TAUBERBISCHOFSHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2868",
//            stationName = "REUTLINGEN-BETZING.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K2890", stationName = "RASTATT", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "K2913",
//            stationName = "BOEBLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2920",
//            stationName = "HERRENBERG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2923",
//            stationName = "ROTTENBURG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K2932",
//            stationName = "TUTTLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K3018",
//            stationName = "ZINNOWITZ",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "K3182",
//            stationName = "BERNBURG/SAALE",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "K3187", stationName = "QUEDLINBURG", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "K3362", stationName = "BITTERFELD", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "K3382", stationName = "BAUTZEN", region = "Sachsen"),
//        WeatherStation(stationId = "K3384", stationName = "MEISSEN", region = "Sachsen"),
//        WeatherStation(stationId = "K3404", stationName = "SONDERSHAUSEN", region = "Thüringen"),
//        WeatherStation(
//            stationId = "K3406",
//            stationName = "BAD FRANKENHAUSEN/KY",
//            region = "Thüringen"
//        ),
//        WeatherStation(stationId = "K3414", stationName = "RASTENBERG", region = "Thüringen"),
//        WeatherStation(stationId = "K3822", stationName = "EUTIN", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "K3854",
//            stationName = "BAD SEGEBERG",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "K3869",
//            stationName = "GRAMBECK",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "K3883", stationName = "UELZEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "K3891", stationName = "LUENEBURG", region = "Niedersachsen"),
//        WeatherStation(stationId = "K3910", stationName = "WOLFSBURG", region = "Niedersachsen"),
//        WeatherStation(stationId = "K3924", stationName = "SALZGITTER", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "K3973",
//            stationName = "BAD LAUTERBERG",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "K3982",
//            stationName = "CLAUSTHAL-ZELLERFLD.",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "K3997", stationName = "ESCHWEGE", region = "Hessen"),
//        WeatherStation(stationId = "K4036", stationName = "KRONACH", region = "Bayern"),
//        WeatherStation(stationId = "K4042", stationName = "KULMBACH", region = "Bayern"),
//        WeatherStation(stationId = "K4054", stationName = "SCHWEINFURT", region = "Bayern"),
//        WeatherStation(stationId = "K4057", stationName = "KITZINGEN", region = "Bayern"),
//        WeatherStation(stationId = "K4058", stationName = "EBRACH", region = "Bayern"),
//        WeatherStation(stationId = "K4069", stationName = "GUNZENHSN.", region = "Bayern"),
//        WeatherStation(stationId = "K4071", stationName = "SCHWABACH", region = "Bayern"),
//        WeatherStation(stationId = "K4086", stationName = "FUERTH/BAYERN", region = "Bayern"),
//        WeatherStation(stationId = "K4087", stationName = "ERLANGEN", region = "Bayern"),
//        WeatherStation(stationId = "K4091", stationName = "UFFENHEIM", region = "Bayern"),
//        WeatherStation(stationId = "K4093", stationName = "ROTHENBURG ODT.", region = "Bayern"),
//        WeatherStation(
//            stationId = "K4100",
//            stationName = "ELLWANGEN/JAGST",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "K4102",
//            stationName = "HEIDENHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "K4105", stationName = "NOERDLINGEN", region = "Bayern"),
//        WeatherStation(stationId = "K4108", stationName = "EICHSTAETT", region = "Bayern"),
//        WeatherStation(stationId = "K4116", stationName = "ALTOMUENSTER", region = "Bayern"),
//        WeatherStation(stationId = "K4130", stationName = "KRUMBACH-EDENHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "K4138", stationName = "ISNY", region = "Bayern"),
//        WeatherStation(stationId = "K4140", stationName = "OBERSTAUFEN", region = "Bayern"),
//        WeatherStation(stationId = "K4149", stationName = "KAUFBEUREN", region = "Bayern"),
//        WeatherStation(stationId = "K4157", stationName = "MITTENWALD", region = "Bayern"),
//        WeatherStation(stationId = "K4169", stationName = "BAD TOELZ", region = "Bayern"),
//        WeatherStation(stationId = "K4171", stationName = "EBERSBERG", region = "Bayern"),
//        WeatherStation(stationId = "K4172", stationName = "HOLZKIRCHEN/OBB.", region = "Bayern"),
//        WeatherStation(stationId = "K4179", stationName = "KREUTH", region = "Bayern"),
//        WeatherStation(stationId = "K4181", stationName = "SCHLIERSEE", region = "Bayern"),
//        WeatherStation(stationId = "K4185", stationName = "MAINBURG", region = "Bayern"),
//        WeatherStation(stationId = "K4204", stationName = "JENA/STERNWARTE", region = "Thüringen"),
//        WeatherStation(stationId = "K4244", stationName = "LOBENSTEIN", region = "Thüringen"),
//        WeatherStation(stationId = "K4402", stationName = "FREIBERG", region = "Sachsen"),
//        WeatherStation(stationId = "K4408", stationName = "BAD GOTTLEUBA", region = "Sachsen"),
//        WeatherStation(stationId = "K4420", stationName = "GREIZ-DOELAU", region = "Sachsen"),
//        WeatherStation(stationId = "K4473", stationName = "SELB", region = "Bayern"),
//        WeatherStation(stationId = "K4476", stationName = "TIRSCHENREUTH", region = "Bayern"),
//        WeatherStation(stationId = "K4484", stationName = "OBERVIECHTACH", region = "Bayern"),
//        WeatherStation(stationId = "K4488", stationName = "CHAM", region = "Bayern"),
//        WeatherStation(stationId = "K4501", stationName = "MALLERSDORF/NDB.", region = "Bayern"),
//        WeatherStation(stationId = "K4503", stationName = "LANDSHUT", region = "Bayern"),
//        WeatherStation(stationId = "K4514", stationName = "FREYUNG", region = "Bayern"),
//        WeatherStation(stationId = "K4529", stationName = "WASSERBURG/INN", region = "Bayern"),
//        WeatherStation(stationId = "K4531", stationName = "TROSTBERG", region = "Bayern"),
//        WeatherStation(stationId = "K4533", stationName = "TRAUNSTEIN", region = "Bayern"),
//        WeatherStation(stationId = "K4535", stationName = "BAD REICHENHALL", region = "Bayern"),
//        WeatherStation(stationId = "K4536", stationName = "BERCHTESG.", region = "Bayern"),
//        WeatherStation(stationId = "K4540", stationName = "REIT IM WINKL", region = "Bayern"),
//        WeatherStation(stationId = "K4546", stationName = "BAYRISCHZELL", region = "Bayern"),
//        WeatherStation(stationId = "K4570", stationName = "BROTJACKLRIEGEL", region = "Bayern"),
//        WeatherStation(
//            stationId = "K9097",
//            stationName = "DETMOLD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N0101", stationName = "BALDERSCHWANG", region = "Bayern"),
//        WeatherStation(stationId = "N0113", stationName = "LINDAU", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0121",
//            stationName = "MONSCHAU",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N0122",
//            stationName = "WANGEN/ALLGAEU",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0136",
//            stationName = "BAD SCHUSSENRIED",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0139",
//            stationName = "BAD WALDSEE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0149", stationName = "MARKTREDW.", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0151",
//            stationName = "SCHLEIDEN-SCHOENES.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N0153",
//            stationName = "WARENDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N0157",
//            stationName = "RIEDLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0159",
//            stationName = "SAULGAU-BOLSTERN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0171",
//            stationName = "EHINGEN/DONAU",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0197",
//            stationName = "GOTTMADINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0214", stationName = "BLUMBERG", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "N0224", stationName = "AHLEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N0226", stationName = "DUEREN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N0242",
//            stationName = "HINDELANG/OSTRACHTAL",
//            region = "Bayern"
//        ),
//        WeatherStation(stationId = "N0253", stationName = "IMMENSTADT", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0258",
//            stationName = "ZELL I.WIES.-PFAFFB.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0267", stationName = "LOERRACH", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "N0273",
//            stationName = "LEUTKIRCH",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0283",
//            stationName = "HEITERSHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0291", stationName = "BREISACH", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "N0304",
//            stationName = "ERKELENZ",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N0311",
//            stationName = "GUTACH/BR.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0332", stationName = "MINDELHEIM", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0352",
//            stationName = "GERSTETTEN-DETTINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0359",
//            stationName = "DISCHINGEN(EGAUWAS.)",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0406", stationName = "DINKELSBUEHL", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0411",
//            stationName = "SCHRAMBERG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N0429",
//            stationName = "VIERSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N0432",
//            stationName = "BOPFINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0445", stationName = "DONAUWOERTH", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0447",
//            stationName = "STRAELEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N0462", stationName = "VECHTA", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N0469",
//            stationName = "OBERKIRCH",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0474", stationName = "WERTINGEN", region = "Bayern"),
//        WeatherStation(stationId = "N0477", stationName = "ACHERN", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "N0505", stationName = "FUESSEN-WEISSENSEE", region = "Bayern"),
//        WeatherStation(stationId = "N0514", stationName = "ANKUM", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N0527",
//            stationName = "FORBACH-HERRENWIES",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0546", stationName = "HASELUENNE", region = "Niedersachsen"),
//        WeatherStation(stationId = "N0548", stationName = "SONTRA", region = "Hessen"),
//        WeatherStation(stationId = "N0554", stationName = "RINGGAU-RENDA", region = "Hessen"),
//        WeatherStation(stationId = "N0586", stationName = "SCHWABMUENCHEN", region = "Bayern"),
//        WeatherStation(stationId = "N0602", stationName = "MEPPEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "N0635", stationName = "WITZENHAUSEN-ZIEGH.", region = "Hessen"),
//        WeatherStation(stationId = "N0645", stationName = "POETTMES-SCHORN", region = "Bayern"),
//        WeatherStation(stationId = "N0674", stationName = "ABENSBERG-SANDHARL.", region = "Bayern"),
//        WeatherStation(
//            stationId = "N0677",
//            stationName = "LANDAU/PFALZ",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "N0680",
//            stationName = "GERMERSHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N0717", stationName = "FRIESOYTHE", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N0738",
//            stationName = "UPLENGEN-STAPELERM.",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N0751", stationName = "THALMAESSING", region = "Bayern"),
//        WeatherStation(stationId = "N0753", stationName = "GREDING", region = "Bayern"),
//        WeatherStation(stationId = "N0755", stationName = "SPEYER", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N0761",
//            stationName = "KRAICHTAL-GOCHSHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N0763", stationName = "BEILNGRIES", region = "Bayern"),
//        WeatherStation(stationId = "N0765", stationName = "LEER", region = "Niedersachsen"),
//        WeatherStation(stationId = "N0775", stationName = "RIEDENBURG", region = "Bayern"),
//        WeatherStation(stationId = "N0778", stationName = "NEUSTADT/DONAU", region = "Bayern"),
//        WeatherStation(stationId = "N0781", stationName = "KELHEIM", region = "Bayern"),
//        WeatherStation(stationId = "N1012", stationName = "KALBACH", region = "Hessen"),
//        WeatherStation(stationId = "N1026", stationName = "LOSSBURG", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "N1027", stationName = "GREBENHAIN", region = "Hessen"),
//        WeatherStation(stationId = "N1033", stationName = "HORB", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "N1038",
//            stationName = "ALBSTADT-BURGFELDEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1040", stationName = "HEMMOOR", region = "Niedersachsen"),
//        WeatherStation(stationId = "N1043", stationName = "BALINGEN", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "N1054",
//            stationName = "HAIGERLOCH-HART",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1075",
//            stationName = "TUEBINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1101", stationName = "BAERNAU", region = "Bayern"),
//        WeatherStation(stationId = "N1107", stationName = "NEUFFEN", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "N1120", stationName = "ZITTAU", region = "Sachsen"),
//        WeatherStation(
//            stationId = "N1122",
//            stationName = "NEUSTADT/WN-ALTENST.",
//            region = "Bayern"
//        ),
//        WeatherStation(
//            stationId = "N1140",
//            stationName = "GEISLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1147",
//            stationName = "GOEPPINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1150", stationName = "ROTENBURG/FULDA", region = "Hessen"),
//        WeatherStation(stationId = "N1151", stationName = "KEMNATH", region = "Bayern"),
//        WeatherStation(stationId = "N1156", stationName = "GUBEN", region = "Brandenburg"),
//        WeatherStation(stationId = "N1171", stationName = "SPANGENBERG", region = "Hessen"),
//        WeatherStation(stationId = "N1201", stationName = "WALDMUENCHEN", region = "Bayern"),
//        WeatherStation(
//            stationId = "N1215",
//            stationName = "WINTERBACH",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1245", stationName = "BACKNANG", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "N1265", stationName = "HOHENFELS", region = "Bayern"),
//        WeatherStation(
//            stationId = "N1319",
//            stationName = "ALTENSTEIG-WART",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1323", stationName = "FRANKFURT/ODER", region = "Brandenburg"),
//        WeatherStation(stationId = "N1325", stationName = "REGEN", region = "Bayern"),
//        WeatherStation(stationId = "N1333", stationName = "BISCHOFSMAIS", region = "Bayern"),
//        WeatherStation(
//            stationId = "N1336",
//            stationName = "BAD LIEBENZELL",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1345", stationName = "VIECHTACH", region = "Bayern"),
//        WeatherStation(stationId = "N1353", stationName = "LAM", region = "Bayern"),
//        WeatherStation(
//            stationId = "N1354",
//            stationName = "RENNINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1371", stationName = "FURTH IM WALD", region = "Bayern"),
//        WeatherStation(stationId = "N1382", stationName = "FALKENSTEIN KR.CHAM", region = "Bayern"),
//        WeatherStation(
//            stationId = "N1401",
//            stationName = "BOENNIGHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1429", stationName = "NEUKIRCHEN-SEIGHS.", region = "Hessen"),
//        WeatherStation(stationId = "N1441", stationName = "SCHWALMSTADT", region = "Hessen"),
//        WeatherStation(stationId = "N1461", stationName = "SANKT ENGLMAR", region = "Bayern"),
//        WeatherStation(stationId = "N1475", stationName = "DEGGENDORF", region = "Bayern"),
//        WeatherStation(stationId = "N1503", stationName = "AALEN", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "N1528",
//            stationName = "WUESTENROT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N1542", stationName = "EBERSWALDE", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "N1551",
//            stationName = "KUENZELSAU-MORSBACH",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1613",
//            stationName = "CRAILSHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1622",
//            stationName = "BLAUFELDEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1648",
//            stationName = "MOECKMUEHL",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N1712",
//            stationName = "MOSBACH-DIEDESHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "N2028",
//            stationName = "FRIEDEBURG-HORSTEN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N2032", stationName = "USLAR", region = "Niedersachsen"),
//        WeatherStation(stationId = "N2046", stationName = "MURNAU", region = "Bayern"),
//        WeatherStation(stationId = "N2048", stationName = "KOCHEL", region = "Bayern"),
//        WeatherStation(stationId = "N2076", stationName = "SAUERLACH", region = "Bayern"),
//        WeatherStation(stationId = "N2103", stationName = "OBERAMMERGAU", region = "Bayern"),
//        WeatherStation(stationId = "N2117", stationName = "WEILHEIM", region = "Bayern"),
//        WeatherStation(stationId = "N2132", stationName = "GRUENSTADT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N2142", stationName = "DACHAU", region = "Bayern"),
//        WeatherStation(stationId = "N2147", stationName = "STARNBERG", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2159",
//            stationName = "KIRCHHEIMBOLANDEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N2171", stationName = "WOLFHAGEN", region = "Hessen"),
//        WeatherStation(
//            stationId = "N2173",
//            stationName = "PASEWALK",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2193", stationName = "LANDAU/ISAR", region = "Bayern"),
//        WeatherStation(stationId = "N2202", stationName = "LALLING", region = "Bayern"),
//        WeatherStation(stationId = "N2204", stationName = "HEPPENHEIM", region = "Hessen"),
//        WeatherStation(stationId = "N2216", stationName = "BIBLIS", region = "Hessen"),
//        WeatherStation(stationId = "N2219", stationName = "SEEHEIM-JUGENHEIM", region = "Hessen"),
//        WeatherStation(stationId = "N2221", stationName = "GEISENHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "N2222", stationName = "LAUTERTAL/ODW.", region = "Hessen"),
//        WeatherStation(
//            stationId = "N2228",
//            stationName = "FRIEDLAND",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2235", stationName = "HOFGEISMAR", region = "Hessen"),
//        WeatherStation(stationId = "N2249", stationName = "OPPENHEIM", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N2253", stationName = "EGING AM SEE", region = "Bayern"),
//        WeatherStation(stationId = "N2254", stationName = "RUESSELSHEIM", region = "Hessen"),
//        WeatherStation(stationId = "N2271", stationName = "SCHOENBERG/NDB.", region = "Bayern"),
//        WeatherStation(stationId = "N2274", stationName = "SANKT OSWALD", region = "Bayern"),
//        WeatherStation(stationId = "N2284", stationName = "MAUTH", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2311",
//            stationName = "WILLEBADESSEN-BORL.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N2336",
//            stationName = "HOEXTER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N2361", stationName = "OTTENSTEIN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N2362",
//            stationName = "GRIMMEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2372",
//            stationName = "DEMMIN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2375",
//            stationName = "EMMERTHAL-GROHNDE",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "N2386",
//            stationName = "ANKLAM",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2388", stationName = "DORFEN KR.ERDING", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2395",
//            stationName = "WOLGAST",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2402",
//            stationName = "NIEHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N2412",
//            stationName = "WUSTERHUSEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2431", stationName = "ASCHAU", region = "Bayern"),
//        WeatherStation(stationId = "N2433", stationName = "BAD MUENDER", region = "Niedersachsen"),
//        WeatherStation(stationId = "N2443", stationName = "RUHPOLDING-SEEHAUS", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2446",
//            stationName = "SASSNITZ-STAPHEL",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2457",
//            stationName = "BERGEN/RUEGEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2475",
//            stationName = "STRALSUND",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2571", stationName = "TEISENDORF", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2575",
//            stationName = "BAD SUELZE",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2583", stationName = "BURGHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "N2603", stationName = "BODENKIRCHEN-AICH", region = "Bayern"),
//        WeatherStation(stationId = "N2611", stationName = "EGGENFELDEN", region = "Bayern"),
//        WeatherStation(stationId = "N2614", stationName = "PFARRKIRCHEN", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2622",
//            stationName = "PREROW A. DARSS",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2626",
//            stationName = "GRAAL-MUERITZ",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2632", stationName = "POCKING", region = "Bayern"),
//        WeatherStation(stationId = "N2704", stationName = "WALDKIRCHEN", region = "Bayern"),
//        WeatherStation(
//            stationId = "N2781",
//            stationName = "BUETZOW-WOLKEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N2813",
//            stationName = "BAD DOBERAN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N2822", stationName = "RERIK"),
//        WeatherStation(
//            stationId = "N2839",
//            stationName = "WISMAR",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N3001",
//            stationName = "SCHOEPPINGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N3002", stationName = "MUENCHBERG", region = "Bayern"),
//        WeatherStation(stationId = "N3003", stationName = "GEFREES", region = "Bayern"),
//        WeatherStation(stationId = "N3007", stationName = "SCHWARZENBACH/SAALE", region = "Bayern"),
//        WeatherStation(
//            stationId = "N3029",
//            stationName = "OERLINGHAUSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N3035", stationName = "NAILA", region = "Bayern"),
//        WeatherStation(stationId = "N3041", stationName = "LICHTENFELS/OFR.", region = "Bayern"),
//        WeatherStation(
//            stationId = "N3047",
//            stationName = "GEROLDSGRUEN-STEINB.",
//            region = "Bayern"
//        ),
//        WeatherStation(stationId = "N3049", stationName = "EMLICHHEIM", region = "Niedersachsen"),
//        WeatherStation(stationId = "N3052", stationName = "PRESSECK", region = "Bayern"),
//        WeatherStation(stationId = "N3053", stationName = "STEINBACH AM WALD", region = "Bayern"),
//        WeatherStation(stationId = "N3060", stationName = "BAD BENTHEIM", region = "Niedersachsen"),
//        WeatherStation(stationId = "N3102", stationName = "AHAUS", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N3114",
//            stationName = "COESFELD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N3149", stationName = "EBERN-EYRICHSHOF", region = "Bayern"),
//        WeatherStation(stationId = "N3206", stationName = "SULINGEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "N3233", stationName = "NEUMARKT OPF.", region = "Bayern"),
//        WeatherStation(stationId = "N3240", stationName = "HOYA", region = "Niedersachsen"),
//        WeatherStation(stationId = "N3254", stationName = "OTTENDORF-OKRILLA", region = "Sachsen"),
//        WeatherStation(stationId = "N3257", stationName = "PIRNA", region = "Sachsen"),
//        WeatherStation(stationId = "N3264", stationName = "BISCHOFSWERDA", region = "Sachsen"),
//        WeatherStation(stationId = "N3265", stationName = "AUERBACH/OPF.", region = "Bayern"),
//        WeatherStation(stationId = "N3303", stationName = "HERSBRUCK", region = "Bayern"),
//        WeatherStation(stationId = "N3309", stationName = "LAUF/HEUCHLING", region = "Bayern"),
//        WeatherStation(stationId = "N3312", stationName = "ALTDORF/OFR.", region = "Bayern"),
//        WeatherStation(stationId = "N3334", stationName = "GRAEFENBERG", region = "Bayern"),
//        WeatherStation(stationId = "N3360", stationName = "STADELHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "N3420", stationName = "FORCHHEIM/OFR.", region = "Bayern"),
//        WeatherStation(
//            stationId = "N3432",
//            stationName = "NEUSTADT/AISCH-UNTN.",
//            region = "Bayern"
//        ),
//        WeatherStation(stationId = "N3462", stationName = "RIESA", region = "Sachsen"),
//        WeatherStation(stationId = "N3504", stationName = "HASSFURT", region = "Bayern"),
//        WeatherStation(stationId = "N3533", stationName = "TORGAU", region = "Sachsen"),
//        WeatherStation(stationId = "N3608", stationName = "KAMENZ", region = "Sachsen"),
//        WeatherStation(stationId = "N3619", stationName = "HOYERSWERDA", region = "Sachsen"),
//        WeatherStation(stationId = "N3666", stationName = "ELSTERWERDA", region = "Brandenburg"),
//        WeatherStation(stationId = "N3685", stationName = "GRAEFENTONNA", region = "Thüringen"),
//        WeatherStation(stationId = "N3727", stationName = "OBERWEISSENBRUNN", region = "Bayern"),
//        WeatherStation(stationId = "N3729", stationName = "BISCHOFSHEIM/RHOEN", region = "Bayern"),
//        WeatherStation(stationId = "N3754", stationName = "HAMMELBURG", region = "Bayern"),
//        WeatherStation(stationId = "N3778", stationName = "BURGSINN", region = "Bayern"),
//        WeatherStation(stationId = "N3833", stationName = "WEIBERSBRUNN", region = "Bayern"),
//        WeatherStation(
//            stationId = "N3924",
//            stationName = "WEIKERSHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N3951", stationName = "WERTHEIM-EICHEL", region = "Bayern"),
//        WeatherStation(
//            stationId = "N4002",
//            stationName = "MUDAU-SCHLOSSAU",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "N4005", stationName = "AMORBACH", region = "Bayern"),
//        WeatherStation(stationId = "N4032", stationName = "LUETZELBACH", region = "Hessen"),
//        WeatherStation(stationId = "N4045", stationName = "ASCHAFFENBURG", region = "Bayern"),
//        WeatherStation(stationId = "N4068", stationName = "GIFHORN", region = "Niedersachsen"),
//        WeatherStation(stationId = "N4070", stationName = "DIEBURG", region = "Hessen"),
//        WeatherStation(stationId = "N4116", stationName = "HANAU", region = "Hessen"),
//        WeatherStation(stationId = "N4123", stationName = "EIBENSTOCK(TALSP.)", region = "Sachsen"),
//        WeatherStation(stationId = "N4161", stationName = "GOSLAR", region = "Niedersachsen"),
//        WeatherStation(stationId = "N4162", stationName = "ZWICKAU", region = "Sachsen"),
//        WeatherStation(stationId = "N4176", stationName = "ROTTACH-EGERN", region = "Bayern"),
//        WeatherStation(stationId = "N4191", stationName = "ZWOENITZ", region = "Sachsen"),
//        WeatherStation(stationId = "N4241", stationName = "NEU ANSPACH", region = "Hessen"),
//        WeatherStation(
//            stationId = "N4242",
//            stationName = "WOLFENBUETTEL",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N4248", stationName = "ROCHLITZ", region = "Sachsen"),
//        WeatherStation(stationId = "N4253", stationName = "FRIEDBERG", region = "Hessen"),
//        WeatherStation(stationId = "N4277", stationName = "LEHRE", region = "Niedersachsen"),
//        WeatherStation(stationId = "N4333", stationName = "BAD HOMBURG", region = "Hessen"),
//        WeatherStation(stationId = "N4359", stationName = "LEHRTE", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N4365",
//            stationName = "ADELHEIDSDORF",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N4377", stationName = "ANNABERG_BUCHHOLZ", region = "Sachsen"),
//        WeatherStation(stationId = "N4414", stationName = "HALBERSTADT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "N4426", stationName = "DOERNTHAL", region = "Sachsen"),
//        WeatherStation(stationId = "N4464", stationName = "BRAUNSDORF", region = "Sachsen"),
//        WeatherStation(stationId = "N4513", stationName = "GRIMMA", region = "Sachsen"),
//        WeatherStation(stationId = "N4535", stationName = "BAD DUEBEN", region = "Sachsen"),
//        WeatherStation(stationId = "N4561", stationName = "HERZBERG", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N4601",
//            stationName = "OSTERODE/HARZ",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N4623", stationName = "NORTHEIM", region = "Niedersachsen"),
//        WeatherStation(stationId = "N4639", stationName = "DESSAU", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N4655",
//            stationName = "BAD GANDERSHEIM",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N4838", stationName = "ADENSTEDT", region = "Niedersachsen"),
//        WeatherStation(stationId = "N4854", stationName = "SCHOENINGEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N5015",
//            stationName = "BARSINGHAUSEN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N5044", stationName = "INGELHEIM", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N5056", stationName = "RUEDESHEIM", region = "Hessen"),
//        WeatherStation(stationId = "N5111", stationName = "FREISEN/SAAR", region = "Saarland"),
//        WeatherStation(stationId = "N5146", stationName = "SOHREN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N5149", stationName = "RHAUNEN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N5184", stationName = "SAALFELD", region = "Thüringen"),
//        WeatherStation(stationId = "N5227", stationName = "KUSEL", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N5245",
//            stationName = "LAUTERECKEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N5250", stationName = "RUDOLSTADT", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N5344",
//            stationName = "STROMBERG/HUNSRUECK",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N5346", stationName = "ILMENAU", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N5374",
//            stationName = "BINGEN-BUEDESHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "N5417",
//            stationName = "NAUMBURG/SAALE",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N5432", stationName = "MUEHLHAUSEN", region = "Thüringen"),
//        WeatherStation(stationId = "N5446", stationName = "OBERWESEL", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N5528", stationName = "ARNSTADT", region = "Thüringen"),
//        WeatherStation(stationId = "N5537", stationName = "TAMBACH-DIETHARZ", region = "Thüringen"),
//        WeatherStation(stationId = "N5570", stationName = "BAD TENNSTEDT", region = "Thüringen"),
//        WeatherStation(stationId = "N5601", stationName = "SOEMMERDA", region = "Thüringen"),
//        WeatherStation(stationId = "N5755", stationName = "NORDHAUSEN", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N5791",
//            stationName = "SANGERHAUSEN",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "N5872",
//            stationName = "BAD DUERRENBERG",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N5939", stationName = "ADORF", region = "Sachsen"),
//        WeatherStation(stationId = "N6016", stationName = "STEFFENBERG", region = "Hessen"),
//        WeatherStation(stationId = "N6037", stationName = "ULRICHSTEIN", region = "Hessen"),
//        WeatherStation(stationId = "N6067", stationName = "DELMENHORST", region = "Niedersachsen"),
//        WeatherStation(stationId = "N6160", stationName = "BUTZBACH", region = "Hessen"),
//        WeatherStation(stationId = "N6172", stationName = "WETZLAR", region = "Hessen"),
//        WeatherStation(stationId = "N6197", stationName = "MEUSELWITZ", region = "Thüringen"),
//        WeatherStation(stationId = "N6208", stationName = "DIETZHOELZTAL", region = "Hessen"),
//        WeatherStation(stationId = "N6223", stationName = "HERBORN", region = "Hessen"),
//        WeatherStation(
//            stationId = "N6230",
//            stationName = "OSTERHOLZ-SCHARMBECK",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N6241", stationName = "MENGERSKIRCHEN", region = "Hessen"),
//        WeatherStation(stationId = "N6250", stationName = "SCHMITTEN-TREISBERG", region = "Hessen"),
//        WeatherStation(stationId = "N6257", stationName = "BORNA", region = "Sachsen"),
//        WeatherStation(stationId = "N6259", stationName = "WEILMUENSTER", region = "Hessen"),
//        WeatherStation(stationId = "N6357", stationName = "QUERFURT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N6423",
//            stationName = "BAD ZWISCHENAHN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "N6435", stationName = "HETTSTEDT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N6553",
//            stationName = "HASSELFELDE(WASSW.)",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N6566", stationName = "ALTENBRAK", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N6695",
//            stationName = "OSCHERSLEBEN/BODE",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "N6813",
//            stationName = "LINDAU/SACHS.-ANHALT",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "N6935",
//            stationName = "HALDENSLEBEN",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "N7012",
//            stationName = "BAD OLDESLOE",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "N7029",
//            stationName = "RATZEBURG",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "N7040", stationName = "PRUEM", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N7060", stationName = "ARZFELD", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N7075", stationName = "BITBURG", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N7113",
//            stationName = "NEUSTRELITZ",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "N7134", stationName = "TRIPPSTADT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N7135", stationName = "TEMPLIN", region = "Brandenburg"),
//        WeatherStation(stationId = "N7142", stationName = "ZEHDENICK", region = "Brandenburg"),
//        WeatherStation(stationId = "N7182", stationName = "LOEBAU", region = "Sachsen"),
//        WeatherStation(stationId = "N7239", stationName = "HERMESKEIL", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N7244",
//            stationName = "ECKERNFOERDE",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "N7314", stationName = "WEISSWASSER", region = "Sachsen"),
//        WeatherStation(stationId = "N7316", stationName = "MERZIG", region = "Saarland"),
//        WeatherStation(stationId = "N7332", stationName = "SAARBURG", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N7386",
//            stationName = "FUERSTENWALDE/SPREE",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "N7395", stationName = "STRAUSBERG", region = "Brandenburg"),
//        WeatherStation(stationId = "N7411", stationName = "DAHME", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "N7417",
//            stationName = "DAHLEM-KRONENBURG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N7511", stationName = "TREUENBRIETZEN", region = "Brandenburg"),
//        WeatherStation(stationId = "N7539", stationName = "WITTLICH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "N7544", stationName = "LEHNIN", region = "Brandenburg"),
//        WeatherStation(stationId = "N7608", stationName = "KASTELLAUN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N7622",
//            stationName = "BURG B.MAGDEBURG",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N7651", stationName = "ORANIENBURG", region = "Brandenburg"),
//        WeatherStation(stationId = "N7659", stationName = "NAUEN", region = "Brandenburg"),
//        WeatherStation(stationId = "N7740", stationName = "FRIESACK", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "N7744",
//            stationName = "ALTENKIRCHEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N7817", stationName = "PRITZWALK", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "N7822",
//            stationName = "BLANKENHEIM/AHRHUET.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N7868", stationName = "STENDAL", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N8032",
//            stationName = "KIRCHEN/SIEG",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "N8044", stationName = "WEITERFELD", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "N8101",
//            stationName = "WALDBROEL",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8128",
//            stationName = "SIEGBURG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8146",
//            stationName = "GUMMERSBACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8204", stationName = "BRUEHL", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8232", stationName = "SALZWEDEL", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "N8261", stationName = "HITZACKER", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N8307",
//            stationName = "RADEVORMWALD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8322",
//            stationName = "WUPPERTAL-BARMEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8326",
//            stationName = "HAGENOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N8331",
//            stationName = "LUDWIGSLUST",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "N8334",
//            stationName = "WUPPERTAL-VOHW.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8346",
//            stationName = "REMSCHEID",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8349",
//            stationName = "WERMELSKIRCHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8369",
//            stationName = "BERG.NEUKIRCHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8381",
//            stationName = "DORMAGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8403",
//            stationName = "BAD MUENSTEREIFEL",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8408", stationName = "SUDERBURG", region = "Niedersachsen"),
//        WeatherStation(stationId = "N8421", stationName = "BAD BEVENSEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N8424",
//            stationName = "ERFTSTADT-BLIESHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8439",
//            stationName = "ZUELPICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8481", stationName = "NEUSS", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8524", stationName = "TRITTAU", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "N8527",
//            stationName = "KREFELD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8566",
//            stationName = "MESCHEDE/HENNE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8613", stationName = "SORPE", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8615", stationName = "HARSEFELD", region = "Niedersachsen"),
//        WeatherStation(stationId = "N8623", stationName = "BRILON", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8625", stationName = "STADERSAND", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "N8631",
//            stationName = "RUETHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8634",
//            stationName = "WARSTEIN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8653", stationName = "MOEHNE", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N8667",
//            stationName = "BAD BRAMSTEDT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "N8686",
//            stationName = "FROENDENBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8690",
//            stationName = "BROKDORF",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "N8716",
//            stationName = "SCHWERTE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8723",
//            stationName = "WINTERBERG-ALTASTBG.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8777", stationName = "OLPE", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8790", stationName = "BIGGE", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N8825", stationName = "VERSE", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N8829",
//            stationName = "LUEDENSCHEID",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8832",
//            stationName = "ISERLOHN-RODEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8864",
//            stationName = "ENNEPETAL-MILSPE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N8867",
//            stationName = "SPROCKHOEVEL-HASSL.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N8884", stationName = "HAGEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N8947",
//            stationName = "VELBERT-LANGENBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N9030", stationName = "HERNE", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "N9067",
//            stationName = "BOTTROP",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N9079",
//            stationName = "OBERHAUSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N9109", stationName = "MOERS", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N9117", stationName = "HILDBURGHAUSEN", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N9126",
//            stationName = "SCHMIEDEFELD/RSTG.",
//            region = "Thüringen"
//        ),
//        WeatherStation(stationId = "N9154", stationName = "SUHL", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N9227",
//            stationName = "WUENNENBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N9228", stationName = "BAD SALZUNGEN", region = "Thüringen"),
//        WeatherStation(
//            stationId = "N9320",
//            stationName = "DELBRUECK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N9323",
//            stationName = "WADERSLOH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "N9328", stationName = "RUHLA", region = "Thüringen"),
//        WeatherStation(stationId = "N9349", stationName = "GOTHA", region = "Thüringen"),
//        WeatherStation(stationId = "N9350", stationName = "SOEST", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N9357", stationName = "EISENACH", region = "Thüringen"),
//        WeatherStation(stationId = "N9401", stationName = "HAMM", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "N9413", stationName = "EILSLEBEN", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N9446",
//            stationName = "WALTROP",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N9530",
//            stationName = "HALTERN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N9538",
//            stationName = "DORSTEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "N9607",
//            stationName = "WESEL-FLUEREN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "C0014",
//            stationName = "HARSEWINKEL",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "C0015",
//            stationName = "STEINHAGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "C0073",
//            stationName = "BIELEFELD/OLDENTRUP",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0004",
//            stationName = "AACHEN-RICHTERICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0006",
//            stationName = "BILLERBECK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0007", stationName = "TAUS", region = "Plzeňský kraj"),
//        WeatherStation(stationId = "P0008", stationName = "COMO", region = "Lombardei"),
//        WeatherStation(stationId = "P0009", stationName = "ARNHEIM", region = "Gelderland"),
//        WeatherStation(
//            stationId = "P0010",
//            stationName = "LUETTICH",
//            region = "Wallonische Region"
//        ),
//        WeatherStation(stationId = "P0011", stationName = "MERAN", region = "Trentino-Südtirol"),
//        WeatherStation(stationId = "P0012", stationName = "LEIBSTADT", region = "Aargau"),
//        WeatherStation(
//            stationId = "P0013",
//            stationName = "NEUSS-WEHL",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0016", stationName = "GR.FELDBG./TS.", region = "Hessen"),
//        WeatherStation(stationId = "P0017", stationName = "GROSS UMSTADT", region = "Hessen"),
//        WeatherStation(stationId = "P0018", stationName = "MELIBOCUS", region = "Hessen"),
//        WeatherStation(stationId = "P0019", stationName = "NIDDA", region = "Hessen"),
//        WeatherStation(stationId = "P0020", stationName = "VOGELSBERG", region = "Hessen"),
//        WeatherStation(stationId = "P0021", stationName = "LAMBRECHT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0022", stationName = "NEBELHORN", region = "Bayern"),
//        WeatherStation(stationId = "P0023", stationName = "KITZBUEHEL", region = "Tirol"),
//        WeatherStation(
//            stationId = "P0024",
//            stationName = "RIVA D. GARDA",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(stationId = "P0025", stationName = "GEESTHACHT", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0026", stationName = "FINKENWERDER", region = "Hamburg"),
//        WeatherStation(
//            stationId = "P0027",
//            stationName = "BRUNSBUETTEL/SWA",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0028", stationName = "HOECHSTADT", region = "Bayern"),
//        WeatherStation(stationId = "P0029", stationName = "ISSUM", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0030",
//            stationName = "OBERHAUSEN-STERKRADE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0031",
//            stationName = "MUELHEIM/RUHR",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0032",
//            stationName = "SCHWELM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0033", stationName = "UNNA", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0034", stationName = "SCHWANDORF", region = "Bayern"),
//        WeatherStation(stationId = "P0035", stationName = "WESTERBERG", region = "Bayern"),
//        WeatherStation(
//            stationId = "P0036",
//            stationName = "MUENSTER ZENTRUM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0037", stationName = "METALLEUROP", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0038", stationName = "COTTBUS/LUB", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0039",
//            stationName = "KOENIGS WUSTERH./LUB",
//            region = "Brandenburg"
//        ),
//        WeatherStation(
//            stationId = "P0040",
//            stationName = "POTSDAM-ZENTRUM/LUB",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "P0041", stationName = "PREMNITZ/LUB", region = "Brandenburg"),
//        WeatherStation(stationId = "P0042", stationName = "SCHWEDT/LUB", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0043",
//            stationName = "SENFTENBERG/LUB",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "P0044", stationName = "SPREMBERG/LUB", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0045",
//            stationName = "WITTENBERGE/LUB",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "P0050", stationName = "FALKENSTEIN/TAUNUS", region = "Hessen"),
//        WeatherStation(
//            stationId = "P0051",
//            stationName = "DUELMEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0053", stationName = "ANEMOLTER", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0054",
//            stationName = "BORNUM AM HARZ",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "P0055", stationName = "ALTOETTING", region = "Bayern"),
//        WeatherStation(stationId = "P0056", stationName = "LUPFEN", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "P0057", stationName = "GROSSER BEERBERG", region = "Thüringen"),
//        WeatherStation(
//            stationId = "P0058",
//            stationName = "SANKT GALLENKIRCH",
//            region = "Vorarlberg"
//        ),
//        WeatherStation(stationId = "P0059", stationName = "MITTAGSSPITZE", region = "Vorarlberg"),
//        WeatherStation(stationId = "P0060", stationName = "PATSCHERKOFEL", region = "Tirol"),
//        WeatherStation(stationId = "P0061", stationName = "HUNDSTEIN", region = "Salzburg"),
//        WeatherStation(
//            stationId = "P0062",
//            stationName = "TRAUNKIRCHEN",
//            region = "Oberösterreich"
//        ),
//        WeatherStation(stationId = "P0063", stationName = "ULRICHSBERG", region = "Oberösterreich"),
//        WeatherStation(
//            stationId = "P0064",
//            stationName = "PLOECKENSTEIN",
//            region = "Jihočeský kraj"
//        ),
//        WeatherStation(
//            stationId = "P0065",
//            stationName = "GROSSER HOELLENGOGEL",
//            region = "Oberösterreich"
//        ),
//        WeatherStation(stationId = "P0066", stationName = "TUERNITZ", region = "Niederösterreich"),
//        WeatherStation(
//            stationId = "P0067",
//            stationName = "HOELLENSTEIN/YBBS",
//            region = "Niederösterreich"
//        ),
//        WeatherStation(
//            stationId = "P0068",
//            stationName = "HOCHSCHNEEBERG",
//            region = "Niederösterreich"
//        ),
//        WeatherStation(stationId = "P0069", stationName = "KAMMSPITZ", region = "Steiermark"),
//        WeatherStation(stationId = "P0070", stationName = "CHATILLON", region = "Aostatal"),
//        WeatherStation(stationId = "P0071", stationName = "MARGOZZO", region = "Piemont"),
//        WeatherStation(stationId = "P0072", stationName = "MASERA", region = "Piemont"),
//        WeatherStation(stationId = "P0073", stationName = "M.ZEDA", region = "Piemont"),
//        WeatherStation(stationId = "P0074", stationName = "SONDRIO", region = "Lombardei"),
//        WeatherStation(stationId = "P0075", stationName = "LECCO", region = "Lombardei"),
//        WeatherStation(stationId = "P0076", stationName = "BRIXEN", region = "Trentino-Südtirol"),
//        WeatherStation(
//            stationId = "P0077",
//            stationName = "ROLLEPASS",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(stationId = "P0078", stationName = "CORTINA D'AMPEZZO", region = "Venetien"),
//        WeatherStation(stationId = "P0079", stationName = "PASO DI FALZAREGO", region = "Venetien"),
//        WeatherStation(
//            stationId = "P0080",
//            stationName = "ALBERTVILLE",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0081",
//            stationName = "LE ROIGNAIS",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0082",
//            stationName = "CHAMONIX",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0083",
//            stationName = "ANNECY",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0084",
//            stationName = "MT. BUET",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0085",
//            stationName = "CHORGES",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0086",
//            stationName = "SERRE CHEVALIER",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0087",
//            stationName = "DIGNE",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0088",
//            stationName = "ANNOT",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0089",
//            stationName = "CROIX DE L ALPE",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(stationId = "P0091", stationName = "SIMPLONPASS", region = "Wallis"),
//        WeatherStation(stationId = "P0092", stationName = "MT. AUBERT", region = "Waadt"),
//        WeatherStation(stationId = "P0093", stationName = "LILLEHAMMER", region = "Innlandet"),
//        WeatherStation(stationId = "P0095", stationName = "TORPO", region = "Viken"),
//        WeatherStation(stationId = "P0096", stationName = "FINSE", region = "Vestland"),
//        WeatherStation(
//            stationId = "P0097",
//            stationName = "SELJORD",
//            region = "Vestfold og Telemark"
//        ),
//        WeatherStation(
//            stationId = "P0098",
//            stationName = "LIFJELL",
//            region = "Vestfold og Telemark"
//        ),
//        WeatherStation(stationId = "P0099", stationName = "LJUBLJANA", region = "Ljubljana"),
//        WeatherStation(stationId = "P0100", stationName = "BLED", region = "Radovljica"),
//        WeatherStation(
//            stationId = "P0101",
//            stationName = "OF-POST D1",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0102",
//            stationName = "OF-POST D2",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0103", stationName = "OF-POST D3", region = "Bayern"),
//        WeatherStation(stationId = "P0104", stationName = "OF-POST D4", region = "Thüringen"),
//        WeatherStation(stationId = "P0105", stationName = "OF-POST D5", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0106",
//            stationName = "OF-POST D6",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0107", stationName = "OF-POST D7", region = "Hessen"),
//        WeatherStation(stationId = "P0108", stationName = "OF-POST D8", region = "Brandenburg"),
//        WeatherStation(stationId = "P0109", stationName = "OF-POST D9", region = "Brandenburg"),
//        WeatherStation(stationId = "P0110", stationName = "OF-POST H1", region = "Hessen"),
//        WeatherStation(stationId = "P0111", stationName = "OF-POST H2", region = "Hessen"),
//        WeatherStation(stationId = "P0112", stationName = "OF-POST H3", region = "Hessen"),
//        WeatherStation(stationId = "P0113", stationName = "OF-POST H4", region = "Hessen"),
//        WeatherStation(stationId = "P0114", stationName = "OF-POST H5", region = "Hessen"),
//        WeatherStation(stationId = "P0115", stationName = "LOIBLPASS", region = "Tržič"),
//        WeatherStation(
//            stationId = "P0116",
//            stationName = "NEUERN/NYRSKO",
//            region = "Plzeňský kraj"
//        ),
//        WeatherStation(stationId = "P0118", stationName = "PASO DI CAMPELLI", region = "Lombardei"),
//        WeatherStation(stationId = "P0119", stationName = "SCHMOELLN", region = "Brandenburg"),
//        WeatherStation(stationId = "P0120", stationName = "HAMBURG-NEUENG.", region = "Hamburg"),
//        WeatherStation(stationId = "P0121", stationName = "WENNIGSEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0122", stationName = "WIELEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0123", stationName = "LAUCHA", region = "Sachsen"),
//        WeatherStation(
//            stationId = "P0124",
//            stationName = "TIMMENDORF/POEL",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0125",
//            stationName = "KRAGELUND",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "P0126",
//            stationName = "LINDEWITT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0127", stationName = "SOELLMNITZ", region = "Thüringen"),
//        WeatherStation(stationId = "P0128", stationName = "PODELZIG", region = "Brandenburg"),
//        WeatherStation(stationId = "P0129", stationName = "DELITZSCH-SELBEN", region = "Sachsen"),
//        WeatherStation(
//            stationId = "P0130",
//            stationName = "KRUMMHOERN-LOQUARD",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "P0131",
//            stationName = "KAISER-WILH.-KOOG",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0132", stationName = "MESSMAST WHV", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0133", stationName = "MESSMAST OL", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0134", stationName = "MESSMAST EMD", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0135",
//            stationName = "HILKENBROOK, NT",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "P0136",
//            stationName = "VIENENBURG, MG",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "P0137",
//            stationName = "SYKE-GESSEL, NTB",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "P0138", stationName = "HOHEGING, NT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0139",
//            stationName = "ALTENBEKEN, MG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0140", stationName = "RAPSHAGEN, NT", region = "Brandenburg"),
//        WeatherStation(stationId = "P0141", stationName = "BASSENS", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0142", stationName = "TOSSENS", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0143", stationName = "WYBELSUMER POLDER"),
//        WeatherStation(stationId = "P0144", stationName = "SCHUELP", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0145", stationName = "HAMSWEHRUM", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0146", stationName = "PILSUM", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0147", stationName = "ASENDORF", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0148", stationName = "MENSLAGE", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0149", stationName = "GARLSTORF", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0150",
//            stationName = "ST.PETER-ORDING",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "P0151",
//            stationName = "HALLIG HOOGE",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0152", stationName = "PLOEN", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0153", stationName = "NORDW. FPN"),
//        WeatherStation(stationId = "P0154", stationName = "WESTL. SYLT"),
//        WeatherStation(stationId = "P0155", stationName = "BRUGGE", region = "Flämische Region"),
//        WeatherStation(stationId = "P0157", stationName = "DIESSEN", region = "Bayern"),
//        WeatherStation(stationId = "P0158", stationName = "CHIEMSEE", region = "Bayern"),
//        WeatherStation(stationId = "P0159", stationName = "GMUND/TEGERNSEE", region = "Bayern"),
//        WeatherStation(stationId = "P0160", stationName = "STEINBACH", region = "Salzburg"),
//        WeatherStation(stationId = "P0161", stationName = "HALLSTATT", region = "Oberösterreich"),
//        WeatherStation(
//            stationId = "P0162",
//            stationName = "SAN VIGILIO",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(stationId = "P0163", stationName = "BELLAGIO", region = "Lombardei"),
//        WeatherStation(stationId = "P0164", stationName = "DOMASO", region = "Lombardei"),
//        WeatherStation(stationId = "P0165", stationName = "ISEO", region = "Lombardei"),
//        WeatherStation(stationId = "P0166", stationName = "LA SPEZIA", region = "Ligurien"),
//        WeatherStation(stationId = "P0167", stationName = "LIVORNO"),
//        WeatherStation(stationId = "P0168", stationName = "SAN REMO", region = "Ligurien"),
//        WeatherStation(stationId = "P0169", stationName = "LEUCATE"),
//        WeatherStation(stationId = "P0171", stationName = "TRIENT", region = "Trentino-Südtirol"),
//        WeatherStation(stationId = "P0172", stationName = "MITROVICA"),
//        WeatherStation(stationId = "P0173", stationName = "GNJILANE"),
//        WeatherStation(stationId = "P0174", stationName = "LEISENWALD", region = "Hessen"),
//        WeatherStation(
//            stationId = "P0175",
//            stationName = "ROSTOCK-STADT",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "P0176", stationName = "BUERSTADT", region = "Hessen"),
//        WeatherStation(stationId = "P0177", stationName = "WALD-MICHELBACH", region = "Hessen"),
//        WeatherStation(stationId = "P0178", stationName = "BIEBESHEIM", region = "Hessen"),
//        WeatherStation(stationId = "P0179", stationName = "BRENSBACH", region = "Hessen"),
//        WeatherStation(stationId = "P0180", stationName = "GRUENBERG", region = "Hessen"),
//        WeatherStation(stationId = "P0181", stationName = "STADTALLENDORF", region = "Hessen"),
//        WeatherStation(stationId = "P0182", stationName = "LAUTERBACH", region = "Hessen"),
//        WeatherStation(stationId = "P0183", stationName = "BURGHAUN", region = "Hessen"),
//        WeatherStation(stationId = "P0184", stationName = "SCHLENKLENGSFELD", region = "Hessen"),
//        WeatherStation(stationId = "P0185", stationName = "BAD EMSTAL", region = "Hessen"),
//        WeatherStation(
//            stationId = "P0186",
//            stationName = "BAD BREISIG",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "P0187", stationName = "BETZDORF", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0188", stationName = "PUDERBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0189", stationName = "ST.GOAR", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0190",
//            stationName = "NASSAU/RHL.-PFALZ",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "P0191", stationName = "NASTAETTEN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0192", stationName = "GEROLSTEIN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0193",
//            stationName = "HINTERWEIDENTHAL",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "P0194", stationName = "FREINSHEIM", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0195",
//            stationName = "ROCKENHAUSEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "P0196", stationName = "EISENBERG", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0197", stationName = "WOERTH", region = "Bayern"),
//        WeatherStation(stationId = "P0198", stationName = "MIESAU", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0199",
//            stationName = "UETERSEN",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0200", stationName = "LABOE", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "P0201",
//            stationName = "SCHENEFELD",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0202", stationName = "GLINDE", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0203", stationName = "WITTINGEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0204",
//            stationName = "HANNOV.MUENDEN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "P0205", stationName = "PEINE", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0206", stationName = "AMT NEUHAUS", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0207", stationName = "HODENHAGEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0208", stationName = "LANGWEDEL", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0209", stationName = "GLANDORF", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0210", stationName = "DAMME", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0211", stationName = "LANGWARDEN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0212",
//            stationName = "PULHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0213", stationName = "KERPEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0214",
//            stationName = "TROISDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0215",
//            stationName = "MECKENHEIM/RHEINB.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0216",
//            stationName = "LINNICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0217",
//            stationName = "ALDENHOVEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0218",
//            stationName = "MECHERNICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0219",
//            stationName = "WIESDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0220",
//            stationName = "OPLADEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0221",
//            stationName = "SCHLEBUSCH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0222",
//            stationName = "RHEINDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0223",
//            stationName = "LEICHLINGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0224",
//            stationName = "BAESWEILER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0225",
//            stationName = "BERGHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0226",
//            stationName = "BERGISCH GLADBACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0227",
//            stationName = "KOENIGSWINTER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0228", stationName = "EITORF", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0229", stationName = "REKEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0230",
//            stationName = "ASCHEBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0231",
//            stationName = "HALLE/NORD.WESTFALEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0232",
//            stationName = "HOLTE-STUKENBROCK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0233", stationName = "BUENDE", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0234",
//            stationName = "ERWITTE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0238", stationName = "LIMASSOL", region = "Bezirk Limassol"),
//        WeatherStation(stationId = "P0239", stationName = "MARBELLA"),
//        WeatherStation(stationId = "P0240", stationName = "SAN FELIU"),
//        WeatherStation(
//            stationId = "P0241",
//            stationName = "SAINT TROPEZ",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(stationId = "P0242", stationName = "CERNOBBIO", region = "Lombardei"),
//        WeatherStation(stationId = "P0243", stationName = "ISCHIA"),
//        WeatherStation(stationId = "P0244", stationName = "PORTOFINO", region = "Ligurien"),
//        WeatherStation(
//            stationId = "P0245",
//            stationName = "MADEIRA/FESTLAND",
//            region = "Distrikt Castelo Branco"
//        ),
//        WeatherStation(
//            stationId = "P0246",
//            stationName = "KARTHAGO",
//            region = "Gouvernement Tunis"
//        ),
//        WeatherStation(
//            stationId = "P0247",
//            stationName = "WIESENSTEIG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0248",
//            stationName = "BESIGHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0249",
//            stationName = "SCHORNDORF",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0250",
//            stationName = "KRAUTHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0251",
//            stationName = "SULZBACH-LAUFEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0252",
//            stationName = "BILLIGHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0253", stationName = "LOSSBURG", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "P0254",
//            stationName = "KIRCHZARTEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0255", stationName = "ENDINGEN", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "P0256",
//            stationName = "OTTENHOEFEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0257", stationName = "SINGEN", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "P0258",
//            stationName = "JESTETTEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0259",
//            stationName = "TRUCHTELFINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0260",
//            stationName = "ILLERIEDEN-DORNDORF",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0261",
//            stationName = "GAMMERTINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0262", stationName = "WOLFRATSHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "P0263", stationName = "PFAFFENHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "P0264", stationName = "BRUCKMUEHL", region = "Bayern"),
//        WeatherStation(stationId = "P0265", stationName = "BUCH AM AMMERSEE", region = "Bayern"),
//        WeatherStation(stationId = "P0266", stationName = "KUENZING", region = "Bayern"),
//        WeatherStation(stationId = "P0267", stationName = "OBERNZENN", region = "Bayern"),
//        WeatherStation(stationId = "P0268", stationName = "FISCHACH", region = "Bayern"),
//        WeatherStation(stationId = "P0269", stationName = "LAUINGEN", region = "Bayern"),
//        WeatherStation(stationId = "P0273", stationName = "HELMBRECHTS", region = "Bayern"),
//        WeatherStation(stationId = "P0274", stationName = "BLIESRANDSBACH", region = "Saarland"),
//        WeatherStation(stationId = "P0275", stationName = "HEUSWEILER", region = "Saarland"),
//        WeatherStation(stationId = "P0276", stationName = "PERL", region = "Saarland"),
//        WeatherStation(stationId = "P0277", stationName = "WADERN", region = "Saarland"),
//        WeatherStation(
//            stationId = "P0278",
//            stationName = "NEUNKIRCHEN/SAARLAND",
//            region = "Saarland"
//        ),
//        WeatherStation(stationId = "P0279", stationName = "SCHMELZ", region = "Saarland"),
//        WeatherStation(stationId = "P0280", stationName = "NONNWEILER", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0281",
//            stationName = "BERNAU/BRANDENBURG",
//            region = "Brandenburg"
//        ),
//        WeatherStation(
//            stationId = "P0282",
//            stationName = "HERZBERG/BRANDENBURG",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "P0283", stationName = "TREBUS", region = "Brandenburg"),
//        WeatherStation(stationId = "P0284", stationName = "LUEBBENAU", region = "Brandenburg"),
//        WeatherStation(stationId = "P0285", stationName = "LUCKENWALDE", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0286",
//            stationName = "SATOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "P0288", stationName = "MEERANE", region = "Sachsen"),
//        WeatherStation(stationId = "P0289", stationName = "KAEBSCHUETZTAL", region = "Sachsen"),
//        WeatherStation(stationId = "P0290", stationName = "OPPACH", region = "Sachsen"),
//        WeatherStation(stationId = "P0291", stationName = "DOEBELN", region = "Sachsen"),
//        WeatherStation(stationId = "P0292", stationName = "WURZEN", region = "Sachsen"),
//        WeatherStation(stationId = "P0293", stationName = "POESSNECK", region = "Thüringen"),
//        WeatherStation(stationId = "P0295", stationName = "NIESKY", region = "Sachsen"),
//        WeatherStation(stationId = "P0297", stationName = "DINGOLFING", region = "Bayern"),
//        WeatherStation(stationId = "P0298", stationName = "ARLBERG", region = "Vorarlberg"),
//        WeatherStation(stationId = "P0299", stationName = "GROSSGLOCKNER", region = "Tirol"),
//        WeatherStation(stationId = "P0300", stationName = "DACHSTEIN", region = "Steiermark"),
//        WeatherStation(stationId = "P0301", stationName = "LICHTENBERG", region = "Oberösterreich"),
//        WeatherStation(stationId = "P0302", stationName = "ZINKEN", region = "Steiermark"),
//        WeatherStation(stationId = "P0303", stationName = "WEINSBERG", region = "Niederösterreich"),
//        WeatherStation(stationId = "P0304", stationName = "KAISEREICHE", region = "Burgenland"),
//        WeatherStation(stationId = "P0305", stationName = "SONNENBERG", region = "Burgenland"),
//        WeatherStation(stationId = "P0306", stationName = "WANK", region = "Bayern"),
//        WeatherStation(stationId = "P0307", stationName = "HOERNLE", region = "Bayern"),
//        WeatherStation(stationId = "P0308", stationName = "BRAUNECK", region = "Bayern"),
//        WeatherStation(stationId = "P0309", stationName = "HOCHFELLN", region = "Bayern"),
//        WeatherStation(stationId = "P0310", stationName = "PREDIGTSTUHL", region = "Bayern"),
//        WeatherStation(stationId = "P0311", stationName = "ANDERMATT", region = "Uri"),
//        WeatherStation(stationId = "P0312", stationName = "LINTHAL", region = "Glarus"),
//        WeatherStation(stationId = "P0314", stationName = "SAANEN-GSTAAD", region = "Bern"),
//        WeatherStation(stationId = "P0325", stationName = "ANDORRA", region = "Canillo"),
//        WeatherStation(stationId = "P0326", stationName = "WELVER", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0327",
//            stationName = "ISERLOHN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0328",
//            stationName = "SIEDLINGHAUSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0329",
//            stationName = "MARSBERG-POSTWEG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0330", stationName = "HORN", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0331", stationName = "GOEHL", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0332", stationName = "BISDORF", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0333", stationName = "KHANIA"),
//        WeatherStation(stationId = "P0346", stationName = "GETTORF", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "P0347",
//            stationName = "HARRISLEE",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0348", stationName = "MALENTE", region = "Schleswig-Holstein"),
//        WeatherStation(stationId = "P0349", stationName = "MARNE", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "P0350",
//            stationName = "REINFELD",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "P0351",
//            stationName = "SCHOENBERG",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "P0352",
//            stationName = "TRAPPENKAMP",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "P0353",
//            stationName = "WESSELBUREN",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "P0354", stationName = "MEISSNER", region = "Hessen"),
//        WeatherStation(
//            stationId = "P0355",
//            stationName = "KLADRUM",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0356",
//            stationName = "RAKOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0357",
//            stationName = "RAVENSBERG",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "P0358", stationName = "ABLASS", region = "Sachsen"),
//        WeatherStation(stationId = "P0359", stationName = "DORNA", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "P0360", stationName = "WILLMERSDORF", region = "Brandenburg"),
//        WeatherStation(stationId = "P0361", stationName = "HOCHHEIM", region = "Thüringen"),
//        WeatherStation(stationId = "P0362", stationName = "IHLEWITZ", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "P0363", stationName = "NEUENFELD", region = "Brandenburg"),
//        WeatherStation(stationId = "P0364", stationName = "OBHAUSEN", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "P0365", stationName = "KLETTWITZ", region = "Brandenburg"),
//        WeatherStation(stationId = "P0366", stationName = "REICHENBACH", region = "Sachsen"),
//        WeatherStation(
//            stationId = "P0367",
//            stationName = "ALPE D'HUEZ",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0368",
//            stationName = "COURCHEVEL",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0369",
//            stationName = "FLAINE",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0370",
//            stationName = "ISOLA 2000",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0371",
//            stationName = "MERIBEL",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0372",
//            stationName = "MORZINE",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(
//            stationId = "P0373",
//            stationName = "VAL D'ISERE",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(stationId = "P0374", stationName = "AHRNTAL", region = "Trentino-Südtirol"),
//        WeatherStation(stationId = "P0375", stationName = "ARABBA", region = "Venetien"),
//        WeatherStation(stationId = "P0376", stationName = "BORMIO 2000", region = "Lombardei"),
//        WeatherStation(stationId = "P0377", stationName = "CERVINIA", region = "Aostatal"),
//        WeatherStation(stationId = "P0378", stationName = "COURMAYEUR", region = "Aostatal"),
//        WeatherStation(stationId = "P0379", stationName = "FOLGARIA", region = "Trentino-Südtirol"),
//        WeatherStation(
//            stationId = "P0380",
//            stationName = "GOSSENSASS",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(
//            stationId = "P0381",
//            stationName = "MADONNA DI CAMPIGLIO",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(
//            stationId = "P0383",
//            stationName = "SCHNALSTAL",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(
//            stationId = "P0384",
//            stationName = "ST.WALBURG",
//            region = "Trentino-Südtirol"
//        ),
//        WeatherStation(stationId = "P0385", stationName = "DAMUELS", region = "Vorarlberg"),
//        WeatherStation(stationId = "P0386", stationName = "FILZMOOS", region = "Salzburg"),
//        WeatherStation(stationId = "P0387", stationName = "FULPMES", region = "Tirol"),
//        WeatherStation(stationId = "P0388", stationName = "HINTERSEE", region = "Salzburg"),
//        WeatherStation(stationId = "P0389", stationName = "KAUNERTALER GLETSCH.", region = "Tirol"),
//        WeatherStation(stationId = "P0390", stationName = "MATREI/OSTTIROL", region = "Tirol"),
//        WeatherStation(stationId = "P0391", stationName = "HOCHSOELDEN", region = "Tirol"),
//        WeatherStation(stationId = "P0392", stationName = "ST.JAKOB/DEFEREGGEN.", region = "Tirol"),
//        WeatherStation(stationId = "P0393", stationName = "TURRACHER HOEHE", region = "Kärnten"),
//        WeatherStation(stationId = "P0394", stationName = "WAGRAIN", region = "Salzburg"),
//        WeatherStation(stationId = "P0395", stationName = "WOLFSBERG", region = "Kärnten"),
//        WeatherStation(stationId = "P0397", stationName = "BRANAES", region = "Värmlands län"),
//        WeatherStation(stationId = "P0399", stationName = "KLAEPPEN", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0401", stationName = "SAEFSEN", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0402", stationName = "GRINDELWALD", region = "Bern"),
//        WeatherStation(stationId = "P0403", stationName = "LENZERHEIDE", region = "Graubünden"),
//        WeatherStation(stationId = "P0405", stationName = "REJVIZ", region = "Olomoucký kraj"),
//        WeatherStation(
//            stationId = "P0406",
//            stationName = "SPINDLERMUEHLE",
//            region = "Královéhradecký kraj"
//        ),
//        WeatherStation(
//            stationId = "P0409",
//            stationName = "MARSBERG-MEERHOF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0410", stationName = "BICKENDORF", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0411", stationName = "FLOMBORN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0412", stationName = "SCHEID", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0413",
//            stationName = "NIEDER KOSTENZ",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "P0414", stationName = "KEHRIG", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0415", stationName = "WILDPOLDSRIED", region = "Bayern"),
//        WeatherStation(
//            stationId = "P0416",
//            stationName = "RIBNITZ-DAMGARTEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "P0417", stationName = "KUESTE JASMUND BODD."),
//        WeatherStation(stationId = "P0422", stationName = "SPAIN_NEW_01", region = "Extremadura"),
//        WeatherStation(stationId = "P0423", stationName = "SPAIN_NEW_02", region = "Kantabrien"),
//        WeatherStation(stationId = "P0424", stationName = "SPAIN_NEW_03"),
//        WeatherStation(
//            stationId = "P0425",
//            stationName = "SPAIN_NEW_04",
//            region = "Kastilien und León"
//        ),
//        WeatherStation(
//            stationId = "P0426",
//            stationName = "SPAIN_NEW_05",
//            region = "Kastilien-La Mancha"
//        ),
//        WeatherStation(
//            stationId = "P0427",
//            stationName = "SPAIN_NEW_06",
//            region = "Nouvelle-Aquitaine"
//        ),
//        WeatherStation(
//            stationId = "P0428",
//            stationName = "SPAIN_NEW_07",
//            region = "Kastilien-La Mancha"
//        ),
//        WeatherStation(
//            stationId = "P0429",
//            stationName = "SPAIN_NEW_08",
//            region = "Kastilien und León"
//        ),
//        WeatherStation(stationId = "P0430", stationName = "BLIESDORF", region = "Brandenburg"),
//        WeatherStation(stationId = "P0431", stationName = "WERBIG", region = "Brandenburg"),
//        WeatherStation(stationId = "P0432", stationName = "ROSSAU", region = "Sachsen"),
//        WeatherStation(
//            stationId = "P0433",
//            stationName = "GROSSMACKENSTEDT",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "P0434",
//            stationName = "HASELUENNE KNN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "P0435",
//            stationName = "GRUEPPENBUEHREN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "P0436", stationName = "ARRAS", region = "Hauts-de-France"),
//        WeatherStation(stationId = "P0437", stationName = "CALAIS", region = "Hauts-de-France"),
//        WeatherStation(stationId = "P0439", stationName = "FINO1/PLATTFORM"),
//        WeatherStation(
//            stationId = "P0441",
//            stationName = "LENGERICH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0442", stationName = "TEGELBERG", region = "Bayern"),
//        WeatherStation(stationId = "P0443", stationName = "PLATTERHOF", region = "Bayern"),
//        WeatherStation(stationId = "P0444", stationName = "SCHOTTMALHORN", region = "Bayern"),
//        WeatherStation(stationId = "P0445", stationName = "FRANKFURT/ZEIL", region = "Hessen"),
//        WeatherStation(
//            stationId = "P0446",
//            stationName = "ESSEN/BAHNHOF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0447",
//            stationName = "LE CASTELLET",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(
//            stationId = "P0448",
//            stationName = "SABIHA GOKCEN INTL.",
//            region = "Istanbul"
//        ),
//        WeatherStation(stationId = "P0449", stationName = "AMPUGNANO", region = "Toskana"),
//        WeatherStation(stationId = "P0450", stationName = "KISA", region = "Östergötlands län"),
//        WeatherStation(
//            stationId = "P0451",
//            stationName = "GOETA KANAL",
//            region = "Östergötlands län"
//        ),
//        WeatherStation(stationId = "P0452", stationName = "VAETTERN"),
//        WeatherStation(stationId = "P0453", stationName = "HJAELMAREN", region = "Örebro län"),
//        WeatherStation(
//            stationId = "P0454",
//            stationName = "KATRINEHOLM",
//            region = "Södermanlands län"
//        ),
//        WeatherStation(stationId = "P0455", stationName = "MALAEREN", region = "Södermanlands län"),
//        WeatherStation(stationId = "P0456", stationName = "NORR MALAEREN", region = "Uppsala län"),
//        WeatherStation(stationId = "P0457", stationName = "DALAELVEN", region = "Gävleborgs län"),
//        WeatherStation(
//            stationId = "P0458",
//            stationName = "NORR HJAELMAREN",
//            region = "Västmanlands län"
//        ),
//        WeatherStation(stationId = "P0459", stationName = "SKYLLBERG", region = "Örebro län"),
//        WeatherStation(stationId = "P0460", stationName = "SMALAND", region = "Jönköpings län"),
//        WeatherStation(stationId = "P0461", stationName = "BORAS", region = "Jönköpings län"),
//        WeatherStation(
//            stationId = "P0462",
//            stationName = "ALLEBERG",
//            region = "Västra Götalands län"
//        ),
//        WeatherStation(
//            stationId = "P0463",
//            stationName = "TOERREBODA",
//            region = "Västra Götalands län"
//        ),
//        WeatherStation(stationId = "P0464", stationName = "VAENNERN", region = "Värmlands län"),
//        WeatherStation(stationId = "P0465", stationName = "DEGERFORS", region = "Örebro län"),
//        WeatherStation(stationId = "P0466", stationName = "BERGSLAGEN", region = "Örebro län"),
//        WeatherStation(
//            stationId = "P0467",
//            stationName = "TIOMILASKOGEN",
//            region = "Värmlands län"
//        ),
//        WeatherStation(stationId = "P0468", stationName = "BORLAENGE", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0469", stationName = "GAESTRIKLAND", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0470", stationName = "SILJAN", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0471", stationName = "DALARNA", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0472", stationName = "NORRA DALARNA", region = "Dalarnas län"),
//        WeatherStation(stationId = "P0473", stationName = "AESNEN", region = "Kronobergs län"),
//        WeatherStation(stationId = "P0474", stationName = "BOLMEN", region = "Hallands län"),
//        WeatherStation(stationId = "P0475", stationName = "NORRA SKANE", region = "Skåne län"),
//        WeatherStation(
//            stationId = "P0476",
//            stationName = "WITTIGHAUSEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "P0477", stationName = "ENERTRAG", region = "Brandenburg"),
//        WeatherStation(stationId = "P0478", stationName = "LONDON/CITY INTL", region = "England"),
//        WeatherStation(stationId = "P0481", stationName = "WITTEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0482", stationName = "OLBERNHAU", region = "Sachsen"),
//        WeatherStation(stationId = "P0483", stationName = "ROSSKOPF", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "P0484",
//            stationName = "HOLZSCHLAEGERMATTE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0487",
//            stationName = "SDL.FLUSS LITANI",
//            region = "Gouvernement Nabatäa"
//        ),
//        WeatherStation(stationId = "P0488", stationName = "BERGSTEDT", region = "Hamburg"),
//        WeatherStation(stationId = "P0489", stationName = "HAMBURG INNENSTADT", region = "Hamburg"),
//        WeatherStation(stationId = "P0490", stationName = "HUERTH", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0491",
//            stationName = "HATTINGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0492",
//            stationName = "VILLARD DE LANS",
//            region = "Auvergne-Rhône-Alpes"
//        ),
//        WeatherStation(stationId = "P0493", stationName = "ALAGNA", region = "Piemont"),
//        WeatherStation(stationId = "P0494", stationName = "ZINAL", region = "Wallis"),
//        WeatherStation(stationId = "P0495", stationName = "CHAMPERY", region = "Wallis"),
//        WeatherStation(stationId = "P0496", stationName = "FIESCH", region = "Wallis"),
//        WeatherStation(stationId = "P0497", stationName = "MELCHSEE-FRUTT", region = "Obwalden"),
//        WeatherStation(stationId = "P0498", stationName = "MAURACH", region = "Tirol"),
//        WeatherStation(stationId = "P0499", stationName = "SEDRUN", region = "Graubünden"),
//        WeatherStation(stationId = "P0500", stationName = "BERTIKOW", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0501",
//            stationName = "LANGEN-TRECHOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0502",
//            stationName = "HOHEN PRITZ",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0503",
//            stationName = "WERDER",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "P0504",
//            stationName = "BERSTELAND-NIEWITZ",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "P0505", stationName = "MORBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0506", stationName = "LUENNE", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0507", stationName = "HEIDEN", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0508", stationName = "BERGLICHT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "P0509",
//            stationName = "SASSENBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0510",
//            stationName = "SCHELKLINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "P0511",
//            stationName = "SCHEID_2",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0512",
//            stationName = "HAARSTRANG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0513", stationName = "NEUKIRCHEN", region = "Thüringen"),
//        WeatherStation(stationId = "P0514", stationName = "RAUSCHWITZ", region = "Thüringen"),
//        WeatherStation(stationId = "P0515", stationName = "SCHILBACH", region = "Thüringen"),
//        WeatherStation(stationId = "P0516", stationName = "SCHOENEWALDE", region = "Brandenburg"),
//        WeatherStation(stationId = "P0518", stationName = "RAGUSA", region = "Sizilien"),
//        WeatherStation(stationId = "P0521", stationName = "LOVIISA", region = "Uusimaa"),
//        WeatherStation(
//            stationId = "P0523",
//            stationName = "BRIE-CHAMPNIERS",
//            region = "Nouvelle-Aquitaine"
//        ),
//        WeatherStation(
//            stationId = "P0524",
//            stationName = "TONNAY CHARENTE",
//            region = "Nouvelle-Aquitaine"
//        ),
//        WeatherStation(stationId = "P0525", stationName = "GAETA"),
//        WeatherStation(
//            stationId = "P0527",
//            stationName = "SAN CARLOS D.RAPITA",
//            region = "Katalonien"
//        ),
//        WeatherStation(stationId = "P0529", stationName = "TREGUIER"),
//        WeatherStation(stationId = "P0531", stationName = "PORTO EMPEDOCLE"),
//        WeatherStation(stationId = "P0532", stationName = "GARCHING", region = "Bayern"),
//        WeatherStation(stationId = "P0533", stationName = "GUNDREMMINGEN", region = "Bayern"),
//        WeatherStation(stationId = "P0534", stationName = "ESSENBACH", region = "Bayern"),
//        WeatherStation(stationId = "P0535", stationName = "IMATRA", region = "Südkarelien"),
//        WeatherStation(stationId = "P0536", stationName = "MALLAIG", region = "Schottland"),
//        WeatherStation(stationId = "P0537", stationName = "PORTREE", region = "Schottland"),
//        WeatherStation(stationId = "P0538", stationName = "ULLAPOOL", region = "Schottland"),
//        WeatherStation(stationId = "P0540", stationName = "GALLIPOLI"),
//        WeatherStation(stationId = "P0541", stationName = "PORTO AZZURRO", region = "Toskana"),
//        WeatherStation(
//            stationId = "P0543",
//            stationName = "UUSIKAUPUNKI",
//            region = "Varsinais-Suomi"
//        ),
//        WeatherStation(stationId = "P0544", stationName = "BEAUVAIS", region = "Normandie"),
//        WeatherStation(stationId = "P0545", stationName = "ASTI", region = "Piemont"),
//        WeatherStation(stationId = "P0546", stationName = "EGERSUND", region = "Rogaland"),
//        WeatherStation(stationId = "P0547", stationName = "ADRA", region = "Andalusien"),
//        WeatherStation(stationId = "P0548", stationName = "BANBURY", region = "England"),
//        WeatherStation(stationId = "P0549", stationName = "BLACKBURN", region = "England"),
//        WeatherStation(
//            stationId = "P0550",
//            stationName = "LA CIOTAT",
//            region = "Provence-Alpes-Côte d'Azur"
//        ),
//        WeatherStation(stationId = "P0551", stationName = "LA PALMA", region = "Andalusien"),
//        WeatherStation(stationId = "P0552", stationName = "MELILLI", region = "Sizilien"),
//        WeatherStation(stationId = "P0553", stationName = "VIVERO", region = "Kastilien und León"),
//        WeatherStation(stationId = "P0554", stationName = "COSENZA", region = "Kalabrien"),
//        WeatherStation(stationId = "P0555", stationName = "SASSARI", region = "Sardinien"),
//        WeatherStation(stationId = "P0556", stationName = "GUARDA", region = "Kastilien und León"),
//        WeatherStation(
//            stationId = "P0557",
//            stationName = "LINARES",
//            region = "Kastilien-La Mancha"
//        ),
//        WeatherStation(stationId = "P0559", stationName = "OBER-BEERBACH", region = "Hessen"),
//        WeatherStation(stationId = "P0560", stationName = "ERFURT-STADT", region = "Thüringen"),
//        WeatherStation(stationId = "P0561", stationName = "HAMBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "P0563", stationName = "LONDON LUTON", region = "England"),
//        WeatherStation(stationId = "P0564", stationName = "EAST MIDLANDS", region = "England"),
//        WeatherStation(
//            stationId = "P0567",
//            stationName = "MOSKVA/VNUKOVO",
//            region = "Oblast Moskau"
//        ),
//        WeatherStation(
//            stationId = "P0570",
//            stationName = "VANNES MEUCON",
//            region = "Pays de la Loire"
//        ),
//        WeatherStation(stationId = "P0571", stationName = "ATHINAI-ELEFTHERIOS", region = "Attika"),
//        WeatherStation(stationId = "P0572", stationName = "AMARI", region = "Kreis Harju"),
//        WeatherStation(stationId = "P0573", stationName = "KURESSAARE"),
//        WeatherStation(stationId = "W3011", stationName = "WESTL.AGADIR", region = "Munizip Nalut"),
//        WeatherStation(
//            stationId = "W3212",
//            stationName = "CANARIS-E",
//            region = "Munizip al-Dschabal al-Gharbi"
//        ),
//        WeatherStation(stationId = "W3409", stationName = "CANARIS-NE"),
//        WeatherStation(stationId = "W3602", stationName = "ALBORAN"),
//        WeatherStation(stationId = "W3604", stationName = "ALBORAN-W"),
//        WeatherStation(stationId = "W3607", stationName = "WESTL.GIBR."),
//        WeatherStation(stationId = "W3609", stationName = "CABO S.VICENTE"),
//        WeatherStation(stationId = "W3701", stationName = "SDL.CARTAGENA"),
//        WeatherStation(stationId = "W3811", stationName = "WESTL.LISSABON"),
//        WeatherStation(stationId = "W4010", stationName = "WESTL.PORT."),
//        WeatherStation(stationId = "W4211", stationName = "SDL.FINISTERRE"),
//        WeatherStation(stationId = "W4402", stationName = "GOLF BIARRITZ"),
//        WeatherStation(stationId = "W4410", stationName = "FINISTERRE", region = "Galicien"),
//        WeatherStation(stationId = "W4504", stationName = "SUDGASCOGNE"),
//        WeatherStation(stationId = "W4505", stationName = "NDL.GIJON"),
//        WeatherStation(stationId = "W4606", stationName = "BISKAYA"),
//        WeatherStation(stationId = "W4703", stationName = "NORDGASCOGNE"),
//        WeatherStation(stationId = "W4807", stationName = "SOLE"),
//        WeatherStation(stationId = "W5001", stationName = "ENGL.KAN.-E"),
//        WeatherStation(stationId = "W5003", stationName = "LYME BAY"),
//        WeatherStation(stationId = "W5004", stationName = "ENGL.KAN.-W"),
//        WeatherStation(stationId = "W5011", stationName = "FASTNET", region = "Thüringen"),
//        WeatherStation(stationId = "W5105", stationName = "LUNDY", region = "Wales"),
//        WeatherStation(stationId = "W5108", stationName = "SUEDL.IRL."),
//        WeatherStation(stationId = "W5306", stationName = "IRISCHE SEE", region = "Wales"),
//        WeatherStation(stationId = "W5501", stationName = "TYNE"),
//        WeatherStation(stationId = "W5506", stationName = "NORTH CHANNEL", region = "Schottland"),
//        WeatherStation(stationId = "W5602", stationName = "FORTH"),
//        WeatherStation(stationId = "W5607", stationName = "INISHTRAHULL"),
//        WeatherStation(stationId = "W5611", stationName = "NWL.IRLAND"),
//        WeatherStation(stationId = "W5708", stationName = "SDL.HEBRIDEN", region = "Schottland"),
//        WeatherStation(stationId = "W5802", stationName = "CROMARTY"),
//        WeatherStation(stationId = "W5808", stationName = "HEBRIDEN"),
//        WeatherStation(stationId = "W5906", stationName = "NDL.HEBRIDEN"),
//        WeatherStation(stationId = "W6003", stationName = "PENTLANDS"),
//        WeatherStation(stationId = "W6006", stationName = "FAROER"),
//        WeatherStation(stationId = "W6010", stationName = "60NORD10WEST", region = "Viken"),
//        WeatherStation(stationId = "W6102", stationName = "SHETLANDS"),
//        WeatherStation(stationId = "E2935", stationName = "GOLF AKABA-N"),
//        WeatherStation(stationId = "E3231", stationName = "PORT-SAID"),
//        WeatherStation(stationId = "E3234", stationName = "ISRAEL"),
//        WeatherStation(stationId = "E3328", stationName = "SE-KRITIKO"),
//        WeatherStation(stationId = "E3331", stationName = "DELTA"),
//        WeatherStation(stationId = "E3420", stationName = "SW-KRITIKO"),
//        WeatherStation(stationId = "E3424", stationName = "SUEDL.KRETA"),
//        WeatherStation(stationId = "E3512", stationName = "OESTL.DJERBA"),
//        WeatherStation(stationId = "E3514", stationName = "MELITA-SE"),
//        WeatherStation(stationId = "E3517", stationName = "SIDRA"),
//        WeatherStation(stationId = "E3519", stationName = "OESTL.TUNIS"),
//        WeatherStation(stationId = "E3526", stationName = "KRETA-SE"),
//        WeatherStation(stationId = "E3530", stationName = "RHODOS/ZYP."),
//        WeatherStation(stationId = "E3534", stationName = "CRUSADE-N"),
//        WeatherStation(stationId = "E3613", stationName = "TUNIS"),
//        WeatherStation(stationId = "E3623", stationName = "KITHIRASEE"),
//        WeatherStation(stationId = "E3624", stationName = "WEST CRETAN"),
//        WeatherStation(stationId = "E3625", stationName = "AEGAEIS-S."),
//        WeatherStation(stationId = "E3627", stationName = "KARPATHIO"),
//        WeatherStation(stationId = "E3629", stationName = "KASTELORIZO"),
//        WeatherStation(stationId = "E3631", stationName = "TAURUS-W"),
//        WeatherStation(stationId = "E3634", stationName = "TAURUS-E"),
//        WeatherStation(stationId = "E3700", stationName = "PALOS"),
//        WeatherStation(stationId = "E3701", stationName = "CABRERA-W"),
//        WeatherStation(stationId = "E3703", stationName = "ALGER-W"),
//        WeatherStation(stationId = "E3712", stationName = "PANTELLERIA"),
//        WeatherStation(stationId = "E3719", stationName = "ION.MEER"),
//        WeatherStation(stationId = "E3721", stationName = "S-IONIANSEA"),
//        WeatherStation(stationId = "E3724", stationName = "AEGAEIS-SW."),
//        WeatherStation(
//            stationId = "E3727",
//            stationName = "KOS",
//            region = "Decentralized Administration of the Aegean"
//        ),
//        WeatherStation(stationId = "E3803", stationName = "CABRERA"),
//        WeatherStation(stationId = "E3805", stationName = "ALGIER"),
//        WeatherStation(stationId = "E3807", stationName = "ANNABA"),
//        WeatherStation(stationId = "E3809", stationName = "SUEDL.SARD."),
//        WeatherStation(stationId = "E3811", stationName = "TUNISIE-E"),
//        WeatherStation(stationId = "E3817", stationName = "BOOT-S"),
//        WeatherStation(stationId = "E3825", stationName = "CENTRAL AEGEAN"),
//        WeatherStation(stationId = "E3826", stationName = "SAMOSSEE"),
//        WeatherStation(stationId = "E3901", stationName = "BALEARES-SW"),
//        WeatherStation(stationId = "E3904", stationName = "BALEAREN"),
//        WeatherStation(stationId = "E3905", stationName = "CABRERA-E"),
//        WeatherStation(stationId = "E3915", stationName = "LIPARI-SE"),
//        WeatherStation(stationId = "E3918", stationName = "BOOT"),
//        WeatherStation(stationId = "E3920", stationName = "ION.MEER-N."),
//        WeatherStation(stationId = "E3925", stationName = "AEGAEIS-N."),
//        WeatherStation(stationId = "E4007", stationName = "SARDAIGNE-S"),
//        WeatherStation(stationId = "E4011", stationName = "CARBONARA"),
//        WeatherStation(stationId = "E4013", stationName = "CIRCEO-S"),
//        WeatherStation(stationId = "E4014", stationName = "LIPARI"),
//        WeatherStation(stationId = "E4023", stationName = "AEGAEIS-NW."),
//        WeatherStation(stationId = "E4026", stationName = "THRAKICO"),
//        WeatherStation(stationId = "E4028", stationName = "MARMARA"),
//        WeatherStation(stationId = "E4103", stationName = "BALEARES-NE"),
//        WeatherStation(stationId = "E4104", stationName = "MINORQUE"),
//        WeatherStation(stationId = "E4107", stationName = "WESTL.KOR/S"),
//        WeatherStation(stationId = "E4111", stationName = "TYRRH.MEER"),
//        WeatherStation(stationId = "E4119", stationName = "STR.OTRANTO"),
//        WeatherStation(stationId = "E4204", stationName = "GOLFE-LION"),
//        WeatherStation(stationId = "E4208", stationName = "CORSE"),
//        WeatherStation(stationId = "E4212", stationName = "CIRCEO-N"),
//        WeatherStation(stationId = "E4216", stationName = "NDL.BARI"),
//        WeatherStation(stationId = "E4218", stationName = "ADRIA-SUED"),
//        WeatherStation(stationId = "E4229", stationName = "SCHW.MEER1"),
//        WeatherStation(stationId = "E4236", stationName = "SCHW.MEER7"),
//        WeatherStation(stationId = "E4304", stationName = "LION"),
//        WeatherStation(stationId = "E4307", stationName = "SDL.PROVENCE"),
//        WeatherStation(stationId = "E4309", stationName = "LIGUR.MEER"),
//        WeatherStation(stationId = "E4310", stationName = "ELBA"),
//        WeatherStation(stationId = "E4316", stationName = "ZENTR.ADRIA"),
//        WeatherStation(stationId = "E4329", stationName = "SCHW.MEER2"),
//        WeatherStation(stationId = "E4413", stationName = "ADRIA-NORD"),
//        WeatherStation(stationId = "E4414", stationName = "OESTL.ANCONA"),
//        WeatherStation(stationId = "E4430", stationName = "SCHW.MEER3"),
//        WeatherStation(stationId = "E4435", stationName = "SCHW.MEER6"),
//        WeatherStation(stationId = "E4513", stationName = "GOLF-VENEDIG"),
//        WeatherStation(stationId = "E4514", stationName = "SDL.PULA"),
//        WeatherStation(stationId = "E4515", stationName = "RAB"),
//        WeatherStation(stationId = "E4531", stationName = "SCHW.MEER4"),
//        WeatherStation(stationId = "E4637", stationName = "SCHW.MEER5"),
//        WeatherStation(stationId = "E5000", stationName = "STR.DOVER"),
//        WeatherStation(stationId = "E5101", stationName = "THEMSE"),
//        WeatherStation(stationId = "E5203", stationName = "RHEINMUENDG."),
//        WeatherStation(stationId = "E5204", stationName = "IJMUIDEN"),
//        WeatherStation(stationId = "E5303", stationName = "HUMBER"),
//        WeatherStation(stationId = "E5304", stationName = "NORDSEE1"),
//        WeatherStation(stationId = "E5305", stationName = "IJSSELMEER"),
//        WeatherStation(stationId = "E5307", stationName = "OSTFR. KUESTE"),
//        WeatherStation(stationId = "E5311", stationName = "LUEB. BUCHT"),
//        WeatherStation(stationId = "E5312", stationName = "NDL.POEL"),
//        WeatherStation(stationId = "E5344", stationName = "BALTRUM", region = "Niedersachsen"),
//        WeatherStation(stationId = "E5401", stationName = "HUMBER-W"),
//        WeatherStation(stationId = "E5403", stationName = "DOGGER-SUED"),
//        WeatherStation(stationId = "E5404", stationName = "NORDSEE2"),
//        WeatherStation(stationId = "E5405", stationName = "WESTFR.KUESTE"),
//        WeatherStation(stationId = "E5406", stationName = "DT.BUCHT"),
//        WeatherStation(stationId = "E5407", stationName = "POS.FPN"),
//        WeatherStation(stationId = "E5408", stationName = "WANGEROOGE"),
//        WeatherStation(stationId = "E5409", stationName = "ELBEMUENDUNG"),
//        WeatherStation(stationId = "E5411", stationName = "KIELER BUCHT"),
//        WeatherStation(stationId = "E5412", stationName = "WESTL.OSTS."),
//        WeatherStation(stationId = "E5413", stationName = "WESTL.RUEGEN"),
//        WeatherStation(stationId = "E5414", stationName = "BODDENGEW. OST"),
//        WeatherStation(stationId = "E5416", stationName = "SUEDL.OSTS."),
//        WeatherStation(stationId = "E5502", stationName = "DOGGER"),
//        WeatherStation(stationId = "E5504", stationName = "ENTENSCHN."),
//        WeatherStation(stationId = "E5506", stationName = "NORDSEE3"),
//        WeatherStation(stationId = "E5507", stationName = "NORDW.SYLT"),
//        WeatherStation(stationId = "E5508", stationName = "NORDFR.KUE."),
//        WeatherStation(stationId = "E5510", stationName = "FLENSB.FOER."),
//        WeatherStation(stationId = "E5511", stationName = "BELTE/SUND"),
//        WeatherStation(stationId = "E5512", stationName = "FEHMARNBELT"),
//        WeatherStation(stationId = "E5513", stationName = "NDL.RUEGEN"),
//        WeatherStation(stationId = "E5517", stationName = "OESTL.BORNHOLM"),
//        WeatherStation(stationId = "E5519", stationName = "NDL.DANZIG"),
//        WeatherStation(stationId = "E5543", stationName = "ISET-MEER22"),
//        WeatherStation(stationId = "E5606", stationName = "FISCHER-SUED"),
//        WeatherStation(
//            stationId = "E5611",
//            stationName = "KATTEGAT",
//            region = "Region Midtjylland"
//        ),
//        WeatherStation(stationId = "E5612", stationName = "NDL.MOEN"),
//        WeatherStation(stationId = "E5613", stationName = "KATTEGAT-S"),
//        WeatherStation(stationId = "E5614", stationName = "HANOE-BUCHT-W"),
//        WeatherStation(stationId = "E5615", stationName = "NDL.BORNHOLM"),
//        WeatherStation(stationId = "E5616", stationName = "KALMAR-SUND-S"),
//        WeatherStation(stationId = "E5618", stationName = "SE-OSTSEE"),
//        WeatherStation(stationId = "E5620", stationName = "WESTL.KLAIPEDA"),
//        WeatherStation(stationId = "E5702", stationName = "FORTIES"),
//        WeatherStation(stationId = "E5705", stationName = "FISCHER"),
//        WeatherStation(stationId = "E5709", stationName = "SKAGERRAK"),
//        WeatherStation(stationId = "E5711", stationName = "KATTTEGAT-N"),
//        WeatherStation(stationId = "E5805", stationName = "UTSIRA-SUED"),
//        WeatherStation(stationId = "E5807", stationName = "KAP LINDESNES", region = "Agder"),
//        WeatherStation(stationId = "E5810", stationName = "NWL.SKAGEN"),
//        WeatherStation(stationId = "E5811", stationName = "SKAGERRAK-E"),
//        WeatherStation(stationId = "E5818", stationName = "WESTL.GOTLAND"),
//        WeatherStation(stationId = "E5820", stationName = "ZENTR.OSTS."),
//        WeatherStation(stationId = "E5824", stationName = "RIGAI.MEERB."),
//        WeatherStation(stationId = "E5902", stationName = "VIKING-S"),
//        WeatherStation(stationId = "E5910", stationName = "OSLOFJORD"),
//        WeatherStation(stationId = "E5917", stationName = "SDL.STOCKHOLM"),
//        WeatherStation(stationId = "E5919", stationName = "OESTL.STOCKHOLM"),
//        WeatherStation(stationId = "E5922", stationName = "WESTL.OESEL"),
//        WeatherStation(stationId = "E6001", stationName = "VIKING"),
//        WeatherStation(stationId = "E6005", stationName = "UTSIRA-NORD", region = "Vestland"),
//        WeatherStation(stationId = "E6019", stationName = "SDL.ALAND", region = "Uppsala län"),
//        WeatherStation(
//            stationId = "E6021",
//            stationName = "NOERDL.OSTS.",
//            region = "Åländer Schären"
//        ),
//        WeatherStation(stationId = "E6024", stationName = "FINN.MEERB.-W"),
//        WeatherStation(stationId = "E6026", stationName = "FINN.MEERB."),
//        WeatherStation(stationId = "E6104", stationName = "UTVAR"),
//        WeatherStation(stationId = "E6118", stationName = "BOTTENSEE-SW"),
//        WeatherStation(stationId = "E6120", stationName = "ALANDSEE"),
//        WeatherStation(
//            stationId = "E6131",
//            stationName = "LADOGA SEE",
//            region = "Republik Karelien"
//        ),
//        WeatherStation(stationId = "E7708", stationName = "GLOBAL1"),
//        WeatherStation(
//            stationId = "A338 ",
//            stationName = "BREKENDORFER MOOR",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "A492 ",
//            stationName = "OLDENBURG I.H.",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "A512 ", stationName = "HEIDE", region = "Schleswig-Holstein"),
//        WeatherStation(
//            stationId = "A652 ",
//            stationName = "PADENSTEDT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "B335 ",
//            stationName = "KAVELSDORF",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "B742 ",
//            stationName = "LINSTOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "C316 ", stationName = "MARMSTORF", region = "Hamburg"),
//        WeatherStation(stationId = "E136 ", stationName = "ZETEL", region = "Niedersachsen"),
//        WeatherStation(stationId = "E267 ", stationName = "BOCKEL", region = "Niedersachsen"),
//        WeatherStation(stationId = "E402 ", stationName = "DOERPEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "E427 ", stationName = "AHLHORN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "E460 ",
//            stationName = "VORM WITZENBRUCH",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "E482 ", stationName = "HOHENZETHEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "E653 ", stationName = "WIETZEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "E726 ", stationName = "NEMDEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "E735 ", stationName = "HATTENDORF", region = "Niedersachsen"),
//        WeatherStation(stationId = "E777 ", stationName = "WATENSTEDT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "E790 ",
//            stationName = "WOLFSBURG (SUEDWEST)",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "E798 ", stationName = "HELMSTEDT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "E877 ",
//            stationName = "CLAUSTHAL-ZELLERFELD",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "E885 ", stationName = "WESTERODE", region = "Niedersachsen"),
//        WeatherStation(stationId = "E923 ", stationName = "SCHLOCHAU", region = "Niedersachsen"),
//        WeatherStation(stationId = "E972 ", stationName = "MOLLENFELDE", region = "Niedersachsen"),
//        WeatherStation(stationId = "F136 ", stationName = "KARSTEDTSHOF", region = "Brandenburg"),
//        WeatherStation(stationId = "F283 ", stationName = "JOACHIMSTHAL", region = "Brandenburg"),
//        WeatherStation(stationId = "F461 ", stationName = "RUEDERSDORF", region = "Brandenburg"),
//        WeatherStation(stationId = "F537 ", stationName = "FAHLHORST", region = "Brandenburg"),
//        WeatherStation(stationId = "F618 ", stationName = "FLAEMING", region = "Brandenburg"),
//        WeatherStation(stationId = "F863 ", stationName = "HAENCHEN", region = "Brandenburg"),
//        WeatherStation(stationId = "F945 ", stationName = "RUHLAND", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "H069 ",
//            stationName = "LADBERGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H075 ",
//            stationName = "HABICHTSWALD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H097 ",
//            stationName = "STEINEGGE-EXTER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H228 ",
//            stationName = "KALTENBACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H267 ",
//            stationName = "BECKUMER BERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H308 ",
//            stationName = "SONSBECK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H379 ",
//            stationName = "LOHME-ALME",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H423 ",
//            stationName = "ALTENESSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H456 ",
//            stationName = "OSTOENNER BACH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H483 ",
//            stationName = "OTTENSGRUND",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H528 ",
//            stationName = "HOLZBUETTGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H545 ",
//            stationName = "OBERBARMEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "H554 ", stationName = "NAHMER", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "H556 ",
//            stationName = "ROELVEDER MUEHLE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H605 ",
//            stationName = "GUEDDERATH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H642 ",
//            stationName = "REMSCHEID-LENNEP",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H663 ",
//            stationName = "SICHTER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H744 ",
//            stationName = "KOELN-STAMMHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H746 ",
//            stationName = "MOITZFELD",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H775 ",
//            stationName = "ECKENHAGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H810 ",
//            stationName = "KREUZ AACHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H933 ",
//            stationName = "WISSKIRCHEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H993 ",
//            stationName = "BLANKENHEIM",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "J721 ",
//            stationName = "LOESTERBACH SUED",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "J907 ", stationName = "GOLDENE BREMM", region = "Saarland"),
//        WeatherStation(stationId = "K040 ", stationName = "ESCH", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K100 ",
//            stationName = "KLEIN-ALTENDORF",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "K101 ", stationName = "STEINBORN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K130 ", stationName = "SINZIG", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K164 ",
//            stationName = "KANNENBAECKER LAND",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K169 ", stationName = "GRENZAU", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K250 ", stationName = "MAYEN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K265 ", stationName = "OCHTENDUNG", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K266 ",
//            stationName = "MOSELTALBRUECKE",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K268 ",
//            stationName = "MUENSTERMAIFELD",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K315 ",
//            stationName = "STRICKSCHEID",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K341 ",
//            stationName = "LAUBACHER HOEHE",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K436 ", stationName = "WIERSDORF", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K442 ",
//            stationName = "DREIS-BRUECK",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K445 ", stationName = "FLUSSBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K471 ",
//            stationName = "SIMMERN-WAHLBACH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K480 ", stationName = "LAUDERT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K481 ", stationName = "WAHLBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K510 ",
//            stationName = "MERZKIRCHEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K560 ",
//            stationName = "MEDDERSHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K562 ", stationName = "WIESWEILER", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K571 ",
//            stationName = "BINGEN-GAULSHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K582 ",
//            stationName = "MAINZ (DLR)",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K587 ", stationName = "WOERRSTADT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K588 ",
//            stationName = "ROMMERSHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K597 ", stationName = "NIERSTEIN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K598 ", stationName = "DIEMHEIM", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K610 ", stationName = "AVELSBACH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K620 ", stationName = "KANZERN", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K621 ", stationName = "WITTLICH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K623 ", stationName = "ZELTINGEN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K630 ",
//            stationName = "DIENSTWEILER",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K642 ",
//            stationName = "NIEDERWOERSSESBACH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K670 ",
//            stationName = "PLEISWEILER-OBERHOFE",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K672 ",
//            stationName = "SCHWEIGHOFEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K677 ",
//            stationName = "FREIMERSHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K695 ", stationName = "EICH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K732 ", stationName = "HAHNWEILER", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K768 ",
//            stationName = "SCHORLENBERG",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K787 ",
//            stationName = "LEINIGER BERG",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K795 ",
//            stationName = "FRANKENTHAL",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K862 ", stationName = "MORLAUTERN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K880 ",
//            stationName = "HERXHEIMWEYHER",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K882 ",
//            stationName = "STEINWEILER",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K886 ", stationName = "WEIERHOF", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K887 ",
//            stationName = "NEUSTADT/WEINSTRASSE",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K892 ",
//            stationName = "SCHIFFERSTADT",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K963 ", stationName = "LUSTADT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "L112 ", stationName = "VASBECK", region = "Hessen"),
//        WeatherStation(
//            stationId = "L119 ",
//            stationName = "HOF LAUTERBACH, VOEH",
//            region = "Hessen"
//        ),
//        WeatherStation(stationId = "L160 ", stationName = "LUTTERBERG", region = "Niedersachsen"),
//        WeatherStation(stationId = "L242 ", stationName = "AM SCHARFENSTEIN", region = "Hessen"),
//        WeatherStation(stationId = "L267 ", stationName = "ALHEIM", region = "Hessen"),
//        WeatherStation(stationId = "L282 ", stationName = "OBERHONE", region = "Hessen"),
//        WeatherStation(stationId = "L283 ", stationName = "DOMAENE VOGELSBURG", region = "Hessen"),
//        WeatherStation(stationId = "L284 ", stationName = "HESSENRING", region = "Hessen"),
//        WeatherStation(stationId = "L353 ", stationName = "ALSFELD", region = "Hessen"),
//        WeatherStation(stationId = "L379 ", stationName = "EICHHOF", region = "Hessen"),
//        WeatherStation(stationId = "L414 ", stationName = "HAIGER", region = "Hessen"),
//        WeatherStation(stationId = "L474 ", stationName = "RIMBERG", region = "Hessen"),
//        WeatherStation(stationId = "L542 ", stationName = "HOMBERG-OHM", region = "Hessen"),
//        WeatherStation(stationId = "L585 ", stationName = "FULDA", region = "Hessen"),
//        WeatherStation(stationId = "L637 ", stationName = "T/R WETTERAU", region = "Hessen"),
//        WeatherStation(stationId = "L641 ", stationName = "ECHZELL SCHWALHEIM", region = "Hessen"),
//        WeatherStation(stationId = "L648 ", stationName = "ALTENSTADT", region = "Hessen"),
//        WeatherStation(stationId = "L684 ", stationName = "THALAUBACH", region = "Hessen"),
//        WeatherStation(stationId = "L687 ", stationName = "FORSTHAUS", region = "Hessen"),
//        WeatherStation(stationId = "L716 ", stationName = "IDSTEIN", region = "Hessen"),
//        WeatherStation(stationId = "L838 ", stationName = "FRANKFURT", region = "Hessen"),
//        WeatherStation(stationId = "L841 ", stationName = "FRANKFURT WESTEND", region = "Hessen"),
//        WeatherStation(stationId = "L857 ", stationName = "WALDSCHNEISE HANAU", region = "Hessen"),
//        WeatherStation(stationId = "L858 ", stationName = "MARKOEBEL", region = "Hessen"),
//        WeatherStation(stationId = "L889 ", stationName = "ROSSDORF DARMSTADT", region = "Hessen"),
//        WeatherStation(stationId = "L912 ", stationName = "ALLMENDFELD", region = "Hessen"),
//        WeatherStation(
//            stationId = "L959 ",
//            stationName = "RHEINBR.MANNHEIM",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "L962 ", stationName = "HEPPENHEIM", region = "Hessen"),
//        WeatherStation(stationId = "L985 ", stationName = "BUCHHALDE", region = "Hessen"),
//        WeatherStation(stationId = "M403 ", stationName = "HOERSCHEL", region = "Thüringen"),
//        WeatherStation(stationId = "M524 ", stationName = "BOXBERG", region = "Thüringen"),
//        WeatherStation(stationId = "M575 ", stationName = "GERAER BERG", region = "Thüringen"),
//        WeatherStation(stationId = "M774 ", stationName = "LEUBSDORF", region = "Thüringen"),
//        WeatherStation(stationId = "M888 ", stationName = "SCHLEIZ", region = "Thüringen"),
//        WeatherStation(stationId = "N013 ", stationName = "ROSSLA", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "N443 ", stationName = "IRXLEBEN", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "N567 ", stationName = "VOCKERODE", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N642 ",
//            stationName = "PLOETZKAU/SAALE",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N793 ", stationName = "ZOERBIG", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "N891 ",
//            stationName = "ELSTER-SAALE-KANAL",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "N992 ", stationName = "OSTERFELD", region = "Thüringen"),
//        WeatherStation(stationId = "O013 ", stationName = "BERBERSDORF", region = "Sachsen"),
//        WeatherStation(stationId = "O215 ", stationName = "WALDSTEINBERG", region = "Sachsen"),
//        WeatherStation(stationId = "O252 ", stationName = "SCHOENBORN", region = "Sachsen"),
//        WeatherStation(stationId = "O372 ", stationName = "BURKAUER BERG", region = "Sachsen"),
//        WeatherStation(stationId = "O451 ", stationName = "DRESDEN-PILLNITZ", region = "Sachsen"),
//        WeatherStation(stationId = "O454 ", stationName = "DRESDEN/FLUGHAFEN", region = "Sachsen"),
//        WeatherStation(stationId = "O459 ", stationName = "ZELLWALD", region = "Sachsen"),
//        WeatherStation(stationId = "O862 ", stationName = "MARIENHOEHE", region = "Sachsen"),
//        WeatherStation(stationId = "O863 ", stationName = "AUE", region = "Sachsen"),
//        WeatherStation(stationId = "O951 ", stationName = "HEINERSGRUEN", region = "Sachsen"),
//        WeatherStation(stationId = "P017 ", stationName = "OBERTHULBA", region = "Bayern"),
//        WeatherStation(stationId = "P082 ", stationName = "SAALEBRUECKE", region = "Bayern"),
//        WeatherStation(stationId = "P101 ", stationName = "KAHL", region = "Bayern"),
//        WeatherStation(stationId = "P116 ", stationName = "HASELTAL", region = "Bayern"),
//        WeatherStation(stationId = "P134 ", stationName = "SCHWEINFURT", region = "Bayern"),
//        WeatherStation(stationId = "P159 ", stationName = "HIRSCHAID", region = "Bayern"),
//        WeatherStation(stationId = "P166 ", stationName = "THURNAU", region = "Bayern"),
//        WeatherStation(stationId = "P235 ", stationName = "BUERGSTADT", region = "Bayern"),
//        WeatherStation(stationId = "P254 ", stationName = "RANDERSACKER", region = "Bayern"),
//        WeatherStation(stationId = "P264 ", stationName = "ROEDELSEE", region = "Bayern"),
//        WeatherStation(stationId = "P267 ", stationName = "HIENBERG", region = "Bayern"),
//        WeatherStation(stationId = "P289 ", stationName = "NAABBRUECKE", region = "Bayern"),
//        WeatherStation(stationId = "P291 ", stationName = "WALDNAAB", region = "Bayern"),
//        WeatherStation(stationId = "P332 ", stationName = "ZOLLHAUS", region = "Bayern"),
//        WeatherStation(stationId = "P353 ", stationName = "VILSTAL", region = "Bayern"),
//        WeatherStation(stationId = "P401 ", stationName = "ZUMHAUS", region = "Bayern"),
//        WeatherStation(stationId = "P438 ", stationName = "GELBELSEE", region = "Bayern"),
//        WeatherStation(stationId = "P452 ", stationName = "TB EICHELBERG", region = "Bayern"),
//        WeatherStation(stationId = "P533 ", stationName = "KOESCHINGER FORST", region = "Bayern"),
//        WeatherStation(stationId = "P547 ", stationName = "SIEGENBURG", region = "Bayern"),
//        WeatherStation(stationId = "P555 ", stationName = "MALLERSDORF-PFB", region = "Bayern"),
//        WeatherStation(stationId = "P573 ", stationName = "DEGGENAU", region = "Bayern"),
//        WeatherStation(stationId = "P575 ", stationName = "NEUSLING", region = "Bayern"),
//        WeatherStation(stationId = "P589 ", stationName = "GALGENBERG", region = "Bayern"),
//        WeatherStation(stationId = "P632 ", stationName = "HOLLEDAU SUED", region = "Bayern"),
//        WeatherStation(stationId = "P738 ", stationName = "SCHOEFFELDING", region = "Bayern"),
//        WeatherStation(stationId = "P748 ", stationName = "OBERPFAFFENHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "P755 ", stationName = "ASCHHEIM", region = "Bayern"),
//        WeatherStation(stationId = "P801 ", stationName = "MEMMINGEN", region = "Bayern"),
//        WeatherStation(stationId = "P805 ", stationName = "ALLGAEUER TOR", region = "Bayern"),
//        WeatherStation(stationId = "P866 ", stationName = "SEEHAMMER SEE", region = "Bayern"),
//        WeatherStation(stationId = "P869 ", stationName = "DETTENDORF", region = "Bayern"),
//        WeatherStation(stationId = "P878 ", stationName = "STREITHEIM", region = "Bayern"),
//        WeatherStation(stationId = "P910 ", stationName = "HELLENGERST", region = "Bayern"),
//        WeatherStation(stationId = "P912 ", stationName = "SULZBERG", region = "Bayern"),
//        WeatherStation(stationId = "P941 ", stationName = "GROSSWEIL", region = "Bayern"),
//        WeatherStation(stationId = "P977 ", stationName = "OBERAUDORF", region = "Bayern"),
//        WeatherStation(
//            stationId = "Q006 ",
//            stationName = "SECKENHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q068 ",
//            stationName = "HOLZSPITZE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q208 ",
//            stationName = "KARLSRUHE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "Q241 ", stationName = "SULMTAL", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "Q247 ",
//            stationName = "BESIGHEIM",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q290 ",
//            stationName = "WOLFSKOPF",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q348 ",
//            stationName = "ENGELBERG",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q441 ",
//            stationName = "AK STUTTGART",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q444 ",
//            stationName = "STUTTGART RWY4",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q561 ",
//            stationName = "METZINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "Q585 ", stationName = "NW-HR09", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "Q597 ", stationName = "NW-HR02", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "Q740 ",
//            stationName = "BALINGEN-BRONNHPTN.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q848 ",
//            stationName = "GEISINGEN",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "Q904 ",
//            stationName = "DREIECK WEIL",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "Q988 ", stationName = "GRUB", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "X001 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X002 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X003 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "X004 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X005 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X006 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X007 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X008 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X009 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X010 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X011 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "X012 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X013 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X014 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X015 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(
//            stationId = "X016 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X017 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X018 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X019 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X020 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X021 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X022 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X023 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X024 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X025 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X026 ", stationName = "SWIS-PUNKT", region = "Brandenburg"),
//        WeatherStation(stationId = "X027 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X028 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X029 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X030 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X031 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X032 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X033 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X034 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X035 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X036 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X037 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X038 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X039 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X040 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X042 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X043 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X044 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X045 ", stationName = "SWIS-PUNKT", region = "Berlin"),
//        WeatherStation(stationId = "X046 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X047 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X048 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X049 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(
//            stationId = "X050 ",
//            stationName = "SWIS-PUNKT",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "X051 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X052 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X053 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X054 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X055 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X056 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X057 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X058 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X059 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X060 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X087 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X088 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "X089 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X090 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X091 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X093 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X095 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X096 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X097 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X098 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X099 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X100 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X101 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X102 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X103 ", stationName = "SWIS-PUNKT", region = "Brandenburg"),
//        WeatherStation(stationId = "X104 ", stationName = "SWIS-PUNKT", region = "Berlin"),
//        WeatherStation(stationId = "X105 ", stationName = "SWIS-PUNKT", region = "Berlin"),
//        WeatherStation(stationId = "X106 ", stationName = "SWIS-PUNKT", region = "Hamburg"),
//        WeatherStation(stationId = "X107 ", stationName = "SWIS-PUNKT", region = "Bremen"),
//        WeatherStation(
//            stationId = "X109 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X110 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X111 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X112 ", stationName = "SWIS-PUNKT", region = "Saarland"),
//        WeatherStation(stationId = "X113 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X114 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X115 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X116 ", stationName = "SWIS-PUNKT", region = "Hauts-de-France"),
//        WeatherStation(stationId = "X117 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X118 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X119 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X120 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X121 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X122 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "X123 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X124 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X125 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X126 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "X127 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X128 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X129 ", stationName = "SWIS-PUNKT", region = "Hamburg"),
//        WeatherStation(
//            stationId = "X130 ",
//            stationName = "SWIS-PUNKT",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(stationId = "X131 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(
//            stationId = "X132 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X133 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(
//            stationId = "X134 ",
//            stationName = "SWIS-PUNKT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(
//            stationId = "X135 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X136 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "X137 ",
//            stationName = "SWIS-PUNKT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "X138 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "X139 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X140 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X141 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X142 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(
//            stationId = "X143 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X144 ",
//            stationName = "SWIS-PUNKT",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X145 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X146 ",
//            stationName = "SWIS-PUNKT",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X147 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X148 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(
//            stationId = "X149 ",
//            stationName = "SWIS-PUNKT",
//            region = "Schleswig-Holstein"
//        ),
//        WeatherStation(stationId = "X150 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X151 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X200 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X201 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X202 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X203 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X204 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X205 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X206 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X207 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X208 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X209 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X210 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X211 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X212 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X213 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X214 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X215 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X216 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X217 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X218 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X219 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X220 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X221 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X222 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X223 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X224 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X225 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X226 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X227 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(
//            stationId = "X228 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X229 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X230 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X231 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X232 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X233 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X234 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X235 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X236 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X237 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(
//            stationId = "X238 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X239 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X240 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X241 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X242 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X243 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X244 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X245 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X246 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X247 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X248 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X249 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X250 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X251 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X252 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X253 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X254 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X255 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X256 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X257 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X258 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X259 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X260 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X261 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X262 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X263 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X264 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X265 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X266 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X267 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X268 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X269 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X270 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(
//            stationId = "X271 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X272 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X273 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X274 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X275 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X276 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X277 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X278 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X279 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X280 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X281 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X282 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X283 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X284 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X285 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X286 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X287 ", stationName = "SWIS-PUNKT", region = "Saarland"),
//        WeatherStation(stationId = "X288 ", stationName = "SWIS-PUNKT", region = "Saarland"),
//        WeatherStation(stationId = "X289 ", stationName = "SWIS-PUNKT", region = "Saarland"),
//        WeatherStation(stationId = "X290 ", stationName = "SWIS-PUNKT", region = "Saarland"),
//        WeatherStation(stationId = "X291 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X292 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X293 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X294 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X295 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X296 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "X297 ",
//            stationName = "SWIS-PUNKT",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "X298 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X299 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X300 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X301 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X302 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X303 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "X304 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X305 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X306 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X307 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X308 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X309 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X310 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X311 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X312 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X313 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X314 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X315 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X316 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X317 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X318 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X319 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X320 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X321 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X322 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X323 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X324 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X325 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X326 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "X327 ", stationName = "SWIS-PUNKT", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "X328 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X329 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X330 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X331 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X333 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X334 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X335 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X336 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X337 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X338 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X339 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X340 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X341 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X342 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X343 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X344 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X345 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X346 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X347 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X348 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X349 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X350 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X351 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(stationId = "X352 ", stationName = "SWIS-PUNKT", region = "Hessen"),
//        WeatherStation(
//            stationId = "X353 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X354 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X355 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X356 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X357 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X358 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X359 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X360 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X361 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X362 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X363 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X364 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X365 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X366 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X367 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X368 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X369 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X370 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X371 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X372 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X373 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X374 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X375 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X376 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X377 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X378 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X379 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X380 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X381 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X382 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X383 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X384 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X389 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X390 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X391 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X392 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X393 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X394 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X395 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X396 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X397 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X398 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X399 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X400 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X401 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X402 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X403 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X404 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X405 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X406 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X407 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X408 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X409 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X410 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X411 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X412 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X413 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X414 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X415 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X416 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X417 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X418 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X419 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X420 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X421 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X422 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X423 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X424 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X426 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X427 ", stationName = "SWIS-PUNKT", region = "Bayern"),
//        WeatherStation(stationId = "X428 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X429 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X430 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X431 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X432 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X433 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X434 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X435 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X436 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X437 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X438 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X439 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X440 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X441 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X442 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X443 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X444 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X445 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X446 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X447 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X448 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X449 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X450 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X451 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X452 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X453 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X454 ", stationName = "SWIS-PUNKT", region = "Thüringen"),
//        WeatherStation(stationId = "X455 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X456 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X457 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X458 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X459 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "X460 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X461 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X462 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X463 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "X464 ",
//            stationName = "SWIS-PUNKT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X465 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X466 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X467 ", stationName = "SWIS-PUNKT", region = "Brandenburg"),
//        WeatherStation(stationId = "X468 ", stationName = "SWIS-PUNKT", region = "Brandenburg"),
//        WeatherStation(stationId = "X469 ", stationName = "SWIS-PUNKT", region = "Brandenburg"),
//        WeatherStation(stationId = "X470 ", stationName = "SWIS-PUNKT", region = "Sachsen-Anhalt"),
//        WeatherStation(stationId = "X471 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X472 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X473 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X474 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X475 ", stationName = "SWIS-PUNKT", region = "Sachsen"),
//        WeatherStation(stationId = "X476 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X477 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "X478 ", stationName = "SWIS-PUNKT", region = "Niedersachsen"),
//        WeatherStation(stationId = "06678", stationName = "BISCHOFSZELL", region = "Thurgau"),
//        WeatherStation(stationId = "06647", stationName = "WUERENLINGEN", region = "Aargau"),
//        WeatherStation(stationId = "10124", stationName = "LEUCHTTURM A. WESER"),
//        WeatherStation(
//            stationId = "10271",
//            stationName = "NEURUPPIN-ALT RUPPIN",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "10308", stationName = "NORDHORN", region = "Niedersachsen"),
//        WeatherStation(stationId = "10619", stationName = "BAUMHOLDER", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "11113", stationName = "NAUDERS", region = "Tirol"),
//        WeatherStation(stationId = "11127", stationName = "OBERGURGL", region = "Tirol"),
//        WeatherStation(
//            stationId = "11138",
//            stationName = "ALPINZENTRUM RUDOL.",
//            region = "Salzburg"
//        ),
//        WeatherStation(stationId = "11155", stationName = "FEUERKOGEL", region = "Oberösterreich"),
//        WeatherStation(stationId = "11173", stationName = "FISCHBACH", region = "Steiermark"),
//        WeatherStation(stationId = "11221", stationName = "KOEFLACH", region = "Steiermark"),
//        WeatherStation(stationId = "11232", stationName = "FEISTRITZ", region = "Kärnten"),
//        WeatherStation(stationId = "11252", stationName = "VIRGEN (OSTTIROL)", region = "Tirol"),
//        WeatherStation(stationId = "11255", stationName = "KOETSCHACH", region = "Kärnten"),
//        WeatherStation(
//            stationId = "11272",
//            stationName = "SPITTAL/DRAU (TAWES)",
//            region = "Kärnten"
//        ),
//        WeatherStation(stationId = "11280", stationName = "MURAU", region = "Steiermark"),
//        WeatherStation(
//            stationId = "11285",
//            stationName = "DEUTSCHLANDSBERG",
//            region = "Steiermark"
//        ),
//        WeatherStation(
//            stationId = "11290",
//            stationName = "GRAZ (UNIVERSITAET)",
//            region = "Steiermark"
//        ),
//        WeatherStation(stationId = "11310", stationName = "ISCHGL", region = "Tirol"),
//        WeatherStation(stationId = "11314", stationName = "REUTTE AUTOM.", region = "Tirol"),
//        WeatherStation(stationId = "11340", stationName = "SCHMITTENHOEHE", region = "Salzburg"),
//        WeatherStation(stationId = "11390", stationName = "HARTBERG", region = "Steiermark"),
//        WeatherStation(
//            stationId = "12399",
//            stationName = "TERESPOL",
//            region = "Woiwodschaft Lublin"
//        ),
//        WeatherStation(stationId = "13457", stationName = "TIVAT", region = "Kotor Municipality"),
//        WeatherStation(stationId = "13459", stationName = "NIKSIC", region = "Nikšić Municipality"),
//        WeatherStation(stationId = "13461", stationName = "BAR"),
//        WeatherStation(
//            stationId = "13463",
//            stationName = "PODGORICA",
//            region = "Großgemeinde Podgorica"
//        ),
//        WeatherStation(stationId = "26144", stationName = "LOGEVA", region = "Kreis Jõgeva"),
//        WeatherStation(stationId = "26215", stationName = "ARENSBURG"),
//        WeatherStation(stationId = "26258", stationName = "PSKOV", region = "Oblast Pskow"),
//        WeatherStation(stationId = "26425", stationName = "JELGAVA", region = "Bezirk Jelgava"),
//        WeatherStation(stationId = "26544", stationName = "DAUGAVPILS", region = "Daugavpils"),
//        WeatherStation(stationId = "26657", stationName = "DOKSICY", region = "Wizebskaja Woblasz"),
//        WeatherStation(stationId = "26695", stationName = "LEPEL", region = "Oblast Smolensk"),
//        WeatherStation(stationId = "26759", stationName = "BORISOV", region = "Minskaja Woblasz"),
//        WeatherStation(stationId = "26763", stationName = "ORSHA", region = "Wizebskaja Woblasz"),
//        WeatherStation(
//            stationId = "26774",
//            stationName = "OGORKI",
//            region = "Mahiljouskaja Woblasz"
//        ),
//        WeatherStation(stationId = "26781", stationName = "SMOLENSK", region = "Oblast Smolensk"),
//        WeatherStation(stationId = "26832", stationName = "LIDA", region = "Hrodsenskaja Woblasz"),
//        WeatherStation(stationId = "26898", stationName = "BRYANSK", region = "Oblast Brjansk"),
//        WeatherStation(
//            stationId = "26941",
//            stationName = "BARANOVICHI",
//            region = "Breszkaja Woblasz"
//        ),
//        WeatherStation(stationId = "26951", stationName = "SLUTSK", region = "Minskaja Woblasz"),
//        WeatherStation(
//            stationId = "26961",
//            stationName = "BOBRUISK",
//            region = "Mahiljouskaja Woblasz"
//        ),
//        WeatherStation(stationId = "26966", stationName = "ZHLOBIN", region = "Homelskaja Woblasz"),
//        WeatherStation(stationId = "27402", stationName = "TVER", region = "Oblast Twer"),
//        WeatherStation(stationId = "33019", stationName = "PINSK", region = "Breszkaja Woblasz"),
//        WeatherStation(stationId = "33036", stationName = "MOZYR", region = "Homelskaja Woblasz"),
//        WeatherStation(stationId = "33088", stationName = "SARNY", region = "Riwne"),
//        WeatherStation(stationId = "33124", stationName = "BRAGIN", region = "Homelskaja Woblasz"),
//        WeatherStation(stationId = "33135", stationName = "CHERNIGOV", region = "Tschernihiw"),
//        WeatherStation(
//            stationId = "33177",
//            stationName = "VLADIMIR-VOLYNSKIJ",
//            region = "Wolhynien"
//        ),
//        WeatherStation(stationId = "33187", stationName = "LUTSK", region = "Wolhynien"),
//        WeatherStation(stationId = "33275", stationName = "SUMY", region = "Sumy"),
//        WeatherStation(stationId = "33301", stationName = "ROVNO", region = "Riwne"),
//        WeatherStation(
//            stationId = "33317",
//            stationName = "SHEPETIVKA",
//            region = "Oblast Chmelnyzkyj"
//        ),
//        WeatherStation(stationId = "33325", stationName = "ZHYTOMYR", region = "Schytomyr"),
//        WeatherStation(stationId = "33393", stationName = "LIVIV", region = "Oblast Lwiw"),
//        WeatherStation(stationId = "33415", stationName = "TERNOPOL", region = "Ternopil"),
//        WeatherStation(stationId = "33466", stationName = "MIRONOVKA", region = "Oblast Kiew"),
//        WeatherStation(stationId = "33506", stationName = "POLTAVA", region = "Poltawa"),
//        WeatherStation(stationId = "33562", stationName = "VINNITSA", region = "Winnyzja"),
//        WeatherStation(stationId = "33614", stationName = "SVETLOVODSK", region = "Kirowohrad"),
//        WeatherStation(stationId = "33631", stationName = "UZHGOROD", region = "Transkarpatien"),
//        WeatherStation(
//            stationId = "33658",
//            stationName = "CHERNOVTSY",
//            region = "Oblast Tscherniwzi"
//        ),
//        WeatherStation(stationId = "33664", stationName = "BRICENI", region = "Rajon Briceni"),
//        WeatherStation(stationId = "33745", stationName = "BALTI", region = "Bălți"),
//        WeatherStation(stationId = "33749", stationName = "BRAVICEA", region = "Rajon Călărași"),
//        WeatherStation(stationId = "33761", stationName = "LYUBASHEVKA", region = "Odessa"),
//        WeatherStation(stationId = "33821", stationName = "DUBASARI", region = "Rajon Dubăsari"),
//        WeatherStation(stationId = "33829", stationName = "TIRASPOL", region = "Transnistrien"),
//        WeatherStation(stationId = "33883", stationName = "KOMRAT", region = "Gagausien"),
//        WeatherStation(stationId = "33885", stationName = "CAHUL", region = "Rajon Cahul"),
//        WeatherStation(stationId = "33889", stationName = "IZMAIL", region = "Odessa"),
//        WeatherStation(stationId = "33896", stationName = "SARATA", region = "Odessa"),
//        WeatherStation(stationId = "33902", stationName = "KHERSON", region = "Cherson"),
//        WeatherStation(stationId = "33934", stationName = "DZHANKOI"),
//        WeatherStation(stationId = "33946", stationName = "SIMFEROPOL"),
//        WeatherStation(stationId = "33994", stationName = "AYVOVE"),
//        WeatherStation(stationId = "34415", stationName = "IZYUM", region = "Oblast Charkiw"),
//        WeatherStation(stationId = "34615", stationName = "VOLNOVAKHA", region = "Oblast Donezk"),
//        WeatherStation(stationId = "40025", stationName = "LATAKIA", region = "Latakia"),
//        WeatherStation(stationId = "40030", stationName = "HAMA", region = "Hama"),
//        WeatherStation(stationId = "40253", stationName = "BAQURA", region = "Irbid"),
//        WeatherStation(stationId = "40255", stationName = "IRBID", region = "Irbid"),
//        WeatherStation(stationId = "40256", stationName = "WADI RAYAN", region = "Irbid"),
//        WeatherStation(
//            stationId = "40257",
//            stationName = "RAS MUNEEF",
//            region = "Gouvernement Adschlun"
//        ),
//        WeatherStation(
//            stationId = "40260",
//            stationName = "H-5 SAFAWI",
//            region = "Gouvernement Mafraq"
//        ),
//        WeatherStation(stationId = "40265", stationName = "MAFRAQ", region = "Gouvernement Mafraq"),
//        WeatherStation(
//            stationId = "40267",
//            stationName = "WADI DHULAIL",
//            region = "Gouvernement Mafraq"
//        ),
//        WeatherStation(stationId = "40268", stationName = "SALT", region = "Gouvernement al-Balqa"),
//        WeatherStation(
//            stationId = "40275",
//            stationName = "QATRANEH",
//            region = "Gouvernement Karak"
//        ),
//        WeatherStation(stationId = "40280", stationName = "JERICHO"),
//        WeatherStation(
//            stationId = "40285",
//            stationName = "DEIR ALLA",
//            region = "Gouvernement al-Balqa"
//        ),
//        WeatherStation(
//            stationId = "40288",
//            stationName = "AL AZRAQ",
//            region = "Gouvernement Zarqa"
//        ),
//        WeatherStation(
//            stationId = "40292",
//            stationName = "ER RABBAH",
//            region = "Gouvernement Karak"
//        ),
//        WeatherStation(
//            stationId = "40296",
//            stationName = "GHOR EL SAFI",
//            region = "Gouvernement Karak"
//        ),
//        WeatherStation(
//            stationId = "40298",
//            stationName = "TAFILEH",
//            region = "Gouvernement at-Tafila"
//        ),
//        WeatherStation(stationId = "40300", stationName = "SHOUBAK", region = "Gouvernement Maʿan"),
//        WeatherStation(stationId = "40305", stationName = "JAFER", region = "Gouvernement Maʿan"),
//        WeatherStation(stationId = "40310", stationName = "MA'AN", region = "Gouvernement Maʿan"),
//        WeatherStation(
//            stationId = "40340",
//            stationName = "AQABA AIRPORT",
//            region = "Gouvernement Aqaba"
//        ),
//        WeatherStation(
//            stationId = "F9400",
//            stationName = "ZARQA AIRPORT",
//            region = "Gouvernement Zarqa"
//        ),
//        WeatherStation(stationId = "F9401", stationName = "LOD IL", region = "Irbid"),
//        WeatherStation(stationId = "F9434", stationName = "RUKLA", region = "Bezirk Kaunas"),
//        WeatherStation(
//            stationId = "F9435",
//            stationName = "HALLE DIESELSTR. HKW",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "F9501",
//            stationName = "BOCHUM UMSPWK.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9502",
//            stationName = "EISERFELD UMSPWK.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9503",
//            stationName = "GUNDELFINGEN UMSPWK.",
//            region = "Bayern"
//        ),
//        WeatherStation(
//            stationId = "F9504",
//            stationName = "HANEKENFÄHR UMSPWK.",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(
//            stationId = "F9505",
//            stationName = "HOHENECK UMSPWK.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9506",
//            stationName = "KÜHMOOS UMSPWK.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "F9507", stationName = "LEUPOLZ UMSPWK.", region = "Bayern"),
//        WeatherStation(
//            stationId = "F9508",
//            stationName = "MITTELBEXBACH UMSPWK",
//            region = "Saarland"
//        ),
//        WeatherStation(
//            stationId = "F9509",
//            stationName = "NIEDERSTEDEM UMSPWK.",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9510",
//            stationName = "RHEINAU UMSPWK.",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9511",
//            stationName = "ROMMERSKIRCHEN UMSPW",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "F9512", stationName = "URBERACH UMSPWK.", region = "Hessen"),
//        WeatherStation(
//            stationId = "F9513",
//            stationName = "WEIßENTURM UMSPWK.",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9514",
//            stationName = "WESTERKAPPELN UMSPWK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9515",
//            stationName = "GRONAU WEST",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9516",
//            stationName = "SOONWALD WEST 1",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9517",
//            stationName = "SOONWALD WEST 2",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9518",
//            stationName = "SOONWALD WEST 3",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9519",
//            stationName = "SOONWALD WEST 4",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9520",
//            stationName = "WONNEGAU WEST 1",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9521",
//            stationName = "WONNEGAU WEST 2",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9522",
//            stationName = "WONNEGAU WEST 3",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9523",
//            stationName = "WONNEGAU WEST 4",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9524",
//            stationName = "WONNEGAU WEST 5",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "F9525",
//            stationName = "BRAUWEILER WEST 1",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9526",
//            stationName = "BRAUWEILER WEST 2",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9527",
//            stationName = "WALBERBERG WEST",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9528",
//            stationName = "VILLE OST 1",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9529",
//            stationName = "VILLE OST 2",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "F9530",
//            stationName = "KUGELBERG O. / W. 1",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9531",
//            stationName = "KUGELBERG O. / W. 2",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "F9532", stationName = "KUGELBERG O. / W. 3", region = "Hessen"),
//        WeatherStation(
//            stationId = "F9533",
//            stationName = "KUGELBERG O. / W. 4",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9534",
//            stationName = "KUGELBERG O. / W. 5",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9535",
//            stationName = "KUGELBERG O. / W. 6",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9536",
//            stationName = "KUGELBERG O. / W. 7",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "F9537",
//            stationName = "KUGELBERG O. / W. 8",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(stationId = "F9600", stationName = "HEINERSCHEID", region = "Diekirch"),
//        WeatherStation(stationId = "N9608", stationName = "RENA", region = "Innlandet"),
//        WeatherStation(stationId = "N9610", stationName = "WEIßENFELS", region = "Sachsen-Anhalt"),
//        WeatherStation(
//            stationId = "P0576",
//            stationName = "BLANKENBURG / HARZ",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(stationId = "P0577", stationName = "BLEICHERODE", region = "Thüringen"),
//        WeatherStation(
//            stationId = "P0578",
//            stationName = "HERMSDORF / THUER.",
//            region = "Thüringen"
//        ),
//        WeatherStation(
//            stationId = "P0600",
//            stationName = "VELBERT",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0601",
//            stationName = "WEGBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0602",
//            stationName = "GLADBECK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0603", stationName = "CALW", region = "Baden-Württemberg"),
//        WeatherStation(
//            stationId = "P0604",
//            stationName = "HAGEN-HOHENLIMBURG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0605",
//            stationName = "ENNEPETALSPERRE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0606",
//            stationName = "SCHMALLENBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0607",
//            stationName = "MARSBERG",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0608", stationName = "LANGENAU", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "P0609", stationName = "HARDHEIM", region = "Baden-Württemberg"),
//        WeatherStation(stationId = "P0610", stationName = "WRIEZEN", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "P0616",
//            stationName = "SUEDLOHN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0617",
//            stationName = "WETTRINGEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0618", stationName = "HAFTENKAMP", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0619",
//            stationName = "ENNIGERLOH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0620",
//            stationName = "SCHWARTENBERG",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "P0621", stationName = "BERDEL", region = "Nordrhein-Westfalen"),
//        WeatherStation(stationId = "P0622", stationName = "FREREN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0624", stationName = "SCHIRL", region = "Nordrhein-Westfalen"),
//        WeatherStation(
//            stationId = "P0625",
//            stationName = "DOERENTHE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0626",
//            stationName = "RIESENBECK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0627",
//            stationName = "BEVERGERN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0628", stationName = "MAEKEL", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "P0629",
//            stationName = "TEMMING",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0630",
//            stationName = "HOHENHOLTE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0631",
//            stationName = "OSTBEVERN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0632",
//            stationName = "OSTBEVERN/BROCK",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "P0633",
//            stationName = "OSTBEVERN/UEBERWAS.",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "P0634", stationName = "BOHMTE", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0635", stationName = "LEMFOERDE", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0636", stationName = "LENGERICH", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0637", stationName = "MERZEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0638", stationName = "NEUENKIRCHEN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0639", stationName = "TWIST", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0640", stationName = "NORDHORN", region = "Niedersachsen"),
//        WeatherStation(stationId = "P0642", stationName = "BUTENDI1"),
//        WeatherStation(stationId = "P0643", stationName = "GODEWIN1"),
//        WeatherStation(stationId = "P0644", stationName = "GODEWIN2"),
//        WeatherStation(stationId = "P0645", stationName = "NORDONE1"),
//        WeatherStation(stationId = "P0646", stationName = "SANDBAN1"),
//        WeatherStation(stationId = "P0647", stationName = "NORGRUE1"),
//        WeatherStation(stationId = "P0648", stationName = "VEJAMAT1"),
//        WeatherStation(stationId = "P0649", stationName = "WIKINGR1"),
//        WeatherStation(
//            stationId = "E273 ",
//            stationName = "ROSENGARTEN-KLECKEN",
//            region = "Niedersachsen"
//        ),
//        WeatherStation(stationId = "G201 ", stationName = "BIRKENMOOR", region = "Bayern"),
//        WeatherStation(stationId = "G202 ", stationName = "HOHENROTH", region = "Bayern"),
//        WeatherStation(stationId = "G204 ", stationName = "MARIA-BILDHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "G205 ", stationName = "MARKERSREUTH", region = "Bayern"),
//        WeatherStation(stationId = "G207 ", stationName = "POPPENHOLZ", region = "Bayern"),
//        WeatherStation(stationId = "G208 ", stationName = "EBERTSHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "G210 ", stationName = "BAD STAFFELSTEIN", region = "Bayern"),
//        WeatherStation(stationId = "G211 ", stationName = "SCHOELLKRIPPEN", region = "Bayern"),
//        WeatherStation(stationId = "G213 ", stationName = "BRAUNERSGRUEN", region = "Bayern"),
//        WeatherStation(stationId = "G214 ", stationName = "KOESLAU", region = "Bayern"),
//        WeatherStation(stationId = "G216 ", stationName = "GROSSZIEGENFELD", region = "Bayern"),
//        WeatherStation(stationId = "G219 ", stationName = "WIESENGIECH", region = "Bayern"),
//        WeatherStation(stationId = "G220 ", stationName = "STEINFELD", region = "Bayern"),
//        WeatherStation(stationId = "G222 ", stationName = "GROSSOSTHEIM", region = "Bayern"),
//        WeatherStation(stationId = "G223 ", stationName = "WADENBRUNN", region = "Bayern"),
//        WeatherStation(stationId = "G225 ", stationName = "MISTELBACH", region = "Bayern"),
//        WeatherStation(stationId = "G226 ", stationName = "AUFSESS", region = "Bayern"),
//        WeatherStation(stationId = "G228 ", stationName = "KEMNATH", region = "Bayern"),
//        WeatherStation(stationId = "G229 ", stationName = "SELIGENSTADT", region = "Bayern"),
//        WeatherStation(stationId = "G231 ", stationName = "VEITSHOECHHEIM", region = "Bayern"),
//        WeatherStation(stationId = "G235 ", stationName = "KONNERSREUTH", region = "Bayern"),
//        WeatherStation(stationId = "G237 ", stationName = "SCHWARZENAU", region = "Bayern"),
//        WeatherStation(stationId = "G240 ", stationName = "GERBRUNN", region = "Bayern"),
//        WeatherStation(stationId = "G241 ", stationName = "HELMSTADT", region = "Bayern"),
//        WeatherStation(stationId = "G243 ", stationName = "BAMMERSDORF", region = "Bayern"),
//        WeatherStation(stationId = "G244 ", stationName = "RANDERSACKER", region = "Bayern"),
//        WeatherStation(stationId = "G246 ", stationName = "IPHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "G247 ", stationName = "BUERGSTADT", region = "Bayern"),
//        WeatherStation(
//            stationId = "G249 ",
//            stationName = "HOECHSTADT A.D. AISC",
//            region = "Bayern"
//        ),
//        WeatherStation(stationId = "G250 ", stationName = "DIETZHOF", region = "Bayern"),
//        WeatherStation(stationId = "G253 ", stationName = "HILTPOLTSTEIN", region = "Bayern"),
//        WeatherStation(stationId = "G255 ", stationName = "HEPPDIEL", region = "Bayern"),
//        WeatherStation(stationId = "G256 ", stationName = "EUERHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "G258 ", stationName = "EDELSFELD", region = "Bayern"),
//        WeatherStation(stationId = "G259 ", stationName = "SOELLITZ", region = "Bayern"),
//        WeatherStation(stationId = "G261 ", stationName = "KAUBENHEIM", region = "Bayern"),
//        WeatherStation(stationId = "G262 ", stationName = "NEUHERBERG", region = "Bayern"),
//        WeatherStation(stationId = "G265 ", stationName = "GREIMERSDORF", region = "Bayern"),
//        WeatherStation(stationId = "G270 ", stationName = "ANFELDEN", region = "Bayern"),
//        WeatherStation(stationId = "G271 ", stationName = "WULLNHOF", region = "Bayern"),
//        WeatherStation(stationId = "G273 ", stationName = "IRRENLOHE", region = "Bayern"),
//        WeatherStation(stationId = "G274 ", stationName = "BONNHOF", region = "Bayern"),
//        WeatherStation(stationId = "G276 ", stationName = "HARTENHOF", region = "Bayern"),
//        WeatherStation(stationId = "G277 ", stationName = "KITZENRIED", region = "Bayern"),
//        WeatherStation(stationId = "G279 ", stationName = "SCHATTENHOF", region = "Bayern"),
//        WeatherStation(stationId = "G280 ", stationName = "SOMMERTSHOF", region = "Bayern"),
//        WeatherStation(stationId = "G283 ", stationName = "ROECKERSBUEHL", region = "Bayern"),
//        WeatherStation(stationId = "G285 ", stationName = "POESING", region = "Bayern"),
//        WeatherStation(stationId = "G286 ", stationName = "OBERSTEINBACH", region = "Bayern"),
//        WeatherStation(stationId = "G294 ", stationName = "EISERSZELL", region = "Bayern"),
//        WeatherStation(stationId = "G295 ", stationName = "EIERSDORF", region = "Bayern"),
//        WeatherStation(stationId = "G297 ", stationName = "FRANKENHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "G298 ", stationName = "SARCHING", region = "Bayern"),
//        WeatherStation(stationId = "G300 ", stationName = "STEINACH", region = "Bayern"),
//        WeatherStation(stationId = "G301 ", stationName = "KOEFERING", region = "Bayern"),
//        WeatherStation(stationId = "G303 ", stationName = "KIRCHBERG IM WALD", region = "Bayern"),
//        WeatherStation(stationId = "G306 ", stationName = "WALLERSTEIN", region = "Bayern"),
//        WeatherStation(stationId = "G307 ", stationName = "KALTENBERG", region = "Bayern"),
//        WeatherStation(stationId = "G309 ", stationName = "SANDHARLANDEN", region = "Bayern"),
//        WeatherStation(stationId = "G313 ", stationName = "UTTENKOFEN", region = "Bayern"),
//        WeatherStation(stationId = "G315 ", stationName = "NEUHOF", region = "Bayern"),
//        WeatherStation(stationId = "G318 ", stationName = "BURGHEIM", region = "Bayern"),
//        WeatherStation(stationId = "G321 ", stationName = "FEISTENAICH", region = "Bayern"),
//        WeatherStation(stationId = "G322 ", stationName = "NEUSLING", region = "Bayern"),
//        WeatherStation(stationId = "G324 ", stationName = "KRINGELL", region = "Bayern"),
//        WeatherStation(stationId = "G325 ", stationName = "KARLSHULD", region = "Bayern"),
//        WeatherStation(stationId = "G327 ", stationName = "STADELHOF", region = "Bayern"),
//        WeatherStation(stationId = "G328 ", stationName = "DIETRICHSDORF", region = "Bayern"),
//        WeatherStation(stationId = "G330 ", stationName = "STEINBEISSEN", region = "Bayern"),
//        WeatherStation(stationId = "G331 ", stationName = "EDELSHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "G333 ", stationName = "HUELL", region = "Bayern"),
//        WeatherStation(stationId = "G334 ", stationName = "FRAUENRIEDHAUSEN", region = "Bayern"),
//        WeatherStation(stationId = "G337 ", stationName = "KINZESBERG", region = "Bayern"),
//        WeatherStation(stationId = "G339 ", stationName = "SCHOENBRUNN", region = "Bayern"),
//        WeatherStation(stationId = "G340 ", stationName = "AINERTSHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "G342 ", stationName = "WEISSINGEN", region = "Bayern"),
//        WeatherStation(stationId = "G343 ", stationName = "ENGERSDORF", region = "Bayern"),
//        WeatherStation(stationId = "G345 ", stationName = "HALDENWANG", region = "Bayern"),
//        WeatherStation(stationId = "G346 ", stationName = "JETZENDORF", region = "Bayern"),
//        WeatherStation(stationId = "G348 ", stationName = "BUERG", region = "Bayern"),
//        WeatherStation(stationId = "G352 ", stationName = "BAERNAU", region = "Bayern"),
//        WeatherStation(stationId = "G354 ", stationName = "ROTTHALMUENSTER", region = "Bayern"),
//        WeatherStation(stationId = "G355 ", stationName = "FRANKENDORF", region = "Bayern"),
//        WeatherStation(stationId = "G357 ", stationName = "FRIEDING", region = "Bayern"),
//        WeatherStation(stationId = "G358 ", stationName = "GROSSBERGHOFEN", region = "Bayern"),
//        WeatherStation(stationId = "G360 ", stationName = "EICHENRIED", region = "Bayern"),
//        WeatherStation(stationId = "G363 ", stationName = "DUERABUCH", region = "Bayern"),
//        WeatherStation(stationId = "G364 ", stationName = "RESCHENBERG", region = "Bayern"),
//        WeatherStation(stationId = "G367 ", stationName = "ASEN", region = "Bayern"),
//        WeatherStation(stationId = "G369 ", stationName = "SCHWABMUENCHEN", region = "Bayern"),
//        WeatherStation(stationId = "G372 ", stationName = "KIRCHHEIM", region = "Bayern"),
//        WeatherStation(stationId = "G373 ", stationName = "FORSTING", region = "Bayern"),
//        WeatherStation(stationId = "G375 ", stationName = "GUT HUELL", region = "Bayern"),
//        WeatherStation(stationId = "G376 ", stationName = "BERGHAM", region = "Bayern"),
//        WeatherStation(stationId = "G378 ", stationName = "OSTERSEEON", region = "Bayern"),
//        WeatherStation(stationId = "G384 ", stationName = "NILLING", region = "Bayern"),
//        WeatherStation(stationId = "G385 ", stationName = "ROTHENFELD", region = "Bayern"),
//        WeatherStation(stationId = "G387 ", stationName = "LAUTRACH", region = "Bayern"),
//        WeatherStation(stationId = "G391 ", stationName = "OBERSOECHERING", region = "Bayern"),
//        WeatherStation(stationId = "G394 ", stationName = "SCHOENAU", region = "Bayern"),
//        WeatherStation(stationId = "G396 ", stationName = "STREITELSFINGEN", region = "Bayern"),
//        WeatherStation(stationId = "G397 ", stationName = "SCHWAND", region = "Bayern"),
//        WeatherStation(
//            stationId = "H176 ",
//            stationName = "KALLETAL NIEDERMEIEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H250 ",
//            stationName = "SENDENHORST_N",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H316 ",
//            stationName = "RAESFELD KA",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H375 ",
//            stationName = "LICHTENAU",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H566 ",
//            stationName = "MENDEN_LENDRINGSEN",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H764 ",
//            stationName = "ROTHE FURTH",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H789 ",
//            stationName = "BREITENBACHTALSPERRE",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H813 ",
//            stationName = "ESCHWEILER N",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H840 ",
//            stationName = "BORNHEIM EICHENKAMP",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(
//            stationId = "H910 ",
//            stationName = "SIMMERATH N",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "J623 ", stationName = "DIFFERTEN", region = "Saarland"),
//        WeatherStation(stationId = "J736 ", stationName = "BALTERSWEILER", region = "Saarland"),
//        WeatherStation(stationId = "J739 ", stationName = "BACHEM", region = "Saarland"),
//        WeatherStation(stationId = "J927 ", stationName = "RIESWEILER", region = "Grand Est"),
//        WeatherStation(stationId = "K060 ", stationName = "MAROTH", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K082 ", stationName = "HERDORF", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K099 ",
//            stationName = "LIEBENSCHEID",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K242 ", stationName = "ADENAU", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K376 ",
//            stationName = "GONDERSHAUSEN",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K399 ", stationName = "BERGHAUSEN", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K418 ",
//            stationName = "KÖRPERICH-GAYTALPARK",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K450 ", stationName = "NEEF", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K550 ", stationName = "ENTENPFUHL", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K552 ", stationName = "GAUCHSBERG", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K626 ", stationName = "HERMESKEIL", region = "Rheinland-Pfalz"),
//        WeatherStation(
//            stationId = "K748 ",
//            stationName = "MARTINSHÖHE",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(
//            stationId = "K756 ",
//            stationName = "FRANKELBACH",
//            region = "Rheinland-Pfalz"
//        ),
//        WeatherStation(stationId = "K931 ", stationName = "HORTENKOPF", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "K996 ", stationName = "SCHAIDT", region = "Rheinland-Pfalz"),
//        WeatherStation(stationId = "L244 ", stationName = "GUDENSBERG", region = "Hessen"),
//        WeatherStation(
//            stationId = "L314 ",
//            stationName = "ANGELBURG-FRECHENHAU",
//            region = "Hessen"
//        ),
//        WeatherStation(stationId = "L391 ", stationName = "BEBRA", region = "Hessen"),
//        WeatherStation(stationId = "L543 ", stationName = "GRÜNBERG", region = "Hessen"),
//        WeatherStation(stationId = "L562 ", stationName = "FREIENSTEINAU", region = "Hessen"),
//        WeatherStation(
//            stationId = "L595 ",
//            stationName = "GERSFELD_(RHÖN)-DALH",
//            region = "Hessen"
//        ),
//        WeatherStation(stationId = "L643 ", stationName = "NIDDA-KLÄRANLAGE", region = "Hessen"),
//        WeatherStation(stationId = "L731 ", stationName = "USINGEN", region = "Hessen"),
//        WeatherStation(stationId = "L769 ", stationName = "FREIGERICHT-HORBACH", region = "Hessen"),
//        WeatherStation(stationId = "L918 ", stationName = "LORSCH-KLÄRANLAGE", region = "Hessen"),
//        WeatherStation(
//            stationId = "M439 ",
//            stationName = "BERKA, BAD (FLUGPLAT",
//            region = "Thüringen"
//        ),
//        WeatherStation(
//            stationId = "N769 ",
//            stationName = "LAUCHSTAEDT, BAD",
//            region = "Sachsen-Anhalt"
//        ),
//        WeatherStation(
//            stationId = "Q824 ",
//            stationName = "DACHSBERG-WOLPADINGE",
//            region = "Baden-Württemberg"
//        ),
//        WeatherStation(
//            stationId = "X479 ",
//            stationName = "MIDDELHAGEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X480 ",
//            stationName = "BLANDOW",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X481 ",
//            stationName = "BOHLENDORF",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X482 ",
//            stationName = "GNOIEN",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "X483 ",
//            stationName = "HOEXTER",
//            region = "Nordrhein-Westfalen"
//        ),
//        WeatherStation(stationId = "X484 ", stationName = "HOGFGEISMAR", region = "Hessen"),
//        WeatherStation(stationId = "X485 ", stationName = "BEVERN", region = "Niedersachsen"),
//        WeatherStation(
//            stationId = "X486 ",
//            stationName = "ORANIENBURG-STADT",
//            region = "Brandenburg"
//        ),
//        WeatherStation(stationId = "Z901 ", stationName = "HOERMOOS", region = "Bayern"),
//        WeatherStation(stationId = "Z902 ", stationName = "HOCHGRATBAHN", region = "Bayern"),
//        WeatherStation(stationId = "Z904 ", stationName = "KANZELWAND", region = "Vorarlberg"),
//        WeatherStation(stationId = "Z905 ", stationName = "FELLHORN", region = "Bayern"),
//        WeatherStation(stationId = "Z907 ", stationName = "NEBELHORN", region = "Bayern"),
//        WeatherStation(stationId = "Z908 ", stationName = "NEBELHORN-KOBLAT", region = "Bayern"),
//        WeatherStation(stationId = "Z909 ", stationName = "SCHWARZENBERG", region = "Bayern"),
//        WeatherStation(stationId = "Z910 ", stationName = "TEGELBERG-RUECKEN", region = "Bayern"),
//        WeatherStation(stationId = "Z911 ", stationName = "TEGELBERGBAHN", region = "Bayern"),
//        WeatherStation(stationId = "Z912 ", stationName = "TEGELBERG", region = "Bayern"),
//        WeatherStation(stationId = "Z914 ", stationName = "ZUGSPITZPLATT", region = "Bayern"),
//        WeatherStation(stationId = "Z916 ", stationName = "PUERSCHLING", region = "Bayern"),
//        WeatherStation(stationId = "Z917 ", stationName = "OSTERFELDER", region = "Bayern"),
//        WeatherStation(stationId = "Z919 ", stationName = "KRANZBERG", region = "Bayern"),
//        WeatherStation(stationId = "Z920 ", stationName = "MARCHKLAMM TAL"),
//        WeatherStation(stationId = "Z921 ", stationName = "MARCHKLAMM", region = "Tirol"),
//        WeatherStation(stationId = "Z922 ", stationName = "BRUNNSTEINSPITZE", region = "Tirol"),
//        WeatherStation(stationId = "Z923 ", stationName = "LINDERSPITZE-RINNE", region = "Tirol"),
//        WeatherStation(stationId = "Z924 ", stationName = "LINDERSPITZE", region = "Tirol"),
//        WeatherStation(stationId = "Z925 ", stationName = "FAHRENBERG", region = "Bayern"),
//        WeatherStation(stationId = "Z926 ", stationName = "HERZOGSTANDBAHN", region = "Bayern"),
//        WeatherStation(stationId = "Z928 ", stationName = "SCHROEDELSTEIN", region = "Bayern"),
//        WeatherStation(stationId = "Z929 ", stationName = "BRAUNECK", region = "Bayern"),
//        WeatherStation(stationId = "Z931 ", stationName = "BRECHERSPITZE", region = "Bayern"),
//        WeatherStation(stationId = "Z932 ", stationName = "SPITZINGSEE", region = "Bayern"),
//        WeatherStation(stationId = "Z934 ", stationName = "WENDELSTEIN-SOIN", region = "Bayern"),
//        WeatherStation(stationId = "Z936 ", stationName = "MOESLARNALM", region = "Bayern"),
//        WeatherStation(stationId = "Z937 ", stationName = "KAMPENWAND", region = "Bayern"),
//        WeatherStation(stationId = "Z939 ", stationName = "DUERRNBACHHORN", region = "Bayern"),
//        WeatherStation(stationId = "Z940 ", stationName = "RAUSCHBERG", region = "Bayern"),
//        WeatherStation(stationId = "Z942 ", stationName = "WARTSTEINKOPF", region = "Bayern"),
//        WeatherStation(stationId = "Z943 ", stationName = "REITERALPE", region = "Bayern"),
//        WeatherStation(stationId = "Z944 ", stationName = "WARTSTEINHUETTE", region = "Bayern"),
//        WeatherStation(stationId = "Z946 ", stationName = "KUEHROINT", region = "Bayern"),
//        WeatherStation(stationId = "Z947 ", stationName = "FUNTENSEETAUERN", region = "Bayern"),
//        WeatherStation(stationId = "Z948 ", stationName = "HOELLGRABEN", region = "Bayern"),
//        WeatherStation(stationId = "Z949 ", stationName = "JENNER", region = "Bayern"),
//        WeatherStation(stationId = "01001", stationName = "JAN MAYEN"),
//        WeatherStation(stationId = "01025", stationName = "TROMSOE", region = "Troms og Finnmark"),
//        WeatherStation(stationId = "01028", stationName = "BJORNOYA", region = "Spitzbergen"),
//        WeatherStation(
//            stationId = "01049",
//            stationName = "ALTA LUFTHAVN",
//            region = "Troms og Finnmark"
//        ),
//        WeatherStation(
//            stationId = "01052",
//            stationName = "HAMMERFEST",
//            region = "Troms og Finnmark"
//        ),
//        WeatherStation(stationId = "01089", stationName = "KIRKENES", region = "Troms og Finnmark"),
//        WeatherStation(
//            stationId = "01092",
//            stationName = "MAKKAUR FYR",
//            region = "Troms og Finnmark"
//        ),
//        WeatherStation(stationId = "01152", stationName = "BODOE", region = "Nordland"),
//        WeatherStation(stationId = "01180", stationName = "HARSTAD", region = "Troms og Finnmark"),
//        WeatherStation(
//            stationId = "01210",
//            stationName = "ALESUND AIRP",
//            region = "Møre og Romsdal"
//        ),
//        WeatherStation(
//            stationId = "01223",
//            stationName = "KRISTIANSUND",
//            region = "Møre og Romsdal"
//        ),
//        WeatherStation(stationId = "01238", stationName = "FOKSTUA 2", region = "Innlandet"),
//        WeatherStation(stationId = "01241", stationName = "ORLAND", region = "Trøndelag"),
//        WeatherStation(stationId = "01271", stationName = "TRONDHEIM", region = "Trøndelag"),
//        WeatherStation(stationId = "01290", stationName = "NAMSOS", region = "Trøndelag"),
//        WeatherStation(stationId = "01366", stationName = "SOGNEFJELL", region = "Innlandet"),
//        WeatherStation(stationId = "01380", stationName = "VENABU", region = "Innlandet"),
//        WeatherStation(
//            stationId = "02049",
//            stationName = "GALLIVARE APT",
//            region = "Norrbottens län"
//        ),
//        WeatherStation(stationId = "02120", stationName = "KVIKKJOKK", region = "Norrbottens län"),
//        WeatherStation(stationId = "02128", stationName = "GUNNARN", region = "Västerbottens län"),
//        WeatherStation(stationId = "02186", stationName = "LULEA", region = "Norrbottens län"),
//        WeatherStation(stationId = "02196", stationName = "HAPARANDA", region = "Lappland"),
//        WeatherStation(stationId = "02226", stationName = "FROSON", region = "Jämtlands län"),
//        WeatherStation(stationId = "02284", stationName = "JAERNAESKLUBB"),
//        WeatherStation(stationId = "02286", stationName = "UMEA", region = "Västerbottens län"),
//        WeatherStation(stationId = "02324", stationName = "SVEG", region = "Jämtlands län"),
//        WeatherStation(
//            stationId = "02355",
//            stationName = "KUGGOEREN AMOS",
//            region = "Gävleborgs län"
//        ),
//        WeatherStation(
//            stationId = "02366",
//            stationName = "TIMRA/MIDLANDA",
//            region = "Västernorrlands län"
//        ),
//        WeatherStation(stationId = "02752", stationName = "KRISTIINANKAUPUNGIN"),
//        WeatherStation(stationId = "02807", stationName = "IVALO", region = "Lappland"),
//        WeatherStation(stationId = "02830", stationName = "KITTILA", region = "Lappland"),
//        WeatherStation(stationId = "02836", stationName = "SODANKYLA", region = "Lappland"),
//        WeatherStation(stationId = "02847", stationName = "ROVANIEMI", region = "Lappland"),
//        WeatherStation(stationId = "02869", stationName = "KUUSAMO", region = "Nordösterbotten"),
//        WeatherStation(stationId = "02876", stationName = "OULU"),
//        WeatherStation(stationId = "02897", stationName = "KAJAANI", region = "Kainuu"),
//        WeatherStation(stationId = "02911", stationName = "VAASA", region = "Österbotten"),
//        WeatherStation(stationId = "02915", stationName = "VIITASAARI", region = "Mittelfinnland"),
//        WeatherStation(stationId = "02917", stationName = "KUOPIO", region = "Nordsavo"),
//        WeatherStation(stationId = "02929", stationName = "JOENSUU APT", region = "Nordkarelien"),
//        WeatherStation(stationId = "02935", stationName = "JYVASKYLA", region = "Mittelfinnland"),
//        WeatherStation(stationId = "02947", stationName = "MIKKELI", region = "Südsavo"),
//        WeatherStation(stationId = "02948", stationName = "SAVONLINNA", region = "Südsavo"),
//        WeatherStation(stationId = "04018", stationName = "KEFLAVIK"),
//        WeatherStation(stationId = "04030", stationName = "REYKJAVIK"),
//        WeatherStation(stationId = "04048", stationName = "VESTMANNAEYJAR"),
//        WeatherStation(stationId = "04063", stationName = "AKUREYRI", region = "Norrbottens län"),
//        WeatherStation(stationId = "04097", stationName = "DALATANGI", region = "Nordland"),
//        WeatherStation(
//            stationId = "04231",
//            stationName = "SONDRESTROMFJORD",
//            region = "Autonomer Kreis der Nenzen"
//        ),
//        WeatherStation(stationId = "04250", stationName = "GODTHAB NUUK", region = "Republik Komi"),
//        WeatherStation(stationId = "04270", stationName = "NARSARSUAQ", region = "Oblast Wologda"),
//        WeatherStation(stationId = "04330", stationName = "DANEBORG"),
//        WeatherStation(
//            stationId = "04339",
//            stationName = "SCORESBYSUND",
//            region = "Troms og Finnmark"
//        ),
//        WeatherStation(stationId = "04360", stationName = "TASIILAQ"),
//        WeatherStation(stationId = "04361", stationName = "KULUSUK"),
//        WeatherStation(stationId = "06011", stationName = "FAROEER"),
//        WeatherStation(stationId = "08501", stationName = "FLORES/AZOREN", region = "Eskişehir"),
//        WeatherStation(stationId = "08505", stationName = "AZOREN", region = "Manisa"),
//        WeatherStation(stationId = "08509", stationName = "LAJES/AZOREN", region = "Izmir"),
//        WeatherStation(stationId = "08515", stationName = "SANTA MARIA"),
//        WeatherStation(stationId = "08521", stationName = "FUNCHAL"),
//        WeatherStation(
//            stationId = "08589",
//            stationName = "CAP VERDEN/PRAIA",
//            region = "Schamal Darfur"
//        ),
//        WeatherStation(stationId = "08594", stationName = "SAL", region = "Ennedi-Massiv"),
//        WeatherStation(stationId = "17038", stationName = "TRABZON", region = "Trabzon"),
//        WeatherStation(stationId = "17096", stationName = "ERZURUM", region = "Erzurum"),
//        WeatherStation(stationId = "17170", stationName = "VAN", region = "Van"),
//        WeatherStation(stationId = "17280", stationName = "DIYARBAKIR", region = "Diyarbakır"),
//        WeatherStation(stationId = "20674", stationName = "OSTROV DIKSON"),
//        WeatherStation(stationId = "21824", stationName = "TIKSI"),
//        WeatherStation(stationId = "22113", stationName = "MURMANSK"),
//        WeatherStation(
//            stationId = "22550",
//            stationName = "ARCHANGELSK",
//            region = "Oblast Archangelsk"
//        ),
//        WeatherStation(stationId = "22583", stationName = "KOJNAS", region = "Oblast Archangelsk"),
//        WeatherStation(
//            stationId = "22802",
//            stationName = "SORTAVALA",
//            region = "Republik Karelien"
//        ),
//        WeatherStation(stationId = "22820", stationName = "PETROSK", region = "Republik Karelien"),
//        WeatherStation(stationId = "23074", stationName = "DUDINKA", region = "Region Krasnojarsk"),
//        WeatherStation(
//            stationId = "23256",
//            stationName = "TAZOVSKOE",
//            region = "Autonomer Kreis der Jamal-Nenzen"
//        ),
//        WeatherStation(
//            stationId = "23330",
//            stationName = "SALEHARD",
//            region = "Autonomer Kreis der Jamal-Nenzen"
//        ),
//        WeatherStation(
//            stationId = "23472",
//            stationName = "TURUHANSK",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(
//            stationId = "23631",
//            stationName = "BEREZOVO",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(
//            stationId = "23734",
//            stationName = "OKTJABRSKOE",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(stationId = "23804", stationName = "SYKTYVKAR", region = "Republik Komi"),
//        WeatherStation(
//            stationId = "23849",
//            stationName = "SURGUT",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(stationId = "24125", stationName = "OLENEK"),
//        WeatherStation(stationId = "24266", stationName = "VERHOJANSK", region = "Oblast Murmansk"),
//        WeatherStation(
//            stationId = "24688",
//            stationName = "OJMJAKON",
//            region = "Oblast Archangelsk"
//        ),
//        WeatherStation(stationId = "24959", stationName = "JAKUTSK", region = "Nordkarelien"),
//        WeatherStation(stationId = "27051", stationName = "TOTMA", region = "Oblast Wologda"),
//        WeatherStation(stationId = "27113", stationName = "CEREPOVEC", region = "Oblast Wologda"),
//        WeatherStation(
//            stationId = "27459",
//            stationName = "NIZHNY NOVGOROD",
//            region = "Oblast de Níjni Novgorod"
//        ),
//        WeatherStation(stationId = "27595", stationName = "KAZAN", region = "Tatarstan"),
//        WeatherStation(stationId = "27612", stationName = "MOSKAU", region = "Moskau"),
//        WeatherStation(stationId = "27719", stationName = "TULA", region = "Oblast Tula"),
//        WeatherStation(stationId = "27730", stationName = "RYAZAN", region = "Oblast Rjasan"),
//        WeatherStation(stationId = "27962", stationName = "PENZA", region = "Oblast Pensa"),
//        WeatherStation(stationId = "28076", stationName = "DEMJANSKOE", region = "Oblast Tjumen"),
//        WeatherStation(stationId = "28382", stationName = "UST-ISIM", region = "Oblast Omsk"),
//        WeatherStation(
//            stationId = "28440",
//            stationName = "EKATERINBURG",
//            region = "Oblast Swerdlowsk"
//        ),
//        WeatherStation(stationId = "28698", stationName = "OMSK", region = "Oblast Omsk"),
//        WeatherStation(stationId = "28722", stationName = "UFA", region = "Baschkortostan"),
//        WeatherStation(stationId = "28807", stationName = "SAMARA", region = "Oblast Samara"),
//        WeatherStation(stationId = "28952", stationName = "KUSTANAI", region = "Qostanai"),
//        WeatherStation(stationId = "29122", stationName = "KARGASOK", region = "Oblast Tomsk"),
//        WeatherStation(stationId = "29430", stationName = "TOMSK", region = "Oblast Tomsk"),
//        WeatherStation(
//            stationId = "29570",
//            stationName = "KRASNOJARSK",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(stationId = "29838", stationName = "BARNAUL", region = "Region Altai"),
//        WeatherStation(
//            stationId = "29846",
//            stationName = "NOVOKUZNETSK",
//            region = "Oblast Kemerowo"
//        ),
//        WeatherStation(stationId = "30054", stationName = "VITIM", region = "Värmlands län"),
//        WeatherStation(stationId = "30253", stationName = "BODAJBO"),
//        WeatherStation(stationId = "30309", stationName = "BRATSK"),
//        WeatherStation(
//            stationId = "30433",
//            stationName = "NIZHNEANGARSK",
//            region = "Region Midtjylland"
//        ),
//        WeatherStation(stationId = "30521", stationName = "ZHIGALOVO"),
//        WeatherStation(stationId = "30710", stationName = "IRKUTSK"),
//        WeatherStation(stationId = "30731", stationName = "GORJACINSK", region = "Niedersachsen"),
//        WeatherStation(stationId = "30758", stationName = "CHITA", region = "Brandenburg"),
//        WeatherStation(stationId = "31088", stationName = "OKHOTSK", region = "Oblast Wologda"),
//        WeatherStation(stationId = "31300", stationName = "ZEJA", region = "Minskaja Woblasz"),
//        WeatherStation(
//            stationId = "31478",
//            stationName = "SOFIJSKIJ PRIISK",
//            region = "Oblast Brjansk"
//        ),
//        WeatherStation(
//            stationId = "31735",
//            stationName = "HABAROVSK",
//            region = "Oblast Dnipropetrowsk"
//        ),
//        WeatherStation(stationId = "31960", stationName = "VLADIVOSTOK"),
//        WeatherStation(stationId = "32053", stationName = "NOGLIKI", region = "Oblast Saratow"),
//        WeatherStation(
//            stationId = "32150",
//            stationName = "JUZHNO-SAKHALINSK",
//            region = "Oblast Rostow"
//        ),
//        WeatherStation(stationId = "32215", stationName = "SEVERO-KURILSK", region = "Aktobe"),
//        WeatherStation(stationId = "32389", stationName = "KLJUCHI", region = "Oblast Swerdlowsk"),
//        WeatherStation(
//            stationId = "32408",
//            stationName = "UST'KAMCHATSK",
//            region = "Oblast Kurgan"
//        ),
//        WeatherStation(stationId = "34123", stationName = "VORONEZ", region = "Oblast Woronesch"),
//        WeatherStation(stationId = "34152", stationName = "BALASHOV", region = "Oblast Saratow"),
//        WeatherStation(stationId = "34519", stationName = "DONETSK", region = "Oblast Donezk"),
//        WeatherStation(stationId = "34560", stationName = "VOLGOGRAD", region = "Oblast Wolgograd"),
//        WeatherStation(stationId = "34880", stationName = "ASTRAHAN", region = "Oblast Astrachan"),
//        WeatherStation(stationId = "34929", stationName = "KRASNODAR", region = "Region Krasnodar"),
//        WeatherStation(stationId = "35108", stationName = "URALSK", region = "Westkasachstan"),
//        WeatherStation(stationId = "35121", stationName = "ORENBURG", region = "Oblast Orenburg"),
//        WeatherStation(stationId = "35188", stationName = "TSELINOGRAD"),
//        WeatherStation(stationId = "35229", stationName = "AKTJUBINSK", region = "Aktobe"),
//        WeatherStation(stationId = "35358", stationName = "TORGAI", region = "Qostanai"),
//        WeatherStation(stationId = "35394", stationName = "KARAGANDA", region = "Qaraghandy"),
//        WeatherStation(stationId = "35746", stationName = "ARAL'SK", region = "Qysylorda"),
//        WeatherStation(stationId = "36870", stationName = "ALMA-ATA"),
//        WeatherStation(stationId = "37171", stationName = "SOTSCHI"),
//        WeatherStation(
//            stationId = "37228",
//            stationName = "WLADIKAVKAZ",
//            region = "Nordossetien-Alanien"
//        ),
//        WeatherStation(stationId = "37788", stationName = "YEREVAN ZVARTNOTS", region = "Armawir"),
//        WeatherStation(stationId = "37864", stationName = "BAKU/BINA"),
//        WeatherStation(stationId = "38353", stationName = "BISHKEK", region = "Gebiet Tschüi"),
//        WeatherStation(stationId = "38457", stationName = "TASCHKENT"),
//        WeatherStation(
//            stationId = "38507",
//            stationName = "KRASNOVODSK",
//            region = "Balkan welaýaty"
//        ),
//        WeatherStation(stationId = "38545", stationName = "DARGANATA", region = "Lebap welaýaty"),
//        WeatherStation(stationId = "38696", stationName = "SAMARKAND", region = "Samarkand"),
//        WeatherStation(
//            stationId = "38836",
//            stationName = "DUSHANBE",
//            region = "Der Republik unterstellte Bezirke"
//        ),
//        WeatherStation(stationId = "38880", stationName = "ASHKHABAD", region = "Ashgabat"),
//        WeatherStation(stationId = "38927", stationName = "TERMEZ", region = "Provinz Surxondaryo"),
//        WeatherStation(stationId = "38954", stationName = "KHOROG", region = "Badachschan"),
//        WeatherStation(stationId = "40061", stationName = "PALMYRA", region = "Gouvernement Homs"),
//        WeatherStation(
//            stationId = "40362",
//            stationName = "RAFHA",
//            region = "Al-Hudud asch-schamaliyya"
//        ),
//        WeatherStation(stationId = "40375", stationName = "TABUK", region = "Provinz Tabuk"),
//        WeatherStation(
//            stationId = "40416",
//            stationName = "DHAHRAN INTL",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "40430", stationName = "AL MADINAH", region = "Provinz Medina"),
//        WeatherStation(
//            stationId = "40437",
//            stationName = "RIAD INT.AIRPORT",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "40438", stationName = "RIYADH", region = "Provinz Riad"),
//        WeatherStation(
//            stationId = "40582",
//            stationName = "KUWAIT",
//            region = "Gouvernement Al Farwaniya"
//        ),
//        WeatherStation(stationId = "40704", stationName = "AHAR", region = "Ost-Aserbaidschan"),
//        WeatherStation(stationId = "40719", stationName = "RASHT", region = "Gilan"),
//        WeatherStation(stationId = "40745", stationName = "MASHHAD", region = "Razavi-Chorasan"),
//        WeatherStation(stationId = "40747", stationName = "SANANDAJ", region = "Kurdestan"),
//        WeatherStation(stationId = "40754", stationName = "TEHERAN", region = "Teheran"),
//        WeatherStation(
//            stationId = "40762",
//            stationName = "TORBAT-HEYDARIEH",
//            region = "Razavi-Chorasan"
//        ),
//        WeatherStation(stationId = "40766", stationName = "KERMANSHAH", region = "Kermānschāh"),
//        WeatherStation(stationId = "40768", stationName = "HAMEDAN", region = "Hamadan"),
//        WeatherStation(stationId = "40794", stationName = "SAFI-ABAD DEZFUL", region = "Chuzestan"),
//        WeatherStation(stationId = "40800", stationName = "ESFAHAN", region = "Isfahan"),
//        WeatherStation(
//            stationId = "40835",
//            stationName = "GACH SARAN DU GUNBA.",
//            region = "Kohgiluye und Boyer Ahmad"
//        ),
//        WeatherStation(stationId = "40848", stationName = "SHIRAZ", region = "Fars"),
//        WeatherStation(stationId = "40854", stationName = "BAM", region = "Kerman"),
//        WeatherStation(stationId = "40875", stationName = "BANDARABBASS", region = "Hormozgan"),
//        WeatherStation(stationId = "40911", stationName = "MAZAR-I-SHARIF", region = "Balch"),
//        WeatherStation(stationId = "40948", stationName = "KABUL/AIRPORT", region = "Kabul"),
//        WeatherStation(
//            stationId = "41024",
//            stationName = "JEDDAH/KING ABDUL",
//            region = "Provinz Mekka"
//        ),
//        WeatherStation(stationId = "41030", stationName = "MAKKAH", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "41150",
//            stationName = "BAHREIN-INT.AIRP.",
//            region = "Gouvernement Muharraq"
//        ),
//        WeatherStation(stationId = "41170", stationName = "DOHA-INT.AIRPORT", region = "Doha"),
//        WeatherStation(
//            stationId = "41184",
//            stationName = "RAS AL KHAIMAH",
//            region = "Ra’s al-Chaima"
//        ),
//        WeatherStation(stationId = "41194", stationName = "DUBAI", region = "Dubai"),
//        WeatherStation(stationId = "41196", stationName = "SHARJAH", region = "Schardscha"),
//        WeatherStation(stationId = "41217", stationName = "ABU DHABI/INTL.", region = "Abu Dhabi"),
//        WeatherStation(stationId = "41218", stationName = "AL AIN AIRPORT", region = "Abu Dhabi"),
//        WeatherStation(stationId = "41240", stationName = "KHASAB"),
//        WeatherStation(stationId = "41242", stationName = "DIBBA", region = "Musandam"),
//        WeatherStation(stationId = "41244", stationName = "BURAIMI", region = "Abu Dhabi"),
//        WeatherStation(
//            stationId = "41246",
//            stationName = "SOHAR MAJIS",
//            region = "Schamal al-Batina"
//        ),
//        WeatherStation(stationId = "41253", stationName = "RUSTAQ", region = "Dschanub al-Batina"),
//        WeatherStation(stationId = "41254", stationName = "SAIQ", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "41255", stationName = "NIZWA", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "41256", stationName = "SEEB-INT.AIRPORT", region = "Maskat"),
//        WeatherStation(stationId = "41257", stationName = "SAMAIL", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "41258", stationName = "QABOOS PORT"),
//        WeatherStation(stationId = "41262", stationName = "FAHUD", region = "az-Zahira"),
//        WeatherStation(stationId = "41263", stationName = "BAHLA", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "41264", stationName = "ADAM", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "41265", stationName = "IBRA", region = "Asch-Scharqiyya"),
//        WeatherStation(stationId = "41267", stationName = "QALHAT", region = "Asch-Scharqiyya"),
//        WeatherStation(
//            stationId = "41268",
//            stationName = "SUR",
//            region = "Dschanub asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "41275", stationName = "QARN ALAM", region = "ad-Dachiliyya"),
//        WeatherStation(
//            stationId = "41288",
//            stationName = "MASIRAH",
//            region = "Dschanub asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "41304", stationName = "MARMUL", region = "Dhofar"),
//        WeatherStation(stationId = "41312", stationName = "RAYSUT PORT", region = "Dhofar"),
//        WeatherStation(stationId = "41314", stationName = "THUMRAIT", region = "Dhofar"),
//        WeatherStation(stationId = "41315", stationName = "QAIROON HAIRITI", region = "Dhofar"),
//        WeatherStation(stationId = "41316", stationName = "SALALAH", region = "Dhofar"),
//        WeatherStation(stationId = "41404", stationName = "SANA'A", region = "Gouvernement Sanaa"),
//        WeatherStation(
//            stationId = "41431",
//            stationName = "HODEIDAH",
//            region = "Gouvernement al-Hudaida"
//        ),
//        WeatherStation(stationId = "41466", stationName = "TAIZ", region = "Gouvernement Ta'izz"),
//        WeatherStation(stationId = "41480", stationName = "ADEN"),
//        WeatherStation(
//            stationId = "41494",
//            stationName = "SOCOTRA",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(stationId = "41571", stationName = "ISLAMABAD", region = "Punjab"),
//        WeatherStation(stationId = "41620", stationName = "ZHOB", region = "Belutschistan"),
//        WeatherStation(stationId = "41640", stationName = "LAHORE CITY", region = "Punjab"),
//        WeatherStation(stationId = "41696", stationName = "KALAT", region = "Belutschistan"),
//        WeatherStation(stationId = "41749", stationName = "NAWABSHAH", region = "Sindh"),
//        WeatherStation(stationId = "41780", stationName = "KARACHI", region = "Sindh"),
//        WeatherStation(stationId = "41923", stationName = "DHAKA", region = "Dhaka"),
//        WeatherStation(stationId = "41950", stationName = "BARISAL", region = "Barishal"),
//        WeatherStation(stationId = "41978", stationName = "CHITTAGONG", region = "Chittagong"),
//        WeatherStation(stationId = "42182", stationName = "NEW DELHI/SAFDARJUNG", region = "Delhi"),
//        WeatherStation(stationId = "42260", stationName = "AGRA", region = "Uttar Pradesh"),
//        WeatherStation(stationId = "42348", stationName = "JAIPUR/SANGANER", region = "Rajasthan"),
//        WeatherStation(stationId = "42369", stationName = "LUCKNOW", region = "Uttar Pradesh"),
//        WeatherStation(
//            stationId = "42475",
//            stationName = "ALLAHABAD/BAMHRAULI",
//            region = "Uttar Pradesh"
//        ),
//        WeatherStation(stationId = "42809", stationName = "CALCUTTA", region = "Westbengalen"),
//        WeatherStation(
//            stationId = "42867",
//            stationName = "NAGPUR SONEGAON",
//            region = "Maharashtra"
//        ),
//        WeatherStation(stationId = "43003", stationName = "BOMBAY AIRPORT", region = "Maharashtra"),
//        WeatherStation(
//            stationId = "43128",
//            stationName = "HYDERABAD AIRPORT",
//            region = "Telangana"
//        ),
//        WeatherStation(stationId = "43279", stationName = "MADRAS", region = "Tamil Nadu"),
//        WeatherStation(stationId = "43296", stationName = "BANGALORE", region = "Karnataka"),
//        WeatherStation(stationId = "43371", stationName = "THIRUVANANTHAPURAM", region = "Kerala"),
//        WeatherStation(stationId = "43450", stationName = "KATUNAYAKE", region = "Westprovinz"),
//        WeatherStation(stationId = "43466", stationName = "COLOMBO", region = "Westprovinz"),
//        WeatherStation(stationId = "43467", stationName = "RATMALANA", region = "Westprovinz"),
//        WeatherStation(stationId = "43555", stationName = "MALE", region = "Malé"),
//        WeatherStation(stationId = "43599", stationName = "GAN"),
//        WeatherStation(stationId = "44275", stationName = "BAYANBULAG", region = "Bajanchongor"),
//        WeatherStation(stationId = "44292", stationName = "ULAAN-BAATOR", region = "Grand Est"),
//        WeatherStation(stationId = "44434", stationName = "POKHARA", region = "Gandaki"),
//        WeatherStation(stationId = "44438", stationName = "BHAIRAWA AIRPORT", region = "Lumbini"),
//        WeatherStation(stationId = "44454", stationName = "KATHMANDU", region = "Bagmati"),
//        WeatherStation(stationId = "45007", stationName = "HONGKONG", region = "Agadez"),
//        WeatherStation(stationId = "45011", stationName = "MACAO", region = "Agadez"),
//        WeatherStation(stationId = "47008", stationName = "CHONGJIN"),
//        WeatherStation(stationId = "47016", stationName = "HYESAN", region = "Istanbul"),
//        WeatherStation(stationId = "47041", stationName = "HAMHEUNG", region = "Balıkesir"),
//        WeatherStation(stationId = "47050", stationName = "ANJU"),
//        WeatherStation(stationId = "47055", stationName = "WONSAN", region = "Izmir"),
//        WeatherStation(stationId = "47058", stationName = "PYONGYANG"),
//        WeatherStation(stationId = "47101", stationName = "CHUNCHON", region = "Aydın"),
//        WeatherStation(stationId = "47105", stationName = "KANGNUNG", region = "Denizli"),
//        WeatherStation(stationId = "47106", stationName = "TONGHAE/RADAR", region = "Denizli"),
//        WeatherStation(stationId = "47108", stationName = "SEOUL"),
//        WeatherStation(stationId = "47114", stationName = "WONJU", region = "Muğla"),
//        WeatherStation(stationId = "47127", stationName = "CHUNGJU"),
//        WeatherStation(stationId = "47133", stationName = "TAEJON"),
//        WeatherStation(stationId = "47136", stationName = "ANDONG"),
//        WeatherStation(stationId = "47138", stationName = "POHANG"),
//        WeatherStation(stationId = "47143", stationName = "TAEGU"),
//        WeatherStation(stationId = "47146", stationName = "CHONJU"),
//        WeatherStation(stationId = "47152", stationName = "ULSAN"),
//        WeatherStation(stationId = "47156", stationName = "KWANGJU"),
//        WeatherStation(stationId = "47189", stationName = "SOGWIPO"),
//        WeatherStation(
//            stationId = "47407",
//            stationName = "ASAHIKAWA",
//            region = "Karatschai-Tscherkessien"
//        ),
//        WeatherStation(stationId = "47412", stationName = "SAPPORO"),
//        WeatherStation(stationId = "47430", stationName = "HAKODATE"),
//        WeatherStation(stationId = "47575", stationName = "AOMORI / HONSHU", region = "Rize"),
//        WeatherStation(stationId = "47584", stationName = "MORIOKA", region = "Erzurum"),
//        WeatherStation(stationId = "47590", stationName = "SENDAI", region = "Diyarbakır"),
//        WeatherStation(stationId = "47598", stationName = "ONAHAMA", region = "Al-Hasaka"),
//        WeatherStation(stationId = "47604", stationName = "NIIGATA", region = "Şanlıurfa"),
//        WeatherStation(stationId = "47610", stationName = "NAGANO", region = "Aleppo"),
//        WeatherStation(stationId = "47618", stationName = "MATSUMOTO", region = "Aleppo"),
//        WeatherStation(
//            stationId = "47662",
//            stationName = "TOKYO NARITA",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(stationId = "47746", stationName = "TOTTORI / HONSHU"),
//        WeatherStation(stationId = "47765", stationName = "HIROSHIMA"),
//        WeatherStation(stationId = "47772", stationName = "OSAKA"),
//        WeatherStation(stationId = "47807", stationName = "FUKUOKA"),
//        WeatherStation(stationId = "47815", stationName = "OITA"),
//        WeatherStation(stationId = "47827", stationName = "KAGOSHIMA"),
//        WeatherStation(stationId = "47830", stationName = "MIYAZAKI"),
//        WeatherStation(stationId = "47893", stationName = "KOCHI"),
//        WeatherStation(stationId = "47895", stationName = "TOKUSHIMA / SHIKOKU"),
//        WeatherStation(stationId = "48042", stationName = "MANDALAY", region = "Mandalay-Division"),
//        WeatherStation(stationId = "48062", stationName = "SITTWE", region = "Rakhaing-Staat"),
//        WeatherStation(stationId = "48097", stationName = "YANGON", region = "Rangun"),
//        WeatherStation(stationId = "48327", stationName = "CHIANG MAI", region = "Chiang Mai"),
//        WeatherStation(stationId = "48429", stationName = "BANGKOK/SUVARNABHUMI", region = "Sahel"),
//        WeatherStation(stationId = "48455", stationName = "BANGKOK", region = "Sahel"),
//        WeatherStation(
//            stationId = "48456",
//            stationName = "BANGKOK/DON MUANG",
//            region = "Tillabéri"
//        ),
//        WeatherStation(stationId = "48461", stationName = "PHATTHAYA", region = "Est"),
//        WeatherStation(
//            stationId = "48475",
//            stationName = "HUA HIN",
//            region = "Prachuap Khiri Khan"
//        ),
//        WeatherStation(stationId = "48550", stationName = "KOH SAMUI", region = "Northern Region"),
//        WeatherStation(stationId = "48564", stationName = "PHUKET", region = "Phuket"),
//        WeatherStation(stationId = "48569", stationName = "HAT YAI", region = "Volta Region"),
//        WeatherStation(stationId = "48601", stationName = "PENANG-BAYANLEPAS"),
//        WeatherStation(stationId = "48620", stationName = "SITIAWAN"),
//        WeatherStation(stationId = "48647", stationName = "KUALA LUMPUR"),
//        WeatherStation(stationId = "48657", stationName = "KUANTAN"),
//        WeatherStation(stationId = "48698", stationName = "SINGAPUR"),
//        WeatherStation(stationId = "48820", stationName = "HANOI", region = "Tamanrasset"),
//        WeatherStation(stationId = "48855", stationName = "DA NANG", region = "Agadez"),
//        WeatherStation(stationId = "48900", stationName = "SAIGON", region = "Kaduna"),
//        WeatherStation(stationId = "48930", stationName = "LUANG-PRABANG", region = "Region Kidal"),
//        WeatherStation(stationId = "48940", stationName = "VIENTIANE", region = "Region Gao"),
//        WeatherStation(stationId = "48966", stationName = "SIEMREAP", region = "Dosso"),
//        WeatherStation(stationId = "48991", stationName = "PHNOM-PENH/POCHENT.", region = "Kebbi"),
//        WeatherStation(
//            stationId = "50774",
//            stationName = "YICHUN (NORTH)",
//            region = "Rajon Rezina"
//        ),
//        WeatherStation(stationId = "50854", stationName = "ANDA", region = "Kreis Harghita"),
//        WeatherStation(stationId = "50953", stationName = "HARBIN", region = "Kreis Vrancea"),
//        WeatherStation(stationId = "51463", stationName = "URUMQI", region = "Xinjiang"),
//        WeatherStation(stationId = "51709", stationName = "KASHI", region = "Xinjiang"),
//        WeatherStation(stationId = "51730", stationName = "ALAR", region = "Xinjiang"),
//        WeatherStation(stationId = "51765", stationName = "TIKANLIK", region = "Xinjiang"),
//        WeatherStation(stationId = "51818", stationName = "PISHAN", region = "Xinjiang"),
//        WeatherStation(stationId = "52436", stationName = "YUMENZHEN", region = "Gansu"),
//        WeatherStation(stationId = "52495", stationName = "BAYAN MOD"),
//        WeatherStation(stationId = "52866", stationName = "XINING"),
//        WeatherStation(stationId = "52889", stationName = "LANZHOU", region = "Bouira"),
//        WeatherStation(stationId = "53487", stationName = "DATONG"),
//        WeatherStation(stationId = "53513", stationName = "LINHE"),
//        WeatherStation(stationId = "53698", stationName = "SHIJIAZHUANG"),
//        WeatherStation(stationId = "53959", stationName = "YUNCHENG"),
//        WeatherStation(
//            stationId = "54102",
//            stationName = "XILINHOT",
//            region = "Gespanschaft Šibenik-Knin"
//        ),
//        WeatherStation(stationId = "54161", stationName = "CHANGCHUNG", region = "Kreis Teleorman"),
//        WeatherStation(stationId = "54218", stationName = "CHIFENG", region = "Gemeinde Bar"),
//        WeatherStation(stationId = "54324", stationName = "CHAOYANG", region = "Qark Dibra"),
//        WeatherStation(stationId = "54342", stationName = "SHENYANG", region = "Blagoewgrad"),
//        WeatherStation(stationId = "54423", stationName = "CHENGDE"),
//        WeatherStation(
//            stationId = "54471",
//            stationName = "YINGKOU",
//            region = "Decentralized Administration of Macedonia and Thrace"
//        ),
//        WeatherStation(stationId = "54497", stationName = "DANDONG"),
//        WeatherStation(stationId = "54511", stationName = "PEKING", region = "Kalabrien"),
//        WeatherStation(stationId = "54527", stationName = "TIANJIN"),
//        WeatherStation(
//            stationId = "54662",
//            stationName = "DALIAN",
//            region = "Decentralized Administration of Thessaly and Central Greece"
//        ),
//        WeatherStation(stationId = "54753", stationName = "LONGKOU"),
//        WeatherStation(stationId = "54823", stationName = "JINAN"),
//        WeatherStation(stationId = "54843", stationName = "WEIFANG"),
//        WeatherStation(stationId = "54857", stationName = "QUINGDAO"),
//        WeatherStation(
//            stationId = "55472",
//            stationName = "XAINZA",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "55578",
//            stationName = "XIGAZE",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "55591",
//            stationName = "LHASA",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "56187", stationName = "WENJIANG", region = "Ghardaia"),
//        WeatherStation(stationId = "56196", stationName = "MIANYANG", region = "Ouargla"),
//        WeatherStation(stationId = "56571", stationName = "XICHANG", region = "Tamanrasset"),
//        WeatherStation(
//            stationId = "56778",
//            stationName = "KUNMING/WUJIABA",
//            region = "Tamanrasset"
//        ),
//        WeatherStation(stationId = "57025", stationName = "FENGXIANG", region = "Tebessa"),
//        WeatherStation(stationId = "57036", stationName = "XI'AN", region = "Gouvernement Gafsa"),
//        WeatherStation(stationId = "57083", stationName = "ZHENGZHOU"),
//        WeatherStation(stationId = "57245", stationName = "ANKANG", region = "Gouvernement Kebili"),
//        WeatherStation(stationId = "57411", stationName = "NANCHONG", region = "Ouargla"),
//        WeatherStation(stationId = "57461", stationName = "YICHANG", region = "Munizip Nalut"),
//        WeatherStation(stationId = "57494", stationName = "WUHAN", region = "Munizip Misrata"),
//        WeatherStation(stationId = "57516", stationName = "CHONGQING", region = "Illizi"),
//        WeatherStation(stationId = "57598", stationName = "YINING", region = "Munizip al-Dschufra"),
//        WeatherStation(stationId = "57662", stationName = "CHANGDE", region = "Munizip Nalut"),
//        WeatherStation(stationId = "57687", stationName = "CHANGSHA", region = "Ash Shati"),
//        WeatherStation(stationId = "57793", stationName = "YICHUN", region = "Ash Shati"),
//        WeatherStation(stationId = "57816", stationName = "GUIYANG", region = "Illizi"),
//        WeatherStation(stationId = "57957", stationName = "GUILIN", region = "Munizip Ghat"),
//        WeatherStation(stationId = "57972", stationName = "CHENZHOU", region = "Murzuk"),
//        WeatherStation(stationId = "58027", stationName = "XUZHOU"),
//        WeatherStation(stationId = "58040", stationName = "GANYU"),
//        WeatherStation(stationId = "58221", stationName = "BENGBU"),
//        WeatherStation(stationId = "58238", stationName = "NANJING"),
//        WeatherStation(
//            stationId = "58362",
//            stationName = "SHANGHAI PUDONG",
//            region = "Munizip al-Mardsch"
//        ),
//        WeatherStation(stationId = "58424", stationName = "ANQING", region = "Munizip Surt"),
//        WeatherStation(stationId = "58457", stationName = "HANGZHOU", region = "Munizip al-Wahat"),
//        WeatherStation(stationId = "58477", stationName = "DINGHAI", region = "Munizip al-Wahat"),
//        WeatherStation(
//            stationId = "58527",
//            stationName = "JINGDEZHEN",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(stationId = "58752", stationName = "RUI'AN", region = "Munizip al-Wahat"),
//        WeatherStation(stationId = "58847", stationName = "FUZHOU", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "58968", stationName = "TAIBEI", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "59046", stationName = "LIUZHOU", region = "Illizi"),
//        WeatherStation(stationId = "59134", stationName = "XIAMEN", region = "Murzuk"),
//        WeatherStation(stationId = "59211", stationName = "BAISE", region = "Tamanrasset"),
//        WeatherStation(stationId = "59287", stationName = "GUANGZHOU", region = "Agadez"),
//        WeatherStation(stationId = "59316", stationName = "SHANTOU", region = "Murzuk"),
//        WeatherStation(stationId = "59431", stationName = "NANNING", region = "Tamanrasset"),
//        WeatherStation(stationId = "59493", stationName = "SHENZHEN HUANGTIAN", region = "Agadez"),
//        WeatherStation(stationId = "59644", stationName = "BEIHAI", region = "Agadez"),
//        WeatherStation(stationId = "59658", stationName = "ZHANJIANG", region = "Agadez"),
//        WeatherStation(stationId = "59663", stationName = "YANGJIANG", region = "Agadez"),
//        WeatherStation(stationId = "59758", stationName = "HAIKOU", region = "Agadez"),
//        WeatherStation(stationId = "59948", stationName = "YA XIAN", region = "Agadez"),
//        WeatherStation(
//            stationId = "60005",
//            stationName = "LA PALMA",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(
//            stationId = "60015",
//            stationName = "TENERIFE NORTE",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(
//            stationId = "60020",
//            stationName = "SANTA CRUZ DE TENE.",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(
//            stationId = "60025",
//            stationName = "TENERIFE SUR",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(stationId = "60030", stationName = "LAS PALMAS", region = "Ash Shati"),
//        WeatherStation(stationId = "60035", stationName = "FUERTEVENTURA", region = "Ash Shati"),
//        WeatherStation(stationId = "60040", stationName = "LANZAROTE", region = "Ash Shati"),
//        WeatherStation(stationId = "60630", stationName = "IN-SALAH", region = "Tamanrasset"),
//        WeatherStation(stationId = "60680", stationName = "TAMANRASSET", region = "Tamanrasset"),
//        WeatherStation(stationId = "61024", stationName = "AGADEZ", region = "Agadez"),
//        WeatherStation(stationId = "61052", stationName = "NIAMEY/DIORI HAMANI", region = "Niger"),
//        WeatherStation(stationId = "61291", stationName = "BAMAKO", region = "Region Sikasso"),
//        WeatherStation(stationId = "61415", stationName = "NOUADHIBOU", region = "Region Tibesti"),
//        WeatherStation(stationId = "61442", stationName = "NOUAKCHOTT", region = "Region Tibesti"),
//        WeatherStation(stationId = "61641", stationName = "DAKAR", region = "Region Barh El Gazel"),
//        WeatherStation(
//            stationId = "61701",
//            stationName = "BANJUL/YUNDUM",
//            region = "Region Barh El Gazel"
//        ),
//        WeatherStation(
//            stationId = "61766",
//            stationName = "BISSAU",
//            region = "Region Chari-Baguirmi"
//        ),
//        WeatherStation(stationId = "61832", stationName = "CONAKRY/GBESSIA", region = "Nord"),
//        WeatherStation(stationId = "61856", stationName = "FREETOWN", region = "Nord"),
//        WeatherStation(stationId = "61901", stationName = "ST. HELENA", region = "Timbuktu"),
//        WeatherStation(stationId = "61902", stationName = "ASCENSION", region = "Provinz Zaire"),
//        WeatherStation(stationId = "61967", stationName = "DIEGO GARCIA"),
//        WeatherStation(stationId = "61980", stationName = "SAINT-DENIS", region = "al-Wusta"),
//        WeatherStation(stationId = "61988", stationName = "RODRIGUES"),
//        WeatherStation(stationId = "61990", stationName = "PLAISANCE", region = "al-Wusta"),
//        WeatherStation(stationId = "62259", stationName = "TAZERBO", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "62405", stationName = "LUXOR", region = "Aswan"),
//        WeatherStation(stationId = "62414", stationName = "ASSUAN", region = "Aswan"),
//        WeatherStation(
//            stationId = "62423",
//            stationName = "FARAFRA",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "62463", stationName = "HURGHADA", region = "Al-Bahr al-ahmar"),
//        WeatherStation(
//            stationId = "62641",
//            stationName = "PORT SUDAN",
//            region = "al-Bahr al-ahmar"
//        ),
//        WeatherStation(stationId = "62721", stationName = "KHARTOUM", region = "al-Chartum"),
//        WeatherStation(stationId = "62730", stationName = "KASSALA", region = "Kassala"),
//        WeatherStation(stationId = "62760", stationName = "EL FASHER", region = "Schamal Darfur"),
//        WeatherStation(stationId = "62790", stationName = "NYALA", region = "Dschanub Darfur"),
//        WeatherStation(stationId = "62941", stationName = "JUBA", region = "Central Equatoria"),
//        WeatherStation(stationId = "63125", stationName = "DJIBOUTI", region = "Dschibuti"),
//        WeatherStation(stationId = "63170", stationName = "HARGEISA", region = "Woqooyi Galbeed"),
//        WeatherStation(stationId = "63175", stationName = "BURAO", region = "Togdheer"),
//        WeatherStation(stationId = "63450", stationName = "ADDIS ABABA", region = "Addis Abeba"),
//        WeatherStation(stationId = "63471", stationName = "DIREDAWA", region = "Dire Dawa"),
//        WeatherStation(stationId = "63658", stationName = "SOROTI", region = "Eastern Region"),
//        WeatherStation(stationId = "63705", stationName = "ENTEBBE", region = "Zentraluganda"),
//        WeatherStation(stationId = "63710", stationName = "KERICHO", region = "Uasin Gishu County"),
//        WeatherStation(stationId = "63733", stationName = "MUSOMA", region = "Eastern Region"),
//        WeatherStation(stationId = "63740", stationName = "NAIROBI", region = "Murang'a County"),
//        WeatherStation(
//            stationId = "63791",
//            stationName = "KILIMANJARO AIRPORT",
//            region = "Kajiado County"
//        ),
//        WeatherStation(stationId = "63820", stationName = "MOMBASA", region = "Mombasa County"),
//        WeatherStation(
//            stationId = "63870",
//            stationName = "ZANZIBAR/KISAUNI",
//            region = "Unguja Kaskazini"
//        ),
//        WeatherStation(stationId = "63894", stationName = "DAR ES SALAAM AIRP."),
//        WeatherStation(stationId = "63980", stationName = "SEYCHELLES INT."),
//        WeatherStation(stationId = "64005", stationName = "MBANDAKA", region = "Équateur"),
//        WeatherStation(
//            stationId = "64210",
//            stationName = "KINSHASA/NDJILI",
//            region = "Brazzaville"
//        ),
//        WeatherStation(stationId = "64220", stationName = "KINSHASA", region = "Brazzaville"),
//        WeatherStation(stationId = "64387", stationName = "KIGALI", region = "Western Region"),
//        WeatherStation(stationId = "64390", stationName = "BUJUMBURA", region = "Cibitoke"),
//        WeatherStation(stationId = "64400", stationName = "POINTE-NOIRE"),
//        WeatherStation(stationId = "64450", stationName = "BRAZZAVILLE", region = "Brazzaville"),
//        WeatherStation(stationId = "64500", stationName = "LIBREVILLE", region = "Ästuar"),
//        WeatherStation(stationId = "64650", stationName = "BANGUI", region = "Erzbistum Bangui"),
//        WeatherStation(
//            stationId = "64700",
//            stationName = "NDJAMENA",
//            region = "Erzbistum N’Djaména"
//        ),
//        WeatherStation(stationId = "64756", stationName = "ABECHE", region = "Wadai"),
//        WeatherStation(stationId = "64910", stationName = "DOUALA", region = "Littoral"),
//        WeatherStation(stationId = "65046", stationName = "KANO", region = "Kano"),
//        WeatherStation(stationId = "65082", stationName = "MAIDUGURI", region = "Borno"),
//        WeatherStation(
//            stationId = "65125",
//            stationName = "ABUJA",
//            region = "Federal Capital Territory"
//        ),
//        WeatherStation(stationId = "65201", stationName = "LAGOS/IKEJA", region = "Lagos"),
//        WeatherStation(stationId = "65344", stationName = "COTONOU", region = "Littoral"),
//        WeatherStation(stationId = "65387", stationName = "LOME", region = "Region Maritime"),
//        WeatherStation(stationId = "65401", stationName = "NAVRONGO", region = "Upper East Region"),
//        WeatherStation(stationId = "65472", stationName = "ACCRA"),
//        WeatherStation(stationId = "65503", stationName = "OUAGADOUGOU", region = "Centre-Est"),
//        WeatherStation(stationId = "65528", stationName = "ODIENNE", region = "Savanes"),
//        WeatherStation(
//            stationId = "65545",
//            stationName = "BONDOUKOU",
//            region = "Brong-Ahafo Region"
//        ),
//        WeatherStation(stationId = "65548", stationName = "MAN", region = "Sassandra-Marahoué"),
//        WeatherStation(stationId = "65557", stationName = "GAGNOA", region = "Lagunes"),
//        WeatherStation(stationId = "65562", stationName = "DIMBOKRO", region = "Comoé"),
//        WeatherStation(stationId = "65578", stationName = "ABIDJAN", region = "Western Region"),
//        WeatherStation(stationId = "66160", stationName = "LUANDA", region = "Provinz Zaire"),
//        WeatherStation(stationId = "67002", stationName = "HAHAYA AIRPORT"),
//        WeatherStation(stationId = "67009", stationName = "DIEGO-SUAREZ"),
//        WeatherStation(
//            stationId = "67027",
//            stationName = "MAJUNGA",
//            region = "Gouvernement Ma'rib"
//        ),
//        WeatherStation(stationId = "67083", stationName = "ANTANANARIVO", region = "Nadschran"),
//        WeatherStation(stationId = "67113", stationName = "MAHANORO", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "67137", stationName = "FIANARANTSOA", region = "Provinz Riad"),
//        WeatherStation(stationId = "67237", stationName = "NAMPULA", region = "Debub"),
//        WeatherStation(stationId = "67295", stationName = "CHIMOIO", region = "Nahr an-Nil"),
//        WeatherStation(stationId = "67315", stationName = "VILANCULOS"),
//        WeatherStation(stationId = "67323", stationName = "INHAMBANE", region = "Al-Bahr al-ahmar"),
//        WeatherStation(
//            stationId = "67341",
//            stationName = "MAPUT0/MAVALANE",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "67561", stationName = "NDOLA", region = "Schamal Kurdufan"),
//        WeatherStation(stationId = "67586", stationName = "LILONGWE", region = "Sannar"),
//        WeatherStation(stationId = "67665", stationName = "LUSAKA", region = "Schamal Kurdufan"),
//        WeatherStation(stationId = "67693", stationName = "CHILEKA", region = "Kassala"),
//        WeatherStation(stationId = "67743", stationName = "LIVINGSTONE", region = "Schamal Darfur"),
//        WeatherStation(stationId = "67761", stationName = "KARIBA", region = "Schamal Kurdufan"),
//        WeatherStation(
//            stationId = "67775",
//            stationName = "HARARE-KUTSAGA",
//            region = "asch-Schamaliyya"
//        ),
//        WeatherStation(
//            stationId = "67843",
//            stationName = "VICTORIA FALLS",
//            region = "Schamal Darfur"
//        ),
//        WeatherStation(
//            stationId = "67853",
//            stationName = "HWANGE NATIONAL PARK",
//            region = "Schamal Darfur"
//        ),
//        WeatherStation(stationId = "67964", stationName = "BULAWAYO", region = "asch-Schamaliyya"),
//        WeatherStation(stationId = "67975", stationName = "MASVINGO", region = "asch-Schamaliyya"),
//        WeatherStation(stationId = "68010", stationName = "OKAUKUEJO", region = "Region Tibesti"),
//        WeatherStation(stationId = "68029", stationName = "KASANE", region = "Schamal Darfur"),
//        WeatherStation(stationId = "68032", stationName = "MAUN", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "68104", stationName = "WALVIS BAY", region = "Murzuk"),
//        WeatherStation(stationId = "68110", stationName = "WINDHUK", region = "Region Tibesti"),
//        WeatherStation(
//            stationId = "68112",
//            stationName = "WINDHOEK HOSEA INTL.",
//            region = "Region Tibesti"
//        ),
//        WeatherStation(
//            stationId = "68174",
//            stationName = "PIETERSBURG",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "68212", stationName = "HARDAP", region = "Murzuk"),
//        WeatherStation(
//            stationId = "68240",
//            stationName = "GABORONE AIRPORT",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(
//            stationId = "68262",
//            stationName = "PRETORIA EENDRACHT",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(
//            stationId = "68296",
//            stationName = "SKUKUZA",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "68300", stationName = "LUDERITZ/DIAZ POINT", region = "Murzuk"),
//        WeatherStation(
//            stationId = "68312",
//            stationName = "KEETMANSHOOP",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(
//            stationId = "68368",
//            stationName = "JOHANNESBURG",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "68438", stationName = "KIMBERLEY", region = "al-Butnan"),
//        WeatherStation(
//            stationId = "68442",
//            stationName = "BLOEMFONTEIN",
//            region = "Gouvernement Matruh"
//        ),
//        WeatherStation(
//            stationId = "68461",
//            stationName = "BETHLEHEM AIRPORT",
//            region = "Al-Dschiza"
//        ),
//        WeatherStation(stationId = "68513", stationName = "KOINGNAAS", region = "Munizip Surt"),
//        WeatherStation(stationId = "68523", stationName = "BRANDVLEI", region = "Munizip al-Wahat"),
//        WeatherStation(
//            stationId = "68558",
//            stationName = "BARKLY EAST",
//            region = "Gouvernement Matruh"
//        ),
//        WeatherStation(stationId = "68588", stationName = "DURBAN", region = "Al-Dschiza"),
//        WeatherStation(stationId = "68647", stationName = "QUEENSTOWN"),
//        WeatherStation(
//            stationId = "68727",
//            stationName = "BEAUFORT WEST",
//            region = "Munizip Darna"
//        ),
//        WeatherStation(stationId = "68816", stationName = "KAPSTADT"),
//        WeatherStation(stationId = "68842", stationName = "PORT ELIZABETH"),
//        WeatherStation(stationId = "68858", stationName = "EAST LONDON"),
//        WeatherStation(
//            stationId = "68906",
//            stationName = "GOUGH ISLAND",
//            region = "Distrikt Viseu"
//        ),
//        WeatherStation(stationId = "68916", stationName = "CAPE POINT"),
//        WeatherStation(stationId = "68928", stationName = "MOSSEL BAY"),
//        WeatherStation(stationId = "68992", stationName = "BOUVET ISLAND"),
//        WeatherStation(stationId = "68994", stationName = "MARION ISLAND"),
//        WeatherStation(stationId = "70026", stationName = "BARROW/W.POST W.ROG."),
//        WeatherStation(
//            stationId = "70200",
//            stationName = "NOME",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(
//            stationId = "70219",
//            stationName = "BETHEL AK",
//            region = "Oblast Swerdlowsk"
//        ),
//        WeatherStation(
//            stationId = "70261",
//            stationName = "FAIRBANKS/INT.",
//            region = "Oblast Archangelsk"
//        ),
//        WeatherStation(
//            stationId = "70273",
//            stationName = "ANCHORAGE INT.",
//            region = "Republik Komi"
//        ),
//        WeatherStation(stationId = "70308", stationName = "ST.PAUL", region = "Oblast Tjumen"),
//        WeatherStation(stationId = "70361", stationName = "YAKUTAT", region = "Oblast Wologda"),
//        WeatherStation(stationId = "70381", stationName = "JUNEAU", region = "Oblast Nowgorod"),
//        WeatherStation(
//            stationId = "71060",
//            stationName = "CAMSELL RIVER N.W.T.",
//            region = "Norrbottens län"
//        ),
//        WeatherStation(stationId = "71066", stationName = "HIGH LEVEL,ALTA."),
//        WeatherStation(stationId = "71078", stationName = "LYNN LAKE MAN."),
//        WeatherStation(
//            stationId = "71090",
//            stationName = "CLYDE N.W.T.",
//            region = "Autonomer Kreis der Jamal-Nenzen"
//        ),
//        WeatherStation(
//            stationId = "71122",
//            stationName = "BANFF,ALTA.",
//            region = "Woiwodschaft Niederschlesien"
//        ),
//        WeatherStation(stationId = "71123", stationName = "EDMONTON INT.", region = "Brandenburg"),
//        WeatherStation(
//            stationId = "71260",
//            stationName = "SAULT STE.MARIE ONT.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "71395", stationName = "HALIFAX INT.", region = "Qysylorda"),
//        WeatherStation(
//            stationId = "71474",
//            stationName = "CLINTON,B.C.",
//            region = "Woiwodschaft Masowien"
//        ),
//        WeatherStation(stationId = "71515", stationName = "DRYDEN", region = "Uws"),
//        WeatherStation(stationId = "71601", stationName = "HALIFAX", region = "Qysylorda"),
//        WeatherStation(stationId = "71621", stationName = "TRENTON", region = "Almaty"),
//        WeatherStation(stationId = "71622", stationName = "BRANTFORD", region = "Xinjiang"),
//        WeatherStation(stationId = "71624", stationName = "TORONTO", region = "Almaty"),
//        WeatherStation(stationId = "71627", stationName = "MONTREAL DORVAL", region = "Schambyl"),
//        WeatherStation(stationId = "71628", stationName = "OTTAWA", region = "Almaty"),
//        WeatherStation(stationId = "71700", stationName = "FREDERICTON", region = "Qysylorda"),
//        WeatherStation(stationId = "71707", stationName = "SYDNEY,N.S.", region = "Qysylorda"),
//        WeatherStation(stationId = "71714", stationName = "QUEBEC,QUE.", region = "Qaraghandy"),
//        WeatherStation(stationId = "71727", stationName = "BAGOTVILLE", region = "Qaraghandy"),
//        WeatherStation(stationId = "71731", stationName = "NORTH BAY", region = "Almaty"),
//        WeatherStation(
//            stationId = "71749",
//            stationName = "THUNDER BAY ONT.",
//            region = "Bajan-Ölgii"
//        ),
//        WeatherStation(stationId = "71801", stationName = "ST.JOHNS NEUFUNDL.", region = "Atyrau"),
//        WeatherStation(stationId = "71803", stationName = "GANDER", region = "Aktobe"),
//        WeatherStation(stationId = "71809", stationName = "DEER LAKE NF.", region = "Aktobe"),
//        WeatherStation(stationId = "71811", stationName = "SEPT-ILES QUE.", region = "Qostanai"),
//        WeatherStation(stationId = "71815", stationName = "STEPHENVILLE NFLD.", region = "Aktobe"),
//        WeatherStation(
//            stationId = "71816",
//            stationName = "GOOSE BAY NF.",
//            region = "Chelyabinskaya Oblast"
//        ),
//        WeatherStation(
//            stationId = "71827",
//            stationName = "LA GRANDE RIVIERE",
//            region = "Oblast Nowosibirsk"
//        ),
//        WeatherStation(
//            stationId = "71828",
//            stationName = "SCHEFFERVILLE QUE.",
//            region = "Oblast Kurgan"
//        ),
//        WeatherStation(stationId = "71849", stationName = "DEER LAKE", region = "Tuwa"),
//        WeatherStation(stationId = "71852", stationName = "WINNIPEG INT.AIRPORT", region = "Tuwa"),
//        WeatherStation(
//            stationId = "71863",
//            stationName = "REGINA SASK.",
//            region = "Wallonische Region"
//        ),
//        WeatherStation(
//            stationId = "71869",
//            stationName = "PRINCE ALBERT SASK.",
//            region = "Friesland"
//        ),
//        WeatherStation(stationId = "71877", stationName = "CALGARY", region = "Sachsen"),
//        WeatherStation(stationId = "71892", stationName = "VANCOUVER", region = "Oblast Lwiw"),
//        WeatherStation(stationId = "71893", stationName = "COMOX B.C.", region = "Oblast Lwiw"),
//        WeatherStation(
//            stationId = "71909",
//            stationName = "IQALUIT",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(
//            stationId = "71911",
//            stationName = "SHEPHERD BAY",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(
//            stationId = "71913",
//            stationName = "CHURCHILL",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(
//            stationId = "71924",
//            stationName = "RESOLUTE",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(stationId = "71925", stationName = "CAMBRIDGE BAY N.W.T."),
//        WeatherStation(
//            stationId = "71926",
//            stationName = "BAKER LAKE N.W.T.",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(stationId = "71934", stationName = "FORT SMITH", region = "Innlandet"),
//        WeatherStation(stationId = "71957", stationName = "INUVIK", region = "Oblast Murmansk"),
//        WeatherStation(
//            stationId = "71966",
//            stationName = "DAWSON,Y.T.",
//            region = "Oblast Archangelsk"
//        ),
//        WeatherStation(stationId = "72201", stationName = "KEY WEST", region = "Madhya Pradesh"),
//        WeatherStation(stationId = "72202", stationName = "MIAMI", region = "Uttar Pradesh"),
//        WeatherStation(
//            stationId = "72203",
//            stationName = "WEST PALM BEACH",
//            region = "Uttar Pradesh"
//        ),
//        WeatherStation(stationId = "72205", stationName = "ORLANDO /JETPORT", region = "Lumbini"),
//        WeatherStation(
//            stationId = "72206",
//            stationName = "JACKSONVILLE",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72208",
//            stationName = "CHARLESTON",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "72211", stationName = "TAMPA", region = "Lumbini"),
//        WeatherStation(
//            stationId = "72214",
//            stationName = "TALLAHASSEE",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72218",
//            stationName = "AUGUSTA BUSH FLD.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72219",
//            stationName = "ATLANTA GA.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72223",
//            stationName = "MOBILE/BATES F. AL.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72226",
//            stationName = "MONTGOMERY",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72231",
//            stationName = "NEW ORLEANS",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72243",
//            stationName = "HOUSTON TX.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72250",
//            stationName = "BROWNSVILLE/TX.",
//            region = "Kachin-Staat"
//        ),
//        WeatherStation(
//            stationId = "72253",
//            stationName = "SAN ANTONIO INT.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72254",
//            stationName = "AUSTIN",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "72259", stationName = "DALLAS", region = "Qinghai"),
//        WeatherStation(stationId = "72261", stationName = "DEL RIO", region = "Adrar"),
//        WeatherStation(stationId = "72266", stationName = "ABILENE/MUN. 18.", region = "Sichuan"),
//        WeatherStation(stationId = "72267", stationName = "LUBBOCK 18.", region = "El Bayadh"),
//        WeatherStation(stationId = "72270", stationName = "EL PASO INT.", region = "Ouargla"),
//        WeatherStation(stationId = "72274", stationName = "TUCSON INT.", region = "Munizip Nalut"),
//        WeatherStation(stationId = "72278", stationName = "PHOENIX AZ."),
//        WeatherStation(stationId = "72290", stationName = "SAN DIEGO/LINGBERG"),
//        WeatherStation(stationId = "72295", stationName = "LOS ANGELES"),
//        WeatherStation(stationId = "72304", stationName = "CAPE HATTERAS, NC."),
//        WeatherStation(stationId = "72306", stationName = "RALEIGH/DURHAM NC."),
//        WeatherStation(stationId = "72308", stationName = "NORFOLK/INT.,VA.", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72314",
//            stationName = "CHARLOTTE/DOUG. NC",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72315",
//            stationName = "ASHEVILLE/MUN.,NC.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72327",
//            stationName = "NASHVILLE INT.",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "72334", stationName = "MEMPHIS", region = "Qinghai"),
//        WeatherStation(stationId = "72340", stationName = "NORTH LITTLE ROCK", region = "Qinghai"),
//        WeatherStation(stationId = "72351", stationName = "WICHITA FALLS 18.", region = "Qinghai"),
//        WeatherStation(stationId = "72353", stationName = "OKLAHOMA CITY", region = "Qinghai"),
//        WeatherStation(stationId = "72365", stationName = "ALBUQUERQUE INT.", region = "Khenchela"),
//        WeatherStation(stationId = "72370", stationName = "KINGMAN/MOHAVE,AZ."),
//        WeatherStation(stationId = "72374", stationName = "WINSLOW", region = "sfaks"),
//        WeatherStation(stationId = "72376", stationName = "FLAGSTAFF AZ."),
//        WeatherStation(stationId = "72386", stationName = "LAS VEGAS/MCCARRAN"),
//        WeatherStation(stationId = "72389", stationName = "FRESNO/AIR TERM."),
//        WeatherStation(stationId = "72403", stationName = "WASHINGTON/DULLES", region = "Xinjiang"),
//        WeatherStation(stationId = "72405", stationName = "WASHINGTON", region = "Xinjiang"),
//        WeatherStation(stationId = "72406", stationName = "BALTIMORE", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72407",
//            stationName = "ATLANTIC CITY INT.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72408", stationName = "PHILADELPHIA INT.", region = "Xinjiang"),
//        WeatherStation(stationId = "72411", stationName = "ROANOKE/MUN. VA.", region = "Xinjiang"),
//        WeatherStation(stationId = "72421", stationName = "CINCINNATI OH.", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72423",
//            stationName = "LOUISVILLE/STAND.KY.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72434", stationName = "ST. LOUIS", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72438",
//            stationName = "INDIANAPOLIS IN/W.C.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72446", stationName = "KANSAS CITY", region = "Gansu"),
//        WeatherStation(stationId = "72451", stationName = "DODGE CITY/MUN.KS.", region = "Qinghai"),
//        WeatherStation(
//            stationId = "72476",
//            stationName = "GRAND JUNCTION,CO.",
//            region = "Sardinien"
//        ),
//        WeatherStation(stationId = "72487", stationName = "CALIENTE,NV.", region = "Sizilien"),
//        WeatherStation(stationId = "72488", stationName = "RENO"),
//        WeatherStation(
//            stationId = "72492",
//            stationName = "STOCKTON METRO. CA.",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(
//            stationId = "72494",
//            stationName = "SAN FRANCISCO",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(stationId = "72502", stationName = "NEWARK", region = "Dschalalabat"),
//        WeatherStation(stationId = "72503", stationName = "NEW YORK", region = "Dschalalabat"),
//        WeatherStation(stationId = "72509", stationName = "BOSTON MA.", region = "Gebiet Talas"),
//        WeatherStation(
//            stationId = "72519",
//            stationName = "SYRACUSE/HANCOCK NY.",
//            region = "Almaty"
//        ),
//        WeatherStation(stationId = "72520", stationName = "PITTSBURGH INT.", region = "Xinjiang"),
//        WeatherStation(stationId = "72524", stationName = "CLEVELAND", region = "Xinjiang"),
//        WeatherStation(stationId = "72528", stationName = "BUFFALO INT.,NY.", region = "Almaty"),
//        WeatherStation(stationId = "72530", stationName = "CHICAGO", region = "Xinjiang"),
//        WeatherStation(stationId = "72537", stationName = "DETROIT", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72546",
//            stationName = "DES MOINES/MUN. IA.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72547", stationName = "DUBUQUE/MUN. IA.", region = "Xinjiang"),
//        WeatherStation(stationId = "72564", stationName = "CHEYENNE WY."),
//        WeatherStation(stationId = "72565", stationName = "DENVER INT."),
//        WeatherStation(stationId = "72570", stationName = "CRAIG-MOFFAT,CO."),
//        WeatherStation(stationId = "72572", stationName = "SALT LAKE CITY"),
//        WeatherStation(
//            stationId = "72594",
//            stationName = "EUREKA CA.",
//            region = "Decentralized Administration of Macedonia and Thrace"
//        ),
//        WeatherStation(stationId = "72606", stationName = "PORTLAND INT.", region = "Schambyl"),
//        WeatherStation(
//            stationId = "72617",
//            stationName = "BURLINGTON/INT. VT.",
//            region = "Schambyl"
//        ),
//        WeatherStation(stationId = "72640", stationName = "MILWAUKEE", region = "Xinjiang"),
//        WeatherStation(stationId = "72658", stationName = "MINNEAPOLIS", region = "Xinjiang"),
//        WeatherStation(stationId = "72662", stationName = "RAPID CITY", region = "Okzitanien"),
//        WeatherStation(
//            stationId = "72681",
//            stationName = "BOISE/MUN. ID.",
//            region = "Gespanschaft Split-Dalmatien"
//        ),
//        WeatherStation(
//            stationId = "72698",
//            stationName = "PORTLAND/INT. OR.",
//            region = "Eisenmarkt"
//        ),
//        WeatherStation(
//            stationId = "72734",
//            stationName = "SAULT STE.MARIE MI.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72745", stationName = "DULUTH INT.", region = "Chowd-Aimag"),
//        WeatherStation(
//            stationId = "72753",
//            stationName = "FARGO/HECTOR F. ND.",
//            region = "Dsawchan-Aimag"
//        ),
//        WeatherStation(
//            stationId = "72764",
//            stationName = "BISMARCK/MUN. ND.",
//            region = "Nouvelle-Aquitaine"
//        ),
//        WeatherStation(
//            stationId = "72779",
//            stationName = "KALISPELL,MT.",
//            region = "Oberösterreich"
//        ),
//        WeatherStation(stationId = "72781", stationName = "YAKIMA WA.", region = "Csongrád"),
//        WeatherStation(
//            stationId = "72785",
//            stationName = "SPOKANE/INT. WA.",
//            region = "Győr-Moson-Sopron"
//        ),
//        WeatherStation(stationId = "72793", stationName = "SEATTLE", region = "Kreis Bihor"),
//        WeatherStation(
//            stationId = "74486",
//            stationName = "NEW YORK JOHN F.K.",
//            region = "Dschalalabat"
//        ),
//        WeatherStation(stationId = "76225", stationName = "CHIHUAHUA", region = "Illizi"),
//        WeatherStation(stationId = "76405", stationName = "LA PAZ (MEX.)", region = "Illizi"),
//        WeatherStation(stationId = "76548", stationName = "TAMPICO", region = "Shan-Staat"),
//        WeatherStation(stationId = "76612", stationName = "GUADALAJARA", region = "Tamanrasset"),
//        WeatherStation(stationId = "76644", stationName = "AEROP.INT. MERIDA"),
//        WeatherStation(stationId = "76654", stationName = "MANZANILLO,COL.", region = "Agadez"),
//        WeatherStation(stationId = "76680", stationName = "MEXICO CITY", region = "Chiang Mai"),
//        WeatherStation(stationId = "76692", stationName = "VERACRUZ", region = "Bago-Division"),
//        WeatherStation(stationId = "76743", stationName = "VILLAHERMOSA"),
//        WeatherStation(stationId = "76805", stationName = "ACAPULCO", region = "Sukhothai"),
//        WeatherStation(stationId = "78016", stationName = "BERMUDA NAVAL", region = "Helmand"),
//        WeatherStation(stationId = "78073", stationName = "NASSAU", region = "Madhya Pradesh"),
//        WeatherStation(stationId = "78224", stationName = "HAVANNA", region = "Chhattisgarh"),
//        WeatherStation(stationId = "78229", stationName = "VARADERO", region = "Madhya Pradesh"),
//        WeatherStation(
//            stationId = "78264",
//            stationName = "SANTIAGO DE CUBA",
//            region = "Maharashtra"
//        ),
//        WeatherStation(stationId = "78325", stationName = "CASA BLANCA", region = "Chhattisgarh"),
//        WeatherStation(stationId = "78344", stationName = "CIENFUEGOS", region = "Madhya Pradesh"),
//        WeatherStation(
//            stationId = "78388",
//            stationName = "MONT.BAY-SANGSTER",
//            region = "Telangana"
//        ),
//        WeatherStation(stationId = "78397", stationName = "KINGSTON", region = "Maharashtra"),
//        WeatherStation(stationId = "78439", stationName = "PORT AU PRINCE"),
//        WeatherStation(stationId = "78458", stationName = "PUERTO PLATA"),
//        WeatherStation(stationId = "78460", stationName = "SANTIAGO INT."),
//        WeatherStation(stationId = "78479", stationName = "PUNTA CANA"),
//        WeatherStation(stationId = "78485", stationName = "LAS AMERICAS"),
//        WeatherStation(stationId = "78486", stationName = "SANTO DOMINGO"),
//        WeatherStation(stationId = "78526", stationName = "SAN JUAN"),
//        WeatherStation(stationId = "78583", stationName = "BELIZE AIRPORT"),
//        WeatherStation(stationId = "78641", stationName = "GUATEMALA AEROPUERTO"),
//        WeatherStation(stationId = "78720", stationName = "TEGUCIGALPA"),
//        WeatherStation(stationId = "78741", stationName = "MANAGUA SANDINO APT"),
//        WeatherStation(stationId = "78760", stationName = "PUNTARENAS"),
//        WeatherStation(stationId = "78762", stationName = "JUAN SANTAMARIA"),
//        WeatherStation(stationId = "78767", stationName = "PUERTO LIMON"),
//        WeatherStation(stationId = "78774", stationName = "LIBERIA"),
//        WeatherStation(stationId = "78792", stationName = "PANAMA TOCUMEN APT"),
//        WeatherStation(stationId = "78866", stationName = "ST. MAARTEN"),
//        WeatherStation(stationId = "78897", stationName = "LE RAIZET,GUADELOUPE"),
//        WeatherStation(stationId = "78925", stationName = "LE LAMENTIN"),
//        WeatherStation(stationId = "78948", stationName = "HEWANORRA AIRPORT"),
//        WeatherStation(stationId = "78954", stationName = "GRANTLEY ADAMS"),
//        WeatherStation(stationId = "78958", stationName = "GRENADA"),
//        WeatherStation(stationId = "78962", stationName = "CROWN POINT"),
//        WeatherStation(stationId = "78970", stationName = "TRINIDAD PIARCO INT."),
//        WeatherStation(stationId = "78982", stationName = "QUEEN BEATRIX-AIRP."),
//        WeatherStation(stationId = "78988", stationName = "HATO-AIRPORT"),
//        WeatherStation(stationId = "78990", stationName = "FLAMINGO,BONAIRE"),
//        WeatherStation(stationId = "80022", stationName = "CARTAGENA/RAFAEL NU."),
//        WeatherStation(stationId = "80028", stationName = "BARRANQUILLA/ER.COR."),
//        WeatherStation(stationId = "80110", stationName = "MEDELLIN/OLAYA"),
//        WeatherStation(stationId = "80112", stationName = "RIO NEGRO/J.M.CORDO."),
//        WeatherStation(stationId = "80222", stationName = "BOGOTA"),
//        WeatherStation(stationId = "80259", stationName = "CALI/ALFONSO B."),
//        WeatherStation(stationId = "80407", stationName = "MARACAIBO"),
//        WeatherStation(stationId = "80415", stationName = "CARACAS AEROPUERTO"),
//        WeatherStation(stationId = "80416", stationName = "CARACAS"),
//        WeatherStation(stationId = "80421", stationName = "MARGARITA INTL."),
//        WeatherStation(stationId = "80438", stationName = "MERIDA/VENEZUELA"),
//        WeatherStation(stationId = "80472", stationName = "VALENCIA"),
//        WeatherStation(stationId = "81001", stationName = "GEORGETOWN"),
//        WeatherStation(stationId = "81002", stationName = "TIMEHRI/GUYANA"),
//        WeatherStation(stationId = "81405", stationName = "CAYENNE/FR.GUYANA"),
//        WeatherStation(stationId = "81408", stationName = "GEORGES DE L'OYAPOCK"),
//        WeatherStation(stationId = "82022", stationName = "BOA VISTA"),
//        WeatherStation(stationId = "82193", stationName = "BELEM/INTL."),
//        WeatherStation(stationId = "82332", stationName = "MANAUS"),
//        WeatherStation(stationId = "82579", stationName = "TERESINA/INTL."),
//        WeatherStation(stationId = "82599", stationName = "NATAL AEROPORTO", region = "Manyara"),
//        WeatherStation(stationId = "82824", stationName = "PORTO VELHO"),
//        WeatherStation(stationId = "82899", stationName = "RECIFE/INTL.", region = "Iringa"),
//        WeatherStation(stationId = "82993", stationName = "MACEIO", region = "Iringa"),
//        WeatherStation(stationId = "83096", stationName = "ARACAJU", region = "Amhara"),
//        WeatherStation(stationId = "83248", stationName = "SALVADOR BAHIA", region = "Amhara"),
//        WeatherStation(stationId = "83362", stationName = "CUIABA/INTL."),
//        WeatherStation(
//            stationId = "83378",
//            stationName = "BRASILIA/INTL.",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(
//            stationId = "83423",
//            stationName = "GOIANIA",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(
//            stationId = "83437",
//            stationName = "MONTES CLAROS",
//            region = "Gouvernement Sa'da"
//        ),
//        WeatherStation(stationId = "83483", stationName = "PIRAPORA", region = "al-Dschauf"),
//        WeatherStation(stationId = "83579", stationName = "ARAXA", region = "Provinz Riad"),
//        WeatherStation(stationId = "83698", stationName = "CAMPOS", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "83746",
//            stationName = "GALEAO (RIO/INTL.)",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "83766", stationName = "LONDRINA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83780", stationName = "SAO PAULO", region = "Provinz Riad"),
//        WeatherStation(stationId = "83827", stationName = "FOZ DO IGUACU AERP."),
//        WeatherStation(
//            stationId = "83899",
//            stationName = "FLORIANOPOLIS AERP.",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83971", stationName = "PORTO ALEGRE/INTL.", region = "Fars"),
//        WeatherStation(stationId = "84008", stationName = "SAN CRISTOBAL"),
//        WeatherStation(stationId = "84071", stationName = "QUITO"),
//        WeatherStation(stationId = "84203", stationName = "GUAYAQUIL"),
//        WeatherStation(stationId = "84377", stationName = "IQUITOS"),
//        WeatherStation(stationId = "84401", stationName = "PIURA"),
//        WeatherStation(stationId = "84628", stationName = "LIMA", region = "Karnataka"),
//        WeatherStation(stationId = "84686", stationName = "CUZCO"),
//        WeatherStation(stationId = "84735", stationName = "JULIACA"),
//        WeatherStation(stationId = "85201", stationName = "LA PAZ/ALTO"),
//        WeatherStation(stationId = "85223", stationName = "COCHABAMBA"),
//        WeatherStation(stationId = "85242", stationName = "ORURO"),
//        WeatherStation(stationId = "85245", stationName = "SANTA CRUZ/EL TROMP."),
//        WeatherStation(stationId = "85442", stationName = "ANTOFAGASTA", region = "Gujarat"),
//        WeatherStation(stationId = "85469", stationName = "OSTERINSEL", region = "Illizi"),
//        WeatherStation(
//            stationId = "85574",
//            stationName = "PUDAHUEL",
//            region = "Khyber Pakhtunkhwa"
//        ),
//        WeatherStation(
//            stationId = "85577",
//            stationName = "SANTIAGO",
//            region = "Khyber Pakhtunkhwa"
//        ),
//        WeatherStation(
//            stationId = "85682",
//            stationName = "CONCEPCION",
//            region = "Khyber Pakhtunkhwa"
//        ),
//        WeatherStation(stationId = "85799", stationName = "PUERT0 MONTT", region = "Dschalalabat"),
//        WeatherStation(stationId = "85874", stationName = "BALMACEDA", region = "Schambyl"),
//        WeatherStation(stationId = "85934", stationName = "PUNTA ARENAS", region = "Aqmola"),
//        WeatherStation(stationId = "85972", stationName = "KAP HOORN", region = "Oblast Tjumen"),
//        WeatherStation(stationId = "86218", stationName = "ASUNCION"),
//        WeatherStation(stationId = "86580", stationName = "MONTEVID. CARRASCO", region = "Semnan"),
//        WeatherStation(stationId = "87046", stationName = "JUJUY AERO"),
//        WeatherStation(
//            stationId = "87222",
//            stationName = "CATAMARCA AERO",
//            region = "Belutschistan"
//        ),
//        WeatherStation(stationId = "87289", stationName = "PASO DE LOS LIBRES", region = "Kerman"),
//        WeatherStation(
//            stationId = "87344",
//            stationName = "CORDOBA/ARGENTINIEN",
//            region = "Helmand"
//        ),
//        WeatherStation(stationId = "87418", stationName = "MENDOZA AERO", region = "Paktika"),
//        WeatherStation(stationId = "87506", stationName = "MALARGUE AERO", region = "Baglan"),
//        WeatherStation(stationId = "87509", stationName = "SAN RAFAEL AERO", region = "Wardak"),
//        WeatherStation(
//            stationId = "87576",
//            stationName = "BUENOS AIRES AERO",
//            region = "Razavi-Chorasan"
//        ),
//        WeatherStation(
//            stationId = "87585",
//            stationName = "BUENOS AIRES",
//            region = "Razavi-Chorasan"
//        ),
//        WeatherStation(stationId = "87623", stationName = "SANTA ROSA", region = "Mary welaýaty"),
//        WeatherStation(
//            stationId = "87692",
//            stationName = "MAR DEL PLATA",
//            region = "Nord-Chorasan"
//        ),
//        WeatherStation(
//            stationId = "87750",
//            stationName = "BAHIA BLANCA",
//            region = "Lebap welaýaty"
//        ),
//        WeatherStation(
//            stationId = "87765",
//            stationName = "BARILOCHE AERO",
//            region = "Provinz Namangan"
//        ),
//        WeatherStation(stationId = "87803", stationName = "ESQUEL AERO", region = "Schambyl"),
//        WeatherStation(
//            stationId = "87860",
//            stationName = "COMODORO RINADAVIA",
//            region = "Südkasachstan"
//        ),
//        WeatherStation(stationId = "87938", stationName = "USHUAIA", region = "Nordkasachstan"),
//        WeatherStation(stationId = "88889", stationName = "FALKLANDS", region = "Baschkortostan"),
//        WeatherStation(stationId = "88903", stationName = "GRYTVIKEN", region = "Oblast Tula"),
//        WeatherStation(
//            stationId = "91165",
//            stationName = "LIHUE,KAUAI",
//            region = "Dschanub asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "91182", stationName = "HONOLULU", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "91190", stationName = "KAHULUI,MAUI", region = "al-Wusta"),
//        WeatherStation(stationId = "91285", stationName = "HILO/GEN.,LYMAN.", region = "Dhofar"),
//        WeatherStation(stationId = "91334", stationName = "TRUK,CAROLINE IS."),
//        WeatherStation(stationId = "91348", stationName = "PONAPE"),
//        WeatherStation(stationId = "91366", stationName = "KWAJALEIN/BUCHOLZ"),
//        WeatherStation(stationId = "91517", stationName = "HONIARA"),
//        WeatherStation(stationId = "91568", stationName = "ANEITYUM"),
//        WeatherStation(stationId = "91574", stationName = "CHESTERFIELD"),
//        WeatherStation(stationId = "91592", stationName = "NOUMEA"),
//        WeatherStation(stationId = "91680", stationName = "NANDI (FIDSCHI)", region = "Karnataka"),
//        WeatherStation(stationId = "91753", stationName = "HIHIFO", region = "Karnataka"),
//        WeatherStation(stationId = "91765", stationName = "PAGO PAGO/INT.AIRP."),
//        WeatherStation(stationId = "91843", stationName = "RAROTONGA"),
//        WeatherStation(stationId = "91925", stationName = "ATUONA", region = "Pwani"),
//        WeatherStation(
//            stationId = "91938",
//            stationName = "TAHITI",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(
//            stationId = "91961",
//            stationName = "PITCAIRN ISLAND",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "92004", stationName = "WEWAK W.O."),
//        WeatherStation(stationId = "93110", stationName = "AUCKLAND AERO"),
//        WeatherStation(stationId = "93245", stationName = "TAUPO", region = "Xinjiang"),
//        WeatherStation(stationId = "93439", stationName = "WELLINGTON", region = "Gebiet Naryn"),
//        WeatherStation(stationId = "93615", stationName = "HOKITIKA", region = "Schambyl"),
//        WeatherStation(stationId = "93781", stationName = "CHRISTCHURCH AERO", region = "Schambyl"),
//        WeatherStation(
//            stationId = "93831",
//            stationName = "QUEENSTOWN/INTL.",
//            region = "Südkasachstan"
//        ),
//        WeatherStation(stationId = "93845", stationName = "INVERCARGILL", region = "Qaraghandy"),
//        WeatherStation(stationId = "94120", stationName = "DARWIN", region = "Schamal Kurdufan"),
//        WeatherStation(stationId = "94131", stationName = "TINDAL", region = "an-Nil al-abyad"),
//        WeatherStation(
//            stationId = "94203",
//            stationName = "BROOME AIRPORT",
//            region = "Ennedi-Massiv"
//        ),
//        WeatherStation(
//            stationId = "94238",
//            stationName = "TENNANT CREEK AIRPOR",
//            region = "al-Bahr al-ahmar"
//        ),
//        WeatherStation(stationId = "94287", stationName = "CAIRNS AIRPORT", region = "al-Dschauf"),
//        WeatherStation(stationId = "94294", stationName = "TOWNSVILLE", region = "Nadschran"),
//        WeatherStation(stationId = "94300", stationName = "CARNARVON AIRPORT", region = "Murzuk"),
//        WeatherStation(stationId = "94312", stationName = "PORT HEDLAND", region = "Region Borkou"),
//        WeatherStation(
//            stationId = "94326",
//            stationName = "ALICE SPRINGS",
//            region = "Al-Bahr al-ahmar"
//        ),
//        WeatherStation(
//            stationId = "94346",
//            stationName = "LONGREACH AIRPORT",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(
//            stationId = "94374",
//            stationName = "ROCKHAMPTON",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(
//            stationId = "94403",
//            stationName = "GERALDTON",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(
//            stationId = "94461",
//            stationName = "GILES (M.O.)",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "94578", stationName = "BRISBANE", region = "Fars"),
//        WeatherStation(stationId = "94604", stationName = "BUNBURY"),
//        WeatherStation(stationId = "94608", stationName = "PERTH"),
//        WeatherStation(
//            stationId = "94637",
//            stationName = "KALGOORLIE BOULDER",
//            region = "Munizip al-Wahat"
//        ),
//        WeatherStation(stationId = "94653", stationName = "CEDUNA (AIRPORT M.O."),
//        WeatherStation(stationId = "94672", stationName = "ADELAIDE", region = "Gouvernement Homs"),
//        WeatherStation(stationId = "94691", stationName = "BROKEN HILL/INTL.", region = "Al-Anbar"),
//        WeatherStation(stationId = "94767", stationName = "SYDNEY AIRPORT", region = "Isfahan"),
//        WeatherStation(stationId = "94791", stationName = "COFFS HARBOUR", region = "Fars"),
//        WeatherStation(stationId = "94802", stationName = "ALBANY AIRPORT"),
//        WeatherStation(
//            stationId = "94866",
//            stationName = "MELBOURNE AIRPORT",
//            region = "West-Aserbaidschan"
//        ),
//        WeatherStation(stationId = "94926", stationName = "CANBERRA", region = "Hamadan"),
//        WeatherStation(stationId = "94975", stationName = "HOBART", region = "Dagestan"),
//        WeatherStation(
//            stationId = "94995",
//            stationName = "LORD HOWE ISLAND",
//            region = "Süd Chorasan"
//        ),
//        WeatherStation(
//            stationId = "94998",
//            stationName = "MACQUARIE ISLAND",
//            region = "Baschkortostan"
//        ),
//        WeatherStation(stationId = "95448", stationName = "LEINSTER", region = "Munizip al-Wahat"),
//        WeatherStation(stationId = "95492", stationName = "THAGOMINDAH", region = "Hail"),
//        WeatherStation(stationId = "96001", stationName = "SABANG", region = "Aceh"),
//        WeatherStation(stationId = "96011", stationName = "BANDA ACEH/BL.BINTG.", region = "Aceh"),
//        WeatherStation(stationId = "96035", stationName = "MEDAN", region = "Sumatera Utara"),
//        WeatherStation(stationId = "96163", stationName = "PADANG/TABING"),
//        WeatherStation(
//            stationId = "96315",
//            stationName = "BRUNEI AIRPORT",
//            region = "Mambéré-Kadéï"
//        ),
//        WeatherStation(stationId = "96413", stationName = "KUCHING", region = "Zentral-Süd"),
//        WeatherStation(stationId = "96471", stationName = "KOTA KINABALU", region = "Ouham-Pendé"),
//        WeatherStation(stationId = "96491", stationName = "SANDAKAN", region = "Ouham"),
//        WeatherStation(stationId = "96741", stationName = "JAKARTA"),
//        WeatherStation(stationId = "96749", stationName = "JAKARTA SOEKARNO"),
//        WeatherStation(
//            stationId = "96933",
//            stationName = "SURABAYA/PERAK",
//            region = "Provinz Zaire"
//        ),
//        WeatherStation(stationId = "96995", stationName = "CHRISTMAS ISLAND", region = "Niger"),
//        WeatherStation(stationId = "96996", stationName = "COCOS ISLAND AIRP."),
//        WeatherStation(
//            stationId = "97014",
//            stationName = "MENADO/DR.SAM RATU.",
//            region = "Orientale"
//        ),
//        WeatherStation(
//            stationId = "97180",
//            stationName = "UJUNG PANDANG/HASAN.",
//            region = "Bandundu"
//        ),
//        WeatherStation(stationId = "97230", stationName = "DENPASAR-NGURAHRAI", region = "Uíge"),
//        WeatherStation(stationId = "97260", stationName = "SUMBAWA BESAR", region = "Bandundu"),
//        WeatherStation(stationId = "97390", stationName = "DILLI/AIRPORT", region = "Katanga"),
//        WeatherStation(stationId = "98328", stationName = "BAGUIO", region = "Ennedi-Massiv"),
//        WeatherStation(stationId = "98425", stationName = "MANILA", region = "Region Wadi Fira"),
//        WeatherStation(
//            stationId = "98429",
//            stationName = "NINOY AQUINO/INTL.",
//            region = "Region Wadi Fira"
//        ),
//        WeatherStation(stationId = "98431", stationName = "CALAPAN", region = "Wadai"),
//        WeatherStation(stationId = "98536", stationName = "ROMBLON", region = "Region Sila"),
//        WeatherStation(
//            stationId = "98618",
//            stationName = "PUERTO PRINCESA",
//            region = "Region Moyen-Chari"
//        ),
//        WeatherStation(stationId = "98644", stationName = "TAGBILARAN", region = "Dschanub Darfur"),
//        WeatherStation(stationId = "98646", stationName = "MACTAN", region = "Dschanub Darfur"),
//        WeatherStation(stationId = "98753", stationName = "DAVAO", region = "Obermbomou"),
//        WeatherStation(stationId = "01149", stationName = "BASMOEN", region = "Nordland"),
//        WeatherStation(stationId = "01194", stationName = "NARVIK", region = "Nordland"),
//        WeatherStation(
//            stationId = "01215",
//            stationName = "HJELVIG (MYRBO)",
//            region = "Møre og Romsdal"
//        ),
//        WeatherStation(stationId = "02086", stationName = "LAINIO", region = "Norrbottens län"),
//        WeatherStation(stationId = "02096", stationName = "PAJALA", region = "Norrbottens län"),
//        WeatherStation(
//            stationId = "02267",
//            stationName = "ORNSKOLDSVIK",
//            region = "Västernorrlands län"
//        ),
//        WeatherStation(
//            stationId = "02293",
//            stationName = "SKELLEFTEHAMN",
//            region = "Västerbottens län"
//        ),
//        WeatherStation(stationId = "02810", stationName = "ENONTEKIO", region = "Lappland"),
//        WeatherStation(stationId = "02912", stationName = "VAASA", region = "Österbotten"),
//        WeatherStation(
//            stationId = "04072",
//            stationName = "FAGURHOLSMYRI",
//            region = "Västernorrlands län"
//        ),
//        WeatherStation(stationId = "04094", stationName = "NUPUR", region = "Jämtlands län"),
//        WeatherStation(stationId = "08513", stationName = "PONTA DELGADA"),
//        WeatherStation(
//            stationId = "27615",
//            stationName = "MOSKAU/DOMODEDOVO",
//            region = "Oblast Moskau"
//        ),
//        WeatherStation(stationId = "28225", stationName = "PERM", region = "Region Perm"),
//        WeatherStation(stationId = "28429", stationName = "OKTJABRSKI", region = "Region Perm"),
//        WeatherStation(
//            stationId = "28642",
//            stationName = "CELJABINSK-BLANDINO",
//            region = "Chelyabinskaya Oblast"
//        ),
//        WeatherStation(
//            stationId = "28900",
//            stationName = "SAMARA/KURUMOCH",
//            region = "Oblast Samara"
//        ),
//        WeatherStation(
//            stationId = "29634",
//            stationName = "NOVOSIBIRSK",
//            region = "Oblast Nowosibirsk"
//        ),
//        WeatherStation(stationId = "34267", stationName = "DANILOVKA", region = "Oblast Wolgograd"),
//        WeatherStation(
//            stationId = "34731",
//            stationName = "ROSTOV-NA-DONU",
//            region = "Oblast Rostow"
//        ),
//        WeatherStation(
//            stationId = "35138",
//            stationName = "ORSK (SOUTH APT)",
//            region = "Oblast Orenburg"
//        ),
//        WeatherStation(stationId = "37235", stationName = "GROZNYJ", region = "Tschetschenien"),
//        WeatherStation(stationId = "37260", stationName = "SUHUMI"),
//        WeatherStation(stationId = "37549", stationName = "TBILISI", region = "Tbilisi"),
//        WeatherStation(stationId = "37789", stationName = "YEREVAN", region = "Armawir"),
//        WeatherStation(stationId = "40608", stationName = "MOSUL", region = "Ninawa"),
//        WeatherStation(stationId = "40616", stationName = "ERBIL", region = "Arbil"),
//        WeatherStation(stationId = "40623", stationName = "SULAIMANIYA", region = "Sulaimaniyya"),
//        WeatherStation(stationId = "40650", stationName = "BAGHDAD", region = "Al-Anbar"),
//        WeatherStation(stationId = "40689", stationName = "BASRAH", region = "Basra"),
//        WeatherStation(stationId = "40904", stationName = "FAIZABAD", region = "Badachschan"),
//        WeatherStation(stationId = "40913", stationName = "KUNDUZ", region = "Kundus"),
//        WeatherStation(stationId = "40914", stationName = "BAGHLAN", region = "Baglan"),
//        WeatherStation(stationId = "40922", stationName = "MIMANA", region = "Faryab"),
//        WeatherStation(stationId = "40938", stationName = "HERAT", region = "Herat"),
//        WeatherStation(stationId = "40990", stationName = "KANDAHAR", region = "Kandahar"),
//        WeatherStation(
//            stationId = "41020",
//            stationName = "JEDDAH (PORT)",
//            region = "Provinz Mekka"
//        ),
//        WeatherStation(stationId = "41216", stationName = "ABU DHABI", region = "Abu Dhabi"),
//        WeatherStation(stationId = "41641", stationName = "LAHORE AIRPORT", region = "Punjab"),
//        WeatherStation(stationId = "41947", stationName = "KHULNA", region = "Khulna"),
//        WeatherStation(stationId = "42042", stationName = "SRINAGAR"),
//        WeatherStation(stationId = "42181", stationName = "NEU DELHI", region = "Delhi"),
//        WeatherStation(stationId = "42295", stationName = "DARJEELING", region = "Westbengalen"),
//        WeatherStation(stationId = "42647", stationName = "AHMEDABAD INTL", region = "Gujarat"),
//        WeatherStation(stationId = "43057", stationName = "BOMBAY"),
//        WeatherStation(stationId = "43194", stationName = "GOA-DABOLIM", region = "Goa"),
//        WeatherStation(stationId = "43372", stationName = "TRIVANDRUM AIRPORT"),
//        WeatherStation(stationId = "47110", stationName = "SEOUL AIRPORT"),
//        WeatherStation(stationId = "47113", stationName = "INCHEON/INTL."),
//        WeatherStation(stationId = "47153", stationName = "PUSAN"),
//        WeatherStation(stationId = "47166", stationName = "MOKPO"),
//        WeatherStation(stationId = "47182", stationName = "CHEJU INT'L AIRPORT"),
//        WeatherStation(stationId = "47545", stationName = "AKITA AIRPORT", region = "Erzincan"),
//        WeatherStation(stationId = "47569", stationName = "SENDAI AIRPORT", region = "Diyarbakır"),
//        WeatherStation(stationId = "47588", stationName = "YAMAGATA", region = "Diyarbakır"),
//        WeatherStation(stationId = "47595", stationName = "FUKUSHIMA", region = "Diyarbakır"),
//        WeatherStation(stationId = "47607", stationName = "TOYAMA", region = "Kilis"),
//        WeatherStation(stationId = "47616", stationName = "FUKUI", region = "Hatay"),
//        WeatherStation(stationId = "47635", stationName = "NAGOYA AIRPORT", region = "Hama"),
//        WeatherStation(
//            stationId = "47670",
//            stationName = "YOKOHAMA",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(
//            stationId = "47671",
//            stationName = "TOKYO INTERNATIONAL",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(
//            stationId = "47686",
//            stationName = "TOKYO AIRPORT",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(
//            stationId = "47687",
//            stationName = "TOKIO",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(stationId = "47721", stationName = "FUJI AB", region = "Gouvernement Homs"),
//        WeatherStation(stationId = "47759", stationName = "KYOTO"),
//        WeatherStation(stationId = "47768", stationName = "OKAYAMA / HONSHU"),
//        WeatherStation(stationId = "47771", stationName = "OSAKA AIRPORT"),
//        WeatherStation(stationId = "47789", stationName = "HIROSHIMA AIRPORT"),
//        WeatherStation(stationId = "47819", stationName = "KUMAMOTO"),
//        WeatherStation(stationId = "47836", stationName = "YAKUSHIMA", region = "Al-Minufiyya"),
//        WeatherStation(stationId = "47855", stationName = "NAGASAKI AIRPORT"),
//        WeatherStation(stationId = "47930", stationName = "NAHA", region = "Al-Wadi al-dschadid"),
//        WeatherStation(stationId = "48070", stationName = "MONGHSAT", region = "Shan-Staat"),
//        WeatherStation(stationId = "48600", stationName = "LANGKAWI", region = "Kedah"),
//        WeatherStation(stationId = "48618", stationName = "KUALA TRENGGANU"),
//        WeatherStation(stationId = "48625", stationName = "IPOH"),
//        WeatherStation(stationId = "48632", stationName = "CAMERON HIGHLANDS"),
//        WeatherStation(stationId = "48694", stationName = "PAYA LEBAR"),
//        WeatherStation(stationId = "54543", stationName = "SHANHAIGUAN"),
//        WeatherStation(
//            stationId = "54774",
//            stationName = "WEIHAI",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(stationId = "58259", stationName = "NANTONG", region = "Munizip al-Mardsch"),
//        WeatherStation(stationId = "58334", stationName = "WUHU"),
//        WeatherStation(stationId = "58343", stationName = "CHANGZHOU", region = "Munizip Bengasi"),
//        WeatherStation(
//            stationId = "58367",
//            stationName = "SHANGHAI",
//            region = "Munizip al-Mardsch"
//        ),
//        WeatherStation(stationId = "59368", stationName = "XINGANG", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "59554", stationName = "GAOXIONG", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "61214", stationName = "KIDAL", region = "Region Kidal"),
//        WeatherStation(stationId = "61223", stationName = "TOMBOUCTOU", region = "Timbuktu"),
//        WeatherStation(stationId = "61226", stationName = "GAO", region = "Region Gao"),
//        WeatherStation(stationId = "61984", stationName = "SAINT-PIERRE", region = "az-Zahira"),
//        WeatherStation(
//            stationId = "62460",
//            stationName = "SHARM EL SHEIKH",
//            region = "Dschanub Sina"
//        ),
//        WeatherStation(stationId = "63021", stationName = "ASMARA", region = "Maekel"),
//        WeatherStation(
//            stationId = "63023",
//            stationName = "MASSAWA",
//            region = "Semienawi Kayih Bahri"
//        ),
//        WeatherStation(stationId = "63270", stationName = "KISIMAYU", region = "Jubbada Hoose"),
//        WeatherStation(stationId = "63789", stationName = "ARUSHA", region = "Arusha"),
//        WeatherStation(stationId = "64008", stationName = "BASANKUSU", region = "Équateur"),
//        WeatherStation(stationId = "64950", stationName = "YAOUNDE/NSIMALEN", region = "Zentral"),
//        WeatherStation(
//            stationId = "65660",
//            stationName = "MONROVIA/ROBERTS",
//            region = "Nord-Ouest"
//        ),
//        WeatherStation(
//            stationId = "68190",
//            stationName = "PHALABORWA",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "68239", stationName = "POMFRET", region = "Kufra-Oasen"),
//        WeatherStation(stationId = "68476", stationName = "LADYSMITH", region = "Al-Minya"),
//        WeatherStation(
//            stationId = "70272",
//            stationName = "ANCHORAGE ELMENDORF",
//            region = "Republik Komi"
//        ),
//        WeatherStation(stationId = "71620", stationName = "KINGSTON", region = "Almaty"),
//        WeatherStation(stationId = "71716", stationName = "BATHURST", region = "Qaraghandy"),
//        WeatherStation(
//            stationId = "71888",
//            stationName = "JASPER,ALTA.",
//            region = "Woiwodschaft Kujawien-Pommern"
//        ),
//        WeatherStation(stationId = "71932", stationName = "UXBRIDGE WEST ON", region = "Almaty"),
//        WeatherStation(
//            stationId = "72216",
//            stationName = "ALBANY",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(
//            stationId = "72228",
//            stationName = "BIRMINGHAM-SHUTTLESW",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "72237", stationName = "FORT MYERS", region = "Uttar Pradesh"),
//        WeatherStation(
//            stationId = "72242",
//            stationName = "GALVESTON",
//            region = "Autonomes Gebiet Tibet"
//        ),
//        WeatherStation(stationId = "72287", stationName = "ONTARIO INT."),
//        WeatherStation(
//            stationId = "72388",
//            stationName = "SAN JOSE INT.",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(stationId = "72466", stationName = "COLORADO SPRINGS"),
//        WeatherStation(stationId = "72467", stationName = "ASPEN"),
//        WeatherStation(stationId = "72469", stationName = "DENVER"),
//        WeatherStation(
//            stationId = "72482",
//            stationName = "SACRAMENTO INT.",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(
//            stationId = "72493",
//            stationName = "OAKLAND INT.",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(stationId = "72512", stationName = "NIAGARA FALLS", region = "Almaty"),
//        WeatherStation(stationId = "72522", stationName = "HARRISBURG INT.", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "72527",
//            stationName = "PITTSBURGH/ALLEGH.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(stationId = "72554", stationName = "OMAHA/OFFUTT AFB.", region = "Gansu"),
//        WeatherStation(stationId = "72568", stationName = "JACKSON HOLE", region = "Toskana"),
//        WeatherStation(stationId = "72610", stationName = "BANGOR INT.", region = "Südkasachstan"),
//        WeatherStation(
//            stationId = "72613",
//            stationName = "MOUNT WASHINGTON NH.",
//            region = "Schambyl"
//        ),
//        WeatherStation(stationId = "72670", stationName = "CODY/MUN.WY.", region = "Ligurien"),
//        WeatherStation(stationId = "72775", stationName = "GREAT FALLS MT.", region = "Bayern"),
//        WeatherStation(stationId = "76394", stationName = "MONTERREY", region = "Adrar"),
//        WeatherStation(stationId = "76595", stationName = "CANCUN", region = "Odisha"),
//        WeatherStation(stationId = "76679", stationName = "MEXICO INT.", region = "Chiang Mai"),
//        WeatherStation(stationId = "78118", stationName = "TURKS ISLAND", region = "Gujarat"),
//        WeatherStation(stationId = "78119", stationName = "SOUTH CAICOS", region = "Gujarat"),
//        WeatherStation(stationId = "78258", stationName = "HOLGUIN", region = "Maharashtra"),
//        WeatherStation(stationId = "78315", stationName = "PINAR DEL RIO", region = "Chhattisgarh"),
//        WeatherStation(stationId = "78337", stationName = "TRINIDAD", region = "Madhya Pradesh"),
//        WeatherStation(
//            stationId = "78339",
//            stationName = "CIEGO DE AVILA",
//            region = "Madhya Pradesh"
//        ),
//        WeatherStation(stationId = "78373", stationName = "CIUDAD HABANA", region = "Chhattisgarh"),
//        WeatherStation(stationId = "78409", stationName = "CAP-HAITIEN"),
//        WeatherStation(stationId = "78447", stationName = "LES CAYES", region = "Maharashtra"),
//        WeatherStation(stationId = "78470", stationName = "SAN JUAN D.L. MAGUA."),
//        WeatherStation(stationId = "78475", stationName = "LA ROMANA"),
//        WeatherStation(stationId = "78547", stationName = "ST. CROIX"),
//        WeatherStation(stationId = "78550", stationName = "BEEF ISLAND,TORTOLA"),
//        WeatherStation(stationId = "78555", stationName = "ST. THOMAS"),
//        WeatherStation(stationId = "78662", stationName = "SAN SALVADOR"),
//        WeatherStation(stationId = "78666", stationName = "SAN SALVADOR AIRPORT"),
//        WeatherStation(stationId = "78861", stationName = "COOLIDGE FIELD"),
//        WeatherStation(stationId = "78899", stationName = "MARIE GALANTE"),
//        WeatherStation(stationId = "78946", stationName = "CASTRIES"),
//        WeatherStation(stationId = "82099", stationName = "MACAPA"),
//        WeatherStation(stationId = "82191", stationName = "BELEM"),
//        WeatherStation(stationId = "82397", stationName = "FORTALEZA", region = "Kitui County"),
//        WeatherStation(stationId = "82900", stationName = "RECIFE CURADO", region = "Iringa"),
//        WeatherStation(stationId = "82915", stationName = "RIO BRANCO"),
//        WeatherStation(
//            stationId = "83377",
//            stationName = "BRASILIA",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(
//            stationId = "83583",
//            stationName = "BELO HORIZONTE",
//            region = "Provinz Asir"
//        ),
//        WeatherStation(
//            stationId = "83611",
//            stationName = "CAMPO GRANDE/INTL.",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83648", stationName = "VITORIA", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "83721",
//            stationName = "CAMPINAS-VIRACOPOS",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(
//            stationId = "83743",
//            stationName = "RIO DE JANEIRO",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "83773", stationName = "AVARE", region = "asch-Scharqiyya"),
//        WeatherStation(
//            stationId = "83779",
//            stationName = "SAO PAULO/INTL.",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "83782", stationName = "SANTOS", region = "Provinz Riad"),
//        WeatherStation(stationId = "83842", stationName = "CURITIBA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83920", stationName = "SAO JOAQUIM"),
//        WeatherStation(stationId = "83968", stationName = "PORTO ALEGRE CANOAS", region = "Fars"),
//        WeatherStation(stationId = "85445", stationName = "LA ESCONDIDA", region = "Sindh"),
//        WeatherStation(stationId = "86570", stationName = "PUNTA DEL ESTE", region = "Semnan"),
//        WeatherStation(
//            stationId = "87839",
//            stationName = "FARO PUNTA DELGADA",
//            region = "Provinz Navoiy"
//        ),
//        WeatherStation(
//            stationId = "87903",
//            stationName = "LAGO ARGENTINO AERO",
//            region = "Qaraghandy"
//        ),
//        WeatherStation(
//            stationId = "91217",
//            stationName = "GUAM MARIANA IS.",
//            region = "Gouvernement Lahidsch"
//        ),
//        WeatherStation(stationId = "91530", stationName = "NAURU INT."),
//        WeatherStation(stationId = "91663", stationName = "SAVUSAVU AIRPORT", region = "Telangana"),
//        WeatherStation(stationId = "91930", stationName = "BORA-BORA", region = "al-Mahra"),
//        WeatherStation(stationId = "93119", stationName = "AUCKLAND"),
//        WeatherStation(stationId = "93308", stationName = "NEW PLYMOUTH", region = "Xinjiang"),
//        WeatherStation(
//            stationId = "93436",
//            stationName = "WELLINGTON AIRPORT",
//            region = "Gebiet Naryn"
//        ),
//        WeatherStation(stationId = "93780", stationName = "CHRISTCHURCH", region = "Schambyl"),
//        WeatherStation(stationId = "93890", stationName = "DUNEDIN", region = "Schambyl"),
//        WeatherStation(stationId = "94035", stationName = "PORT MORESBY"),
//        WeatherStation(stationId = "94387", stationName = "BUNDABERG (BINGERA)"),
//        WeatherStation(
//            stationId = "94463",
//            stationName = "CURTIN SPRINGS",
//            region = "Al-Wadi al-dschadid"
//        ),
//        WeatherStation(stationId = "94564", stationName = "RAINBOW BEACH"),
//        WeatherStation(stationId = "94587", stationName = "TABULAM", region = "Fars"),
//        WeatherStation(
//            stationId = "94669",
//            stationName = "PORT PIRIE",
//            region = "Gouvernement Rif Dimaschq"
//        ),
//        WeatherStation(stationId = "94743", stationName = "MOUNT BOYCE AWS.", region = "Isfahan"),
//        WeatherStation(stationId = "94768", stationName = "SYDNEY", region = "Isfahan"),
//        WeatherStation(stationId = "94774", stationName = "NEWCASTLE", region = "Isfahan"),
//        WeatherStation(stationId = "94828", stationName = "PORTLAND", region = "Batman"),
//        WeatherStation(
//            stationId = "94868",
//            stationName = "MELBOURNE",
//            region = "West-Aserbaidschan"
//        ),
//        WeatherStation(stationId = "94969", stationName = "LAUNCESTON"),
//        WeatherStation(stationId = "95367", stationName = "MACKAY", region = "asch-Scharqiyya"),
//        WeatherStation(
//            stationId = "96059",
//            stationName = "PRAPAT-SIBISAMONT.",
//            region = "Sumatera Utara"
//        ),
//        WeatherStation(stationId = "96747", stationName = "JAKARTA HALIM P."),
//        WeatherStation(stationId = "96853", stationName = "JOGYAKARTA/ADISUC."),
//        WeatherStation(stationId = "97240", stationName = "AMPENAN", region = "Uíge"),
//        WeatherStation(stationId = "97290", stationName = "ENDEH", region = "Westkasai"),
//        WeatherStation(
//            stationId = "98748",
//            stationName = "CAGAYAN DE ORO",
//            region = "Western Bahr el Ghazal"
//        ),
//        WeatherStation(stationId = "99953", stationName = "LONGBOAT KEY", region = "Uttar Pradesh"),
//        WeatherStation(stationId = "P0001", stationName = "INSEL BORACAY", region = "Region Sila"),
//        WeatherStation(stationId = "P0002", stationName = "CHITWAN-PARK", region = "Bagmati"),
//        WeatherStation(stationId = "P0003", stationName = "MAURITIUS STRAND", region = "al-Wusta"),
//        WeatherStation(stationId = "P0005", stationName = "STR.V.MOZAMBIQUE"),
//        WeatherStation(stationId = "P0014", stationName = "PALM SPRINGS (CF.)"),
//        WeatherStation(
//            stationId = "P0015",
//            stationName = "PUERTO VALLARTA",
//            region = "Tamanrasset"
//        ),
//        WeatherStation(stationId = "P0046", stationName = "TORAJA-LAND", region = "Équateur"),
//        WeatherStation(
//            stationId = "P0047",
//            stationName = "BANAUE/NORD-LUZON",
//            region = "Ennedi-Massiv"
//        ),
//        WeatherStation(
//            stationId = "P0048",
//            stationName = "TONGARIO NATIONALP.",
//            region = "Xinjiang"
//        ),
//        WeatherStation(
//            stationId = "P0049",
//            stationName = "MOUNT COOK NAT.PARK",
//            region = "Schambyl"
//        ),
//        WeatherStation(stationId = "P0052", stationName = "ARBIL", region = "Arbil"),
//        WeatherStation(stationId = "P0094", stationName = "RONDESLOTTET", region = "Innlandet"),
//        WeatherStation(stationId = "P0315", stationName = "ARGUINEGUIN", region = "Ash Shati"),
//        WeatherStation(stationId = "P0316", stationName = "OGDEN"),
//        WeatherStation(stationId = "P0317", stationName = "PARK CITY"),
//        WeatherStation(stationId = "P0318", stationName = "HEBER CITY"),
//        WeatherStation(stationId = "P0319", stationName = "PROVO"),
//        WeatherStation(
//            stationId = "P0320",
//            stationName = "SUEDL. ISLAS MARIAS",
//            region = "Tamanrasset"
//        ),
//        WeatherStation(stationId = "P0321", stationName = "WESTL. LOS ANGELES"),
//        WeatherStation(
//            stationId = "P0322",
//            stationName = "WESTL. DAVENPORT",
//            region = "Decentralized Administration of Peloponnese, Western Greece and the Ionian"
//        ),
//        WeatherStation(stationId = "P0323", stationName = "WESTL. ENSENADA", region = "Odessa"),
//        WeatherStation(stationId = "P0324", stationName = "OBERER SEE", region = "Xinjiang"),
//        WeatherStation(stationId = "P0337", stationName = "SAN PEDRO DE MACORIS"),
//        WeatherStation(stationId = "P0338", stationName = "S.FRANCI. DE MACORIS"),
//        WeatherStation(stationId = "P0339", stationName = "CONCEPCION D.L. VEGA"),
//        WeatherStation(stationId = "P0340", stationName = "GONAIVES"),
//        WeatherStation(stationId = "P0342", stationName = "NATIONALPARK JARAGUA"),
//        WeatherStation(stationId = "P0343", stationName = "NAT.PK. MTE. CHRISTI"),
//        WeatherStation(stationId = "P0344", stationName = "NAT.PK. LOS HAITISES"),
//        WeatherStation(stationId = "P0345", stationName = "NT.P.SIERRA BAHORUCO"),
//        WeatherStation(stationId = "P0396", stationName = "ARE", region = "Jämtlands län"),
//        WeatherStation(stationId = "P0398", stationName = "FUNAESDALEN", region = "Jämtlands län"),
//        WeatherStation(
//            stationId = "P0400",
//            stationName = "RIKSGRAENSEN",
//            region = "Norrbottens län"
//        ),
//        WeatherStation(stationId = "P0407", stationName = "BEAR MOUNTAIN"),
//        WeatherStation(stationId = "P0408", stationName = "VAIL"),
//        WeatherStation(
//            stationId = "P0418",
//            stationName = "SULEJA",
//            region = "Federal Capital Territory"
//        ),
//        WeatherStation(
//            stationId = "P0479",
//            stationName = "TEHERAN/IMAM KHOMEI.",
//            region = "Teheran"
//        ),
//        WeatherStation(
//            stationId = "P0480",
//            stationName = "CHUBU CENTRAIR",
//            region = "Gouvernement Homs"
//        ),
//        WeatherStation(stationId = "P0485", stationName = "LOLENGI", region = "Équateur"),
//        WeatherStation(
//            stationId = "P0486",
//            stationName = "OHARA",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(stationId = "P0517", stationName = "USINSK", region = "Republik Komi"),
//        WeatherStation(stationId = "P0519", stationName = "JINING / SHANDONG"),
//        WeatherStation(stationId = "P0520", stationName = "SAO SEBASTIAO", region = "Morogoro"),
//        WeatherStation(stationId = "P0522", stationName = "RAAHE", region = "Nordösterbotten"),
//        WeatherStation(
//            stationId = "P0526",
//            stationName = "KOGALYM",
//            region = "Autonomer Kreis der Chanten und Mansen/Jugra"
//        ),
//        WeatherStation(stationId = "P0528", stationName = "SAO LUIZ"),
//        WeatherStation(stationId = "P0530", stationName = "KOKKOLA", region = "Mittelösterbotten"),
//        WeatherStation(stationId = "P0539", stationName = "VARKAUS", region = "Nordsavo"),
//        WeatherStation(stationId = "P0542", stationName = "QUANZHOU", region = "Munizip Ghat"),
//        WeatherStation(stationId = "P0558", stationName = "SUBIC", region = "Region Wadi Fira"),
//        WeatherStation(
//            stationId = "P0562",
//            stationName = "SHENYANG / TAOXIAN",
//            region = "Blagoewgrad"
//        ),
//        WeatherStation(stationId = "P0565", stationName = "TIANJIN"),
//        WeatherStation(stationId = "P0566", stationName = "ASTANA"),
//        WeatherStation(stationId = "P0568", stationName = "TOLUCA, MEX.", region = "Lampang"),
//        WeatherStation(
//            stationId = "P0569",
//            stationName = "ORLANDO / SANFORD A.",
//            region = "Sudurpashchim Province"
//        ),
//        WeatherStation(stationId = "P0574", stationName = "LUHANSK", region = "Luhansk"),
//        WeatherStation(stationId = "P0575", stationName = "FORT MCMURRAY ALTA."),
//        WeatherStation(stationId = "W1164", stationName = "ISLA MARGARITA"),
//        WeatherStation(stationId = "W1261", stationName = "LEEW.ISLANDS-S"),
//        WeatherStation(stationId = "W1560", stationName = "LEEW.ISLANDS-N"),
//        WeatherStation(stationId = "W1655", stationName = "16N55W"),
//        WeatherStation(stationId = "W1724", stationName = "KAP VERDEN", region = "Schamal Darfur"),
//        WeatherStation(stationId = "W1843", stationName = "18N43W", region = "Provinz Asir"),
//        WeatherStation(stationId = "W1862", stationName = "WINDW.INSELN-E"),
//        WeatherStation(stationId = "W1965", stationName = "WINDW.INSELN-W"),
//        WeatherStation(stationId = "W2030", stationName = "20N30W", region = "asch-Schamaliyya"),
//        WeatherStation(stationId = "W2180", stationName = "TRINIDAD/KUBA", region = "Maharashtra"),
//        WeatherStation(stationId = "W2476", stationName = "BAHAMAS", region = "Madhya Pradesh"),
//        WeatherStation(stationId = "W2520", stationName = "SWL.KANAREN", region = "Kufra-Oasen"),
//        WeatherStation(
//            stationId = "W2617",
//            stationName = "SDL.TENERIFFA",
//            region = "Munizip al-Dschufra"
//        ),
//        WeatherStation(stationId = "W2778", stationName = "GRAND BAHAMA", region = "Uttar Pradesh"),
//        WeatherStation(
//            stationId = "W2814",
//            stationName = "SDL.FUERTEVENTURA",
//            region = "Ash Shati"
//        ),
//        WeatherStation(stationId = "W2918", stationName = "NDL.LA PALMA", region = "Munizip Surt"),
//        WeatherStation(stationId = "W3015", stationName = "CANARIS-SUED", region = "Munizip Surt"),
//        WeatherStation(stationId = "W3417", stationName = "NDL.MADEIRA"),
//        WeatherStation(stationId = "W4215", stationName = "GEBIET 41", region = "Apulien"),
//        WeatherStation(stationId = "W4235", stationName = "GEBIET 43"),
//        WeatherStation(stationId = "W4325", stationName = "GEBIET 42", region = "Lowetsch"),
//        WeatherStation(stationId = "W4346", stationName = "GEBIET 44", region = "Tschetschenien"),
//        WeatherStation(stationId = "W4652", stationName = "GEBIET 50"),
//        WeatherStation(stationId = "W4715", stationName = "GEBIET 46", region = "Steiermark"),
//        WeatherStation(stationId = "W4726", stationName = "GEBIET 47", region = "Kreis Harghita"),
//        WeatherStation(stationId = "W4835", stationName = "GEBIET 48", region = "Saporischschja"),
//        WeatherStation(stationId = "W4845", stationName = "GEBIET 49", region = "Oblast Astrachan"),
//        WeatherStation(stationId = "W5215", stationName = "GEBIET 51", region = "Drossen"),
//        WeatherStation(stationId = "W5244", stationName = "GEBIET 54", region = "Oblast Pensa"),
//        WeatherStation(stationId = "W5325", stationName = "GEBIET 52"),
//        WeatherStation(stationId = "W5335", stationName = "GEBIET 53", region = "Oblast Orjol"),
//        WeatherStation(stationId = "W5353", stationName = "GEBIET 55", region = "Oblast Orenburg"),
//        WeatherStation(
//            stationId = "W5413",
//            stationName = "WESTL.IRLAND",
//            region = "Mecklenburg-Vorpommern"
//        ),
//        WeatherStation(
//            stationId = "W5646",
//            stationName = "GEBIET 59",
//            region = "Oblast de Níjni Novgorod"
//        ),
//        WeatherStation(stationId = "W5716", stationName = "GEBIET 56", region = "Kalmar län"),
//        WeatherStation(stationId = "W5720", stationName = "POSITION L"),
//        WeatherStation(stationId = "W5735", stationName = "GEBIET 58", region = "Oblast Twer"),
//        WeatherStation(stationId = "W5755", stationName = "GEBIET 60", region = "Region Perm"),
//        WeatherStation(
//            stationId = "W5812",
//            stationName = "WESTL.HEBRIDEN",
//            region = "Västra Götalands län"
//        ),
//        WeatherStation(stationId = "W5825", stationName = "GEBIET 57", region = "Bezirk Mazsalaca"),
//        WeatherStation(
//            stationId = "W5843",
//            stationName = "KAP FARVELL",
//            region = "Oblast Kostroma"
//        ),
//        WeatherStation(stationId = "W5922", stationName = "PENTL-FARV2"),
//        WeatherStation(stationId = "W6015", stationName = "PENTL-FARV1", region = "Örebro län"),
//        WeatherStation(
//            stationId = "W6031",
//            stationName = "PENTL-FARV3",
//            region = "Oblast Leningrad"
//        ),
//        WeatherStation(stationId = "W6050", stationName = "SW-GROENLAND", region = "Republik Komi"),
//        WeatherStation(
//            stationId = "W6138",
//            stationName = "SE-GROENLAND",
//            region = "Oblast Archangelsk"
//        ),
//        WeatherStation(stationId = "W6458", stationName = "DAVISSTR1", region = "Republik Komi"),
//        WeatherStation(
//            stationId = "W6531",
//            stationName = "DOHRNBANK",
//            region = "Republik Karelien"
//        ),
//        WeatherStation(
//            stationId = "W7041",
//            stationName = "SUEDL.NANTUCKET IS.",
//            region = "Taschkent"
//        ),
//        WeatherStation(
//            stationId = "W7060",
//            stationName = "DAVISSTR2",
//            region = "Autonomer Kreis der Nenzen"
//        ),
//        WeatherStation(stationId = "W9853", stationName = "WINNIPEG-SEE", region = "Tuwa"),
//        WeatherStation(stationId = "E2834", stationName = "ROTES MEER"),
//        WeatherStation(stationId = "E2835", stationName = "GOLF AKABA-S"),
//        WeatherStation(stationId = "E6204", stationName = "SVINOY"),
//        WeatherStation(stationId = "E6220", stationName = "BOTTENSEE"),
//        WeatherStation(stationId = "E6300", stationName = "63NORD00OST"),
//        WeatherStation(stationId = "E6319", stationName = "BOTTENSEE-NW"),
//        WeatherStation(stationId = "E6407", stationName = "FROYABANKEN"),
//        WeatherStation(stationId = "E6421", stationName = "QUARK"),
//        WeatherStation(stationId = "E6524", stationName = "BOTTENWIEK"),
//        WeatherStation(stationId = "E6602", stationName = "POSITION M"),
//        WeatherStation(stationId = "E6609", stationName = "HALTENBANK"),
//        WeatherStation(stationId = "E6914", stationName = "LOFOTEN", region = "Nordland"),
//        WeatherStation(stationId = "E7225", stationName = "NORDKAP"),
//        WeatherStation(stationId = "E7520", stationName = "BAERENINSEL", region = "Spitzbergen"),
//        WeatherStation(stationId = "S4450", stationName = "ATLANTIK SUED1"),
//        WeatherStation(stationId = "S4659", stationName = "ATLANTIK SUED2", region = "Qysylorda"),
//        WeatherStation(stationId = "01008", stationName = "SVALBARD", region = "Spitzbergen"),
//        WeatherStation(stationId = "04320", stationName = "DANMARKSHAVN", region = "Spitzbergen"),
//        WeatherStation(
//            stationId = "20087",
//            stationName = "OSTROV GOLOMJANNYJ",
//            region = "Region Krasnojarsk"
//        ),
//        WeatherStation(stationId = "71917", stationName = "EUREKA UA N.W.T."),
//        WeatherStation(stationId = "89002", stationName = "NEUMAYER"),
//        WeatherStation(stationId = "89055", stationName = "MARAMBIO", region = "Republik Komi"),
//        WeatherStation(
//            stationId = "89059",
//            stationName = "BERNARDO O'HIGGINS",
//            region = "Republik Komi"
//        ),
//        WeatherStation(stationId = "89512", stationName = "NOVOLAZAREVSKAJA"),
//        WeatherStation(stationId = "89532", stationName = "SYOWA"),
//        WeatherStation(
//            stationId = "89564",
//            stationName = "MAWSON",
//            region = "Autonomer Kreis der Nenzen"
//        ),
//        WeatherStation(stationId = "89592", stationName = "MIRNYJ", region = "Region Krasnojarsk"),
//        WeatherStation(stationId = "89611", stationName = "CASEY"),
//        WeatherStation(
//            stationId = "89642",
//            stationName = "DUMONT D'URVILLE",
//            region = "Oblast Murmansk"
//        ),
//        WeatherStation(
//            stationId = "89042",
//            stationName = "SIGNY ISLAND",
//            region = "Oblast Wologda"
//        ),
//        WeatherStation(stationId = "89542", stationName = "MOLODEZNAYA"),
//        WeatherStation(stationId = "E7707", stationName = "SPITZBERGEN"),
//        WeatherStation(
//            stationId = "01059",
//            stationName = "BANAK/LAKSELV (AFB)",
//            region = "Troms og Finnmark"
//        ),
//        WeatherStation(
//            stationId = "01112",
//            stationName = "BRONNOYSUND/BRONNOY",
//            region = "Nordland"
//        ),
//        WeatherStation(stationId = "23073", stationName = "NORILSK", region = "Region Krasnojarsk"),
//        WeatherStation(
//            stationId = "23205",
//            stationName = "NAR?JAN-MAR",
//            region = "Autonomer Kreis der Nenzen"
//        ),
//        WeatherStation(stationId = "23226", stationName = "VORKUTA", region = "Republik Komi"),
//        WeatherStation(stationId = "25913", stationName = "MAGADAN", region = "Oblast Kirow"),
//        WeatherStation(stationId = "27199", stationName = "KIROV", region = "Oblast Kirow"),
//        WeatherStation(stationId = "27333", stationName = "KOSTROMA", region = "Oblast Kostroma"),
//        WeatherStation(stationId = "28224", stationName = "PERM", region = "Region Perm"),
//        WeatherStation(
//            stationId = "28411",
//            stationName = "IZHEVSK",
//            region = "Udmurtische Republik"
//        ),
//        WeatherStation(stationId = "28506", stationName = "YELABUGA", region = "Tatarstan"),
//        WeatherStation(
//            stationId = "28676",
//            stationName = "PETROPAVLOVSK",
//            region = "Nordkasachstan"
//        ),
//        WeatherStation(stationId = "34122", stationName = "VORONEZ", region = "Oblast Woronesch"),
//        WeatherStation(stationId = "34172", stationName = "SARATOW", region = "Oblast Saratow"),
//        WeatherStation(stationId = "34467", stationName = "VOLGOGRAD", region = "Oblast Wolgograd"),
//        WeatherStation(stationId = "34691", stationName = "NOVYY USHTOGAN", region = "Atyrau"),
//        WeatherStation(stationId = "34949", stationName = "STAVROPOL", region = "Region Stawropol"),
//        WeatherStation(stationId = "35078", stationName = "ATBASAR", region = "Aqmola"),
//        WeatherStation(stationId = "35671", stationName = "ZHEZKAZGAN", region = "Qaraghandy"),
//        WeatherStation(stationId = "35700", stationName = "GUR?YEV", region = "Atyrau"),
//        WeatherStation(stationId = "35796", stationName = "BALKHASH", region = "Qaraghandy"),
//        WeatherStation(stationId = "36003", stationName = "PAVLODAR", region = "Pawlodar"),
//        WeatherStation(stationId = "36428", stationName = "ULKEN NARYN", region = "Ostkasachstan"),
//        WeatherStation(stationId = "36639", stationName = "URZHAR", region = "Ostkasachstan"),
//        WeatherStation(stationId = "36821", stationName = "BAKANAS", region = "Almaty"),
//        WeatherStation(stationId = "36859", stationName = "PANFILOV", region = "Almaty"),
//        WeatherStation(
//            stationId = "36927",
//            stationName = "BALYKTSCHY (RYBACHE)",
//            region = "Gebiet Yssykköl"
//        ),
//        WeatherStation(stationId = "36974", stationName = "NARYN", region = "Gebiet Naryn"),
//        WeatherStation(stationId = "36985", stationName = "KARAKOLKA", region = "Gebiet Yssykköl"),
//        WeatherStation(
//            stationId = "37006",
//            stationName = "NOVOROSSIJSK",
//            region = "Region Krasnodar"
//        ),
//        WeatherStation(stationId = "37177", stationName = "GAGRY"),
//        WeatherStation(stationId = "37272", stationName = "TKVARCHELI"),
//        WeatherStation(
//            stationId = "37279",
//            stationName = "ZUGDIDI",
//            region = "Mingrelien und Oberswanetien"
//        ),
//        WeatherStation(
//            stationId = "37308",
//            stationName = "AMBROLAURI",
//            region = "Ratscha-Letschchumi und Niederswanetien"
//        ),
//        WeatherStation(stationId = "37395", stationName = "KUTAISI", region = "Imeretien"),
//        WeatherStation(stationId = "37416", stationName = "CHINVALY"),
//        WeatherStation(stationId = "37437", stationName = "DUSHETI", region = "Mzcheta-Mtianeti"),
//        WeatherStation(
//            stationId = "37514",
//            stationName = "AKHALTSIKHE",
//            region = "Samzche-Dschawachetien"
//        ),
//        WeatherStation(stationId = "37531", stationName = "GORI", region = "Innerkartlien"),
//        WeatherStation(stationId = "37545", stationName = "TBILISI (TIFLIS)", region = "Tbilisi"),
//        WeatherStation(stationId = "37566", stationName = "SAGAREDZO", region = "Kachetien"),
//        WeatherStation(stationId = "37575", stationName = "ZAKATALY"),
//        WeatherStation(stationId = "37609", stationName = "ASHOTSK", region = "Schirak"),
//        WeatherStation(stationId = "37621", stationName = "BOLNISI", region = "Niederkartlien"),
//        WeatherStation(stationId = "37651", stationName = "SHIRAKI", region = "Kachetien"),
//        WeatherStation(stationId = "37673", stationName = "KHACHMAZ"),
//        WeatherStation(stationId = "37675", stationName = "KUBA"),
//        WeatherStation(stationId = "37686", stationName = "GYUMRI", region = "Schirak"),
//        WeatherStation(stationId = "37693", stationName = "STEPANAVAN", region = "Lori"),
//        WeatherStation(stationId = "37699", stationName = "APARAN", region = "Aragazotn"),
//        WeatherStation(stationId = "37704", stationName = "VANADZOR", region = "Lori"),
//        WeatherStation(stationId = "37711", stationName = "IDZHEVAN", region = "Tawusch"),
//        WeatherStation(stationId = "37717", stationName = "SEVAN LAKE", region = "Gegharkunik"),
//        WeatherStation(stationId = "37735", stationName = "GYANDJA"),
//        WeatherStation(stationId = "37747", stationName = "YEVLAKH"),
//        WeatherStation(stationId = "37749", stationName = "GEOKCHAY"),
//        WeatherStation(stationId = "37756", stationName = "MARAZA"),
//        WeatherStation(stationId = "37759", stationName = "SUMGAIT"),
//        WeatherStation(stationId = "37785", stationName = "ASHTARAK", region = "Aragazotn"),
//        WeatherStation(stationId = "37787", stationName = "ARMAVIR", region = "Armawir"),
//        WeatherStation(stationId = "37871", stationName = "ARTASHAT", region = "Ararat"),
//        WeatherStation(stationId = "37893", stationName = "AGDAM"),
//        WeatherStation(stationId = "37895", stationName = "STEPANAKERT"),
//        WeatherStation(stationId = "37897", stationName = "SISIAN", region = "Sjunik"),
//        WeatherStation(stationId = "37905", stationName = "ZHDANOVSK"),
//        WeatherStation(stationId = "37959", stationName = "KAFAN"),
//        WeatherStation(stationId = "37972", stationName = "BILASUVAR"),
//        WeatherStation(stationId = "37985", stationName = "LENKORAN?"),
//        WeatherStation(stationId = "38062", stationName = "KYZYL-ORDA", region = "Qysylorda"),
//        WeatherStation(stationId = "38111", stationName = "AKTAU", region = "Mangghystau"),
//        WeatherStation(stationId = "38141", stationName = "ZHASLYK", region = "Karakalpakistan"),
//        WeatherStation(stationId = "38178", stationName = "AKBAYTAL", region = "Provinz Navoiy"),
//        WeatherStation(stationId = "38232", stationName = "AK-KUDUK", region = "Mangghystau"),
//        WeatherStation(stationId = "38264", stationName = "NUKUS CITY", region = "Karakalpakistan"),
//        WeatherStation(
//            stationId = "38328",
//            stationName = "SHYMKENT (CHIMKENT)",
//            region = "Südkasachstan"
//        ),
//        WeatherStation(stationId = "38343", stationName = "KULAN", region = "Schambyl"),
//        WeatherStation(stationId = "38345", stationName = "TALAS", region = "Gebiet Talas"),
//        WeatherStation(stationId = "38388", stationName = "EKEZHE", region = "Daşoguz"),
//        WeatherStation(stationId = "38392", stationName = "DASHOGUZ (TASHAUZ)", region = "Daşoguz"),
//        WeatherStation(stationId = "38396", stationName = "URGENCH", region = "Choresmien"),
//        WeatherStation(stationId = "38413", stationName = "TAMDYBULAK", region = "Provinz Navoiy"),
//        WeatherStation(stationId = "38462", stationName = "PSKEM", region = "Taschkent"),
//        WeatherStation(stationId = "38511", stationName = "CHAGYL", region = "Balkan welaýaty"),
//        WeatherStation(stationId = "38567", stationName = "NAVOI", region = "Provinz Navoiy"),
//        WeatherStation(stationId = "38579", stationName = "DZHIZAK", region = "Provinz Jizzax"),
//        WeatherStation(stationId = "38583", stationName = "SYRDAR?YA", region = "Provinz Sirdaryo"),
//        WeatherStation(stationId = "38599", stationName = "KHUDJAND", region = "Sughd"),
//        WeatherStation(stationId = "38611", stationName = "NAMANGAN", region = "Provinz Namangan"),
//        WeatherStation(stationId = "38613", stationName = "DZHALAL-ABAD", region = "Dschalalabat"),
//        WeatherStation(stationId = "38616", stationName = "KARA-SUU", region = "Osch"),
//        WeatherStation(stationId = "38618", stationName = "FERGANA", region = "Provinz Fargʻona"),
//        WeatherStation(stationId = "38656", stationName = "YERBENT", region = "Ahal welaýaty"),
//        WeatherStation(stationId = "38683", stationName = "BUHARA (BUKHARA)", region = "Buchara"),
//        WeatherStation(stationId = "38687", stationName = "CHARDZHOU", region = "Lebap welaýaty"),
//        WeatherStation(stationId = "38705", stationName = "PENDZHIKENT", region = "Sughd"),
//        WeatherStation(stationId = "38713", stationName = "URA-TYUBE", region = "Sughd"),
//        WeatherStation(stationId = "38750", stationName = "ESENGULY", region = "Balkan welaýaty"),
//        WeatherStation(stationId = "38763", stationName = "SERDAR", region = "Balkan welaýaty"),
//        WeatherStation(stationId = "38812", stationName = "KARSHI", region = "Provinz Qashqadaryo"),
//        WeatherStation(
//            stationId = "38851",
//            stationName = "RASHT",
//            region = "Der Republik unterstellte Bezirke"
//        ),
//        WeatherStation(stationId = "38856", stationName = "DARVAZ", region = "Berg-Badachschan"),
//        WeatherStation(stationId = "38869", stationName = "IRHT", region = "Berg-Badachschan"),
//        WeatherStation(stationId = "38875", stationName = "KARAKUL?", region = "Berg-Badachschan"),
//        WeatherStation(
//            stationId = "38895",
//            stationName = "MARY (BAYRAM-ALI)",
//            region = "Mary welaýaty"
//        ),
//        WeatherStation(stationId = "38911", stationName = "KERKI", region = "Lebap welaýaty"),
//        WeatherStation(stationId = "38933", stationName = "KURGAN-TYUBE", region = "Chatlon"),
//        WeatherStation(stationId = "38947", stationName = "PYANDZH", region = "Chatlon"),
//        WeatherStation(stationId = "38974", stationName = "SERAKHS", region = "Ahal welaýaty"),
//        WeatherStation(stationId = "38987", stationName = "KUSHKA", region = "Mary welaýaty"),
//        WeatherStation(stationId = "40001", stationName = "KAMISHLI", region = "Al-Hasaka"),
//        WeatherStation(stationId = "40016", stationName = "HASSAKAH", region = "Al-Hasaka"),
//        WeatherStation(stationId = "40039", stationName = "RAQQA", region = "Ar Raqqa"),
//        WeatherStation(
//            stationId = "40045",
//            stationName = "DEIR AZ ZAWR",
//            region = "Gouvernement Deir ez-Zor"
//        ),
//        WeatherStation(
//            stationId = "40250",
//            stationName = "H-4 IRWAISHED",
//            region = "Gouvernement Mafraq"
//        ),
//        WeatherStation(
//            stationId = "40415",
//            stationName = "DAMMAM (KING FAHD IN",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "47642", stationName = "YOKOTA AIR BASE", region = "Ar Raqqa"),
//        WeatherStation(stationId = "47808", stationName = "FUKUOKA AIRPORT"),
//        WeatherStation(stationId = "61202", stationName = "TESSALIT", region = "Region Kidal"),
//        WeatherStation(stationId = "61265", stationName = "MOPTI", region = "Region Mopti"),
//        WeatherStation(stationId = "62771", stationName = "EL OBEID", region = "Schamal Kurdufan"),
//        WeatherStation(stationId = "62810", stationName = "KADUGLI", region = "Dschanub Kurdufan"),
//        WeatherStation(stationId = "62840", stationName = "MALAKAL", region = "Upper Nile"),
//        WeatherStation(stationId = "63451", stationName = "HARAR MEDA", region = "Oromia"),
//        WeatherStation(
//            stationId = "64810",
//            stationName = "MALABO / BIOKO ISL.",
//            region = "Nordbioko"
//        ),
//        WeatherStation(
//            stationId = "65510",
//            stationName = "BOBO DIOULASSO",
//            region = "Hauts-Bassins"
//        ),
//        WeatherStation(
//            stationId = "69777",
//            stationName = "TAJI (BAGDAD AIRPT.)",
//            region = "Şırnak"
//        ),
//        WeatherStation(
//            stationId = "72204",
//            stationName = "ORLANDO MELBOURNE I.",
//            region = "Uttar Pradesh"
//        ),
//        WeatherStation(stationId = "72356", stationName = "TULSA (INT. AIRP.)", region = "Qinghai"),
//        WeatherStation(
//            stationId = "72401",
//            stationName = "RICHMOND (BYRD AIRPO",
//            region = "Xinjiang"
//        ),
//        WeatherStation(
//            stationId = "72508",
//            stationName = "HARTFORD/BRADLEY INT",
//            region = "Gebiet Talas"
//        ),
//        WeatherStation(
//            stationId = "72543",
//            stationName = "ROCKFORD GREATER ROC",
//            region = "Xinjiang"
//        ),
//        WeatherStation(
//            stationId = "72677",
//            stationName = "BILLINGS (LOGAN INT.",
//            region = "Piemont"
//        ),
//        WeatherStation(
//            stationId = "74783",
//            stationName = "FORT LAUDERDALE",
//            region = "Uttar Pradesh"
//        ),
//        WeatherStation(stationId = "82240", stationName = "PARINTINS"),
//        WeatherStation(stationId = "82244", stationName = "SANTARÉM"),
//        WeatherStation(stationId = "82280", stationName = "SÃO LUIZ"),
//        WeatherStation(stationId = "82288", stationName = "PARNAÍBA", region = "Jubbada Hoose"),
//        WeatherStation(stationId = "82317", stationName = "TEFÉ"),
//        WeatherStation(stationId = "82353", stationName = "ALTAMIRA"),
//        WeatherStation(stationId = "82400", stationName = "FERNANDO DE NORONHA", region = "Mwanza"),
//        WeatherStation(stationId = "82411", stationName = "TABATINGA"),
//        WeatherStation(stationId = "82425", stationName = "COARI"),
//        WeatherStation(stationId = "82444", stationName = "ITAITUBA"),
//        WeatherStation(stationId = "82562", stationName = "MARABÁ"),
//        WeatherStation(stationId = "82564", stationName = "IMPERATRIZ"),
//        WeatherStation(stationId = "82567", stationName = "CARAJAS"),
//        WeatherStation(
//            stationId = "82591",
//            stationName = "MOSSORO/DIX SEPT R.",
//            region = "Manyara"
//        ),
//        WeatherStation(stationId = "82598", stationName = "NATAL", region = "Manyara"),
//        WeatherStation(stationId = "82610", stationName = "EIRUNEPÉ"),
//        WeatherStation(stationId = "82640", stationName = "JACAREACANGA"),
//        WeatherStation(stationId = "82659", stationName = "ARAGUAÍNA"),
//        WeatherStation(stationId = "82795", stationName = "CAMPINA GRANDE", region = "Dodoma"),
//        WeatherStation(stationId = "82798", stationName = "JOÃO PESSOA", region = "Singida"),
//        WeatherStation(stationId = "82965", stationName = "ALTA FLORESTA"),
//        WeatherStation(stationId = "82984", stationName = "PETROLINA"),
//        WeatherStation(stationId = "82986", stationName = "PAULO AFONSO", region = "Lindi"),
//        WeatherStation(stationId = "83065", stationName = "PALMAS", region = "Sanaag"),
//        WeatherStation(stationId = "83095", stationName = "ARACAJÚ", region = "Amhara"),
//        WeatherStation(stationId = "83208", stationName = "VILHENA"),
//        WeatherStation(stationId = "83221", stationName = "FEIRA DE SANTANA", region = "Amhara"),
//        WeatherStation(stationId = "83242", stationName = "LENÇÓIS", region = "Afar"),
//        WeatherStation(stationId = "83344", stationName = "VITÓRIA DA CONQUISTA"),
//        WeatherStation(stationId = "83349", stationName = "ILHEUS", region = "Debub"),
//        WeatherStation(stationId = "83359", stationName = "BARRA DO GARÇAS"),
//        WeatherStation(stationId = "83410", stationName = "RONDONÓPOLIS"),
//        WeatherStation(
//            stationId = "83424",
//            stationName = "GOIÂNIA",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(
//            stationId = "83460",
//            stationName = "PORTO SEGURO",
//            region = "Semienawi Kayih Bahri"
//        ),
//        WeatherStation(
//            stationId = "83470",
//            stationName = "RIO VERDE",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(stationId = "83525", stationName = "UBERLÂNDIA", region = "Nadschran"),
//        WeatherStation(stationId = "83531", stationName = "PATOS DE MINAS", region = "Nadschran"),
//        WeatherStation(
//            stationId = "83543",
//            stationName = "GOVERNADOR VALADARES",
//            region = "Provinz Asir"
//        ),
//        WeatherStation(stationId = "83552", stationName = "CORUMBÁ", region = "al-Wusta"),
//        WeatherStation(stationId = "83576", stationName = "UBERABA", region = "asch-Scharqiyya"),
//        WeatherStation(
//            stationId = "83618",
//            stationName = "TRÊS LAGOAS",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83635", stationName = "DIVINÓPOLIS", region = "Provinz Riad"),
//        WeatherStation(stationId = "83649", stationName = "VITÓRIA", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "83652",
//            stationName = "RIBEIRÃO PRETO",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "83659", stationName = "DOURADOS", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83672", stationName = "ARAÇATUBA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83692", stationName = "JUIZ DE FORA", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "83703",
//            stationName = "PONTA PORA AEROPORTO",
//            region = "az-Zahira"
//        ),
//        WeatherStation(
//            stationId = "83716",
//            stationName = "PRESIDENTE PRUDENTE",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83719", stationName = "CABO FRIO", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "83722",
//            stationName = "BAURU/AREALVA",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83726", stationName = "SAO CARLOS", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83755", stationName = "SANTOS DUMONT", region = "Provinz Riad"),
//        WeatherStation(stationId = "83767", stationName = "MARINGÁ", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83768", stationName = "LONDRINA", region = "asch-Scharqiyya"),
//        WeatherStation(
//            stationId = "83809",
//            stationName = "SÃO JOSÉ DOS CAMPOS",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(
//            stationId = "83818",
//            stationName = "SANTOS AEROPORTO",
//            region = "Provinz Riad"
//        ),
//        WeatherStation(stationId = "83828", stationName = "TOLEDO"),
//        WeatherStation(
//            stationId = "83837",
//            stationName = "PONTA GROSSA",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "83840", stationName = "CURITIBA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83883", stationName = "CHAPECO"),
//        WeatherStation(stationId = "83891", stationName = "LAGES"),
//        WeatherStation(stationId = "83905", stationName = "JOINVILLE", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83914", stationName = "PASSO FUNDO", region = "Fars"),
//        WeatherStation(stationId = "83926", stationName = "NAVEGANTES", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "83928", stationName = "URUGUAIANA", region = "Kerman"),
//        WeatherStation(stationId = "83937", stationName = "SANTA MARIA", region = "Fars"),
//        WeatherStation(stationId = "83942", stationName = "CAXIAS DO SUL", region = "Buschehr"),
//        WeatherStation(stationId = "83981", stationName = "BAGE/GUSTAVO KRAEMER", region = "Yazd"),
//        WeatherStation(stationId = "83985", stationName = "PELOTAS", region = "Isfahan"),
//        WeatherStation(stationId = "85244", stationName = "SANTA CRUZ- VIRU"),
//        WeatherStation(stationId = "86622", stationName = "CACOAL"),
//        WeatherStation(stationId = "86626", stationName = "SINOP"),
//        WeatherStation(stationId = "86645", stationName = "SORRISO"),
//        WeatherStation(stationId = "86652", stationName = "BARREIRAS"),
//        WeatherStation(stationId = "86676", stationName = "VALENÇA", region = "Tigray"),
//        WeatherStation(
//            stationId = "86816",
//            stationName = "BARRETOS/CHAFEI AMS.",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(
//            stationId = "87155",
//            stationName = "RESISTENCIA AIRPORT",
//            region = "Sistan und Belutschistan"
//        ),
//        WeatherStation(stationId = "87480", stationName = "ROSARIO", region = "Farah"),
//        WeatherStation(stationId = "89004", stationName = "SANAE-AWS"),
//        WeatherStation(
//            stationId = "89574",
//            stationName = "PROGRESS",
//            region = "Autonomer Kreis der Jamal-Nenzen"
//        ),
//        WeatherStation(stationId = "F9402", stationName = "CASCAVEL"),
//        WeatherStation(stationId = "F9403", stationName = "CACADOR"),
//        WeatherStation(stationId = "F9404", stationName = "CRICIÚMA"),
//        WeatherStation(
//            stationId = "F9405",
//            stationName = "CALDAS NOVAS",
//            region = "Gouvernement Hadramaut"
//        ),
//        WeatherStation(stationId = "F9406", stationName = "BONITO", region = "ad-Dachiliyya"),
//        WeatherStation(stationId = "F9407", stationName = "GUARAPUAVA", region = "ar-Rayyan"),
//        WeatherStation(stationId = "F9408", stationName = "IPATINGA", region = "Provinz Asir"),
//        WeatherStation(
//            stationId = "F9409",
//            stationName = "JAGUARUNA",
//            region = "Gouvernement Ahmadi"
//        ),
//        WeatherStation(stationId = "F9410", stationName = "JI-PARANÁ"),
//        WeatherStation(
//            stationId = "F9411",
//            stationName = "JUAZEIRO DO NORTE",
//            region = "Dar es Salam"
//        ),
//        WeatherStation(stationId = "F9412", stationName = "MARILIA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "F9413", stationName = "SANTO ÂNGELO", region = "Fars"),
//        WeatherStation(
//            stationId = "F9414",
//            stationName = "SÃO JOSÉ D. R. PRETO",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "F9415", stationName = "PORTO DE TROMBETAS"),
//        WeatherStation(stationId = "F9416", stationName = "UNA", region = "Maekel"),
//        WeatherStation(stationId = "F9417", stationName = "VAG", region = "Provinz Riad"),
//        WeatherStation(stationId = "F9418", stationName = "TEIXEIRA DE FREITAS"),
//        WeatherStation(
//            stationId = "F9419",
//            stationName = "POLO TURISTICO",
//            region = "Garissa County"
//        ),
//        WeatherStation(stationId = "F9420", stationName = "MALDONADO", region = "Semnan"),
//        WeatherStation(
//            stationId = "F9421",
//            stationName = "BELO HORIZONTE AIRP.",
//            region = "Provinz Asir"
//        ),
//        WeatherStation(stationId = "F9422", stationName = "JUIZ DE FORA", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "F9423",
//            stationName = "FORT WORTH-ALLIANCE,",
//            region = "Qinghai"
//        ),
//        WeatherStation(
//            stationId = "F9424",
//            stationName = "BAURU/AREALVA APT.",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(
//            stationId = "F9425",
//            stationName = "ARACATI",
//            region = "Taita-Taveta County"
//        ),
//        WeatherStation(
//            stationId = "F9426",
//            stationName = "CRUZ/ARISTON PESSOA",
//            region = "Garissa County"
//        ),
//        WeatherStation(stationId = "F9427", stationName = "MACAE", region = "Provinz Mekka"),
//        WeatherStation(
//            stationId = "F9428",
//            stationName = "PONTA GROSSA",
//            region = "asch-Scharqiyya"
//        ),
//        WeatherStation(stationId = "F9429", stationName = "PATO BRANCO"),
//        WeatherStation(stationId = "F9430", stationName = "ARARAQUARA", region = "asch-Scharqiyya"),
//        WeatherStation(stationId = "F9431", stationName = "UMUARAMA", region = "Abu Dhabi"),
//        WeatherStation(stationId = "F9432", stationName = "PATO BRANCO AIRPORT"),
//        WeatherStation(stationId = "F9433", stationName = "GLAUBER DE ANDRADE"),
//        WeatherStation(stationId = "N9609", stationName = "ABYEI"),
//        WeatherStation(stationId = "P0611", stationName = "DHAKA ZIA INTL.", region = "Dhaka"),
//        WeatherStation(stationId = "P0612", stationName = "BANGALURU", region = "Karnataka"),
//        WeatherStation(stationId = "P0613", stationName = "COCHIN", region = "Kerala"),
//        WeatherStation(stationId = "P0614", stationName = "CALICUT", region = "Kerala"),
//        WeatherStation(stationId = "P0615", stationName = "HYDERABAD", region = "Telangana"),
//        WeatherStation(stationId = "P0641", stationName = "GAMBELLA", region = "Benishangul-Gumuz"),
//        WeatherStation(
//            stationId = "P0650",
//            stationName = "DIASS-THIES AIRPORT",
//            region = "Region Barh El Gazel"
//        ),
//        WeatherStation(stationId = "89014", stationName = "NORDENSKIOLD BASE"),
//        WeatherStation(stationId = "89022", stationName = "HALLEY"),
//        WeatherStation(stationId = "89504", stationName = "TROLL"),
//        WeatherStation(stationId = "89507", stationName = "KOHNEN"),
//        WeatherStation(stationId = "89606", stationName = "VOSTOK")
    )

    val stationNames: List<String> = _stations.map { it.stationName }

    fun getWeatherStation(stationName: String): WeatherStation {
        return _stations.first { it.stationName == stationName }
    }
}


data class WeatherStation(
    val stationId: String,
    val stationName: String,
    val region: String? = null
)

fun WeatherStation.displayName(): String {
    var displayName = stationName
    if (region?.isNotEmpty() == true) {
        displayName = "$displayName, $region"
    }
    return displayName
}