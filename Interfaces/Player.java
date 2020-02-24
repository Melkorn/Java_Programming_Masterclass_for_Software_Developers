package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int hp;
    private int strength;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Player(String name, int hp, int strength, String weapon) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Hp=" + hp +
                ", Strength=" + strength +
                ", Weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1, "" + this.hp);
        list.add(2, "" + this.strength);
        list.add(3, this.weapon);

        return list;
    }
}
