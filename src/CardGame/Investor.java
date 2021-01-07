package CardGame;

import java.util.ArrayList;

public class Investor {

    private String name = "";
    private ArrayList<String> investmentTypes;
    private ArrayList<Integer> investmentAmounts;

    public Investor() {
    }

    public Investor(String name, ArrayList<String> investmentTypes, ArrayList<Integer> investmentAmounts) {
        this.name = name;
        this.investmentTypes = investmentTypes;
        this.investmentAmounts = investmentAmounts;
    }

    public String getName() {
        return name;
    }

    public int getInvestmentAmount(int index) {
        return investmentAmounts.get(index);
    }

    public String getInvestmentType(int index) {
        return investmentTypes.get(index);
    }

    public void updateInvestment(int index, int amount) {
        investmentAmounts.set(index, amount);
    }

}
