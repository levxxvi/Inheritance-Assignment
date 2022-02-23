public class Moon {
    private int orbitTime;
    private boolean atmosphere;
    private String designation;
    private Planet planet;

    public Moon(Planet planet, int orbitTime, boolean atmosphere, String designation){
    }

    public String getDesignation(){
        return null;
    }
    public void setDesignation(String getDesignation){}
    //fix
    public Planet getPlanet() {
        return planet;
    }
    public void setPlanet(Planet planet){}
    public int getOrbitTime(){
        return 0;
    }
    public void setOrbitTime(int getOrbitTIme){}
    public boolean isAtmosphere(){
        return false;
    }
    public void setAtmosphere(boolean isAtmosphere){}
    public boolean equals(Object object){
        return false;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "orbitTime=" + orbitTime +
                ", atmosphere=" + atmosphere +
                ", designation='" + designation + '\'' +
                ", planet=" + planet +
                '}';
    }
}
