package Players;

import java.util.ArrayList;

public class Party {

    ArrayList<Player>members;

    public Party() {
        this.members = new ArrayList<Player>();
    }

    public int getMembersCount() {
        return this.members.size();
    }

    public void addMember(Player player) {
        this.members.add(player);
    }
<<<<<<< HEAD

    public void removePlayer(Player player) {
        this.members.remove(player);
    }

    public int totalHealthValue() {

        int total = 0;

        for (Player health : members) {
            total += health.getHealthValue();
        }
        return total;
    }

    public void clearParty() {
        this.members.clear();
    }
=======
>>>>>>> fe2a019df1cefd1e8995accb2df5be138fb27c10
}
