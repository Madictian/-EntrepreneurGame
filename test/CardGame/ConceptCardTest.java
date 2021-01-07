package CardGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConceptCardTest {

    @Test
    public void testConstructor() {
        ConceptCard newConceptCard = new ConceptCard("Software");
        assertEquals("Software", newConceptCard.getConcept());
    }

}