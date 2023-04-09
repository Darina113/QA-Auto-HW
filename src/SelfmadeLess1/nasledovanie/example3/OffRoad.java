package SelfmadeLess1.nasledovanie.example3;

public class OffRoad extends Vehicle{
    private int groundClearence;
    OffRoad(int p, int f, int m, int gc){
        super(p,f,m);
        groundClearence=gc;
    }

    public int getGroundClearence() {
        return groundClearence;
    }

    public void setGroundClearence(int groundClearence) {
        this.groundClearence = groundClearence;
    }
}
