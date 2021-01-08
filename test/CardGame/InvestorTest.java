package CardGame;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InvestorTest {

    Investor investor;
    @Before
    public void setUp() {

        ArrayList<String> investmentTypes = new ArrayList<>();
        investmentTypes.add("Food-Service-Industry");
        ArrayList<Integer> investmentAmounts = new ArrayList<>();
        investmentAmounts.add(900000);
        investor = new Investor("Gordon Ramsay", investmentTypes, investmentAmounts);

    }

    @Test
    public void testClass() {

        Investor investor = new Investor();
        assertEquals(Investor.class, investor.getClass());

    }

    @Test
    public void testConstructor() {

        ArrayList<String> investmentTypes = new ArrayList<>();
        investmentTypes.add("Food-Service-Industry");
        ArrayList<Integer> investmentAmounts = new ArrayList<>();
        investmentAmounts.add(900000);
        Investor newInvestor = new Investor("Gordon Ramsay", investmentTypes, investmentAmounts);
        assertEquals("Gordon Ramsay", newInvestor.getName());
        assertEquals("Food-Service-Industry", newInvestor.getInvestmentType(0));
        assertEquals(900000, newInvestor.getInvestmentAmount(0));

    }

    @Test
    public void testUpdateInvestment(){

        setUp();
        assertEquals(900000, investor.getInvestmentAmount(0));
        investor.updateInvestment(0, 100000);
        assertEquals(1000000, investor.getInvestmentAmount(0));

    }

}
