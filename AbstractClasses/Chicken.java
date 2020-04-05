package AbstractClasses;

public class Chicken extends Bird {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " I cant fly, i can only jump. JUMP JUMP JUMP JUMP");
    }
}
