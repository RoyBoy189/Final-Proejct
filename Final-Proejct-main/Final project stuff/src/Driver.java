import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        StringLinkedList mylist = new StringLinkedList();
        String Death = "";
        int lives = 4;
        int whatup = 0;
        File inputFile = new File("C:/Users/roypo/Desktop/wordle.txt");
        System.out.println("Here is a five-letter word. Try your best to guess it! Any word greater or less than five letters will be deemed incorrect.");
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
            
        int you = 0;
        int me = i;
        int hat = me - you -0;      
            whatup = (int) (Math.random() * hat) + you ;
            Death = mylist.get(whatup);
        }        
        System.out.println(Death);
        String[] yourself = Death.split("");
      

        Scanner scanner = new Scanner(System.in);
        String coords = scanner.next();
        if(coords.contains(yourself[0])) {
            System.out.print("*" + Arrays.toString(yourself));
        }
        if(coords.matches(Death)) {
            System.out.println("Great job!");
        }
        while(lives != 0 && ! coords.matches(Death)) {

            System.out.println("oops! try again!");  

            System.out.println("you now have" + " " + lives + " " + "lives left.");       
            String apples = scanner.next();
            String[] guess = apples.split("");
            if(apples.matches(Death) || coords.matches(Death)) {
                System.out.println("Great job!");
                break;
            }
            if(apples.contains(yourself[0]) && guess.length == 5) { 
                        System.out.print("*" + guess[0] + "," + guess[1] + "," + guess[2] + "," + guess[3] + "," + guess[4]);            
            } 

            lives = lives - 1;
            if(lives == 0) {
                System.out.println("Game Over.");
            }
        }
    }
}
