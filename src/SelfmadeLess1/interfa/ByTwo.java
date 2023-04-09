package SelfmadeLess1.interfa;
// продолжаем пример с интерфейсом Series
public class ByTwo implements Series{
    int start;
    int val;
    // конструктор
    ByTwo(){
        start=0;
        val=0;
    }
// если мы имплементируем интерфейс, то нам необходимо реализовать методы которые были в нем объявлены

    @Override // анотация говорит что это переопределенный метод
    public int getNext() {
        val +=2; //добавляем к значению 2 и его возвращаем
        return val;
    }

    @Override
    public void resert() {
        start=0;
        val=0;
    }

    @Override
    public void setStart(int x) {
        start=x;
        val=x;

    }
    // если мы имплементируем интерфейс, то нам необходимо реализовать методы которые были в нем объявлены

}
