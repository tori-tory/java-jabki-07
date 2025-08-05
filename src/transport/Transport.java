package transport;

public abstract class Transport {

    private double speed;

    public Transport(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void move();
}
