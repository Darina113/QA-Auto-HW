package SelfmadeLess1.abstrakcia;
//создаем абстрактный класс
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    //конструктор по умолчанию
    TwoDShape(){
        width=height=0.0;
        name="none";
    }
    //параметризированный конструктор
    TwoDShape(double w, double h, String n){
        width=w;
        height=h;
        name=n;
    }
    //Создание объекта с одинаковыми значениями width и height
    TwoDShape(double x, String n){
        width=height=x;
        name=n;
    }
    //Создание одного объекта на основе другого
    TwoDShape(TwoDShape ob){
        width=ob.width;
        height=ob.height;
        name=ob.name;
    }
    //методы геттеров и сеттеров чтобы видеть приватные переменные
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //конструктор для отображения длины и ширины
    void showDim(){
        System.out.println("Ширина и высота  = "+width+""+height);
    }
    // абстрактный метод. Метод кот показывает площадь какой-то фигуры, он у нас не определен
    // потому что фигуры могут быть разные и для каждой фигуры будет своя реализация
    abstract double area();
}
