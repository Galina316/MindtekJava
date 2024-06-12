package encapsulation;

public class Country {
    public Country(String name, String region, int population) {
        this.name = name;
        this.region = region;
        this.population = population;
    }

    private String name;
    private String region;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
