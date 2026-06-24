package com.paimon.lumine;

// Base class for all characters
class Character {
    private String name;
    private int level;
    private String element;

    public Character(String name, int level, String element) {
        this.name = name;
        this.level = level;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getElement() {
        return element;
    }

    public void attack() {
        System.out.println(name + " attacks with " + element + " element!");
    }
}

// Derived class for Mona
class Mona extends Character {
    private String weapon;

    public Mona(int level, String weapon) {
        super("Mona", level, "Hydro");
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + getElement() + " element using " + weapon + "!");
    }

    public void elementalSkill() {
        System.out.println(getName() + " uses her elemental skill: Mirror Reflection of Doom!");
    }

    public void elementalBurst() {
        System.out.println(getName() + " unleashes her elemental burst: Stellaris Phantasm!");
    }
}

class Fischl extends Character {
    private String weapon;

    public Fischl(int level, String weapon) {
        super("Fischl", level, "Electro");
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + getElement() + " element using " + weapon + "!");
    }

    public void elementalSkill() {
        System.out.println(getName() + " uses her elemental skill: Night Raven!");
    }

    public void elementalBurst() {
        System.out.println(getName() + " unleashes her elemental burst: Midnight Phantasmagoria!");
    }
}

public class Main {
    public static void main(String[] args) {
        Mona mona = new Mona(80, "Catalyst");
        Fischl fischl = new Fischl(80, "Bow");
        mona.attack();
        mona.elementalSkill();
        mona.elementalBurst();
        fischl.attack();
        fischl.elementalSkill();
        fischl.elementalBurst();
    }
}