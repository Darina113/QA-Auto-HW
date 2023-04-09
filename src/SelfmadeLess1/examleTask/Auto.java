package SelfmadeLess1.examleTask;

public class Auto {
    private String name;
    private int cost;
    private int toDistance;
    private int currentDistance;

    public Auto(String name, int cost, int toDistance, int currentDistance) {
        this.name = name;
        this.cost = cost;
        this.toDistance = toDistance;
        this.currentDistance = currentDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getToDistance() {
        return toDistance;
    }

    public void setToDistance(int toDistance) {
        this.toDistance = toDistance;
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }
}
