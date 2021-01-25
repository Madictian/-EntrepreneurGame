package sample;

import CardGame.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;

import java.util.*;

import CardGame.Player;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import CardGame.Investor;

public class Controller {

    @FXML
    TextArea InvestorOne;
    @FXML
    TextArea InvestorTwo;
    @FXML
    TextArea InvestorThree;
    @FXML
    TextArea InvestorFour;
    @FXML
    TextArea InvestorFive;
    @FXML
    Button GameStart;
    @FXML
    TextArea PlayerPoints;

    private ArrayList<ConceptCard> conceptCards = new ArrayList<>(); // Holds all the different concept cards in the game
    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<>(); // The 4 different opportunity cards that exist
    private ArrayList<Player> players = new ArrayList<>(); // Players that exist in the game
    private ArrayList<Investor> investors = new ArrayList<>(); // All the investors that are not used ingame
    private ArrayList<OpportunityCard> cardsInPlay = new ArrayList<>(5); // Opportunity cards that are used/chosen .get(0) player-1's card, .get(1) player-2's card, etc.
    //private Object Player;

    public void investorSetup() {

        Random rand = new Random();
        String food = "Food Service Industry";
        String quality = "Quality of Life Products";
        String cloth = "Clothing";
        String tool = "Tools of Proficiency";
        String home = "Home-Decor";
        String soft = "Software";
        String care = "Personal Care";

        //name, investments, investment amount
        investors.add(new Investor("Reyn Ryanolds", new ArrayList<String>() {
            {
                add("Food Service Industry");
                add("Quality of Life Products");
                add("Clothing");
                add("Tools of Proficiency");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(100000);
                } else {
                    add(700000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(400000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Cim Jarrey", new ArrayList<String>() {
            { //Concepter
                add("Quality of Life Products");
                add("Personal Care");
                add("Software");
                add("Home-Decor");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(400000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(100000);
                }
            }
        }));

        investors.add(new Investor("Eiichi oroda", new ArrayList<String>() {
            { //Concepter
                add("Home-Decor");
                add("Clothing");
                add("Quality of Life Products");
                add("Tools of Proficiency");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(100000);
                }
            }
        }));
        investors.add(new Investor("Oliver Jamie", new ArrayList<String>() {
            { //Concepter
                add("Tools of Proficiency");
                add("Home-Decor");
                add("Food Service Industry");
                add("Personal Care");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(300000);
                }
            }
        }));
        investors.add(new Investor("Swon Ranson", new ArrayList<String>() {
            { //Concepter
                add("Tools of Proficiency");
                add("Food Service Industry");
                add("Clothing");
                add("Home-Decor");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(400000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Stony Tark", new ArrayList<String>() {
            { //Concepter
                add("Tools of Proficiency");
                add("Software");
                add("Home-Decor");
                add("Quality of Life Products");
                add("Personal Care");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(100000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(300000);
                }
            }
        }));
        investors.add(new Investor("Willie Black", new ArrayList<String>() {
            { //Concepter
                add("Qualiy of Life Products");
                add("Clothing");
                add("Home-Decor");
                add("Personal Care");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Musky Elonsius", new ArrayList<String>() {
            { //Concepter
                add("Software");
                add("Home-Decor");
                add("Food Service Industry");
                add("Quality of Life Products");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(100000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(600000);
                }
            }
        }));
        investors.add(new Investor("Alex Lavigne", new ArrayList<String>() {
            { //Concepter
                add("Quality of Life Products");
                add("Food Service Industry");
                add("Software");
                add("Personal Care");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(100000);
                }
            }
        }));
        investors.add(new Investor("Arnold Weissmenschen", new ArrayList<String>() {
            { //Concepter
                add("Quality of Life Products");
                add("Personal Care");
                add("Clothing");
                add("Home-Decor");
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(800000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(400000);
                }
            }
        }));
        investors.add(new Investor("Bezo The Boss", new ArrayList<String>() {
            { //Concepter
                add(soft);
                add(cloth);
                add(home);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(500000);
                }
            }
        }));
        investors.add(new Investor("Mercey Matthews", new ArrayList<String>() {
            { //Concepter
                add(care);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(500000);
                }
            }
        }));
        investors.add(new Investor("Tzu Sun", new ArrayList<String>() {
            { //Concepter
                add(care);
                add(tool);
                add(cloth);
                add(quality);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Cashy John", new ArrayList<String>() {
            { //Concepter
                add(tool);
                add(soft);
                add(home);
                add(food);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(400000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(700000);
                }
            }
        }));
        investors.add(new Investor("Duhna Jeffy", new ArrayList<String>() {
            { //Concepter
                add(tool);
                add(cloth);
                add(care);
                add(quality);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(400000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(400000);
                }
            }
        }));
        investors.add(new Investor("JohnJohn Gorsay", new ArrayList<String>() {
            { //Concepter
                add(food);
                add(tool);
                add(soft);
                add(quality);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(800000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(400000);
                }
            }
        }));
        investors.add(new Investor("Chem Hisworth", new ArrayList<String>() {
            { //Concepter
                add(food);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(500000);
                }
            }
        }));
        investors.add(new Investor("Tya Barby", new ArrayList<String>() {
            { //Concepter
                add(food);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(100000);
                } else {
                    add(800000);
                }
            }
        }));
        investors.add(new Investor("Mitz Chritzen", new ArrayList<String>() {
            { //Concepter
                add(cloth);
                add(soft);
                add(quality);
                add(care);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(800000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(700000);
                }
            }
        }));
        investors.add(new Investor("Ian Cucoroo", new ArrayList<String>() {
            { //Concepter
                add(food);
                add(cloth);
                add(tool);
                add(home);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(700000);
                }

                if (rand.nextBoolean()) {
                    add(3000000);
                } else {
                    add(700000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(600000);
                }
            }
        }));
        investors.add(new Investor("Kei Shirogane", new ArrayList<String>() {
            { //Concepter
                add(soft);
                add(home);
                add(food);
                add(cloth);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(400000);
                }
            }
        }));
        investors.add(new Investor("Laura Hughie", new ArrayList<String>() {
            { //Concepter
                add(food);
                add(care);
                add(cloth);
                add(quality);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(200000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(100000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Jackie W Samsung", new ArrayList<String>() {
            { //Concepter
                add(care);
                add(food);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(800000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(200000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(400000);
                }
            }
        }));
        investors.add(new Investor("Slossy Daniel", new ArrayList<String>() {
            { //Concepter
                add(care);
                add(quality);
                add(food);
                add(soft);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(300000);
                } else {
                    add(500000);
                }

                if (rand.nextBoolean()) {
                    add(700000);
                } else {
                    add(300000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(200000);
                }
            }
        }));
        investors.add(new Investor("Rich Guy", new ArrayList<String>() {
            { //Concepter
                add(care);
                add(home);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>() {
            {
                if (rand.nextBoolean()) {
                    add(400000);
                } else {
                    add(600000);
                }

                if (rand.nextBoolean()) {
                    add(500000);
                } else {
                    add(700000);
                }

                if (rand.nextBoolean()) {
                    add(100000);
                } else {
                    add(700000);
                }

                if (rand.nextBoolean()) {
                    add(600000);
                } else {
                    add(400000);
                }
            }
        }));

    }

    @FXML
    public void initialize() {

        //<editor-fold-desc="Initialization of ArrayList's">
        conceptCards = new ArrayList<>();
        conceptCards.add(new ConceptCard("Software"));
        conceptCards.add(new ConceptCard("Tools of Proficiency"));
        conceptCards.add(new ConceptCard("Food Service Industry"));
        conceptCards.add(new ConceptCard("Clothing"));
        conceptCards.add(new ConceptCard("Personal care"));
        conceptCards.add(new ConceptCard("Home-Decor"));
        conceptCards.add(new ConceptCard("Quality of Life Products"));

        opportunityCards = new ArrayList<>();
        opportunityCards.add(new OpportunityCard(1));
        opportunityCards.add(new OpportunityCard(2));
        opportunityCards.add(new OpportunityCard(3));
        opportunityCards.add(new OpportunityCard(4));

        cardsInPlay = new ArrayList<>();
        cardsInPlay.add(new OpportunityCard(1));
        cardsInPlay.add(new OpportunityCard(1));
        cardsInPlay.add(new OpportunityCard(1));
        cardsInPlay.add(new OpportunityCard(1));
        cardsInPlay.add(new OpportunityCard(1));
        cardsInPlay.set(0, null);
        cardsInPlay.set(1, null);
        cardsInPlay.set(2, null);
        cardsInPlay.set(3, null);
        cardsInPlay.set(4, null);

        investorSetup();
        //</editor-fold>

        //<editor-fold-desc="Start Game Method">
        GameStart.setOnAction(e -> {

            // Start a game by prompt

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "How Many Players?");
            alert.setHeaderText(null);

            for (int i = 2; i < 5; i++) {

                ButtonType amountButton = new ButtonType(String.valueOf(i), ButtonData.OTHER);
                alert.getDialogPane().getButtonTypes().add(amountButton);

            }

            alert.showAndWait();

            int amountOfPlayers = 0;

            switch (alert.getResult().getText()) {
                case "2" -> {
                    amountOfPlayers = 2;
                }
                case "3" -> {
                    amountOfPlayers = 3;
                }
                case "4" -> {
                    amountOfPlayers = 4;
                }
                case "5" -> {
                    amountOfPlayers = 5;
                }
            }

            for (int i = 0; i < amountOfPlayers; i++) {
                players.add(new Player());
            }

            chooseOpportunityCards();

            GameStart.setVisible(false);
            newRound();
        });
        //</editor-fold>

    }

    public void newRound() {

        int numberOfRounds = players.size() * 2;
        int currentRound = 0;

        // Gameplay loop
        while (currentRound != numberOfRounds) {

            currentRound++;

            //<editor-fold-desc="Phase 1 - Investors">

            if (investors.isEmpty()) {

                investorSetup();
                Collections.shuffle(investors);

            } else {

                Collections.shuffle(investors);

            }
            InvestorOne.setText(investors.get(0).toString());
            InvestorTwo.setText(investors.get(1).toString());
            InvestorThree.setText(investors.get(2).toString());
            InvestorFour.setText(investors.get(3).toString());
            InvestorFive.setText(investors.get(4).toString());

            //</editor-fold>

            //<editor-fold-desc="Phase 2 - Concepts">

            Random rand = new Random();
            ArrayList<ButtonType> conceptButtons = new ArrayList<>();
            ArrayList<Integer> conceptIndex = new ArrayList<>();

            while (conceptIndex.size() != 5) {

                int randomInt = rand.nextInt(7);
                if (conceptIndex.contains(randomInt) && conceptIndex.lastIndexOf(randomInt) == conceptIndex.indexOf(randomInt)) {
                    conceptIndex.add(randomInt);
                } else if (!conceptIndex.contains(randomInt)) {
                    conceptIndex.add(randomInt);
                }

            }

            for (int i = 0; i < conceptIndex.size(); i++) {

                ButtonType conceptsButton = new ButtonType(conceptCards.get(conceptIndex.get(i)).getConcept(), ButtonData.OTHER);
                conceptButtons.add(conceptsButton);

            }

            for (int i = 0; i < players.size(); i++) {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Choose a Concept");
                alert.setHeaderText(null);
                alert.getDialogPane().getButtonTypes().addAll(conceptButtons);
                alert.showAndWait();

                switch (alert.getResult().getText()) {
                    case "Software" -> {
                        players.get(i).setConceptCard(conceptCards.get(0));
                    }
                    case "Tools of Proficiency" -> {
                        players.get(i).setConceptCard(conceptCards.get(1));
                    }
                    case "Food Service Industry" -> {
                        players.get(i).setConceptCard(conceptCards.get(2));
                    }
                    case "Clothing" -> {
                        players.get(i).setConceptCard(conceptCards.get(3));
                    }
                    case "Personal care" -> {
                        players.get(i).setConceptCard(conceptCards.get(4));
                    }
                    case "Home-Decor" -> {
                        players.get(i).setConceptCard(conceptCards.get(5));
                    }
                    case "Quality of Life Products" -> {
                        players.get(i).setConceptCard(conceptCards.get(6));
                    }
                }

                conceptButtons.remove(alert.getResult());

            }


            // TODO (FXML) - Find a way to create or show choosen concept card on the board, and remember to place them at the correct players


            //</editor-fold>

            //<editor-fold-desc="Phase 3 - Opportunity cards">

            for (int i = 0; i < players.size(); i++) {

                if (!players.get(i).getOpportunityCards().isEmpty()) {

                    int cardId = layDownOpportunityCard(players.get(i));

                    if (cardId != 0) {

                        for (OpportunityCard currentCard : players.get(i).getOpportunityCards()) {

                            if (currentCard.getOpportunityId() == cardId) {

                                players.get(i).getOpportunityCards().remove(i);
                                cardsInPlay.set(i, currentCard);
                                break;

                            }
                        }
                    }
                }
            }


            // TODO (FXML) - Find a way to place opportunity cards face down on the board


            //</editor-fold>

            //<editor-fold-desc="Phase 4 - Player turns">

            // This is used if we want a players turn to be created in playerTurn()
            for (int i = 0; i < players.size(); i++) {
                playerTurn(i);
            }

            //</editor-fold>

            //<editor-fold-desc="Phase 5 - End of round">

            // end of round - Investors are then removed from list.
            investors.remove(0);
            investors.remove(0);
            investors.remove(0);
            investors.remove(0);
            investors.remove(0);

            PlayerPoints.setText("");
            for (int i = 0; i < players.size(); i++) {
                PlayerPoints.appendText("Player " + (i + 1) + ": " + players.get(i).getPlayerPoints() + "\n");
            }

            //</editor-fold>

        }

        scoreboard();

    } // End of newRound()

    public void playerTurn(int playerId) {

        TextInputDialog dialog = new TextInputDialog("eg. 900000");
        dialog.setTitle("Player " + (playerId + 1));
        dialog.setHeaderText("how big an investment are you looking for?");
        dialog.setContentText("invest in increments of: 100000's");

        Optional<String> result = dialog.showAndWait();
        players.get(playerId).setTurnInvestment(Integer.parseInt(result.get()));

        boolean[] gottenPoints = new boolean[5];
        Arrays.fill(gottenPoints, Boolean.FALSE);

        while (!(players.get(playerId).getTurnInvestment() <= 0)) {

            int choosenInvestorIndex = pickInvestor(playerId);

            // if (choosenInvestorIndex == -1) { break; }

            if (cardsInPlay.get(playerId) != null) {
                // Player have laid down a opportunity card

                if (useOpportunityCard()) {
                    // Player wants to use the card this round

                    for (int i = 0; i < cardsInPlay.size(); i++) {
                        // Check if another player have a denial card

                        if (cardsInPlay.get(i).getOpportunityId() == 4) {

                            if (useOpportunityCard()) {

                                cardsInPlay.set(i, null);
                                cardsInPlay.set(playerId, null);
                                break;

                            }

                        }

                    }

                } else {

                    players.get(playerId).getOpportunityCards().add(cardsInPlay.get(0));
                    cardsInPlay.set(playerId, null);

                }

            }

            int opportunityCardTempInt = 0;

            if (cardsInPlay.get(playerId) != null) {

                if (cardsInPlay.get(playerId).getOpportunityId() == 1) {
                    opportunityCardTempInt = 1;
                } else if (cardsInPlay.get(playerId).getOpportunityId() == 3) {
                    opportunityCardTempInt = 2;
                }

            }

            int roll = rollDice(players.get(playerId).getTurnInvestment(), opportunityCardTempInt);

            int indexOfInvestorsInvestmentType = investors.get(choosenInvestorIndex).getInvestmentTypes().indexOf(players.get(playerId).getConceptCard());

            if (indexOfInvestorsInvestmentType != -1) {

                if ((roll * 100000) + investors.get(choosenInvestorIndex).getInvestmentAmount(indexOfInvestorsInvestmentType) > 1000000) { break; }

                if ((roll * 100000) < players.get(playerId).getTurnInvestment()) {

                    investors.get(choosenInvestorIndex).updateInvestment(indexOfInvestorsInvestmentType, (roll * 100000));
                    players.get(playerId).setTurnInvestment(players.get(playerId).getTurnInvestment() - (roll * 100000));
                    if (gottenPoints[choosenInvestorIndex]) {
                        players.get(playerId).addPlayerPoints(roll);
                    } else {
                        players.get(playerId).addPlayerPoints((roll) + 2);
                        gottenPoints[choosenInvestorIndex] = true;
                    }

                } else {

                    investors.get(choosenInvestorIndex).updateInvestment(indexOfInvestorsInvestmentType, players.get(playerId).getTurnInvestment());
                    if (gottenPoints[choosenInvestorIndex]) {
                        players.get(playerId).addPlayerPoints((players.get(playerId).getTurnInvestment() / 100000));
                    } else {
                        players.get(playerId).addPlayerPoints((players.get(playerId).getTurnInvestment() / 100000) + 2);
                        gottenPoints[choosenInvestorIndex] = true;
                    }
                    players.get(playerId).setTurnInvestment(0);

                }

            } else {

                Alert error = new Alert(Alert.AlertType.WARNING, "Error!");
                error.setHeaderText("Choose a investor that have previously invested in your concept.");
                error.showAndWait();

                /*if ((roll * 100000) < players.get(playerId).getTurnInvestment()) {

                    players.get(playerId).setTurnInvestment(players.get(playerId).getTurnInvestment() - (roll * 100000));
                    if (gottenPoints[choosenInvestorIndex]) {
                        players.get(playerId).addPlayerPoints(roll);
                    } else {
                        players.get(playerId).addPlayerPoints((roll) + 2);
                        gottenPoints[choosenInvestorIndex] = true;
                    }

                } else {

                    if (gottenPoints[choosenInvestorIndex]) {
                        players.get(playerId).addPlayerPoints((players.get(playerId).getTurnInvestment() / 100000));
                    } else {
                        players.get(playerId).addPlayerPoints((players.get(playerId).getTurnInvestment() / 100000) + 2);
                        gottenPoints[choosenInvestorIndex] = true;
                    }
                    players.get(playerId).setTurnInvestment(0);

                }

                investors.get(choosenInvestorIndex).getInvestmentTypes().add(players.get(playerId).getConceptCard());
                investors.get(choosenInvestorIndex).getInvestmentAmounts().add(roll * 100000);*/

            }

            InvestorOne.setText(investors.get(0).toString());
            InvestorTwo.setText(investors.get(1).toString());
            InvestorThree.setText(investors.get(2).toString());
            InvestorFour.setText(investors.get(3).toString());
            InvestorFive.setText(investors.get(4).toString());

        }

        if (cardsInPlay.get(playerId) != null) {

            if (cardsInPlay.get(playerId).getOpportunityId() == 2) {

                persuasiveCard();

            }

        }

    }

    // Used for confirmation by player on to use opportunity card
    public boolean useOpportunityCard() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Opportunity Card", ButtonType.YES, ButtonType.NO);
        alert.setHeaderText(null);
        alert.setContentText("Do you wanna use your opportunity card this turn?");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            return true;
        } else {
            return false;
        }

    }

    // Here you choose to lay down a opportunitycard
    public int layDownOpportunityCard(Player player) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Lay Down Opportunity Card");
        alert.setHeaderText(null);

        ButtonType pass = new ButtonType("Pass", ButtonData.CANCEL_CLOSE);

        ArrayList<TextArea> cards = new ArrayList<>();

        for (OpportunityCard currentCard : player.getOpportunityCards()) {

            TextArea card = new TextArea();
            card.setPrefWidth(125);
            card.setWrapText(true);
            card.setText(currentCard.getTitle() + "\n" + currentCard.getDescription());
            card.setId(String.valueOf(currentCard.getOpportunityId()));
            cards.add(card);

        }

        switch (cards.size()) {
            case 1 -> {
                HBox container = new HBox(cards.get(0));
                alert.getDialogPane().setContent(container);
            }
            case 2 -> {
                HBox container = new HBox(cards.get(0), cards.get(1));
                alert.getDialogPane().setContent(container);
            }
            case 3 -> {
                HBox container = new HBox(cards.get(0), cards.get(1), cards.get(2));
                alert.getDialogPane().setContent(container);
            }
            case 4 -> {
                HBox container = new HBox(cards.get(0), cards.get(1), cards.get(2), cards.get(3));
                alert.getDialogPane().setContent(container);
            }
        }


        for (int i = 1; i < cards.size() + 1; i++) {

            ButtonType cardButton = new ButtonType("Card " + i, ButtonData.OTHER);
            alert.getDialogPane().getButtonTypes().add(cardButton);

        }


        alert.getDialogPane().getButtonTypes().add(pass);

        alert.showAndWait();

        if (alert.getResult() == pass) {

            return 0;

        } else {

            switch (alert.getResult().getText()) {
                case "Card 1" -> {
                    return Integer.parseInt(cards.get(0).getId());
                }
                case "Card 2" -> {
                    return Integer.parseInt(cards.get(1).getId());
                }
                case "Card 3" -> {
                    return Integer.parseInt(cards.get(2).getId());
                }
                case "Card 4" -> {
                    return Integer.parseInt(cards.get(3).getId());
                }
                default -> {
                    return 0;
                }
            }

        }

    }

    //does this need to be Round setup?
    public int rollDice(int investmentAmount, int i) {

        Random rand = new Random();

        if (i == 1/*Golden opportunity card used*/) {

            return investmentAmount / 100000;

        } else if (i == 2) {

            // Call opportunityCard's effect here

            int roll = (rand.nextInt((10 - 1) + 1) + 1);

            if (roll > (investmentAmount / 100000)) {

                return (rand.nextInt((10 - 1) + 1) + 1);

            } else {

                return roll;

            }

        } else {

            return rand.nextInt((10 - 1) + 1) + 1;

        }

    }

    public void scoreboard() {

        int playerIndex = 0;
        for (int i = 0; i < players.size(); i++) {
            if (i != 0) {
                if (players.get(i).getPlayerPoints() > players.get(i - 1).getPlayerPoints()) {
                    playerIndex = i;
                }
            }
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Scoreboard");
        alert.setHeaderText("Player " + playerIndex + 1 + " is the winner");
        String str = "";

        for (int i = 0; i < players.size(); i++) {
            str += "Player " + (i + 1) + ": " + players.get(i).getPlayerPoints() + "\n";
        }
        alert.setContentText(str);

        alert.showAndWait();

    }

    public int pickInvestor(int playerId) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Player " + (playerId + 1));
        alert.setHeaderText("Please pick an investor");
        alert.setContentText(null);

        ButtonType button1 = new ButtonType(investors.get(0).getName(), ButtonData.OTHER);

        ButtonType button2 = new ButtonType(investors.get(1).getName(), ButtonData.OTHER);

        ButtonType button3 = new ButtonType(investors.get(2).getName(), ButtonData.OTHER);

        ButtonType button4 = new ButtonType(investors.get(3).getName(), ButtonData.OTHER);

        ButtonType button5 = new ButtonType(investors.get(4).getName(), ButtonData.OTHER);

        alert.getDialogPane().getButtonTypes().addAll(button1, button2, button3, button4, button5);

        alert.showAndWait();

        if (alert.getResult() == button1) {
            return 0;
        } else if (alert.getResult() == button2) {
            return 1;
        } else if (alert.getResult() == button3) {
            return 2;
        } else if (alert.getResult() == button4) {
            return 3;
        } else if (alert.getResult() == button5) {
            return 4;
        } else {
            return -1;
        }

    }

    public void chooseOpportunityCards() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Choose an opportunity card");
        alert.setHeaderText(null);

        for (int i = 0; i < players.size(); i++) {

            Player player = players.get(i);

            ArrayList<TextArea> cards = new ArrayList<>(4); // 4

            for (OpportunityCard currentCard : opportunityCards) {

                TextArea card = new TextArea();
                card.setPrefWidth(125);
                card.setWrapText(true);
                card.setId(String.valueOf(currentCard.getOpportunityId()));
                card.setText(currentCard.getTitle() + "\n" + currentCard.getDescription());
                card.setId(String.valueOf(currentCard.getOpportunityId()));
                cards.add(card);

            }

            for (int j = 0; j < players.size() - 1; j++) {

                alert.getDialogPane().getButtonTypes().clear();

                switch (cards.size()) { // bliver brugt til at sætte textar eaet rigtige steder.
                    case 1 -> {
                        HBox container = new HBox(cards.get(0));
                        alert.getDialogPane().setContent(container);
                    }
                    case 2 -> {
                        HBox container = new HBox(cards.get(0), cards.get(1));
                        alert.getDialogPane().setContent(container);
                    }
                    case 3 -> {
                        HBox container = new HBox(cards.get(0), cards.get(1), cards.get(2));
                        alert.getDialogPane().setContent(container);
                    }
                    case 4 -> {
                        HBox container = new HBox(cards.get(0), cards.get(1), cards.get(2), cards.get(3));
                        alert.getDialogPane().setContent(container);
                    }
                }

                for (int n = 1; n < cards.size() + 1; n++) {

                    ButtonType cardButton = new ButtonType("Card " + n, ButtonData.OTHER);
                    alert.getDialogPane().getButtonTypes().add(cardButton);

                }

                alert.showAndWait();

                switch (alert.getResult().getText()) { //
                    case "Card 1" -> { // cards -'> textarea - get(0) første tekst area. og id'et er opportunity card som den henfører til.
                        player.getOpportunityCards().add(opportunityCards.get(Integer.parseInt(cards.get(0).getId())));
                        cards.remove(0);
                    }
                    case "Card 2" -> {
                        player.getOpportunityCards().add(opportunityCards.get(Integer.parseInt(cards.get(1).getId())));
                        cards.remove(1);
                    }
                    case "Card 3" -> {
                        player.getOpportunityCards().add(opportunityCards.get(Integer.parseInt(cards.get(2).getId())));
                        cards.remove(2);
                    }
                    case "Card 4" -> {
                        player.getOpportunityCards().add(opportunityCards.get(Integer.parseInt(cards.get(3).getId())));
                        cards.remove(3);
                    }
                }

            }

        }

    }

    public void persuasiveCard() {

        ArrayList<ButtonType> conceptButtons = new ArrayList<>();

        for (int i = 0; i < conceptCards.size(); i++) {

            ButtonType conceptsButton = new ButtonType(conceptCards.get(i).getConcept(), ButtonData.OTHER);
            conceptButtons.add(conceptsButton);

        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Choose a Concept");
        alert.setHeaderText(null);
        alert.getDialogPane().getButtonTypes().addAll(conceptButtons);
        alert.showAndWait();

        String conceptString = alert.getResult().getText();
        for (int i = 0; i < 5; ++i) {

            // create a alert that allows player to choose effect
            int index = investors.get(i).getInvestmentTypes().indexOf(conceptString);
            if (index != -1) {

                // It exits and input code here
                investors.get(i).getInvestmentAmounts().set(index, 1000000);
            } else {
                investors.get(i).getInvestmentTypes().add(conceptString);
                investors.get(i).getInvestmentAmounts().add(1000000);
            }

        }

    }

}
