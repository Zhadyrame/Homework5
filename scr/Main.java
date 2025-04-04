package proxy;
public class Main {
    public static void main(String[] args) {
        Image thumbnail = new ImageProxy("flat.jpg");
        System.out.println("Thumbnail display...");
        thumbnail.display();
        Image agentImage = new ProtectedImProxy(true, "property.jpg");
        agentImage.display(); // Доступ бар

        Image unauthorizedImage = new ProtectedImProxy(false, "property.jpg");
        unauthorizedImage.display();
    }
}
