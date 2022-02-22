import java.awt.*;

public class GasPlanet extends Planet{
    private boolean hasRings;
    private Color color;
    public GasPlanet(int orbitTime, String destination, boolean hasRings, Color color) {
        super(orbitTime, destination);
    }
    public static boolean isHasRings(){
        return false;
    }
    public void setHasRings(boolean isHasRings){}
    public static Color getColor(){
        return null;
    }
    public void setColor(Color getColor){}
    public String toString(){
        return null;
    }
}
