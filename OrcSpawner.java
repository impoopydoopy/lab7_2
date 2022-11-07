import NPC.*;
import NPC.Orcs.*;

public class OrcSpawner extends Spawner{

    @Override
    protected Npc createNPC(NpcClass type) {
        Npc npc = null;
        switch (type){
            case WIZARD: npc = new OrcWizard(); break;
            case BERSERK: npc = new OrcBerserk(); break;
            case DEFENDER: npc = new OrcDefender(); break;
            default: System.out.println("error");
        }

        return npc;
    }
}
