package NPC.Human;

import NPC.Npc;

public class HumanWizard extends Npc {
    @Override
    public void OnSpawn(){
        System.out.println("Человек-маг в боевой готовности, король!");
    }
}
