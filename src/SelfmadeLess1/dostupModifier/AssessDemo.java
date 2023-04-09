package SelfmadeLess1.dostupModifier;


//продолжение примера Myclass
public class AssessDemo {
    public static void main(String[] args){
        MyClass ob = new MyClass();
        // доступ к переменной alpha возможен только с помощью спец.предназначенных для этой цели методов
        ob.setAlpha(-99); // вызываем объект ob и его метод setalpha и передаем число
        // чтобы его получить вызываем метод getalpha
        System.out.println("ob.alpha = "+ob.getAlpha());
        //недопустимо ob.alpha = 10;
        ob.beta=88; // эти переменные с публичным довтупом а значит можем напрмую к ним обращаться
        ob.gamma=99;// эти переменные с публичным довтупом а значит можем напрмую к ним обращаться
    }
}
