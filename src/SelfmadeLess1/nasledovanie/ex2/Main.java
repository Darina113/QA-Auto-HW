package SelfmadeLess1.nasledovanie.ex2;

public class Main {
    public static void main(String[] args) {
        //ChildClass child = new ChildClass();
        //System.out.println(child.parentInt);

        ParentClass parent = new ParentClass("String",2); //создали объект ParentClass
        ChildClass childClass = new ChildClass("String",2,"stringChild");//создали объект childClass
        childClass.howToMove();
        childClass.howToRead();
        System.out.println("============================");
        parent.howToMove();
        parent.howToRead();

    }
}
