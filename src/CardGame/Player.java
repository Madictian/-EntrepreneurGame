package CardGame;

import java.util.ArrayList;

public class Player {

    private String name;
    private int playerPoint;
    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<OpportunityCard>();// Player chosen opportunity cards
    private ConceptCard conceptCard; // Players chosen concept card
    private int turnInvestment;


    public int getTurnInvestment() {
        return turnInvestment;
    }

    public void setTurnInvestment(int turnInvestment) {
        this.turnInvestment = turnInvestment;
    }

    public void setConceptCard(ConceptCard conceptCard) {
        this.conceptCard = conceptCard;
    }

    public String getConceptCard() {
        return this.conceptCard.getConcept();
    }

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        playerPoint = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerPoints() {
        return playerPoint;
    }

    public void addPlayerPoints(int point) {
        this.playerPoint += point;
    }

    public ArrayList<OpportunityCard> getOpportunityCards() {
        return opportunityCards;
    }


}
