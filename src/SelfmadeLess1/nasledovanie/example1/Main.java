package SelfmadeLess1.nasledovanie.example1;

public class Main {
    public static void main(String[] args) {
        //ChildClass child = new ChildClass();
        //System.out.println(child.parentInt);//покажет 0

        //ParentClass parent = new ParentClass();
        ChildClass childClass = new ChildClass("String",2,"stringChild");
        childClass.childMethod();
    }
}
