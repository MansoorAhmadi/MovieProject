package movies.datamodel;

public class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }
}
