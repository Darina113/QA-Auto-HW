package SelfmadeLess1.staticer.ex1;
//ключевое слово Static
public class ClassEx {
    static int staticNumber = 6; //статическое поле
     int nonStaticNumber = 8;//не статическое поле

    //статический метод
     public static void staticMethod(){
         System.out.println("Я статический");
     }

     //не статический метод
    public  void NonStaticMethod(){
        System.out.println("Я  не статический");
    }

    //статический метод
    public static void staticMethod2(){
        System.out.println(staticNumber);
        //System.out.println(nonStaticNumber); //не стат.метод нельзя вызвать в стат методе
        //NonStaticMethod(); //не стат.метод нельзя вызвать в стат методе
         staticMethod();
        System.out.println("Я статический2");
    }

    //не статический метод
    public  void NonStaticMethod2(){//статит.метод можно вызвать в не стат.методе
        System.out.println(staticNumber);
        staticMethod2();
        System.out.println("Я  не статический2");
    }

}
