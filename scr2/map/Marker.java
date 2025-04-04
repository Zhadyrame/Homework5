package map;
public class Marker {
    private int latitude;
    private int longitude;
    private MarkerStyle markerStyle;

    public Marker(int latitude, int longitude, MarkerStyle markerStyle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.markerStyle = markerStyle;
    }

    public void render() {
        markerStyle.render(latitude, longitude);
    }
}
