package SelfmadeLess1.abstrakcia.abstractClass.ex2;

public class Auto extends Vehicles implements Interface, Fly {
    //наследует абстрактный класс Vehicle
    @Override
    public void move() {
        System.out.println("Я еду");
    }

    @Override
    public void iCanFly() {
        System.out.println("Я не могу летать я Авто");
    }
}
