package CardGame;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OpportunityCardTest {

    @Test
    public void testConstructor() {

        OpportunityCard newOpportunityCard = new OpportunityCard(1);
        assertEquals(1, newOpportunityCard.getOpportunityId());
        assertEquals("Convince an investor to max out an investment into your idea", newOpportunityCard.getDescription());
        assertEquals("Golden Opportunity", newOpportunityCard.getTitle());


    }

    @Test
    public void testReRoll() {

        OpportunityCard opportunityCard = new OpportunityCard(3);
        System.out.println(opportunityCard.getTitle());
        System.out.println(opportunityCard.getDescription());
        Random rand = new Random(6);
        assertEquals(2, rand.nextInt((10 - 1) + 1) + 1);
        rand = new Random(8);
        assertEquals(5, rand.nextInt((10 - 1) + 1) + 1);

    }


    /*Test
    public void testgoldenOpprotunity() {

        // call method golden opportunity 500000
        assertEquals(5, rollDice(500000, 1));

    }
*/


}