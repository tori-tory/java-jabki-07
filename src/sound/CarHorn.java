package sound;

public class CarHorn implements SoundEmitter{

    @Override
    public void makeSound() {
        System.out.println("Виу-виу");
    }
}
