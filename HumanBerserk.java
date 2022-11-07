package NPC.Human;

import NPC.Npc;

public class HumanBerserk extends Npc {
    @Override
    public void OnSpawn(){
        System.out.println("Человек-берсерк в боевой готовности, король!");
    }
}
