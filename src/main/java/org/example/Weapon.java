package org.example;

public enum Weapon {
    SWORD(15, 0.5),
    DAGGER(8, 1.2),
    ARROW(12, 0.8);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() { return damage; }
    public double getAttackSpeed() { return attackSpeed; }

}
