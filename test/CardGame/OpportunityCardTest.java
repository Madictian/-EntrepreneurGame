package CardGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpportunityCardTest {

    @Test
    public void testConstructor() {

        OpportunityCard newOpportunityCard = new OpportunityCard(1);
        assertEquals(1, newOpportunityCard.getOpportunityId());
        assertEquals("Convince an investor to max out an investment into your idea", newOpportunityCard.getDescription());
        assertEquals("Golden Opportunity", newOpportunityCard.getTitle());


    }


}