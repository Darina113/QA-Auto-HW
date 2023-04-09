package SelfmadeLess1.nasledovanie.ex1;

public class ClassA {
    int number;
    public ClassA(int number){
        this.number=number;
        System.out.println("Конструктор класса A");
    }
    public ClassA(){} //добавили пустой конструктор чтобы не ыбло конфликтов в след наследуемых классах
}
