package SelfmadeLess1.staticer.ex4;

public class ClassD extends ClassC {

    public ClassD(){
        System.out.println("Конструктор класса D");
    }

    //стат.блок
    static {
        System.out.println("Статический блок D");
    }

    //динамический блок
    {
        System.out.println("Динамический блок D");
    }
}
