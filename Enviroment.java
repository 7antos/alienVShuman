import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.AWTException;
import java.io.IOException;

/**
 * Main class that is going to run the game
 */
public class Enviroment {

    final static ArrayList<Human> humans=new ArrayList<>(Arrays.asList(
        new Human("Pedro Santos", 100),
        new Human("Andre Mendes", 100)));

    private final static Scanner sc=new Scanner(System.in);

    public static void main(String[] main) throws IOException, InterruptedException, AWTException{
        int turn=0;
        while(humans.size()>1){
            Human human=humans.get(turn%humans.size());
            Human target=humans.get((turn+1)%humans.size());
            Weapon weapon=selectAction(human, sc);
            weapon.use(target);
        }
        sc.close();
    }

    private static Weapon selectAction(Human human,Scanner sc) {return null;}
}
