import NPC.Elfs.*;
import NPC.*;

public class ElfSpawner extends Spawner{

    @Override
    protected Npc createNPC(NpcClass type) {
        Npc npc = null;
        switch (type){
            case WIZARD: npc = new ElfWizard(); break;
            case BERSERK: npc = new ElfBerserk(); break;
            case DEFENDER: npc = new ElfDefender(); break;
            default: System.out.println("error");
        }

        return npc;
    }
}
