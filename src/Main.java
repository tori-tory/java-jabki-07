import file.*;
import shape.*;
import sound.*;
import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №7\n");

        /**
         * 1. Фигуры
         * Создайте абстрактный класс Shape с абстрактным методом double area() и методом void displayArea().
         * Создайте классы-наследники:
         * - Circle с полем radius.
         * - Rectangle с полями width и height.
         *
         * Cоздайте массив Shape[], заполните его экземплярами и вызовите displayArea() для каждого элемента (полиморфизм).
         */
        System.out.println("1. Фигуры");

        Shape[] shapes = {
                new Circle(10),
                new Circle(5),
                new Rectangle(1, 1),
                new Rectangle(2,2)
        };
        for (Shape shape : shapes) {
            shape.displayArea(shape.area());
        }

        /**
         * 2. Звуки
         * Создайте интерфейс SoundEmitter с методом void makeSound().
         * Реализуйте его в классах:
         * - Dog
         * - AlarmClock
         * - CarHorn
         *
         * Создайте метод playAllSounds(SoundEmitter[] devices), который вызывает makeSound() у каждого объекта.
         * Покажите преимущества интерфейсов.
         */
        System.out.println("2. Звуки");

        SoundEmitter[] soundEmitters = {
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };

        playAllSounds(soundEmitters);

        /**
         * 3. Файловая система
         * Абстрактный класс File с полями name и абстрактным методом long getSize().
         * Реализации:
         * - TextFile с полем content (строка).
         * - ImageFile с полями width, height, bytesPerPixel.
         *
         * Реализуйте метод getSize() в каждом классе.
         * Напишите метод, который считает общий размер всех файлов в массиве File[].
         */
        System.out.println("3. Файловая система");

        File[] files = {
                new TextFile("story.txt", "Жил-был пёс..."),
                new ImageFile("picture.jpg", 100, 120, 3)
        };

        for (File file : files) {
            System.out.printf("Файл %s, размер (байт) = %s\n", file.getName(), file.getSize());
        }

        System.out.printf("Общий размер файлов (в байтах) =  %s\n", allSize(files));

        /**
         * 4. Транспорт
         * Абстрактный класс Transport с полем speed и абстрактным методом void move().
         * Подклассы:
         * - Bicycle
         * - Airplane
         *
         * В каждом классе реализуйте move() с описанием движения.
         * Создайте метод startRace(Transport[] vehicles), который вызывает move().
         */
        System.out.println("4. Транспорт");

        Transport[] vehicles = {
                new Airplane(999),
                new Bicycle(15),
                new Airplane(500),
                new Bicycle(10)
        };
        startRace(vehicles);
    }

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter soundEmitter : devices) {
            soundEmitter.makeSound();
        }
    }

    public static long allSize(File[] files) {
        long size = 0;
        for (File file : files) {
            size += file.getSize();
        }

        return size;
    }

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle : vehicles) {
            vehicle.move();
        }
    }
}