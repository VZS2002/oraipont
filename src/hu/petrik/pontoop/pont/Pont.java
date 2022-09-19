package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public Pont(int n) {
        this.x = koordinataGeneralasa(n);
        this.y = koordinataGeneralasa(n);
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double ketPontTavolsag(Pont a) {
        int x = a.x - this.x;
        int y = a.y - this.y;
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }

    public int sikNegyed() {
        if (this.x < 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y < 0) {
            return 2;
        } else if (this.x > 0 && this.y > 0) {
            return 4;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);

    }
}

