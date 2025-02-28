package Combine;

import Builder.Dungeon;
import Builder.IDungeonBuilder;
import Builder.SimpleDungeonBuilder;
import Objects.NPC;
import Objects.Room;

public class MUDCombinedDemo{
    public static void main(String[] args) {
        NPC prototypeNPC = new NPC("Dikovin", "The grand master of the dungeon.");
        NPC clonedNPC = (NPC) prototypeNPC.cloneObject();
        System.out.println("Prototype NPC: " + prototypeNPC);
        System.out.println("Cloned NPC: " + clonedNPC);

        NPC modifyedNPC = new NPC(prototypeNPC.getName(), "Better version of NPC");
        System.out.println(modifyedNPC);


        IDungeonBuilder dungeonBuilder = new SimpleDungeonBuilder();
        Dungeon dungeon = dungeonBuilder.setDungeonName("HighQualitySerteficedDungeon")
                .addRoom(new Room("Tropical"))
                .addRoom(new Room("Winter"))
                .addRoom(new Room("Summer"))
                .addRoom(new Room("Safari"))
                .addNPC(prototypeNPC)
                .addNPC(prototypeNPC)
                .addNPC(modifyedNPC)
                .build();
        System.out.println(dungeon);
    }
}
