package SelfmadeLess1.abstrakcia;

public class Triangle extends TwoDShape{
    private String style;
    //конструктор по умолчанию
    Triangle(){
        super();
        style="none";
    }

    //Конструктор класса Triangle
    Triangle(String s, double w, double h){
        super(w,h,"треугольник");
        style=s;
    }
    // Конструктор с одним аргументом
    Triangle(double x){
        super(x,"треугольник");
        style="закрашенный";
    }
    //Создание одного объекта на основе другого
    Triangle(Triangle ob){
        super(ob);
        style=ob.style;
    }

    @Override
    double area() {
        return getWidth()*getHeight()/2;
    }
    //метод стиля треугольника
    void showStyle(){
        System.out.println("Треугольник "+style);
    }
}
