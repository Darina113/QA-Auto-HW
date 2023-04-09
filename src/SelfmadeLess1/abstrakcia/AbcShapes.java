package SelfmadeLess1.abstrakcia;

public class AbcShapes {
    public static void main(String[] args) {
        TwoDShape shapes[]=new TwoDShape[4]; // массив типа twodshape

        shapes[0] = new Triangle("контурный", 8.0,12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);
// пройдемся по массиву через цикл и выведем название и площадь
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Объект ="+shapes[i].getName());
            System.out.println("Площадь ="+shapes[i].area());
        }
    }
}
