package sample;

import CardGame.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Controller {

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
        investors.add(new Investor("Reyn Ryanolds"¨, new ArrayList<String>()
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                add("Personal Care")
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }
            }
        }));
        investors.add(new Investor("Willie Black"¨, new ArrayList<String>()
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }
            }
        }));
        investors.add(new Investor("Alex Lavigne"¨, new ArrayList<String>()
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
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
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }

                if (rand.nextBoolean()) {
                    add();
                } else {
                    add();
                }
            }
        }));



    }

    public void newRound() {

        //<editor-fold-desc="Phase 1">

        if (investors.isEmpty())  {

            investorSetup();

        } else {

            Collections.shuffle(investors);

        }

        // end of round - Investors are then removed from list.
        investors.remove(0);
        investors.remove(1);
        investors.remove(2);
        investors.remove(3);
        investors.remove(4);

    }

    //</editor-fold>

    //<editor-fold-desc="Phase 2">

    // TODO Players choose to lay down a opportunity card or not

    //</editor-fold>

    //<editor-fold-desc="Phase 3">

    // TODO Player 1 turn
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

}
