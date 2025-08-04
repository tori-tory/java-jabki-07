package file;

public class ImageFile extends File {

    private int width;
    private int height;
    private int bytesPerPixel;

    public ImageFile(String name, int width, int height, int bytesPerPixel) {
        super(name);
        setWidth(width);
        setHeight(height);
        setBytesPerPixel(bytesPerPixel);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBytesPerPixel(int bytesPerPixel) {
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        return width * height * bytesPerPixel;
    }
}
