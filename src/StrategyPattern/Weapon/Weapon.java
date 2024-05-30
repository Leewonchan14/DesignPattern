package StrategyPattern.Weapon;

import StrategyPattern.Player;

public interface Weapon {
    public void use(Player player);

    public void drop();
}
