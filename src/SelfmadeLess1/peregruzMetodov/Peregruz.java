package SelfmadeLess1.peregruzMetodov;

public class Peregruz {
    int x;

    //пример пустого метода безз параметров
    public void peregruz(){
        String string;
        System.out.println("Я пустой метод");
    }

    //пример  метода с 1м параметром
    public void peregruz(String string){
        System.out.println("Я не пустой метод. У меня строка "+string);
    }

    //пример  метода с 2мя параметрами строка и число
    public void peregruz(String string,int number){
        System.out.println("Я не пустой метод." +
                " У меня строка "+string+" и у меня число "+number);
    }

    //пример  метода с 2мя параметрами число и строка
    public void peregruz(int number, String string){
        System.out.println("Я не пустой метод." +
                " У меня строка "+string+" и у меня число "+number);
    }

    //пример рекурсии. метод - вызов метода внутри метода
    public void peregruz(int number, String string, String string2){
        peregruz(string2,number);
        System.out.println("И еще есть строка "+string);
    }
}
