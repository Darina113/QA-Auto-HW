package SelfmadeLess1.peregruzMetodov;

public class Main {
    public static void main(String[] args) {
        Peregruz per = new Peregruz(); //создаем экземпляр класса - объект
        per.peregruz();//вызовется метод пустой (без параметров)
        per.peregruz("string"); //вызовется метод с 1м параметром (строка)
        per.peregruz("string",4);//вызовется метод с 2мя параметрами (строка,число)
        per.peregruz(4,"asfasf","aasvca");//вызовется метод с 2мя параметрами (число,строка,строка)
    }
}
