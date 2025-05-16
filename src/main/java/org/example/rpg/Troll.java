package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {
    private boolean canBleed=true;
    private boolean canPoison=true;

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public Troll(String name, int hitPoints, double damage, boolean canBleed, boolean canPoison) {
        super(name, hitPoints, damage);
        this.canBleed = canBleed;
        this.canPoison = canPoison;
    }

    @Override
    public double bleed() {
        if (canBleed) {
            return getDamage() * 0.25;
        }
        return 0;
    }

    @Override
    public double poison() {
        if (canPoison) {
            return getDamage() * 0.3;
        }
        return 0;
    }

    @Override
    public double attack() {

        return getDamage() + bleed() + poison();
    }
}
