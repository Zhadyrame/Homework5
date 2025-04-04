package map;
import java.util.HashMap;
import java.util.Map;
public class MarkerFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String icon, String color, String labelStyle) {
        String key = icon + "-" + color + "-" + labelStyle;
        styles.putIfAbsent(key, new MarkerStyle(icon, color, labelStyle));
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}

