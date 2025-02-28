package Builder;

import Objects.NPC;
import Objects.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder dungeonBuilder = new SimpleDungeonBuilder();
        Dungeon dungeon = dungeonBuilder.setDungeonName("HighQualitySerteficedDungeon")
                .addRoom(new Room("Tropical"))
                .addRoom(new Room("Winter"))
                .addRoom(new Room("Summer"))
                .addRoom(new Room("Safari"))
                .addNPC(new NPC("Roman","Viking that lost his wife"))
                .addNPC(new NPC("Vladimir","Drunk master that have been living here forever"))
                .addNPC(new NPC("Ibragimovich","Football player that is very bad"))
                .build();
        System.out.println(dungeon.getName());
    }
}
