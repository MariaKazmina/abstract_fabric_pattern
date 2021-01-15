package com.company;

public class ElfsArmyUnitsFactory implements ArmyUnits{

    @Override
    public Commander commanderInChief() {
        System.out.println("Звуки главнокомандующего эльфов");
        return new ElfsCommander();
    }

    @Override
    public General general() {
        System.out.println("Звуки генерала эльфов");
        return new ElfsGeneral();
    }

    @Override
    public Soldier solder() {
        System.out.println("Звуки солдатов эльфов");
        return new ElfsSoldier();
    }
}
