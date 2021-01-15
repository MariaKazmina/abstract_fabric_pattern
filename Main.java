package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OrksArmyUnitsFactory orksArmyUnitsFactory = new OrksArmyUnitsFactory();
        MakeArmy makeArmy = new MakeArmy(orksArmyUnitsFactory);
        makeArmy.createArmy();
        ElfsArmyUnitsFactory elfsArmyUnitsFactory = new ElfsArmyUnitsFactory();
        MakeArmy makeArmy1 = new MakeArmy(elfsArmyUnitsFactory);
        makeArmy1.createArmy();
    }
}
