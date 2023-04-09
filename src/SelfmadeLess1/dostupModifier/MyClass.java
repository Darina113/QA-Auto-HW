package SelfmadeLess1.dostupModifier;
// пример с доступом private
public class MyClass {
    private int alpha; // закрытый доступ
    public int beta; //открытый доступ
    int gamma; // тип доступа по умолчанию (public)

    // методы доступа (get and set) к переменной alpha. Члены класса могут обращаться к закрытым членам того же класса
    // setalpha - принимает параметр значения переменной
    // getAlpha - эту перемнную возвращает
    // вызов геттер и сеттера = Command+n

     void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
