package SelfmadeLess1.peregruzMetodov;
//перегрузка методов (продолжение Overload)
public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob=new Overload();
        int res1;
        double res0;

        //вызов первого метода без параметров
        ob.ovlDemo();
        System.out.println(); //перенос строки

        //вызов второго метода с 1 параметром
        ob.ovlDemo(2);
        System.out.println();

        //вызов 3го метода с 2 параметрами
        res1= ob.ovlDemo(4,6);
        System.out.println("Результат вызова ob.ovlDemo(4,6) = "+res1);
        System.out.println();

        //вызов 4го метода с 2 параметрами типа double
        res0= ob.ovlDemo(1.1,2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1,2.32) = "+res0);
        System.out.println();
    }
}
