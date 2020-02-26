package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
   private String name;
   private int hp;
   private int strength;

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", strength=" + strength +
                '}';
    }

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

    public Monster(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));

        }
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1, "" + this.hp);
        list.add(2, "" + this.strength);


        return list;
    }
}
