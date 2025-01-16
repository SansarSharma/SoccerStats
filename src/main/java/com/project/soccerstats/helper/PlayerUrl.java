package com.project.soccerstats.helper;

import java.util.*;

/**
 * PlayerUrl.java
 * This class provides a mapping of player names to their respective URLs for profile and achievements data.
 * The data is categorized for better organization, e.g., current players, retired players.
 */
public class PlayerUrl {

    /**
     * Method - Player URL Provider
     * This method returns a map containing player names as keys and a list of their respective URLs as values.
     * No parameters
     * Return type: Map<String, List<String>> - A map with player names and their URLs.
     */
    public static Map<String, List<String>> getPlayerUrls() {
        Map<String, List<String>> playerUrls = new LinkedHashMap<>();

        //Retired Players
        //Attackers
        playerUrls.put("Pele", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/pele/profil/spieler/17121", "https://www.transfermarkt.us/pele/erfolge/spieler/17121")));

        playerUrls.put("Diego Maradona", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/diego-maradona/profil/spieler/8024", "https://www.transfermarkt.us/diego-maradona/erfolge/spieler/8024")));

        playerUrls.put("Johan Cruyff", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/johan-cruyff/profil/spieler/8021", "https://www.transfermarkt.us/johan-cruyff/erfolge/spieler/8021")));

        playerUrls.put("Ronaldo", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ronaldo/profil/spieler/3140", "https://www.transfermarkt.us/ronaldo/erfolge/spieler/3140")));

        playerUrls.put("Alfredo di Stefano", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/alfredo-di-stefano/profil/spieler/135778", "https://www.transfermarkt.us/alfredo-di-stefano/erfolge/spieler/135778")));

        playerUrls.put("Mane Garrincha", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/mane-garrincha/profil/spieler/151263", "https://www.transfermarkt.us/mane-garrincha/erfolge/spieler/151263")));

        playerUrls.put("Karl-Heinz Rummenigge", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/karl-heinz-rummenigge/profil/spieler/72343", "https://www.transfermarkt.us/karl-heinz-rummenigge/erfolge/spieler/72343")));

        playerUrls.put("Kevin Keegan", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/kevin-keegan/profil/spieler/85458", "https://www.transfermarkt.us/kevin-keegan/erfolge/spieler/85458")));

        playerUrls.put("Gunnar Nordahl", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gunnar-nordahl/profil/spieler/140644", "https://www.transfermarkt.us/gunnar-nordahl/erfolge/spieler/140644")));

        playerUrls.put("George Weah", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/george-weah/profil/spieler/8542", "https://www.transfermarkt.us/george-weah/erfolge/spieler/8542")));

        playerUrls.put("Paolo Rossi", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/paolo-rossi/profil/spieler/116757", "https://www.transfermarkt.us/paolo-rossi/erfolge/spieler/116757")));

        playerUrls.put("Omar Sivori", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/omar-sivori/profil/spieler/50816", "https://www.transfermarkt.us/omar-sivori/erfolge/spieler/50816")));

        playerUrls.put("Jairzinho", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/jairzinho/profil/spieler/145510", "https://www.transfermarkt.us/jairzinho/erfolge/spieler/145510")));

        playerUrls.put("Hugo Sanchez", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/hugo-sanchez/profil/spieler/84528", "https://www.transfermarkt.us/hugo-sanchez/erfolge/spieler/84528")));

        playerUrls.put("Gerd Muller", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gerd-muller/profil/spieler/35604", "https://www.transfermarkt.us/gerd-muller/erfolge/spieler/35604")));

        playerUrls.put("Ferenc Puskas", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ferenc-puskas/profil/spieler/103092", "https://www.transfermarkt.us/ferenc-puskas/erfolge/spieler/103092")));

        playerUrls.put("George Best", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/george-best/profil/spieler/174986", "https://www.transfermarkt.us/george-best/erfolge/spieler/174986")));

        playerUrls.put("Marco van Basten", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/marco-van-basten/profil/spieler/74471", "https://www.transfermarkt.us/marco-van-basten/erfolge/spieler/74471")));

        playerUrls.put("Eusebio", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/eusebio/profil/spieler/89230", "https://www.transfermarkt.us/eusebio/erfolge/spieler/89230")));

        playerUrls.put("Romario", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/romario/profil/spieler/7942", "https://www.transfermarkt.us/romario/erfolge/spieler/7942")));

        playerUrls.put("Raymond Kopa", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/raymond-kopa/profil/spieler/170730", "https://www.transfermarkt.us/raymond-kopa/erfolge/spieler/170730")));

        playerUrls.put("Giuseppe Meazza", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/giuseppe-meazza/profil/spieler/183779", "https://www.transfermarkt.us/giuseppe-meazza/erfolge/spieler/183779")));

        playerUrls.put("Ronaldinho", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ronaldinho/profil/spieler/3373", "https://www.transfermarkt.us/ronaldinho/erfolge/spieler/3373")));

        playerUrls.put("Socrates", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/socrates/profil/spieler/117633", "https://www.transfermarkt.us/socrates/erfolge/spieler/117633")));

        playerUrls.put("Sandor Kocsis", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/sandor-kocsis/profil/spieler/136482", "https://www.transfermarkt.us/sandor-kocsis/erfolge/spieler/136482")));

        playerUrls.put("Rivelino", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/roberto-rivelino/profil/spieler/10201", "https://www.transfermarkt.us/roberto-rivelino/erfolge/spieler/10201")));

        playerUrls.put("Luis Suarez Miramontes", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/luis-suarez/profil/spieler/172315", "https://www.transfermarkt.us/luis-suarez/erfolge/spieler/172315")));

        playerUrls.put("Hristo Stoichkov", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/hristo-stoichkov/profil/spieler/7938", "https://www.transfermarkt.us/hristo-stoichkov/erfolge/spieler/7938")));

        playerUrls.put("Fernando Torres", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/fernando-torres/leistungsdaten/spieler/7767/plus/0?saison=ges", "https://www.transfermarkt.us/fernando-torres/erfolge/spieler/7767")));

        playerUrls.put("Gonzalo Higuain", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gonzalo-higuain/leistungsdaten/spieler/39153", "https://www.transfermarkt.us/gonzalo-higuain/erfolge/spieler/39153")));

        playerUrls.put("Gareth Bale", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gareth-bale/leistungsdaten/spieler/39381/plus/0?saison=ges", "https://www.transfermarkt.us/gareth-bale/erfolge/spieler/39381")));
        
        //Midfielders
        playerUrls.put("Zinedine Zidane", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/zinedine-zidane/profil/spieler/3111", "https://www.transfermarkt.us/zinedine-zidane/erfolge/spieler/3111")));

        playerUrls.put("Johan Neeskens", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/johan-neeskens/profil/spieler/135643", "https://www.transfermarkt.us/johan-neeskens/erfolge/spieler/135643")));

        playerUrls.put("Paul Breitner", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/paul-breitner/profil/spieler/13766", "https://www.transfermarkt.us/paul-breitner/erfolge/spieler/13766")));

        playerUrls.put("Michel Platini", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/michel-platini/profil/spieler/88994", "https://www.transfermarkt.us/michel-platini/erfolge/spieler/88994")));

        playerUrls.put("Roberto Baggio", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/roberto-baggio/profil/spieler/4153", "https://www.transfermarkt.us/roberto-baggio/erfolge/spieler/4153")));

        playerUrls.put("Zico", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/zico/profil/spieler/117619", "https://www.transfermarkt.us/zico/erfolge/spieler/117619")));

        playerUrls.put("Bobby Charlton", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/sir-bobby-charlton/profil/spieler/174874", "https://www.transfermarkt.us/sir-bobby-charlton/erfolge/spieler/174874")));

        playerUrls.put("Ruud Gullit", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ruud-gullit/profil/spieler/101045", "https://www.transfermarkt.us/ruud-gullit/erfolge/spieler/101045")));

        playerUrls.put("Lothar Matthaus", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/lothar-matthaus/profil/spieler/1527", "https://www.transfermarkt.us/lothar-matthaus/erfolge/spieler/1527")));

        playerUrls.put("Iniesta", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/andres-iniesta/profil/spieler/7600", "https://www.transfermarkt.us/andres-iniesta/erfolge/spieler/7600")));

        playerUrls.put("Xavi Hernandez", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/xavi/profil/spieler/7607", "https://www.transfermarkt.us/xavi/erfolge/spieler/7607")));

        playerUrls.put("Kaka", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/kaka/profil/spieler/3366", "https://www.transfermarkt.us/kaka/erfolge/spieler/3366")));

        //Defenders
        playerUrls.put("Franz Beckenbauer", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/franz-beckenbauer/profil/spieler/72347", "https://www.transfermarkt.us/franz-beckenbauer/erfolge/spieler/72347")));

        playerUrls.put("Paolo Maldini", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/paolo-maldini/profil/spieler/5803", "https://www.transfermarkt.us/paolo-maldini/erfolge/spieler/5803")));

        playerUrls.put("Franco Baresi", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/franco-baresi/profil/spieler/42049", "https://www.transfermarkt.us/franco-baresi/erfolge/spieler/42049")));

        playerUrls.put("Bobby Moore", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/bobby-moore/profil/spieler/196086", "https://www.transfermarkt.us/bobby-moore/erfolge/spieler/196086")));

        playerUrls.put("Javier Mascherano", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/javier-mascherano/leistungsdaten/spieler/19981/plus/0?saison=ges", "https://www.transfermarkt.us/javier-mascherano/erfolge/spieler/19981")));

        playerUrls.put("Dani Alves", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/dani-alves/leistungsdaten/spieler/15951/plus/0?saison=ges", "https://www.transfermarkt.us/dani-alves/erfolge/spieler/15951")));

        playerUrls.put("Jesus Navas", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/jesus-navas/leistungsdaten/spieler/15956/plus/0?saison=ges", "https://www.transfermarkt.us/jesus-navas/erfolge/spieler/15956")));

        playerUrls.put("Gerard Pique", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gerard-pique/leistungsdaten/spieler/18944/plus/0?saison=ges", "https://www.transfermarkt.us/gerard-pique/erfolge/spieler/18944")));

        playerUrls.put("Pepe", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/pepe/leistungsdaten/spieler/14132/plus/0?saison=ges", "https://www.transfermarkt.us/pepe/erfolge/spieler/14132")));

        //Goalkeepers
        playerUrls.put("Lev Yashin", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/lev-yashin/leistungsdaten/spieler/174987", "https://www.transfermarkt.us/lev-yashin/erfolge/spieler/174987")));

        playerUrls.put("Gianluigi Buffon", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/gianluigi-buffon/leistungsdaten/spieler/5023", "https://www.transfermarkt.us/gianluigi-buffon/erfolge/spieler/5023")));

        playerUrls.put("Victor Valdes", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/victor-valdes/leistungsdaten/spieler/7589", "https://www.transfermarkt.us/victor-valdes/erfolge/spieler/7589")));

        playerUrls.put("Peter Schmeichel", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/peter-schmeichel/leistungsdaten/spieler/3465", "https://www.transfermarkt.us/peter-schmeichel/erfolge/spieler/3465")));

        playerUrls.put("Oliver Kahn", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/oliver-kahn/leistungsdaten/spieler/206", "https://www.transfermarkt.us/oliver-kahn/erfolge/spieler/206")));

        playerUrls.put("Petr Cech", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/petr-cech/leistungsdaten/spieler/5658", "https://www.transfermarkt.us/petr-cech/erfolge/spieler/5658")));

        playerUrls.put("Edwin van der Sar", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/edwin-van-der-sar/leistungsdaten/spieler/3516", "https://www.transfermarkt.us/edwin-van-der-sar/erfolge/spieler/3516")));

        playerUrls.put("Iker Casillas", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/iker-casillas/leistungsdaten/spieler/3979/plus/0?saison=ges", "https://www.transfermarkt.us/iker-casillas/erfolge/spieler/3979")));
        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Premier League Teams
        //Arsenal
        //Attackers
        playerUrls.put("Bukaya Saka", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/bukayo-saka/leistungsdaten/spieler/433177/plus/0?saison=ges", "https://www.transfermarkt.us/bukayo-saka/erfolge/spieler/433177")));

        //Midfielders
        playerUrls.put("Martin Odegaard", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/martin-odegaard/leistungsdaten/spieler/316264/plus/0?saison=ges", "https://www.transfermarkt.us/martin-odegaard/erfolge/spieler/316264")));

        playerUrls.put("Declan Rice", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/declan-rice/leistungsdaten/spieler/357662/plus/0?saison=ges", "https://www.transfermarkt.us/declan-rice/erfolge/spieler/357662")));

        //Defenders
        playerUrls.put("William Saliba", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/william-saliba/leistungsdaten/spieler/495666/plus/0?saison=ges", "https://www.transfermarkt.us/william-saliba/erfolge/spieler/495666")));

        //Goalkeepers


        //Liverpool
        //Attackers
        playerUrls.put("Mohamed Salah", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/mohamed-salah/leistungsdaten/spieler/148455/plus/0?saison=ges", "https://www.transfermarkt.us/mohamed-salah/erfolge/spieler/148455")));

        //Midfielders

        //Defenders
        playerUrls.put("Virgil van Dijk", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/virgil-van-dijk/leistungsdaten/spieler/139208/plus/0?saison=ges", "https://www.transfermarkt.us/virgil-van-dijk/erfolge/spieler/139208")));

        //Goalkeepers
        playerUrls.put("Alisson", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/alisson/leistungsdaten/spieler/105470/plus/0?saison=ges", "https://www.transfermarkt.us/alisson/erfolge/spieler/105470")));


        //Manchester City
        //Attackers
        playerUrls.put("Erling Haaland", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/erling-haaland/leistungsdaten/spieler/418560/plus/0?saison=ges", "https://www.transfermarkt.us/erling-haaland/erfolge/spieler/418560")));

        playerUrls.put("Phil Foden", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/phil-foden/leistungsdaten/spieler/406635/plus/0?saison=ges", "https://www.transfermarkt.us/phil-foden/erfolge/spieler/406635")));

        //Midfielders
        playerUrls.put("Rodri", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/rodri/leistungsdaten/spieler/357565/plus/0?saison=ges", "https://www.transfermarkt.us/rodri/erfolge/spieler/357565")));

        playerUrls.put("Kevin De Bruyne", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/kevin-de-bruyne/leistungsdaten/spieler/88755/plus/0?saison=ges", "https://www.transfermarkt.us/kevin-de-bruyne/erfolge/spieler/88755")));

        playerUrls.put("Bernardo Silva", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/bernardo-silva/leistungsdaten/spieler/241641/plus/0?saison=ges", "https://www.transfermarkt.us/bernardo-silva/erfolge/spieler/241641")));
        //Defenders
        playerUrls.put("Ruben Dias", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ruben-dias/leistungsdaten/spieler/258004/plus/0?saison=ges", "https://www.transfermarkt.us/ruben-dias/erfolge/spieler/258004")));

        //Goalkeepers


        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Bundesliga League Teams
        //Bayern
        //Attackers
        playerUrls.put("Harry Kane", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/harry-kane/leistungsdaten/spieler/132098/plus/0?saison=ges", "https://www.transfermarkt.us/harry-kane/erfolge/spieler/132098")));

        //Midfielders
        playerUrls.put("Jamal Muisala", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/jamal-musiala/leistungsdaten/spieler/580195/plus/0?saison=ges", "https://www.transfermarkt.us/jamal-musiala/erfolge/spieler/580195")));

        //Defenders

        //Goalkeepers
        playerUrls.put("Manuel Neuer", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/manuel-neuer/leistungsdaten/spieler/17259/plus/0?saison=ges", "https://www.transfermarkt.us/manuel-neuer/erfolge/spieler/17259")));

        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //La Liga League Teams
        //Barcelona
        //Attackers
        playerUrls.put("Lamine Yamal", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/lamine-yamal/leistungsdaten/spieler/937958/plus/0?saison=ges", "https://www.transfermarkt.us/lamine-yamal/erfolge/spieler/937958")));

        playerUrls.put("Robert Lewandowski", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/robert-lewandowski/leistungsdaten/spieler/38253/plus/0?saison=ges", "https://www.transfermarkt.us/robert-lewandowski/erfolge/spieler/38253")));

        playerUrls.put("Raphinha", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/raphinha/leistungsdaten/spieler/411295/plus/0?saison=ges", "https://www.transfermarkt.us/raphinha/erfolge/spieler/411295")));
        //Midfielders

        //Defenders
        playerUrls.put("Ronald Araujo", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/ronald-araujo/leistungsdaten/spieler/480267/plus/0?saison=ges", "https://www.transfermarkt.us/ronald-araujo/erfolge/spieler/480267")));

        //Goalkeepers
        playerUrls.put("Marc-Andre ter Stegen",
                new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/marc-andre-ter-stegen/leistungsdaten/spieler/74857/plus/0?saison=ges", "https://www.transfermarkt.us/marc-andre-ter-stegen/erfolge/spieler/74857")));

        //Real Madrid
        //Attackers
        playerUrls.put("Kylian Mbappe", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/kylian-mbappe/leistungsdaten/spieler/342229/plus/0?saison=ges", "https://www.transfermarkt.us/kylian-mbappe/erfolge/spieler/342229")));

        playerUrls.put("Vinicius Junior", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/vinicius-junior/leistungsdaten/spieler/371998/plus/0?saison=ges", "https://www.transfermarkt.us/vinicius-junior/erfolge/spieler/371998")));

        playerUrls.put("Jude Bellingham", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/jude-bellingham/leistungsdaten/spieler/581678/plus/0?saison=ges", "https://www.transfermarkt.us/jude-bellingham/erfolge/spieler/581678")));

        //Midfielders
        playerUrls.put("Luka Modric", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/luka-modric/leistungsdaten/spieler/27992/plus/0?saison=ges", "https://www.transfermarkt.us/luka-modric/erfolge/spieler/27992")));
        //Defenders
        playerUrls.put("Antonio Rudiger", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/antonio-rudiger/leistungsdaten/spieler/86202/plus/0?saison=ges", "https://www.transfermarkt.us/antonio-rudiger/erfolge/spieler/86202")));

        playerUrls.put("Daniel Carvajal", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/daniel-carvajal/leistungsdaten/spieler/138927/plus/0?saison=ges", "https://www.transfermarkt.us/daniel-carvajal/erfolge/spieler/138927")));
        //Goalkeepers


        //Atletico Madrid
        //Attackers
        playerUrls.put("Antoine Griezmann", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/antoine-griezmann/leistungsdaten/spieler/125781/plus/0?saison=ges", "https://www.transfermarkt.us/antoine-griezmann/erfolge/spieler/125781")));

        //Midfielders

        //Defenders

        //Goalkeepers

        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Serie A
        //Inter
        //Attackers
        playerUrls.put("Lautaro Martinez", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/lautaro-martinez/leistungsdaten/spieler/406625/plus/0?saison=ges", "https://www.transfermarkt.us/lautaro-martinez/erfolge/spieler/406625")));

        //Midfielders

        //Defenders

        //Goalkeepers


        // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Miscellaneous Clubs outside of top 5
        //MLS Players
        //Inter Miami
        playerUrls.put("Lionel Messi", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/lionel-messi/profil/spieler/28003", "https://www.transfermarkt.us/lionel-messi/erfolge/spieler/28003")));

        playerUrls.put("Luis Suarez", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/luis-suarez/leistungsdaten/spieler/44352", "https://www.transfermarkt.us/luis-suarez/erfolge/spieler/44352")));

        playerUrls.put("Sergio Busquets", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/sergio-busquets/leistungsdaten/spieler/65230/plus/0?saison=ges", "https://www.transfermarkt.us/sergio-busquets/erfolge/spieler/65230")));

        playerUrls.put("Jordi Alba", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/jordi-alba/leistungsdaten/spieler/69751/plus/0?saison=ges", "https://www.transfermarkt.us/jordi-alba/erfolge/spieler/69751")));

        //LA Galaxy
        playerUrls.put("Marco Reus", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/marco-reus/leistungsdaten/spieler/35207", "https://www.transfermarkt.us/marco-reus/erfolge/spieler/35207")));

        //Saudi Pro League
        //Al Nassar Players
        playerUrls.put("Cristiano Ronaldo", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/cristiano-ronaldo/leistungsdaten/spieler/8198/plus/0?saison=ges", "https://www.transfermarkt.us/cristiano-ronaldo/erfolge/spieler/8198")));

        //Al Hilal
        playerUrls.put("Neymar", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/neymar/leistungsdaten/spieler/68290/plus/0?saison=ges", "https://www.transfermarkt.us/neymar/erfolge/spieler/68290")));

        //Al-Ittihad
        playerUrls.put("Karim Benzema", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/karim-benzema/leistungsdaten/spieler/18922/plus/0?saison=ges", "https://www.transfermarkt.us/karim-benzema/erfolge/spieler/18922")));

        // Miscellaneous Players
        playerUrls.put("Sergio Ramos", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/sergio-ramos/leistungsdaten/spieler/25557/plus/0?saison=ges", "https://www.transfermarkt.us/sergio-ramos/erfolge/spieler/25557")));

        playerUrls.put("Marcelo", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/marcelo/leistungsdaten/spieler/44501/plus/0?saison=ges", "https://www.transfermarkt.us/marcelo/erfolge/spieler/44501")));

        playerUrls.put("Mats Hummels", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/mats-hummels/leistungsdaten/spieler/39728/plus/0?saison=ges", "https://www.transfermarkt.us/mats-hummels/erfolge/spieler/39728")));

        playerUrls.put("Angel Di Maria", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/angel-di-maria/leistungsdaten/spieler/45320/plus/0?saison=ges", "https://www.transfermarkt.us/angel-di-maria/erfolge/spieler/45320")));

        playerUrls.put("Joe Hart", new ArrayList<>(Arrays.asList("https://www.transfermarkt.us/joe-hart/leistungsdaten/spieler/40204", "https://www.transfermarkt.us/joe-hart/erfolge/spieler/40204")));

        return playerUrls;
    }
}
