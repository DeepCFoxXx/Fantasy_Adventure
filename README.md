# Fantasy_Adventure
Java_TDD

Lab - Fantasy Adventure
The task is to model a fantasy adventure game. The game will have players, who will have a number of health points. Payers will fall into different categories:

Dwarves, Barbarians, Knights
  each of these will have a weapon and fight with other players

Warlocks and Wizards
  they will be able to cast spells on others
  they will have a mythical creature (e.g. an Ogre, Dragon) who will defend them from attackers

Clerics
  they will have healing potions with which they can heal other players

Remember
Use TDD
Git commit regularly

Tasks
1. Create an abstract class Player. Each player will have a name and a number of health points.

2. Create an abstract class for Enemy. Each enemy will have a number of health points and a method to take damage.

3. Create some subclasses of Enemy (Troll, Orc).

4. Create an interface IWeapon which has a method attack

5. Create classes which implement the IWeapon interface, e.g. Sword, Club, Axe.
   Each of these could have a different damage value, which affects the health of the enemy attacked.

6. Create an abstract subclass of Player called Fighter. This should have an IWeapon and an attack method.

7. Create some subclasses of Fighter - Barbarian, Dwarf, Knight.
   Each will have a weapon of type IWeapon, which they can change as the game goes on i.e. a Dwarf might swap an Axe for a Club.
   Add methods, properties specific to each
8. Create an interface ISpell which has a method cast

9. Create classes which implement the ISpell interface
   Each of these could have a different power value, which affects the health of the enemy they are cast upon.

10. Create an interface IDefend which has a method defend

11. Create classes which implement the IDefend interface e.g. Ogre, Dragon
    Each should have a defend method which affects the health value of the enemy they attack.
12. Create an abstract subclass of Player called Mage. This should have an IDefend and a method called defend.

13. Create subclasses of Mage, e.g. Warlock and Wizard
    Each will have a spell of type ISpell and a defender of type IDefend, which they can change as the game goes on.
    Warlock and Wizard should have IDefend instead of IWeapon.
14. Create an interface IHeal which has a single method Heal

15. Create classes which implement the IHeal interface e.g. Potion, Herbs etc.

16. Create a Cleric class. This class will have an IHeal with which they can heal other players. This can be changed as the game goes on.
