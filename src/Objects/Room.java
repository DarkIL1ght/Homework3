package Objects;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public Room cloneObject() {
        return new Room(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
