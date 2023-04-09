package SelfmadeLess1.PereopredelenieMethods;
// пример №2 с переопределением методов и новым подклакссом В2
public class B2 extends A{
    int k;
    B2(int a, int b, int c){
        super(a, b); //вызываем родительский конструктор
        k=c; //добавляем новые переменные
    }
    void show(){
        super.show();
        System.out.println("k= "+k);
    }
}
