package Player_Tests;

import Players.MagicalUsers.Defenders.IDefend;
import Players.MagicalUsers.Enchantress;
import Players.MagicalUsers.Healing_Spells.IHeal;
import Players.MagicalUsers.Sorcerer;
import Players.MagicalUsers.Spells.ISpell;
import Players.MagicalUsers.WhiteMage;
import Players.Party;
import Players.Player;
import Players.Warriors.Barbarian;
import Players.Warriors.DarkKnight;
import Players.Warriors.Paladin;
import Players.Warriors.ShadowRogue;
import Players.Warriors.Weapons.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Party_Test {

    Party party;
    Player barbarian;
    IWeapon greatSword;
    Player darkKnight;
    IWeapon broadSword;
    Player enchantress;
    ISpell flame;
    IDefend leviathan;
    Player paladin;
    Player shadowRogue;
    IWeapon katana;
    Player sorcerer;
    ISpell frost;
    IDefend bahamut;
    Player whiteMage;
    ISpell lightning;
    IHeal cure;

    @Before
    public void before() {
        party = new Party();
        barbarian = new Barbarian("Conan", 600, 80, 10, 50, 60, 20, false, greatSword, 100);
        darkKnight = new DarkKnight("Bruce", 500, 60, 30, 70, 40, 25, false, broadSword, 100);
        enchantress = new Enchantress("Sabrina", 550, 25, 70, 40, 20, 25, false, flame, leviathan, 100 );
        paladin = new Paladin("Duncan", 550, 40, 40, 50, 60, 40,  false, broadSword, 100);
        shadowRogue = new ShadowRogue("Kara", 500, 30, 30, 40, 60, 70,  false, katana, 100);
        sorcerer = new Sorcerer("Lyanna", 400, 10, 80, 30, 30, 45, false, frost, bahamut, 100 );
        whiteMage = new WhiteMage("Goro", 350, 15, 100, 20, 20, 80, false, lightning, leviathan, 100, cure);
    }

    @Test
    public void partyStartsEmpty() {
        assertEquals(0, party.getMembersCount());
    }

    @Test
    public void canAddToParty() {
        party.addMember(barbarian);
        assertEquals(1, party.getMembersCount());
    }

    @Test
    public void canRemovePlayer() {
        party.addMember(barbarian);
        party.removePlayer(barbarian);
        assertEquals(0, party.getMembersCount());
    }

    @Test
    public void canAddAllMembers() {
        party.addMember(barbarian);
        party.addMember(darkKnight);
        party.addMember(enchantress);
        party.addMember(paladin);
        party.addMember(shadowRogue);
        party.addMember(sorcerer);
        party.addMember(whiteMage);
        assertEquals(7, party.getMembersCount());
    }


//    @Test 
//    public void canClearParty() {
//        party.addMember(barbarian);
//        party.addMember(darkKnight);
//        party.addMember(enchantress);
//        party.addMember(paladin);
//        party.addMember(shadowRogue);
//        party.addMember(sorcerer);
//        party.addMember(whiteMage);
//        party.clearMembers();
//        assertEquals(0, party.getMembersCount());
//    }

}
