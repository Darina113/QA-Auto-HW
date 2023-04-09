package SelfmadeLess1.examleTask;

public class Service {
    private String name;

    //конструктор
    public Service(String name) {
        this.name = name;
    }

//метод
    public void readyForService(Contract contract, City city){
        int disForTo = contract.getHuman().getAuto().getToDistance();//расстояние необходимое для то
        int afterTripDisance = contract.getHuman().getAuto().getCurrentDistance()+
                (city.getDistance()*2); //расстояние кот.есть сейчас
        //пишем условия
        if(afterTripDisance>=disForTo){
            System.out.println("Уважаемый "+contract.getHuman().getName()+".\n" +
                    "    Прежде чем вы направитесь в "+city.getName()+" " +
                    "вам понадобится пройти ТО.");
        }else {
            System.out.println("Уважаемый "+contract.getHuman().getName()+".\n" +
                    "    Езжайте в "+city.getName()+". Но не забывайте, что согласно\n" +
                    "    договору "+contract.getId()+" вы обслуживаетесь у нас.\n" +
                    "    Ваша "+name+".");
        }
    }
}
