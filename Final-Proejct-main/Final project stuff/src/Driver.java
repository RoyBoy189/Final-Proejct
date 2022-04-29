import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) {
        StringLinkedList mylist = new StringLinkedList();
        String CorrectWord = "";
        int lives = 4;
        int whatup = 0;
        File inputFile = new File("/home/rpowell/Desktop/Texts/wordle.txt");
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
        for (int i = 0; i < firstGuessArray.length; i++) {
        if(firstGuess.contains(CorrectWordArray[i])) {            
            if(firstGuessArray[i].equals(CorrectWordArray[0]) || (firstGuessArray[i].equals(CorrectWordArray[1])) || (firstGuessArray[i].equals(CorrectWordArray[2])) || (firstGuessArray[i].equals(CorrectWordArray[3])) || (firstGuessArray[i].equals(CorrectWordArray[4])) ) {
                firstGuessArray[i] = "*" + firstGuessArray[i] + "*";
            }
            System.out.printf(firstGuessArray[i]);
        }
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
            if(OtherGuesses.matches(CorrectWord) || firstGuess.matches(CorrectWord)) {
                System.out.println("Great job!");
                break;
            }
            for (int i = 0; i < OtherGuessArray.length; i++) {
            if(OtherGuesses.contains(CorrectWordArray[i]) && OtherGuessArray.length == 5) { 
                if(OtherGuessArray[i].equals(CorrectWordArray[0]) || (OtherGuessArray[i].equals(CorrectWordArray[1])) || (OtherGuessArray[i].equals(CorrectWordArray[2])) || (firstGuessArray[i].equals(CorrectWordArray[3])) || (firstGuessArray[i].equals(CorrectWordArray[4])) ) {
                    OtherGuessArray[i] = "*" + OtherGuessArray[i] + "*";
            } 
            System.out.printf(OtherGuessArray[i]);
            }
            }

            lives = lives - 1;
            if(lives == 0) {
                System.out.println("Game Over.");
            }
        }
    }
}

 
      
