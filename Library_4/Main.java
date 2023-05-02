package Library_4;

import Library_4.Config.Battle;
import Library_4.Data.Defense.BigShield;
import Library_4.Data.Hero.Archer;
import Library_4.Data.Defense.LightShield;
import Library_4.Data.Hero.Paladin;
import Library_4.Data.Hero.Team;
import Library_4.Data.Hero.Warrior;
import Library_4.Data.Weapon.Bow;
import Library_4.Data.Weapon.Sword;

public class Main {
        public static void main(String[] args) {
                Team<Archer> archersTeam = new Team<>();
                archersTeam.add(new Archer("George", new Bow(), new LightShield("Setler"), 25))
                                .add(new Archer("Bob", new Bow(), new LightShield("Lizard"), 25));

                Team<Paladin> paladinsTeam = new Team<>();
                paladinsTeam.add(new Paladin("Ecio", new Sword(), new BigShield("DragonShield"), 40))
                                .add(new Paladin("Fiend", new Sword(), new BigShield("OldShield"), 35));

                System.out.println(archersTeam);
                System.out.println("--------------------");
                System.out.println(paladinsTeam);
                System.out.println("--------------------");

                Battle placeOfBattle = new Battle(new Archer("George", new Bow(), new LightShield("Setler"), 25),
                                new Paladin("Ecio", new Sword(), new BigShield("DragonShield"), 40));

                Warrior winner = placeOfBattle.fight();

                System.out.println("--------------------");
                System.out.printf("Winner: \n%s", winner);
                System.out.println("--------------------");
        }

}
