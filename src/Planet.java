import java.util.ArrayList;

public class Planet {
    int orbitTime;
    String destination;
    ArrayList<Moon> moons;

    public static void main(String[] args) {

    }

    Planet(int orbitTime, String destination){

    }
}

class RockPlanet extends Planet {
    boolean habitable;

    RockPlanet(int orbitTime, String destination, boolean habitable) {
        super(orbitTime, destination);
    }
}