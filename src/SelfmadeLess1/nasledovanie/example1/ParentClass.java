package SelfmadeLess1.nasledovanie.example1;

public class ParentClass {
    String parentString;//поле для род.класса
    int parentInt;//поле для род.класса

    //конструктор род.класса
    public ParentClass(String parentString, int parentInt) {
        this.parentString = parentString;
        this.parentInt = parentInt;
    }
    //public ParentClass(){}

//метод род.класса
    public void parentMethods(){
        System.out.println("I am parent method");
    }
}
