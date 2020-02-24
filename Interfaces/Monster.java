package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
   private String name;
   private int hp;
   private int strength;

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
