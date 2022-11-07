package NPC;

public abstract class Npc {
    public int hitpoints = 100;
    public int damage = 50;

    public void OnLoad(){
        System.out.println("Спавн нпс...");
    }
    public abstract void OnSpawn();
}
