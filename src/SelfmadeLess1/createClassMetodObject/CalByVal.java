package SelfmadeLess1.createClassMetodObject;

public class CalByVal {
    public static void main(String[] args) {
        Test ob=new Test();
        int a=15;
        int b=20;
        System.out.println("a и b перед вызовом= "+a+""+b);
        ob.noChange(a,b);
        System.out.println("a и b после вызова= "+a+""+b);
    }
}
