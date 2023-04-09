package SelfmadeLess1.createClassMetodObject;

public class Vehicle4 {
    int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон
    int range(){ return fuelcap*mpg;}

    //расчет кол-ва топлива, необходимого ТС для преодоления заданного пространства
    double fuelNeeded(int miles){
        return (double) miles/mpg; //привели к double чтобы получить точное значение
    }


}
