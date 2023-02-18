package Printable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class Printable {
    
    private ArrayList<String> asciiImage;

    public Printable(String file) throws FileNotFoundException, IOException{
        this.asciiImage=getAsciiImage(file);
    }

    private ArrayList<String> getAsciiImage(String file) throws FileNotFoundException, IOException {
        ArrayList<String> result=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null)
                result.add(line);
        }
        return result;
    }

    public void printEnd(int end){
        clrscr();
        for (String line : asciiImage)
            if(line.length()>end)
                System.out.println(line.substring(end,line.length()));
    }

    public void print(){
        printEnd(0);
    }

    public void printExitLeft(long v) throws InterruptedException{
        for (int i = 0; i < getMaxLineLength() ; i++){
            printEnd(i);
            TimeUnit.SECONDS.sleep(v);
        }
    }

    public void printEnterLeft(long v) throws InterruptedException{
        for (int i = getMaxLineLength()-1; i >=0 ; i--){
            printEnd(i);
            TimeUnit.SECONDS.sleep(v);
        }
    }

    private int getMaxLineLength(){
        return asciiImage.stream().max(Comparator.comparingInt(String::length)).get().length();
    }

    public static void clrscr(){ 
        try { 
            if (System.getProperty("os.name").contains("Windows")) 
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
            else Runtime.getRuntime().exec("clear"); 
        } catch (IOException | InterruptedException ex) {} 
    }
}
