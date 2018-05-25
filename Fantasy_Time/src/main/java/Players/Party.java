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

}

