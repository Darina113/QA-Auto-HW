package SelfmadeLess1.createClassMetodObject;

// пример использования параметров в методе где есть  два метода int range(){ return fuelcap*mpg;}
// и double fuelNeeded(int miles){return (double) miles/mpg  и два объекта minivan and sportcar
public class TwoVehicle4 {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportcar = new Vehicle4();
        double gallons;
        int dist=252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons= minivan.fuelNeeded(dist);
        System.out.println("Для преодоления "+dist+" миль мини фургону требуется "+gallons+" галлонов топлива");

        gallons= sportcar.fuelNeeded(dist);
        System.out.println("Для преодоления "+dist+" миль спорт атво  требуется "+gallons+ " галлонов топлива");
    }
}
