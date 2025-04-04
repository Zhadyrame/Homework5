package map;

public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void render(int latitude, int longitude) {
        System.out.println("MARKER " + icon + " a (" + latitude + ", " + longitude + ") - Color: " + color + ", Label: " + labelStyle);
    }
}
