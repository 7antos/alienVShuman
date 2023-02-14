public class Human {
    
    // Default weapons
    private final Weapon sword=new Weapon("Sword", 25);

    private String name;
    private int maxHealth;
    private int health;
    private Weapon weapon;

    public Human(String name, int maxHealth){
        this.name=name;
        this.maxHealth=maxHealth;
        this.health=this.maxHealth;
        this.weapon=sword;
    }
    
    String getName(){return this.name;}
    int getMaxHealth(){return this.maxHealth;}
    int getHealth(){return this.health;}
	void setHealth(int health) {
        this.health=health;
	}
    Weapon getWeapon(){return this.weapon;}

}
