package sample;

import CardGame.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.util.*;

import CardGame.Player;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
    TextArea PlayerPoints;


    private ArrayList<ConceptCard> conceptCards = new ArrayList<>() // Holds all the different concept cards in the game
    {
        {
            add(new ConceptCard("Software"));
            add(new ConceptCard("Tools of Proficiency"));
            add(new ConceptCard("Food Service Industry"));
            add(new ConceptCard("Clothing"));
            add(new ConceptCard("Personal care"));
            add(new ConceptCard("Home-Decor"));
            add(new ConceptCard("Quality of Life Products"));
        }
    };

    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<>() // The 4 different opportunity cards that exist
    {
        {
            add(new OpportunityCard(1));
            add(new OpportunityCard(2));
            add(new OpportunityCard(3));
            add(new OpportunityCard(4));
        }
    };

    private ArrayList<Player> players = new ArrayList<>(); // Players that exist in the game
    private ArrayList<Investor> investors = new ArrayList<>(); // All the investors that are not used ingame
    private ArrayList<OpportunityCard> cardsInPlay = new ArrayList<>(5); // Opportunity cards that are used/chosen .get(0) player-1's card, .get(1) player-2's card, etc.
    //private Object Player;

    //does this need to be Round setup?
    public void investorSetup() {

        Random rand = new Random();
        String food = "Food Service Industry";
        String quality = "Quality of Life Products";
        String cloth = "Clothing";
        String tool = "Tools of Proficiency";
        String home = "Home-Décor";
        String soft = "Software";
        String care = "Personal Care";

        //name, investments, investment amount
        investors.add(new Investor("Reyn Ryanolds", new ArrayList<String>()
        {
            {
                add("Food Service Industry");
                add("Quality of Life Products");
                add("Clothing");
                add("Tools of Proficiency");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Cim Jarrey", new ArrayList<String>()
        {
            { //Concepter
                add("Quality of Life Products");
                add("Personal Care");
                add("Software");
                add("Home-Décor");
            }
        }, new ArrayList<Integer>()
        {
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

        investors.add(new Investor("Eiichi oroda", new ArrayList<String>()
        {
            { //Concepter
                add("Home-Décor");
                add("Clothing");
                add("Quality of Life Products");
                add("Tools of Proficiency");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Oliver Jamie", new ArrayList<String>()
        {
            { //Concepter
                add("Tools of Proficiency");
                add("Home-Décor");
                add("Food Service Industry");
                add("Personal Care");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Swon Ranson", new ArrayList<String>()
        {
            { //Concepter
                add("Tools of Proficiency");
                add("Food Service Industry");
                add("Clothing");
                add("Home-Décor");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Stony Tark", new ArrayList<String>()
        {
            { //Concepter
                add("Tools of Proficiency");
                add("Software");
                add("Home-Décor");
                add("Quality of Life Products");
                add("Personal Care");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Willie Black", new ArrayList<String>()
        {
            { //Concepter
                add("Qualiy of Life Products");
                add("Clothing");
                add("Home-Décor");
                add("Personal Care");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Musky Elonsius", new ArrayList<String>()
        {
            { //Concepter
                add("Software");
                add("Home-Décor");
                add("Food Service Industry");
                add("Quality of Life Products");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Alex Lavigne", new ArrayList<String>()
        {
            { //Concepter
                add("Quality of Life Products");
                add("Food Service Industry");
                add("Software");
                add("Personal Care");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Arnold Weissmenschen", new ArrayList<String>()
        {
            { //Concepter
                add("Quality of Life Products");
                add("Personal Care");
                add("Clothing");
                add("Home-Décor");
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Bezo The Boss", new ArrayList<String>()
        {
            { //Concepter
                add(soft);
                add(cloth);
                add(home);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Mercey Matthews", new ArrayList<String>()
        {
            { //Concepter
                add(care);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Tzu Sun", new ArrayList<String>()
        {
            { //Concepter
                add(care);
                add(tool);
                add(cloth);
                add(quality);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Cashy John", new ArrayList<String>()
        {
            { //Concepter
                add(tool);
                add(soft);
                add(home);
                add(food);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Duhna Jeffy", new ArrayList<String>()
        {
            { //Concepter
                add(tool);
                add(cloth);
                add(care);
                add(quality);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("JohnJohn Gorsay", new ArrayList<String>()
        {
            { //Concepter
                add(food);
                add(tool);
                add(soft);
                add(quality);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Chem Hisworth", new ArrayList<String>()
        {
            { //Concepter
                add(food);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Tya Barby", new ArrayList<String>()
        {
            { //Concepter
                add(food);
                add(cloth);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Mitz Chritzen", new ArrayList<String>()
        {
            { //Concepter
                add(cloth);
                add(soft);
                add(quality);
                add(care);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Ian Cucoroo", new ArrayList<String>()
        {
            { //Concepter
                add(food);
                add(cloth);
                add(tool);
                add(home);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Kei Shirogane", new ArrayList<String>()
        {
            { //Concepter
                add(soft);
                add(home);
                add(food);
                add(cloth);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Laura Hughie", new ArrayList<String>()
        {
            { //Concepter
                add(food);
                add(care);
                add(cloth);
                add(quality);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Jackie W Samsung", new ArrayList<String>()
        {
            { //Concepter
                add(care);
                add(food);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Slossy Daniel", new ArrayList<String>()
        {
            { //Concepter
                add(care);
                add(quality);
                add(food);
                add(soft);
            }
        }, new ArrayList<Integer>()
        {
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
        investors.add(new Investor("Rich Guy", new ArrayList<String>()
        {
            { //Concepter
                add(care);
                add(home);
                add(soft);
                add(tool);
            }
        }, new ArrayList<Integer>()
        {
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
    public void UpdatePlayerPoints(){
        PlayerPoints.setText("");
        Player player = new Player();
        for (Object playerr: players) {
            PlayerPoints.appendText("\n\n" + player.getName() + "\n" + player.getPlayerPoints());
        }
    }

    public void newRound() {

        //<editor-fold-desc="Phase 1">

        if (investors.isEmpty())  {

            investorSetup();

        } else {

            Collections.shuffle(investors);

        }
        InvestorOne.setText(investors.get(0).toString());
        InvestorTwo.setText(investors.get(1).toString());
        InvestorThree.setText(investors.get(2).toString());
        InvestorFour.setText(investors.get(3).toString());
        InvestorFive.setText(investors.get(4).toString());




        //</editor-fold>


        //<editor-fold-desc="Phase 2">

        // TODO Players choose to lay down a opportunity card or not.
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

        //</editor-fold>




//        // This is used if we want a players turn to be created in playerTurn()
//        for (int i = 0; i < players.size(); i++) {
//            playerTurn(i);
//        }





        //<editor-fold-desc="Phase 3">
        // method to update the player point textArea

        // TODO Player 1 turn

        if (cardsInPlay.get(0) != null) {
            // Player have laid down a opportunity card

            if (useOpportunityCard()) {
                // Player wants to use the card this round

                for (int i = 0; i < cardsInPlay.size(); i++) {
                    // Check if another player have a denial card

                    if (cardsInPlay.get(i).getOpportunityId() == 4) {

                        if (useOpportunityCard()) {

                            cardsInPlay.set(i, null);
                            cardsInPlay.set(0, null);
                            break;

                        }

                    }

                }

            } else {

                players.get(0).getOpportunityCards().add(cardsInPlay.get(0));
                cardsInPlay.set(0, null);

            }

        }


        // TODO If player 1 have laid down a opportunity card, then he/she will be prompted to choose to use the card or not
        // TODO If the player chooses to use the card, search all cards in the cardsInPlay for a deny-opporunity card, if it exitsts, ask the player if he/she wants to deny this players card


        //</editor-fold>

        //<editor-fold-desc="Phase 4">

        // TODO Player 2 turn


        //</editor-fold>

        //<editor-fold-desc="Phase 5">

        // TODO Player 3 turn

        //</editor-fold>

        //<editor-fold-desc="Phase 6">

        // TODO Player 4 turn

        //</editor-fold>

        //<editor-fold-desc="Phase 7">

        // TODO Player 5 turn

        //</editor-fold>

        // end of round - Investors are then removed from list.
        investors.remove(0);
        investors.remove(0);
        investors.remove(0);
        investors.remove(0);
        investors.remove(0);

        PlayerPoints.setText("");
        for (int i = 0; i < players.size(); i++){
            PlayerPoints.appendText(String.valueOf(players.get(i).getPlayerPoints()) + "\n");
        }


    } // End of newRound()

    public void playerTurn  (int playerId) {

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

    }

    // Used for confirmation by player on to use opportunity card
    public boolean useOpportunityCard() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Opportunity Card", ButtonType.YES, ButtonType.NO);
        alert.setHeaderText(null);
        alert.setContentText("Do you wanna use your opportunity card this turn?");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES){
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

        for (OpportunityCard currentCard: player.getOpportunityCards()) {

            TextArea card = new TextArea();
            card.setText(currentCard.toString());
            card.setId(String.valueOf(currentCard.getOpportunityId()));
            cards.add(card);

        }

        switch(cards.size()) {
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

            switch(alert.getResult().getText()) {
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
                default -> { return 0; }
            }

        }

    }





}
