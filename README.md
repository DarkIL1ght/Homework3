README: Week 4 Homework - Builder & Prototype Patterns
This project demonstrates the implementation of two advanced creational design patterns: Builder and Prototype. These patterns are applied in the context of a Dungeon-based project, where we construct complex objects (like a Dungeon) and efficiently clone similar objects (like NPCs and Rooms).

Project Structure
1. Builder Pattern
The Builder pattern is used to construct a complex object (Dungeon) step-by-step. It allows for flexible and readable object creation.

Files:
IDungeonBuilder.java: Interface defining the methods for building a Dungeon.

SimpleDungeonBuilder.java: Concrete implementation of the IDungeonBuilder interface.

Dungeon.java: The final product class representing a Dungeon with rooms and NPCs.

MUDBuilderDemo.java: Demo class showing how to use the Builder to create a Dungeon.

How it works:
The SimpleDungeonBuilder class provides methods like setDungeonName, addRoom, and addNPC to configure the Dungeon.

The build() method returns the final Dungeon object.

2. Prototype Pattern
The Prototype pattern is used to clone objects efficiently. In this project, it is applied to clone NPCs.

Files:
CloneableGameEntity.java: Interface defining the cloneObject() method for cloning objects.

NPC.java: Class implementing the CloneableGameEntity interface to support cloning.

MUDPrototypeDemo.java: Demo class showing how to clone NPCs.

How it works:
The NPC class implements the cloneObject() method, which returns a copy of the NPC.

This allows for quick duplication of NPCs without manually recreating them.

3. Combining Builder and Prototype
The Builder and Prototype patterns are combined to create a Dungeon and then extend it by cloning existing rooms or NPCs.

Files:
MUDCombinedDemo.java: Demo class showing how to use both patterns together.

How it works:
The Builder creates a basic Dungeon.

The Prototype pattern is used to clone NPCs or Rooms and add them to the Dungeon.

Grading Criteria
Completeness: All required files and tasks are implemented.

Correctness: The Builder and Prototype patterns function as described.

Code Quality: The code is clear, maintainable, and well-documented.

Creativity: Extra credit features (e.g., deep cloning, optional Builder features) are appreciated.

