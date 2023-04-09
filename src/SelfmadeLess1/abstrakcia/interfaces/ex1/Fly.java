package SelfmadeLess1.abstrakcia.interfaces.ex1;

public interface Fly {
    void iCanFly();

    default void defoultMethod(){
        System.out.println("Я дефолтный метод");
    }
}
