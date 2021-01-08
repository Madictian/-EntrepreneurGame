package CardGame;

public class OpportunityCard {

    private String title;
    private String description;
    private int opportunityId;

    //TODO man kunne lave en liste til kortet med 2 muligheder?

    public OpportunityCard(int id) {
        this.opportunityId = id;

        switch (id) {
            case 1 -> { // Golden Opportunity card
                this.description = "Convince an investor to max out an investment into your idea";
                this.title = "Golden Opportunity";
            }
            case 2 -> { // Persuasive card
                this.description = "Persuade an investor to back your idea instead of a competitors idea. Convince all investors that a certain concept is a bad idea.";
                this.title = "Persuasive Opportunity";
            }
            case 3 -> { // Re-roll card
                this.description = "Re-roll the dice";
                this.title = "Safety Net";
            }
            case 4 -> { // Deny Opportunity card
                this.description = "Player denies a specific opportunity card based on his choosing";
                this.title = "Deny opportunity";
            }
        }


    }

    public int getOpportunityId() {
        return opportunityId;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

}
