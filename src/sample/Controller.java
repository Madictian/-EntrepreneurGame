package sample;

import CardGame.*;

import java.util.ArrayList;

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
    private ArrayList<Investor> Investors = new ArrayList<>()
    {
        {
            //add(); // TODO add all 25 investors
        }
    };
    private ArrayList<Investor> InvestorPlaceHolder = new ArrayList<>();



}
