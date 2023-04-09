package SelfmadeLess1.interfa;
// продолжаем пример с интерфейсом Series
public class SeriesDemo {
    public static void main(String[] args) {
        ByTwo ob=new ByTwo();

        for (int i=0; i<5;i++){
            System.out.println("Следующее значение ="+ob.getNext());
        }
        System.out.println("Сброс ");
        ob.resert();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение ="+ob.getNext());
        }

        System.out.println("Начальное значение 100");
        ob.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение = "+ob.getNext());
        }

    }

}
