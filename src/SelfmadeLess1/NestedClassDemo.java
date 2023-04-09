package SelfmadeLess1;
// пример с внутренними классами (продолжение Outer)
public class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8}; // создаем массив данных

        Outer outOb = new Outer(x); // передаем массив в конструктор
        outOb.analyse();// вызываем метод analyse у объекта outOb
    }
}
