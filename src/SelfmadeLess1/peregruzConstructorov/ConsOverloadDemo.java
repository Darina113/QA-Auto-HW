package SelfmadeLess1.peregruzConstructorov;

public class ConsOverloadDemo {
    public static void main(String[] args){
        ConsOverload c1 =new ConsOverload(); //создаем объект класса ConsOverload с исп. первого конструктора
        ConsOverload c2 =new ConsOverload(88);//создаем объект класса ConsOverload с исп. второго конструктора
        ConsOverload c3 =new ConsOverload(17.23); //создаем объект класса ConsOverload с исп. третьего конструктора
        ConsOverload c4 =new ConsOverload(2,4); //создаем объект класса ConsOverload с исп. четвертого конструктора

        System.out.println("c1.x = "+c1.x);
        System.out.println("c2.x = "+c2.x);
        System.out.println("c3.x = "+c3.x);
        System.out.println("c4.x = "+c4.x);
    }
}
// как результат сначала вызвались все конструкторы, и выполняются все операции внутри конструктора
// далее как результат изменение х