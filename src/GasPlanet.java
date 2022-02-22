import java.awt.*;

public class GasPlanet extends Planet{
    boolean hasRings;
    public Color color;
    GasPlanet(int orbitTime, String destination, boolean hasRings, Color color) {
        super(orbitTime, destination);
    }
    static boolean isHasRings(){
        return false;
    }
    void setHasRings(boolean isHasRings){}
    static Color getColor(){
        return null;
    }
    void setColor(Color getColor){}
    public String toString(){
        return null;
    }
}
