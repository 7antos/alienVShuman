public class Human {
    
    // Default weapons
    private final Weapon sword=new Weapon("Sword", 10);

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

    /**
     * Use Weapon on target
     * @param human target
     */
    public void use(Human human){}

    String getName(){return this.name;}
    int getMaxHealth(){return this.maxHealth;}
    int getHealth(){return this.health;}
    Weapon getWeapon(){return this.weapon;}
}
