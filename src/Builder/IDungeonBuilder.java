package Builder;

import Objects.NPC;
import Objects.Room;

public interface IDungeonBuilder {

    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
}