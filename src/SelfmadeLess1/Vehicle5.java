package SelfmadeLess1;

public class Vehicle5 {
    int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон

// создадим конструктор Vehicle5 с передающими параметрами int p, int f, int m)
    Vehicle5(int p, int f, int m){
        passengers=p; // к переменным присваиваем значение которые мы получаем в конструкторе
        fuelcap=f; // к переменным присваиваем значение которые мы получаем в конструкторе
        mpg=m; // к переменным присваиваем значение которые мы получаем в конструкторе
    }
    int range (){
        return fuelcap*mpg;
    }
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

}
