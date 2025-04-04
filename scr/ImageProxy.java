package proxy;
public class ImageProxy implements Image {
    private String filename;
    private FullImage fullImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }
    @Override
    public void display() {
        if (fullImage == null) {
            fullImage = new FullImage(filename);
        }
        fullImage.display();
    }
}
