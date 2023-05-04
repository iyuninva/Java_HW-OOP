package Library_5.Model;

public class UserMapper {

    public String map(User user) {
        return String.format("%s: %s_%s %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split("[:_ ]+");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
