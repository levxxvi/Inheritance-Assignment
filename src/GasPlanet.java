import java.awt.*;

public class GasPlanet extends Planet{
    boolean hasRings;
    public Color color;
    GasPlanet(int orbitTime, String destination, boolean hasRings, Color color) {
        super(orbitTime, destination);
    }
}
