package Human;
import java.util.TreeSet;
import Human.Weapon.Weapon;

public class Human {
    
    // Default weapons
    private final Weapon sword=new Weapon("Sword", 25);

    private String name;
    private int maxHealth;
    private int health;
    private TreeSet<Weapon> weapons;
    private String image;

    public Human(String name, int maxHealth, String image){
        this.name=name;
        this.maxHealth=maxHealth;
        this.health=this.maxHealth;
        this.weapons=new TreeSet<>();
        this.weapons.add(sword);
        this.image=image;
    }
    
    String getName(){return this.name;}
    int getMaxHealth(){return this.maxHealth;}
    public int getHealth(){return this.health;}
	public void setHealth(int health) {
        this.health=health;
	}
    Object[] getWeapons(){return this.weapons.toArray();}
    String getImage(){return this.image;}

}
