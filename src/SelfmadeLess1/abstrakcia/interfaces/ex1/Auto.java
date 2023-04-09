package SelfmadeLess1.abstrakcia.interfaces.ex1;

public class Auto extends Vehicles implements Interface, Fly{
    @Override
    public void move() {
        System.out.println("Я еду");
    }

    @Override
    public void iCanFly() {
        System.out.println("Я не могу летать я Авто");
    }
}
