import java.util.ArrayList;
import java.util.Arrays;

public class Enviroment {

    private final static ArrayList<Human> humans=new ArrayList<>(Arrays.asList(
        new Human("Pedro Santos", 100),
        new Human("Andre Mendes", 100)));

    public static void main(String[] main){
        int turn=0;
        while(humans.size()>1){
            Human human=humans.get(turn%humans.size());
            Human target=humans.get((turn+1)%humans.size());
            human.use(target);
        }
    }
}
