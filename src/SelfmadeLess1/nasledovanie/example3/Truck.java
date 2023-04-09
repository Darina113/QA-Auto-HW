package SelfmadeLess1.nasledovanie.example3;
// пример наследования (продолжение) (класс наследователь Truck)

public class Truck extends Vehicle {
    private int cargocup; // добавляем уник.переменную для подккласса Truck

    //создаем конструктор
    Truck(int p, int f, int m, int c){
        // инициализация членов класса Vehicle с использов.конструктора этого класса
        super(p, f, m);
        cargocup=c;
    }
    //методы доступа к переменной cargocup
    public int getCargocup() {
        return cargocup;
    }

    public void setCargocup(int cargocup) {
        this.cargocup = cargocup;
    }
}
