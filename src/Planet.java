import java.util.ArrayList;
import java.util.List;

public class Planet {
    private int orbitTime;
    private String destination;
    private ArrayList<Moon> moons;

    public Planet(int orbitTime, String destination){
    }
    public Planet (){}

    public static String getDesignation() {
        return "";
    }
    public void setDesignation(String getDesignation){}
    public static int getOrbitTime() {
        return 0;
    }
    public void setOrbitTime(int getOrbitTime){}
    public void addMoon(Moon moons){}
    public List<Moon> getMoons(){
        return null;
    }
    public String toString(){
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class RockPlanet extends Planet {
    private boolean habitable;

    public RockPlanet(int orbitTime, String destination, boolean habitable) {
        super(orbitTime, destination);
    }
    public static boolean isHabitable(){
        return false;
    }
    public void setHabitable(boolean isHabitable){}
    public String toString(){
        return null;
    }
}