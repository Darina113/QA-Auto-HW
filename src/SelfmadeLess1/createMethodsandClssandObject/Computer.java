package SelfmadeLess1.createMethodsandClssandObject;
//пример создания класса,и его полей, и его методов.
public class Computer {
    private int cost;// поля класса Computer
    private String name; // поля класса Computer
    private boolean hasKeyboard;// поля класса Computer

    /////////////создадим геттеры и сеттер потому что поля у нас private/////////
    //метод get - получение стоимости, и возвращает ее
    public int getCost(){
        return cost;
    }

    //метод set - задаем значения поля cost и он делает действие, но не возвращает
    public void setCost(int cost){
        this.cost=cost;
    }

    //метод get - получение имени
    public String getName() {
        return name;
    }
    //метод set - задаем значения поля name и он делает действие, но не возвращает
    public void setName(String name) {
        this.name = name;
    }

    //метод get - получение инфы о наличии isHasKeyboard, и возвращает ее
    public boolean isHasKeyboard() {
        return hasKeyboard;
    }
    //метод set - задаем значения поля HasKeyboard и он делает действие, но не возвращает
    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    //////////////////////////////////конструкторы и перегрузка конструкторов////////////

    //конструктор класса computer принимаем (строку,стоимость,и наличие клавы)
    public Computer(String name, int cost, boolean hasKeyboard){
        this.cost=cost;
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }

    //конструктор класса computer принимаем (стоимость,название,наличие клавы)
    public Computer(int cost, String name, boolean hasKeyboard){
        this.cost=cost;
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }

    //конструктор класса computer принимаем (название,наличие клавы)
    public Computer(String name, boolean hasKeyboard){
        this.hasKeyboard=hasKeyboard;
        this.name=name;
    }

    //конструктор класса computer принимаем (стоимость,наличие клавы,название)
    public Computer(int cost, boolean hasKeyboard, String name){
        this(name,hasKeyboard);//можем вызвать конструктор, помещаем параметры из нужного конструктора, должно быть всегда на 1м месте
        this.cost=cost; //то что не использовалось, назовем отдельно. через ключевое слово this
    }


     ////////////////////методы класса Computer////////
    //метод printSmth кот ничего не принимает и ничего не возвращает. не возвращает потому что у метода стоит void
    public void printSmth(){
        System.out.println("Я ничего не принимаю, и ничего не возвращаю");
    }

    //метод printSmth2 кот принимает и ничего не возвращает. не возвращает потому что у метода стоит void
    public void printSmth2(String text,int number){
        System.out.println("Я пригимаю "+text+" "+ number);
    }

    //метод printSmth3 кот принимает и возвращает число. потому что стоит int и обязательно должны поставить return
    public int printSmth3(int number){

        return number+4;
    }

    //метод printSmth4 кот не принимает и возвращает число. потому что стоит int и обязательно должны поставить return
    public int printSmth4(){
        return 4;
    }
}
