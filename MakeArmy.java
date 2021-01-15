package com.company;

import java.util.Scanner;

public class MakeArmy {
    public ArmyUnits getArmyUnits() {
        return armyUnits;
    }

    public void setArmyUnits(ArmyUnits armyUnits) {
        this.armyUnits = armyUnits;
    }

    private ArmyUnits armyUnits;

    public MakeArmy(ArmyUnits unit) {
        setArmyUnits(unit);
    }

    /**
     * private void getTypeArmyMethod() {
     * Scanner in = new Scanner(System.in);
     * System.out.println("Input string \"Elf\" to create elfs unit. Input string \"Ork\" to create orks unit.");
     * String type = in.nextLine();
     * switch (type) {
     * case "Elf":
     * this.armyUnits = new ElfsArmyUnitsFactory();
     * break;
     * case "Ork":
     * this.armyUnits = new OrksArmyUnitsFactory();
     * break;
     * default:
     * throw new Error("Incorrect input");
     * }
     * }
     */

    private void getUnitsType() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to create only one unit? Input yes or no");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Input string \"Commander\" to create commander unit. Input string \"General\" to create general unit. Input string \"Soldier\" to create soldier unit.");
            String type = in.nextLine();
            switch (type) {
                case "Commander":
                    armyUnits.commanderInChief();
                    break;
                case "General":
                    armyUnits.general();
                    break;
                case "Soldier":
                    armyUnits.solder();
                    break;
                default:
                    throw new Error("Incorrect input");
            }
        }
    }

    public void createArmy() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many soldiers do you want to create?");
        int number = in.nextInt();
        armyUnits.commanderInChief();
        armyUnits.general();
        for (int i = 0; i < number; i++) {
            armyUnits.solder();
        }
    }
}

