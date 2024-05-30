package StrategyPattern;

import StrategyPattern.Weapon.Weapon;

public class Player {
    private Weapon leftWeapon;

    private Weapon rightWeapon;

    public Weapon getLeftWeapon() {
        return leftWeapon;
    }

    public Weapon getRightWeapon() {
        return rightWeapon;
    }

    public void setLeftWeapon(Weapon leftWeapon) {
        if (this.leftWeapon != null) {
            this.leftWeapon.drop();
        }
        this.leftWeapon = leftWeapon;
    }

    public void setRightWeapon(Weapon rightWeapon) {
        if (this.rightWeapon != null) {
            this.rightWeapon.drop();
        }
        this.rightWeapon = rightWeapon;
    }
}
