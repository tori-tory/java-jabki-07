import file.File;
import file.ImageFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shape.Circle;
import shape.Rectangle;

class MainTest {

    @Test
    public void testShape() {
        Circle circle = new Circle(10);
        Assertions.assertEquals(Math.PI * 10 * 10, circle.area());

        Rectangle rectangle = new Rectangle(5,8);
        Assertions.assertEquals(40, rectangle.area());
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    public void testFile() {
        File file = new ImageFile("test.jpg", 2, 2, 150);
        Assertions.assertEquals(600, file.getSize());
        Assertions.assertEquals("file.ImageFile", file.getClass().getName());
    }
}