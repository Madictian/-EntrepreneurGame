package sample;

import CardGame.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Controller {

    private ArrayList<ConceptCard> conceptCards = new ArrayList<>()
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

    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<>()
    {
        {
            //add(new OpportunityCard(1));
            //add(new OpportunityCard(2));
            //add(new OpportunityCard(3));
            //add(new OpportunityCard(4));
        }
    };

    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Investor> investors = new ArrayList<>();

    public void investorSetup() {

        //add(new Investor); // TODO add all 25 investors

    }

    public void newRound() {

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



}
