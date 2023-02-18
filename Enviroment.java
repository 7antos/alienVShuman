import java.util.concurrent.TimeUnit;

import Human.Human;
import Printable.Printable;
import java.awt.AWTException;
import java.io.IOException;

/**
 * Main class that is going to run the game
 */
public class Enviroment {

    Human player1=new Human("Ricardo Monteiro", 100,"intro/keanu.txt");

    public static void main(String[] main) throws IOException, InterruptedException, AWTException{
        // printIntro();
        Printable intro=new Printable("textImages/box.txt");
        intro.printEnterLeft(1/10);
        TimeUnit.SECONDS.sleep(5);
        intro.printExitLeft(1/10);
        Printable.clrscr();
    }

}
