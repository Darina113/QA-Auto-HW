package SelfmadeLess1.createClass;
//создаем класс Vehicle
public class Vehicle {
    int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон
    //объявление класс создает новый тип данных - Vehicle
    //фактическое создание реального объекта Vehicle: (ниже)
    Vehicle minivan = new Vehicle(); //создание объекта minivan типа Vehicle
    // Vehicle minivan  -объявление ссылки на объект
    //minivan = new Vehicle() - выделение памяти для объекта типа Vehicle

    // каждый объект типа Vehicle будет содержать копии переменных passengers,fuelcap,mpg
    // для обращение к ним используется точечная нотация: объект.член


}
