package StrategyPattern.Weapon;

import StrategyPattern.Player;

public class Shield implements Weapon {

    @Override
    public void use(Player player) {
        System.out.println("Depence Attack!");
    }

    @Override
    public void drop() {

    }
}