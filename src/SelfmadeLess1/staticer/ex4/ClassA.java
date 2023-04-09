package SelfmadeLess1.staticer.ex4;

public class ClassA {

    public ClassA(){
        System.out.println("Конструктор класса A");
    }

    //стат.блок
    static {
        System.out.println("Статический блок A");
    }

    //динамический блок
    {
        System.out.println("Динамический блок A");
    }
}
