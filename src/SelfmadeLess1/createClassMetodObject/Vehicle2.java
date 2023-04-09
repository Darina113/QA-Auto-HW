package SelfmadeLess1.createClassMetodObject;
//создаем класс Vehicle2 и его метод range и пишем его вычесления
public class Vehicle2 {
    int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон

    //метод
    void range(){
        System.out.println("Дальность "+fuelcap*mpg+" миль.");
    }
}
