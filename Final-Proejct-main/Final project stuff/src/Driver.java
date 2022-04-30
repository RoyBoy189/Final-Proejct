import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        StringLinkedList mylist = new StringLinkedList();
        String CorrectWord = "";
        int lives = 5;
        int whatup = 0;
        File inputFile = new File("C:/Users/roypo/Desktop/wordle.txt");
        System.out.println("Here is a five-letter word. Try your best to guess it! Any word greater or less than five letters will be deemed incorrect.");
        System.out.print(System.lineSeparator());
        System.out.println("double `*` means a letter is within the correct word. double `||` means a letter matches with the order of the correct word.");
        System.out.print(System.lineSeparator());
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
        int hat = me - you - 0;      
            whatup = (int) (Math.random() * hat) + you ;
            CorrectWord = mylist.get(whatup);
        }        
        System.out.println(CorrectWord);
        String[] CorrectWordArray = CorrectWord.split("");
      

        Scanner scanner = new Scanner(System.in);
        String firstGuess = scanner.next();
        String firstGuessArray[] = firstGuess.split("");
        for (int i = 0; i < CorrectWordArray.length; i++) {
            if(firstGuess.contains(CorrectWordArray[i])) {
            if(firstGuessArray[i].matches(CorrectWordArray[i])) {
                firstGuessArray[i] = "|" + firstGuessArray[i] + "|";                  
            } else {
                firstGuessArray[i] = "*" + firstGuessArray[i] + "*";
            } 
        }
             else   {
                firstGuessArray[i] = firstGuessArray[i];
            }
            System.out.printf(firstGuessArray[i]);
        } 
    

          
    
        if(firstGuess.matches(CorrectWord)) {
            System.out.println("Great job!");
        }
        while(lives != 0 && ! firstGuess.matches(CorrectWord)) {
            System.out.print(System.lineSeparator());
            System.out.println("\n" + "oops! try again!");  

            System.out.println("you now have" + " " + lives + " " + "lives left.");       
            String OtherGuesses = scanner.next();
            String[] OtherGuessArray = OtherGuesses.split("");
            for (int i = 0; i < CorrectWordArray.length; i++) {
                if(OtherGuesses.contains(CorrectWordArray[i])) {
                if(OtherGuessArray[i].equals(CorrectWordArray[i])) {
                    OtherGuessArray[i] = "|" + OtherGuessArray[i] + "|";                  
                } else {
                    OtherGuessArray[i] = "*" + OtherGuessArray[i] + "*";
                } 
            }
                 else if (! OtherGuesses.contains(CorrectWordArray[i])){
                    OtherGuessArray[i] = OtherGuessArray[i];
                }
                System.out.printf(OtherGuessArray[i]);
            } 
           
            lives = lives - 1;
            if(lives == 0) {
                System.out.println("Game Over.");
            }
        }
    }
}


 