package AbstractClasses;

public abstract class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(" breathe in, breath out");

    }

    public abstract void fly();
}
