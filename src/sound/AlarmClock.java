package sound;

public class AlarmClock implements SoundEmitter{

    @Override
    public void makeSound() {
        System.out.println("Нас утро встречает прохладой...");
    }
}
