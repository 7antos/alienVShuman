package Human.Weapon;
import Human.Human;

public class Weapon implements Comparable<Weapon>{
    
    private String name;
    private int value;

    public Weapon(String name, int value) {
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

    @Override
    public int compareTo(Weapon o) {
        if(!this.name.equals(o.name)) return this.name.compareTo(o.name);
        else return o.value - this.value;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
