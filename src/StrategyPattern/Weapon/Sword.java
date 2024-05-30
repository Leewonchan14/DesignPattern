package StrategyPattern.Weapon;

import StrategyPattern.Player;

public class Sword implements Weapon {
    private long damage = 5L;

    @Override
    public void use(Player player) {
        System.out.println("Sword Attack! : " + damage);
    }

    @Override
    public void drop() {
        System.out.println("Sword is dropped");
    }
}
