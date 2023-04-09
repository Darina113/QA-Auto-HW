package SelfmadeLess1.abstrakcia;

public class Rectangle extends TwoDShape{
    //конструктор по умолчанию
    Rectangle(){
        super();
    }
    //Конструктор класса Rectangle
    Rectangle(double w, double h){
        super(w,h,"прямоугольник");
    }
    //Создание квадртата
    Rectangle(double x){
        super(x,"прямоугольник");
    }
    //Создание одного объекта на основе другого
    Rectangle(Rectangle ob){
        super(ob);
    }
    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return false;
    }
    //метод ареа который был абстрактным в TwoDShape классе, переопределяется в этом классе
    double area(){
        return getWidth()*getHeight();
    }

}
