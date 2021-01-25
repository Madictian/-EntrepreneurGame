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

    public ArrayList getInvestmentTypes(){
        return investmentTypes;
    }
    public ArrayList getInvestmentAmounts(){
        return investmentAmounts;
    }
    public int getInvestmentAmount(int index) {
        return investmentAmounts.get(index);
    }

    public String getInvestmentType(int index) {
        return investmentTypes.get(index);
    }

    public void updateInvestment(int index, int amount) {
        investmentAmounts.set(index, investmentAmounts.get(index) + amount);
    }

    @Override
    public String toString() {

        String stuff = "";
        for (int i = 0; i < investmentAmounts.size(); i++) {
            stuff += investmentAmounts.get(i) + " " + investmentTypes.get(i) + "\n";
        }

        return name + "\n" + stuff;
    }


}
