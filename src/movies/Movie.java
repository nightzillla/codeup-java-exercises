package movies;

public class Movie {
    private String name;
    // name getter
    public String getName() {
        return name;
    }
    // name setter
    public void setName(String name) {
        this.name = name;
    }
    private String category;
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // This is a constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}
