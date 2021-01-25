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
                this.description = "If you used one investor will always invest the highest possible amount\n" + "(no more than asked)";
                this.title = "Golden Opportunity";
            }
            case 2 -> { // Persuasive card
                this.description = "Persuade an investor to back your idea instead of a competitors idea. Convince all investors that a certain concept is a bad idea.";
                this.title = "Persuasive Opportunity";
            }
            case 3 -> { // Re-roll card
                this.description = "Can be used to reroll a die that went over the investors limit.";
                this.title = "Safety Net";
            }
            case 4 -> { // Deny Opportunity card
                this.description = "negate the activation of 1 players opportunity card.";
                this.title = "Deny opportunity";
            }
        }

    }

    // I thought this might be a method that can call any of the effects, though idk if its useful, TODO come back to this at a later time
    /*public void cardEffect() {

        switch (opportunityId) {
            case 1 -> *//**//*;
            case 2 -> persuade();
        }

    }*/

    public int reRoll(int roll){
        Random rand = new Random();
        roll = rand.nextInt((10 - 1) + 1) + 1;
        return roll;
    }

  /*  public Investor[] persuade(Investor[] investors, String investmentType) {

        for (Investor currentInvestor: investors) {

            int i;

            for (i = 0; i < currentInvestor.getInvestmentTypeArray().size(); i++) {

                if (currentInvestor.getInvestmentType(i).equals(investmentType)) {

                    break;

                } else if (i == currentInvestor.getInvestmentTypeArray().getLastIndex()) {

                    currentInvestor.getInvestmentTypeArray().add(investmentType);

                }

            }

            currentInvestor.getInvestmentAmountArray().set(i, 1000000);

        }

        return investors;
    }*/

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
