package SelfmadeLess1.staticer.ex4;

public class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Конструктор класса B");
    }

    //стат.блок
    static {
        System.out.println("Статический блок B");
    }

    //динамический блок
    {
        System.out.println("Динамический блок B");
    }
}
