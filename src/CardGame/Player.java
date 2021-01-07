package CardGame;

import java.util.ArrayList;

public class Player {

    private String name;
    private int playerPoint;
    private ArrayList<OpportunityCard> opportunityCards = new ArrayList<OpportunityCard>();
    private ConceptCard conceptCard;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        playerPoint = 0;
    }

    public int getPlayerPoints() {
        return playerPoint;
    }

    public void addPlayerPoints(int point) {
        this.playerPoint += point;
    }



}
