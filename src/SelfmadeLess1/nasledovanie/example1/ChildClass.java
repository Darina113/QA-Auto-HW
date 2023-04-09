package SelfmadeLess1.nasledovanie.example1;

public class ChildClass extends ParentClass{
    String childString; //поле класса ChildClass

   /*public ChildClass(String parentString, int parentInt) {
        super(parentString, parentInt);
    }
*/
    //создаем конструктор для ChildClass+конструктор ParentClass
    public ChildClass(String parentString, int parentInt, String childString) {
        super(parentString, parentInt);//super - указ.на исп-ие род.конструктора
        this.childString = childString;//параметр кот создан в ChildClass
    }

    public void childMethod(){
        System.out.println("child method");
        super.parentMethods();//вызываем исп-е род.метода
        System.out.println(super.parentInt);
    }
}
