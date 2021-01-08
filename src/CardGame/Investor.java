package CardGame;

import java.util.ArrayList;

public class Investor {
    private ArrayList<Integer> defaultInvestmentAmounts;
    private String name = "";
    private ArrayList<String> investmentTypes;
    private ArrayList<Integer> investmentAmounts;

    public Investor() {
    }

    public Investor(String name, ArrayList<String> investmentTypes, ArrayList<Integer> investmentAmounts, ArrayList<Integer> defaultInvestmentAmounts) {
        this.name = name;
        this.investmentTypes = investmentTypes;
        this.investmentAmounts = investmentAmounts;
        this.defaultInvestmentAmounts = defaultInvestmentAmounts;
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

    public int getDefaultInvestmentAmount(int index) {
        return defaultInvestmentAmounts.get(index);
    }

    public void resetValue() {
        for (int i = 0; i < this.investmentAmounts.size(); i++){
            this.investmentAmounts.set(i, getDefaultInvestmentAmount(i));
        }
    }
}
