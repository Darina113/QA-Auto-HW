package SelfmadeLess1;
// класс Vehicle5 с конструктором (с параметрами) (7,16,21) и тд. в которые передаем значение
// в отличии от класа Vehicle4 мы там присваивали эти значения через объект и через точку и через переменную
public class TwoVehicle5 {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5(7,16,21);
        Vehicle5 sportcar = new Vehicle5(2,14,12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль мини фургону требуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelNeeded(dist);
        System.out.println("Для преодоления " + dist + " миль спорт атво  требуется " + gallons + " галлонов топлива");

    }
}