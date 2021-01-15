package com.company;

public class OrksArmyUnitsFactory implements ArmyUnits {
    @Override
    public Commander commanderInChief() {
        System.out.println("Звуки главнокомандующего орков");
        return new OrksCommander();
    }

    @Override
    public General general() {
        System.out.println("Звуки генерала орков");
        return new OrksGeneral();
    }

    @Override
    public Soldier solder() {
        System.out.println("Звуки солдатов орков");
        return new OrksSoldier();
    }
}
