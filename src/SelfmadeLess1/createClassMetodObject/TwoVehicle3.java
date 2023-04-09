package SelfmadeLess1.createClassMetodObject;

//пример возврата значения
public class TwoVehicle3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportcar = new Vehicle3();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        //получение дальности поездки для разных ТС
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Мини фургон может перевезти "+minivan.passengers+ " пассажиров на расстоянии "+range1);

        System.out.println("Спортивный автомобиль может перевезти "+sportcar.passengers+ " пассажиров на расстоянии "+range2);


    }
}
