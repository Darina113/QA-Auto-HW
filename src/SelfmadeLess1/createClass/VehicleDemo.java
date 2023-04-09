package SelfmadeLess1.createClass;

public class VehicleDemo {
    public static void main(String[] args){
        Vehicle minivan = new Vehicle(); //создаем объект класса Vehicle
        int range;
        // присваиваем значения полям в объекте minivan
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;
        // расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("мини-фургон может перевести "+minivan.passengers+ "пассажиров на расстояние "+range+" миль");

    }
}
