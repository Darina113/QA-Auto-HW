package SelfmadeLess1.createClassMetodObject;
//продолжение Test2
public class CalByRef {
    public static void main(String[] args) {
        Test2 ob=new Test2(15,20);
        System.out.println("ob.a  ob.b перед вызовом = "+ob.a+""+ob.b);
        ob.change(ob);//передаем объект
        System.out.println("ob.a  ob.b после вызова = "+ob.a+""+ob.b);
    }
}
