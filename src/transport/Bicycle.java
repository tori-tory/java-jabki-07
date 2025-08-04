package transport;

public class Bicycle extends Transport{

    public Bicycle(double speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.printf("Велосипед движется со скоростью %s км/ч\n", getSpeed());
    }
}
