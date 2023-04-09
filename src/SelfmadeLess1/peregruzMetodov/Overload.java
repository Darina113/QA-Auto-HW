package SelfmadeLess1.peregruzMetodov;
//перегрузка методов (продолжение OverloadDemo)
public class Overload {

    //метод1 без параметра
    void ovlDemo(){
        System.out.println("Без параметров");
    }

    //метод2 1 параметр
    void ovlDemo(int a){
        System.out.println("Один параметр "+a);
    }

    //метод3 2 параметра типа инт
    int ovlDemo(int a, int b){
        System.out.println("Два параметра "+a+""+b);
        return a+b;
    }

    //метод4 2 параметра типа double
    double ovlDemo(double a, double b){
        System.out.println("Два параметра типа double "+a+""+b);
        return a+b;
    }
}
