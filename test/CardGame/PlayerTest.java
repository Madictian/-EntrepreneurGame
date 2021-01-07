package CardGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;

    @Test
    public void testUpdatePoints() {
        assertEquals(0, player.getPlayerPoints());
        player.addPlayerPoints(5);
        assertEquals(5, player.getPlayerPoints());
    }

}