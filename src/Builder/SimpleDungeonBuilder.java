package Builder;

import Objects.NPC;
import Objects.Room;


import java.util.*;


public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;
    private String name;
    private List<Room> rooms;

    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon();
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        dungeon.setName(name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNPC(npc);
        return this;
    }

    @Override
    public Dungeon build() {
        return dungeon;
    }
}