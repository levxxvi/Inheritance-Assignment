import java.util.ArrayList;

public class Planet {
    int orbitTime;
    String destination;
    ArrayList<Moon> moons;

    static String getDesignation() {
        return "";
    }
    void setDesignation(String getDesignation){

    }
    static int getOrbitTime() {
        return 0;
    }

    public Planet(int orbitTime, String destination){


    }
}


class RockPlanet extends Planet {
    boolean habitable;

    public RockPlanet(int orbitTime, String destination, boolean habitable) {
        super(orbitTime, destination);
    }
}