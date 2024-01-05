/*
public class SystemRequirementsNotImplemented {
    // DONE
    // [ ] 5.0 En leier skal kunne verifisere at man har førerkort i ulike klasser
    // [ ] 5.1 - Opprette varibel for førerkort nummer, oppdatere webform for opprettelse av konto, min profil og endre profil.
    // [ ] 5.2 - Lage kobling til statens vegvesens autosys2 api slik at etter en bruker legger inn ett førekort nummer så gir applikasjonen tilbake indikatorer på hva førerkort klasser førerkortet inneholder.

    @Nested
    @DisplayName("5.0 En leier skal kunne verifisere at man har førerkort i ulike klasser")
    public class userRequirement50Test {

        @Nested
        @DisplayName("5.1 Opprette varibel for førerkort nummer, oppdatere webform for opprettelse av konto, min profil og endre profil.")
        public class systemRequirement51Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Testt() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("5.2 Lage kobling til statens vegvesens autosys2 api slik at etter en bruker legger inn ett førekort nummer så gir applikasjonen tilbake indikatorer på hva førerkort klasser førerkortet inneholder.")
        public class systemRequirement52Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }

  // TODO
    // [ ] 13.0 En leier skal kunne filtrere annonser etter ulike kriterier;  Tilgjengelighet(Opptatt eller ledig),  Tidsperiode for tilgjengelighet,  Område,  Bilmerke,  Bilmodell,  Årsmodell,  Biltype,  Antall seter,  Rekkevidde for elbil.
    // [ ] 13.1 - Etter brukeren har først søkt opp tilgjengelige annonser utifra dato og tidspunkt. Så skal det være på toppen av listen av annonser en filter kanpp hvor det gitte bruker kravet kan filtres etter.

    @Nested
    @DisplayName("13.0 En leier skal kunne filtrere annonser etter ulike kriterier;  Tilgjengelighet(Opptatt eller ledig),  Tidsperiode for tilgjengelighet,  Område,  Bilmerke,  Bilmodell,  Årsmodell,  Biltype,  Antall seter,  Rekkevidde for elbil.")
    public class userRequirement13Test {

        @Nested
        @DisplayName(13.1 Etter brukeren har først søkt opp tilgjengelige annonser utifra dato og tidspunkt. Så skal det være på toppen av listen av annonser en filter kanpp hvor det gitte bruker kravet kan filtres etter.")
        public class systemRequirement131Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 14.0 En leier skal kunne se et kart med tilgjengelige biler
    // [ ] 14.1 - Etter en bruker har søkt etter tilgjenglige biler(annonser) i en gitt tidsperiode så kan brukeren trykke på en knapp øverst i listen av annonser som står kart på. Brukeren vil da få opp ett kart hvor annonsene er heller vist som objekter på ett kart.
    // [ ] 14.2 - Ved å trykke på denne knappen skal applikasjonen spørre om å bruke lokasjonen til webleseren/mobilen.
    // [ ] 14.3 - På toppen av kartet skal det være en søke boks hvor brukeren selv kan skrive inn ett stedsnavn/adresse for å endre kart utsnitt.
    // [ ] 14.4 - Applikasjonen skal bruke Google Maps(api).

    @Nested
    @DisplayName("14.0 En leier skal kunne se et kart med tilgjengelige biler")
    public class userRequirement14Test {

        @Nested
        @DisplayName("14.1 Etter en bruker har søkt etter tilgjenglige biler(annonser) i en gitt tidsperiode så kan brukeren trykke på en knapp øverst i listen av annonser som står kart på. Brukeren vil da få opp ett kart hvor annonsene er heller vist som objekter på ett kart.")
        public class systemRequirement141Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("14.2 Ved å trykke på denne knappen skal applikasjonen spørre om å bruke lokasjonen til webleseren/mobilen.")
        public class systemRequirement142Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("14.3 På toppen av kartet skal det være en søke boks hvor brukeren selv kan skrive inn ett stedsnavn/adresse for å endre kart utsnitt.")
        public class systemRequirement143Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("14.4 Applikasjonen skal bruke Google Maps(api).")
        public class systemRequirement144Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // TODO 1. Krav [ ] 15.0 En leier skal kunne reservere bil til gitte tidsrom
    // [ ] 15.1 - Databasen for reservering/annonser må ta hensyn til brukers tidssone, samt sommer/vintertid
    // [ ] 15.2 - Før bekreftelse av en reserverasjon av en bil, må annonsen sjekkes for om hva variebelet "status fryst" er akkurat nå.

    @Nested
    @DisplayName("15.0 En leier skal kunne reservere bil til gitte tidsrom")
    public class userRequirement15Test {

        @Nested
        @DisplayName("15.1 Databasen for reservering/annonser må ta hensyn til brukers tidssone, samt sommer/vintertid")
        public class systemRequirement151Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("15.2 Før bekreftelse av en reserverasjon av en bil, må annonsen sjekkes for om hva variebelet "status fryst" er akkurat nå.")
        public class systemRequirement152Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }

// TODO
    // [ ] 17.0 En utleier skal kunne motta betalingsbekreftelse
    // [ ] 17.1 - Når en bruker har betalt en reserversjon så skal det sendes en mail til selskapet(regnskap), leietaker(kvittering/reservasjonsbekreftelse) og utleier(betalingsbekreftelse/reservasjon) med informasjon om brukeren som har leid bilen.

    @Nested
    @DisplayName("17.0 En utleier skal kunne motta betalingsbekreftelse")
    public class userRequirement17Test {

        @Nested
        @DisplayName("17.1 Når en bruker har betalt en reserversjon så skal det sendes en mail til selskapet(regnskap), leietaker(kvittering/reservasjonsbekreftelse) og utleier(betalingsbekreftelse/reservasjon) med informasjon om brukeren som har leid bilen.")
        public class systemRequirement171Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // TODO 1. Krav [ ] 18.0 En utleier skal kunne få betalt for utleie av bilen
    // TODO 1. Krav [ ] 18.1 - 5 minutter etter endt leieperiode skal utleier få en mail om at utleie er ferdig og ett regnestykke så viser hvor mye utleier vil få utbetalt som leie for bilen, fratrukket selskapets tjeneste kostnad.

    @Nested
    @DisplayName("18.0 En utleier skal kunne få betalt for utleie av bilen")
    public class userRequirement18Test {

        @Nested
        @DisplayName("18.1 5 minutter etter endt leieperiode skal utleier få en mail om at utleie er ferdig og ett regnestykke så viser hvor mye utleier vil få utbetalt som leie for bilen, fratrukket selskapets tjeneste kostnad.")
        public class systemRequirement181Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // TODO 1. Krav [ ] 19.0 En leier skal kunne kontakte utleier for å avtale henting av bil/nøkler
    // TODO 1. Krav [ ] 19.1 - Ved betalt reservasjon/utleie må reservasjonen listes opp under siden "mine reservasjoner".
    // TODO 1. Krav [ ] 19.2 - Inne på en reservasjon skal det være en knapp som oppretter ett webform hvor leieren kan fylle ut ett kontakt skjema til utleieren.
    // [ ] 19.3 - Når en leier har sendt inn ett slikt skjema skal det gå epost til utleier med innholdet av skjemaet.


    @Nested
    @DisplayName("19.0 En leier skal kunne kontakte utleier for å avtale henting av bil/nøkler")
    public class userRequirement19Test {

        @Nested
        @DisplayName("19.1 Ved betalt reservasjon/utleie må reservasjonen listes opp under siden "mine reservasjoner".")
        public class systemRequirement191Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("19.2 Inne på en reservasjon skal det være en knapp som oppretter ett webform hvor leieren kan fylle ut ett kontakt skjema til utleieren.")
        public class systemRequirement192Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("19.3 Når en leier har sendt inn ett slikt skjema skal det gå epost til utleier med innholdet av skjemaet.")
        public class systemRequirement193Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 20.0 En bruker skal kunne sende inn en rapport om bilens tilstand ved mottakelse eller tilbakelevering
    // [ ] 20.1 - Funksjon for å laste opp bilder eller ta bilder i applikasjonen.

    @Nested
    @DisplayName("20.0 En bruker skal kunne sende inn en rapport om bilens tilstand ved mottakelse eller tilbakelevering")
    public class userRequirement20Test {

        @Nested
        @DisplayName("20.1 Funksjon for å laste opp bilder eller ta bilder i applikasjonen.")
        public class systemRequirement201Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 21.0 En bruker skal kunne skrive omtale/rapportere/score en utleier etter endt leie av en bil.
    // [ ] 21.1 - På siden for "mine tidligere reservasjoner" ved feltet som viser utleier skal det være en knapp i applikasjonen som en bruker kan trykke på.
    // [ ] 21.2 - Ved bruk av denne knappen skal det dukke oppe ett webform hvor utleieren må fylle inn 1-5 score(1-5 stjerner). Og en minimum 20 tegn forklaring til score.
    // [ ] 21.3 - Ved utfylles av dette webformet skal brukeren som har blitt rapportert/scoret bli sendt en epost med score og forklaringen.
    // [ ] 21.4 - Brukere som har fått 1-2 i score skal det gå epost kopi til admin/selskapet, hvor selskapet kan da vurdere om validiteten til scoren og evt sanksjons former mot brukeren. Samt oppfølgning av utleiren som har sendt inn rapporten.

    @Nested
    @DisplayName("21.0 En bruker skal kunne skrive omtale/rapportere/score en utleier etter endt leie av en bil.")
    public class userRequirement21Test {

        @Nested
        @DisplayName("21.1 På siden for "mine tidligere reservasjoner" ved feltet som viser utleier skal det være en knapp i applikasjonen som en bruker kan trykke på.")
        public class systemRequirement211Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("21.2 Ved bruk av denne knappen skal det dukke oppe ett webform hvor utleieren må fylle inn 1-5 score(1-5 stjerner). Og en minimum 20 tegn forklaring til score.")
        public class systemRequirement212Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("21.3 Ved utfylles av dette webformet skal brukeren som har blitt rapportert/scoret bli sendt en epost med score og forklaringen.")
        public class systemRequirement213Test {
            @Test
            @DisplayName("213")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("21.4 Brukere som har fått 1-2 i score skal det gå epost kopi til admin/selskapet, hvor selskapet kan da vurdere om validiteten til scoren og evt sanksjons former mot brukeren. Samt oppfølgning av utleiren som har sendt inn rapporten.")
        public class systemRequirement214Test {
            @Test
            @DisplayName("214")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 22.0 En utleier skal kunne rapportere leietager
    // [ ] 22.1 - På siden for aktive utleier/tidligere utleie for en bruker skal det være en knapp i applikasjonen ved siden av bruker infoen for brukeren som har leid den aktuelle bilen.
    // [ ] 22.2 - Ved bruk av denne knappen skal det dukke oppe ett webform hvor utleieren må fylle inn 1-5 score(1-5 stjerner). Og en minimum 20 tegn forklaring til score.
    // [ ] 22.3 - Ved utfylles av dette webformet skal brukeren som har blitt rapportert/scoret bli sendt en epost med score og forklaringen.
    // [ ] 22.4 - Brukere som har fått 1-2 i score skal det gå epost kopi til admin/selskapet, hvor selskapet kan da vurdere om validiteten til scoren og evt sanksjons former mot brukeren. Samt oppfølgning av utleiren som har sendt inn rapporten.

    @Nested
    @DisplayName("22.0 En utleier skal kunne rapportere leietager")
    public class userRequirement22Test {

        @Nested
        @DisplayName("22.1 På siden for aktive utleier/tidligere utleie for en bruker skal det være en knapp i applikasjonen ved siden av bruker infoen for brukeren som har leid den aktuelle bilen.")
        public class systemRequirement221Test {
            @Test
            @DisplayName("221")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("22.2 Ved bruk av denne knappen skal det dukke oppe ett webform hvor utleieren må fylle inn 1-5 score(1-5 stjerner). Og en minimum 20 tegn forklaring til score.")
        public class systemRequirement222Test {
            @Test
            @DisplayName("222")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("22.3 Ved utfylles av dette webformet skal brukeren som har blitt rapportert/scoret bli sendt en epost med score og forklaringen.")
        public class systemRequirement223Test {
            @Test
            @DisplayName("223")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("22.4 Brukere som har fått 1-2 i score skal det gå epost kopi til admin/selskapet, hvor selskapet kan da vurdere om validiteten til scoren og evt sanksjons former mot brukeren. Samt oppfølgning av utleiren som har sendt inn rapporten.")
        public class systemRequirement224Test {
            @Test
            @DisplayName("224")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 23.0 En bruker skal kunne fylle ut skadeskjema som sendes til forsikringsselskap
    // [ ] 23.1 - Opprette variabel i bil klassen for aktivt forsikrings avtale pr bil objekt og med polise nummer.
    // [ ] 23.2 - Legge opp link til ett standard skadeskjema på "min side" for innloggede brukere.
    // [ ] 23.3 - Legge opp link til skadeskjema på "mine reserversjoner" siden.
    // [ ] 23.4 - Opprette felt for innsending av pdf, bilder inne på "mine reservasjoner" siden, slik at en bruker kan sende inn skadeskjema der.
    // [ ] 23.5 - Ved innsendelse av skadeskjema/dokumentasjon fra en bruker skal det sendes samlet som en epost til admin/ansvarlig for skadesaker. Innsendt dokumentasjon sees så over før selskapet selv sender det inn til gjeldende forsikrings selskap.

    @Nested
    @DisplayName("23.0 En bruker skal kunne fylle ut skadeskjema som sendes til forsikringsselskap")
    public class userRequirement23Test {

        @Nested
        @DisplayName("23.1 Opprette variabel i bil klassen for aktivt forsikrings avtale pr bil objekt og med polise nummer.")
        public class systemRequirement231Test {
            @Test
            @DisplayName("231")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("23.2 Legge opp link til ett standard skadeskjema på "min side" for innloggede brukere.")
        public class systemRequirement232Test {
            @Test
            @DisplayName("232")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("23.3 Legge opp link til skadeskjema på "mine reserversjoner" siden.")
        public class systemRequirement233Test {
            @Test
            @DisplayName("233")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("23.4 Opprette felt for innsending av pdf, bilder inne på "mine reservasjoner" siden, slik at en bruker kan sende inn skadeskjema der.")
        public class systemRequirement234Test {
            @Test
            @DisplayName("234")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("23.5 Ved innsendelse av skadeskjema/dokumentasjon fra en bruker skal det sendes samlet som en epost til admin/ansvarlig for skadesaker. Innsendt dokumentasjon sees så over før selskapet selv sender det inn til gjeldende forsikrings selskap.")
        public class systemRequirement235Test {
            @Test
            @DisplayName("235")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 24.0 En admin skal kunne endre brukerinformasjon
    // [ ] 24.1 - Bruker klassen må ha følgende variabeler timedate sist endret verdier inneholdt i bruker objektet, endret av variabel for å holde på informasjon om hvem admin som har endret objektet eller om det er brukeren som har har gjort det selv.
    // [ ] 24.2 - Ved endring av bruker objekt data utført av både admin og brukeren selv skal det alltid sendes en mail til brukeren om hva som er endret og av hvem(selv om brukeren har gjort det) og hva som er endret.

    @Nested
    @DisplayName("24.0 En admin skal kunne endre brukerinformasjon")
    public class userRequirement24Test {

        @Nested
        @DisplayName("24.1 Bruker klassen må ha følgende variabeler timedate sist endret verdier inneholdt i bruker objektet, endret av variabel for å holde på informasjon om hvem admin som har endret objektet eller om det er brukeren som har har gjort det selv.")
        public class systemRequirement241Test {
            @Test
            @DisplayName("241")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("24.2 Ved endring av bruker objekt data utført av både admin og brukeren selv skal det alltid sendes en mail til brukeren om hva som er endret og av hvem(selv om brukeren har gjort det) og hva som er endret.")
        public class systemRequirement242Test {
            @Test
            @DisplayName("242")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }

*/
/*
    // TODO
    // [ ] 25.0 En admin skal kunne slette brukere
    // [ ] 25.1 - Bruker klassen må ha følgende variabeler for sletting av brukere; status slettet bruker 0/1, kommentar ifra admin årsak slettet, timedate for endring av variabel status slettet bruker.
    // [ ] 25.2 - Ved sletting av bruker/brukerkonto må det sendes epost til brukeren som har opprettet kontoen, etter admin har lagret slettet variabelet koblet til brukeren. Når brukeren slettes må det settes en årsak av admin slik at brukeren kan se årsaken til at brukeren er slettet.
    // [ ] 25.3 - Opprette database for slettede brukere, denne databasen må inneha automatisk annonymisering av bruker data inneholdt i en bruker klasse i henhold til oppdatert GDRP lovgiving. Men kunne ivareta annonymiserte bruker objekter for at systemet kan hente ut statestikk historisk basert på slettede brukeres kontoaktivitet, for eksempel for å ivareta regnskaps dokumentasjon i henhold til regnskaps lovgivning.

    @Nested
    @DisplayName("25.0 En admin skal kunne slette brukere")
    public class userRequirement25Test {

        @Nested
        @DisplayName("25.1 Bruker klassen må ha følgende variabeler for sletting av brukere; status slettet bruker 0/1, kommentar ifra admin årsak slettet, timedate for endring av variabel status slettet bruker.")
        public class systemRequirement251Test {
            @Test
            @DisplayName("251")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("25.2 Ved sletting av bruker/brukerkonto må det sendes epost til brukeren som har opprettet kontoen, etter admin har lagret slettet variabelet koblet til brukeren. Når brukeren slettes må det settes en årsak av admin slik at brukeren kan se årsaken til at brukeren er slettet.")
        public class systemRequirement252Test {
            @Test
            @DisplayName("252")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("25.3 Opprette database for slettede brukere, denne databasen må inneha automatisk annonymisering av bruker data inneholdt i en bruker klasse i henhold til oppdatert GDRP lovgiving. Men kunne ivareta annonymiserte bruker objekter for at systemet kan hente ut statestikk historisk basert på slettede brukeres kontoaktivitet, for eksempel for å ivareta regnskaps dokumentasjon i henhold til regnskaps lovgivning.")
        public class systemRequirement253Test {
            @Test
            @DisplayName("253")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 26.0 En admin skal kunne slette annonser
    // [ ] 26.1 - Annonse klassen må ha følgende variabeler for å  sletting av annonser; status slettet 0/1, kommentar ifra admin årsak slettet, timedate for endring av variabel status fryst.
    // [ ] 26.2 - Annonser som er merket "status slettet 1" fjernes ifra databasen for annonser og flyttes til en annen database som inneholder slettede annonser, denne databasen har kun admin/regnskap etc tilgang til, ikke brukere.
    // [ ] 26.3 - Opprette database for slettede annonser.
    // [ ] 26.4 - Ved sletting av annonsen må det sendes epost til bruker som har opprettet annonsen, etter admin har lagret slettet variabelet koblet til annonsen. Når annonsen slettes må det settes en årsak av admin slik at brukeren kan se årsaken til at annonsen er slettet.

    @Nested
    @DisplayName("26.0 En admin skal kunne slette annonser")
    public class userRequirement26Test {

        @Nested
        @DisplayName("26.1 Annonse klassen må ha følgende variabeler for å  sletting av annonser; status slettet 0/1, kommentar ifra admin årsak slettet, timedate for endring av variabel status fryst.")
        public class systemRequirement261Test {
            @Test
            @DisplayName("261")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("26.2 Annonser som er merket "status slettet 1" fjernes ifra databasen for annonser og flyttes til en annen database som inneholder slettede annonser, denne databasen har kun admin/regnskap etc tilgang til, ikke brukere.")
        public class systemRequirement262Test {
            @Test
            @DisplayName("262")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("26.3 Opprette database for slettede annonser.")
        public class systemRequirement263Test {
            @Test
            @DisplayName("263")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("26.4 Ved sletting av annonsen må det sendes epost til bruker som har opprettet annonsen, etter admin har lagret slettet variabelet koblet til annonsen. Når annonsen slettes må det settes en årsak av admin slik at brukeren kan se årsaken til at annonsen er slettet.")
        public class systemRequirement264Test {
            @Test
            @DisplayName("264")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 27.0 En admin skal kunne midlertidig "fryse" annonser
    // [ ] 27.1 - Annonse klassen må ha følgende variabeler for å "frysing" av annonser; status fryst 0/1, kommentar ifra admin årsak fryst, timedate for endring av variabel status fryst.
    // [ ] 27.2 - Ved "frysing" av annonsen må det sendes epost til bruker som har opprettet annonsen, etter admin har lagret fryse variabelet koblet til annonsen. Når annonsen "fryses" må det settes en årsak av admin slik at brukeren kan se årsaken til at annonsen er "fryst"/avpublisert, men ikke slettet.
    // [ ] 27.3 - Hvert 5. minutt må databasen for tilgjengelige biler sjekkes for om noen annonser har fått endret variabelen sin "status fryst". Ved endring til 1 må annonsen fjernes ifra tilgjengelige biler.

    @Nested
    @DisplayName("27.0 En admin skal kunne midlertidig "fryse" annonser")
    public class userRequirement27Test {

        @Nested
        @DisplayName("27.1 Annonse klassen må ha følgende variabeler for å "frysing" av annonser; status fryst 0/1, kommentar ifra admin årsak fryst, timedate for endring av variabel status fryst.")
        public class systemRequirement271Test {
            @Test
            @DisplayName("271")
            public void systemRequirementXXparameter01Testt() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("27.2 Ved "frysing" av annonsen må det sendes epost til bruker som har opprettet annonsen, etter admin har lagret fryse variabelet koblet til annonsen. Når annonsen "fryses" må det settes en årsak av admin slik at brukeren kan se årsaken til at annonsen er "fryst"/avpublisert, men ikke slettet.")
        public class systemRequirement272Test {
            @Test
            @DisplayName("272")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("27.3 Hvert 5. minutt må databasen for tilgjengelige biler sjekkes for om noen annonser har fått endret variabelen sin "status fryst". Ved endring til 1 må annonsen fjernes ifra tilgjengelige biler.")
        public class systemRequirement273Test {
            @Test
            @DisplayName("273")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }

    // DONE
    // [ ] 7.0 En utleier skal kunne legge til bilder av biler til annonsen
    // [ ] 7.1 - På opprette annonse siden legge til knapper for å laste opp bilder eller ta bilder(web: webkamera, mobil: mobilkamera).
    // [ ] 7.2 - Funksjon for å laste opp bilder eller ta bilder i applikasjonen.

    @Nested
    @DisplayName("7.0 En utleier skal kunne legge til bilder av biler til annonsen")
    public class userRequirement70Test {

        @Nested
        @DisplayName("7.1 På opprette annonse siden legge til knapper for å laste opp bilder eller ta bilder(web: webkamera, mobil: mobilkamera).")
        public class systemRequirement71Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("7.2 Funksjon for å laste opp bilder eller ta bilder i applikasjonen.")
        public class systemRequirement72Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }


    // TODO
    // [ ] 8.0 Verifisere at bilen(e) man registrerer er EU-godkjent
    // [ ] 8.1 - For å kunne legge ut en bil som annonse skal systemet sjekke reg nr mot statens vegvesen autosys2 og bekrefte at det er minst 30 dager til frist for ny EU-kontroll godkjent utløper.
    // [ ] 8.2 - Validering av dato for tidspunkt for tilgjengelig utleie(annonse) skal sjekkes mot autosys2 for at bilen har gyldig EU-godkjening i det tilgjengelige tidspunktet.

    @Nested
    @DisplayName("8.0 Verifisere at bilen(e) man registrerer er EU-godkjent")
    public class userRequirement80Test {

        @Nested
        @DisplayName("8.1 For å kunne legge ut en bil som annonse skal systemet sjekke reg nr mot statens vegvesen autosys2 og bekrefte at det er minst 30 dager til frist for ny EU-kontroll godkjent utløper.")
        public class systemRequirement81Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("8.2 Validering av dato for tidspunkt for tilgjengelig utleie(annonse) skal sjekkes mot autosys2 for at bilen har gyldig EU-godkjening i det tilgjengelige tidspunktet.")
        public class systemRequirement82Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
}


-------------------------------------------------------------------------------------------------------------------------------------------------------------
          ------ TEMPLATES -----------------
        Template 0
        @Nested
        @DisplayName("X.0 Example requirement")
        public class requirementXXTest {
                   ----- Test 1 -----
            @Test
            @DisplayName("X.0 Example requirement")
            public void testThatExampleIsPossible1(Object object) {
                assertEquals("expectation", object.toString());
            }
                    ---- Test 2 ----
            @Test
            @DisplayName("X.1 Example requirement")
            public void testThatExampleIsPossible2(Object object) {
                assertEquals("expectation", object.toString());
            }
                    ---- Test json Object to Object ----
            @Test
            @DisplayName("X.2 Example requirement")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageXX@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageXX@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageXX@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageXX@example.com.json");
            }
                     ---- Test Stream -----
            @ParameterizedTest
            @MethodSource("exampleStream")
            @DisplayName("X.2 Example requirement")
            public void systemRequirementXXparameter01Test(String expected, int unexpected, Object object) {
                assertEquals(expected,  object.toString());
                assertNotEquals(unexpected, object.toString());
            } public static Stream exampleStream() {
                return Stream.of(
                        Arguments.of("expected" , "unexpected", new Object()),
                        Arguments.of("expected" , "unexpected", new Object())
                );
        }
    }
--------------------------------------------------------------------------------------------------------------------------------------------------------------
        Template 1
        @Nested
        @DisplayName("1.0 - A user is supposed to be able to create an account")
        public class createUserTest {

            @Nested
            @DisplayName("1.2 - Persistent storage of account details.")
            public class persistentStorageTest {
                @Test
                @DisplayName("This method is used in the create user form in the application, it takes an object and writes it to a JSON file.")
                public void writeToStorageTest() {
                    Client client = new Client();
                    Client client2 = new Client();
                    client.setEmail("persitentStorageWorks@example.com");
                    GuiLogic.createUser(client);
                    assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                    JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
                }
            }
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Template 2
        @Test
        @DisplayName("1.1 Example requirement")
        public void testThatExampleIsPossible2(Object object) {
            assertEquals("expectation", object.toString());
        }

        @ParameterizedTest
        @MethodSource("exampleStream")
        @DisplayName("1.2 Example requirement")
        public void testTharExampleIsPossible3(String expected, int unexpected, Object object) {
            assertEquals(expected,  object.toString());
            assertNotEquals(unexpected, object.toString());
        } public static Stream exampleStream() {
            return Stream.of(
                    Arguments.of("expected" , "unexpected", new Object()),
                    Arguments.of("expected" , "unexpected", new Object())
            );
        }

 */