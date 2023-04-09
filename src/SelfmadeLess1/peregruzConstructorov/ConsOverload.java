package SelfmadeLess1.peregruzConstructorov;
// пример перегрузки конструктора
public class ConsOverload {
    int x;
    // конструктор 1 без передающих параметров
    ConsOverload(){
        System.out.println("Внутри ConsOverload(). ");
        x=0;
    }
    // конструктор 2 c одним параметром типа int
    ConsOverload(int i){
        System.out.println("Внутри ConsOverload(int).");
        x=i;
    }
    // конструктор 3 c одним параметром типа double
    ConsOverload(double d){
        System.out.println("Внутри ConsOverload(double).");
        x=(int) d;
    }
    // конструктор 4 c двумя параметроми типа int
    ConsOverload(int i, int j){
        System.out.println("Внутри ConsOverload(int, int).");
        x=i*j;
    }
}
