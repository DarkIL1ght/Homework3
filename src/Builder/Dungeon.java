package Builder;

import java.util.ArrayList;
import java.util.List;
import Objects.NPC;
import Objects.Room;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon() {
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
    }

    // Getters and setters
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other methods
}