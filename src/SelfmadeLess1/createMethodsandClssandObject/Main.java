package SelfmadeLess1.createMethodsandClssandObject;
//запуск объекта с его классами,методами и полями
public class Main {
    public static void main(String[] args) {
        /*Computer computer = new Computer(); //объект класса
        System.out.println(computer.hasKeyboard);
        System.out.println(computer.cost);
        System.out.println(computer.name);
        /////
        computer.hasKeyboard=true; //инициализируем значения объекта
        computer.cost=15000;//инициализируем значения объекта
        computer.name="Asus";//инициализируем значения объекта

        System.out.println(computer.hasKeyboard);//выводим присвоенные значения
        System.out.println(computer.cost); //выводим присвоенные значения
        System.out.println(computer.name);//выводим присвоенные значения*/

        Computer computer2 = new Computer("Apple",50000,true); //объект класса с конкструктором и его параметрами(название,ст-ть,наличие клавы)
        Computer computer3 = new Computer("Dell",true); //объект класса с конкструктором и его параметрами(название,наличие клавы)
        System.out.println(computer3.getCost());
       // Computer computer4 = new Computer(20000, "Acer",true);
        /*computer2.printSmth();
        computer2.printSmth2("Text",43);
        System.out.println(computer2.printSmth3(3)+4);*/

        System.out.println(computer2.getCost());
        /*computer2.setCost(2000); //мы задаем значение 2000
        System.out.println(computer2.getCost());*/



    }
}
