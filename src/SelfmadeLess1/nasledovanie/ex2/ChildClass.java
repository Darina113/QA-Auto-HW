package SelfmadeLess1.nasledovanie.ex2;

public class ChildClass extends ParentClass {
    String childString;

   /*public ChildClass(String parentString, int parentInt) {
        super(parentString, parentInt);
    }
*/
    public ChildClass(String parentString, int parentInt, String childString) {
        super(parentString, parentInt);
        this.childString = childString;
    }

    public void childMethod(){
        System.out.println("child method");
        super.parentMethods();
        System.out.println(super.parentInt);
    }

    //переопределение методов в дочернем классе
    @Override //анотация Override что идет переопределение метода
    public void howToMove(){
        System.out.println("Я ползаю");
    }
    @Override//анотация Override что идет переопределение метода
    public void howToRead(){
        System.out.println("Мама читает мне сказки");
    }
}
