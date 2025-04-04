package proxy;

public class ProtectedImProxy implements Image {
    private boolean isAgentLoggedIn;
    private FullImage realImage;

    public ProtectedImProxy(boolean isAgentLoggedIn, String filename) {
        this.isAgentLoggedIn = isAgentLoggedIn;
        if (isAgentLoggedIn) {
            this.realImage = new FullImage(filename);
        }
    }

    @Override
    public void display() {
        if (isAgentLoggedIn) {
            realImage.display();
        } else {
            System.out.println("Error");
        }
    }
}

