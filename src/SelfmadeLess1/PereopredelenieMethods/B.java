package SelfmadeLess1.PereopredelenieMethods;
// пример №1 с переопределением методов и новым подклакссом В
public class B extends A{
    int k;
    B(int a, int b, int c){
        super(a, b); //вызываем родительский конструктор
        k=c; //добавляем новые переменные
    }
    void show(){
        System.out.println("k = "+k);
    }
}
