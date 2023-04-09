package SelfmadeLess1.staticer.ex4;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }

    //стат.блок
    static {
        System.out.println("Статический блок C");
    }

    //динамический блок
    {
        System.out.println("Динамический блок C");
    }
}
