package exercises;

public class Cube {

    private int Side = 0;

    public int getSide() {
        return Side;
    }

    public void setSide(int num) {
        this.Side = num;
    }

    public static void main(String[] args) {
        Cube c = new Cube();
        c.setSide(3);
        System.out.println(c.getSide());
    }
}
