package flyw;

import map.Marker;
import map.MarkerFactory;
import map.MarkerStyle;

public class Fly {
    public static void main(String[] args) {
        Marker[] markers = new Marker[1000];
        for (int i = 0; i < 500; i++) {
            MarkerStyle style1 = MarkerFactory.getMarkerStyle("hospital", "red", "bold");
            markers[i] = new Marker(i, i + 1, style1);
        }
        for (int i = 500; i < 1000; i++) {
            MarkerStyle style2 = MarkerFactory.getMarkerStyle("restaurant", "blue", "italic");
            markers[i] = new Marker(i, i + 1, style2);
        }

        System.out.println("Total MarkersCreat: " + markers.length);
        System.out.println("Unique MarkerStyles: " + MarkerFactory.getTotalStyles());
    }
}

