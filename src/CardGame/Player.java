package CardGame;

import java.util.ArrayList;

public class Player {

    private String name;
    private int playerPoint;
    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<OpportunityCard>();// Player chosen opportunity cards
    private ConceptCard conceptCard; // Players chosen concept card

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        playerPoint = 0;
    }

    public String getName() {
        return name;
    }

    public int getPlayerPoints() {
        return playerPoint;
    }

    public void addPlayerPoints(int point) {
        this.playerPoint += point;
    }



}
