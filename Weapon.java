public class Weapon {
    
    private String name;
    private int value;

    public Weapon(String name, int value){
        this.name=name;
        this.value=value;
    }

    /**
     * Use Weapon on target
     * @param human target
     */
    public void use(Human human){
        damage(human, this.getValue());
    }

    /**
     * Inflict self damage
     * @param human entity
     * @param value damage
     */
    private void damage(Human human,int value) {
        if(human.getHealth()<value) human.setHealth(0);
        else human.setHealth(human.getHealth()-value);
    }

	public String getName() {
		return this.name;
	}
    public int getValue() {
		return this.value;
	}
}
