package SelfmadeLess1.createClassMetodObject;

public class Vehicle3 {
    int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон
    int range(){
        return fuelcap*mpg;
    }
}
