package proxy;

public class FullImage implements Image {
    private String filename;

    public FullImage(String filename) {
        this.filename = filename;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Uploading a high-quality image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying full-quality image: " + filename);
    }
}

