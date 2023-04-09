package SelfmadeLess1.createClassMetodObject;
//продолжение в CalByRef
public class Test2 {
    int a,b;

    // конструктор
    Test2(int i,int j){
        a=i;
        b=j;
    }
    //Передача обэекта методу. Теперь переменные ob.a и ob.b объекта, исп-го при вызове, тоже будут меняться
    void change (Test2 ob){
        ob.a=ob.a+ob.b;
        ob.b=-ob.b;
    }
}
