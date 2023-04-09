package SelfmadeLess1.staticer.ex3;

public class ClassStatickInit {
    static String day; //статическая переменная

    //статический метод
    static void thisIsMonday(){
        day ="Monday";
        System.out.println("Today is "+day);
    }

    //статический блок
    static {
        day = "Friday";
        System.out.println("I love "+day);
    }

    //статический блок
    static {
        day = "Tuesday";
        System.out.println("I love "+day);
    }
}
