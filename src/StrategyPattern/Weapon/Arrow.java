package StrategyPattern.Weapon;

import StrategyPattern.Player;

public class Arrow implements Weapon {
    private long damage = 10L;

    @Override
    public void use(Player player) {
        System.out.println("Arrow Attack! : " + damage);
    }

    @Override
    public void drop() {
        System.out.println("Arrow is dropped");
    }
}
