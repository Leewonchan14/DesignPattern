package StrategyPattern;

import StrategyPattern.Weapon.Arrow;
import StrategyPattern.Weapon.Shield;
import StrategyPattern.Weapon.Sword;

public class Client {
    public static void main(String[] args) {
        Player player = new Player();

        player.setLeftWeapon(new Sword());
        player.setRightWeapon(new Arrow());

        player.getRightWeapon().use(player);

        player.setRightWeapon(new Shield());

        player.getLeftWeapon().use(player);
        player.getRightWeapon().use(player);
    }
}
