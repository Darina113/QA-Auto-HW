package SelfmadeLess1.staticer.ex1;

public class Main {
    public static void main(String[] args) {
        ClassEx object = new ClassEx();
        System.out.println(object.nonStaticNumber);//не стат переменная - вызов через имя объекта object
        System.out.println(ClassEx.staticNumber); //стат переменная - вызов через имя класса ClassEx
/*
        object.NonStaticMethod();
        ClassEx.staticMethod();
        ClassEx.staticMethod2();*/
        object.NonStaticMethod2();

    }
}
