package SelfmadeLess1.abstrakcia.abstractClass.ex1;

public  abstract class Vehicles {
    int name;

    public Vehicles(int name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    String cost;

    public void print(){
        System.out.println("Я просто печатаю");
    }

    public abstract void move();
    public abstract void typeMyType();
}
