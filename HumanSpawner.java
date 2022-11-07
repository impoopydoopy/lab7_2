import NPC.*;
import NPC.Human.*;

public class HumanSpawner extends Spawner{

    @Override
    protected Npc createNPC(NpcClass type) {
        Npc npc = null;
        switch (type){
            case WIZARD: npc = new HumanWizard(); break;
            case BERSERK: npc = new HumanBerserk(); break;
            case DEFENDER: npc = new HumanDefender(); break;
            default: System.out.println("error");
        }

        return npc;
    }
}
