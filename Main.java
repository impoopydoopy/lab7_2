import NPC.NpcClass;

public class Main {
    public static void main(String[] args) {
        Spawner spawner = new HumanSpawner();
        spawner.spawnNPC(NpcClass.BERSERK);
        spawner.spawnNPC(NpcClass.DEFENDER);
        spawner.spawnNPC(NpcClass.WIZARD);

        spawner = new OrcSpawner();
        spawner.spawnNPC(NpcClass.BERSERK);
        spawner.spawnNPC(NpcClass.DEFENDER);
        spawner.spawnNPC(NpcClass.WIZARD);

        spawner = new ElfSpawner();
        spawner.spawnNPC(NpcClass.BERSERK);
        spawner.spawnNPC(NpcClass.DEFENDER);
        spawner.spawnNPC(NpcClass.WIZARD);
    }
}