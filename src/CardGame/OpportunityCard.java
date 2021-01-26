package CardGame;

public class OpportunityCard {

    private String title;
    private String description;
    private int opportunityId;

    public OpportunityCard(int id) {
        this.opportunityId = id;

        switch (id) {
            case 0 -> { // Golden Opportunity card
                this.description = "If you used one investor will always invest the highest possible amount\n" + "(no more than asked)";
                this.title = "Golden Opportunity";
            }
            case 1 -> { // Persuasive card
                this.description = "Persuade an investor to back your idea instead of a competitors idea. Convince all investors that a certain concept is a bad idea.";
                this.title = "Persuasive Opportunity";
            }
            case 2 -> { // Re-roll card
                this.description = "Can be used to reroll a die that went over the investors limit.";
                this.title = "Safety Net";
            }
            case 3 -> { // Deny Opportunity card
                this.description = "negate the activation of 1 players opportunity card.";
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
