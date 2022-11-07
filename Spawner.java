import NPC.*;

public abstract class Spawner {
    public void spawnNPC(NpcClass type)
    {
        Npc npc = createNPC(type);

        npc.OnLoad();
        npc.OnSpawn();
    }

    protected abstract Npc createNPC(NpcClass type);
}
