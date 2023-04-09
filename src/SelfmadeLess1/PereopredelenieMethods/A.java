package SelfmadeLess1.PereopredelenieMethods;
// пример переопределения методов (родительский класс А)
public class A {
    int i, j;

    A(int a, int b) {
        i=a;
        j=b;
    }
    void show (){
        System.out.println("i и j = "+i+""+j);
    }
}