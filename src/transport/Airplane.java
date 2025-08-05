package transport;

public class Airplane extends Transport{

    public Airplane(double speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.printf("Самолет летит со скоростью %s км/ч\n", getSpeed());
    }
}
