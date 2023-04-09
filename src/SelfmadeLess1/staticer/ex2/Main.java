package SelfmadeLess1.staticer.ex2;

public class Main {
    //всегда первым отрабатывает блок а после метод
    public static void main(String[] args) {
        StaticBlocker staticBlocker = new StaticBlocker();
        StaticBlocker.justMethod();
        StaticBlocker staticBlocker2 = new StaticBlocker();

    }
}
