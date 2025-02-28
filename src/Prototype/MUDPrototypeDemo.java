package Prototype;

import Objects.NPC;
import java.util.*;

public class MUDPrototypeDemo {
    public static void main(String[] args) {

        NPC prototypeNPC = new NPC("Dikovin", "The grand master of the dungeon.");
        NPC clonedNPC = (NPC) prototypeNPC.cloneObject();
        System.out.println("Prototype NPC: " + prototypeNPC);
        System.out.println("Cloned NPC: " + clonedNPC);

        NPC modifyedNPC = new NPC(prototypeNPC.getName(), "Better version of NPC");
        System.out.println(modifyedNPC);
    }
}
