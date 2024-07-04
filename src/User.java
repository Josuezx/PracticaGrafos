import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> interests;

    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = interests;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getInterests() {
        return interests;
    }

    @Override
    public String toString() {
        return "[name='" + name + ']';
    }
}