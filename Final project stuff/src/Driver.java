import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        StringLinkedList mylist = new StringLinkedList();
        String Death = "";
        int whatup = 0;
        File inputFile = new File("/home/rpowell/Desktop/Texts/wordle.txt");
        
        Scanner scan = null;
        try {
            scan = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        }

        int count = 0;
        while ( scan.hasNext() ) {
            String word = scan.next();
            mylist.add(word);
            count = count + 1;
        }
        for(int i = 0; i < count; i++) {     
            
        int you = 1;
        int me = i;
        int hat = me - you -1;      
            whatup = (int) (Math.random() * hat) + you ;
            Death = mylist.get(whatup);
        }        
        System.out.println(Death);
        String daddy[] = Death.split("");

        Scanner scanner = new Scanner(System.in);
        String coords = scanner.next();
        
        
    }
}