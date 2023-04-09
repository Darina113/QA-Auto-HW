package SelfmadeLess1.nasledovanie.example3;
// пример наследования (общий класс)
public class Vehicle {
    private int passengers;// переменная экземпляра (объекта). Кол-во пассажиров
    private int fuelcap; //переменная экземпляра (объекта). Емкость топливного бака
    private int mpg; //переменная экземпляра (объекта). Потребление топлива в милях на галлон
     //далее создадим конструктор с приним.параметрами
    Vehicle(int p, int f, int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }
    //создадим метод range
    int range (){
        return fuelcap*mpg;
    }
    //создадим метод fuelNeeded
    double fuelNeeded(int miles){
        return (double) miles/mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
