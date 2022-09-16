package pont;

public class Pont {
    private int x;
    private int y;

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(){
        this.x = 0;
        this.y = 0;
    }

    public Pont(int n){
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private static int koordinataGeneralasa(int n) {
        return (int) (Math.random() * (2 * n + 1) - n);
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)",this.x, this.y);
    }

    public double getTavolsagAzOrigotol(){

    }
}
