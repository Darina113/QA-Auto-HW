package SelfmadeLess1.createClassMetodObject;

import SelfmadeLess1.createClassMetodObject.Vehicle2;

//пример возврата из метода void
public class TwoVehicle2 {
    public static void main(String[] args){
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();

        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        sportcar.passengers=2;
        sportcar.fuelcap=14;
        sportcar.mpg=12;

        System.out.println("Мини фургон может перевезти "+minivan.passengers+ " пассажиров");
        minivan.range(); // на объекте minivan вызываем метод range и делаем то что прописано в методе Vehicle2
        System.out.println("Спортивный автомобиль может перевезти "+sportcar.passengers+ " пассажиров");
        sportcar.range(); // на объекте sportcar вызываем метод range и делаем то что прописано в методе Vehicle2

    }
}
