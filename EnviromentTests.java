import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Before;

public class EnviromentTests {

    File testRunTurn1= new File("EnviromentRunTurn1.txt");
    Scanner sc;

    @Before
    public void beforeTests() throws FileNotFoundException{
        sc=new Scanner(testRunTurn1);
    }
}
