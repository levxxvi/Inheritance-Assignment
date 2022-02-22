import java.util.ArrayList;
import java.util.List;

public class Planet {
    int orbitTime;
    String destination;
    ArrayList<Moon> moons;

    public Planet(int orbitTime, String destination){
    }

    static String getDesignation() {
        return "";
    }
    void setDesignation(String getDesignation){}
    static int getOrbitTime() {
        return 0;
    }
    void setOrbitTime(int getOrbitTime){}
    //fix this
    void addMoon(Moon[] moons){}
    List<Moon> getMoons(){
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
    boolean habitable;

    public RockPlanet(int orbitTime, String destination, boolean habitable) {
        super(orbitTime, destination);
    }
}