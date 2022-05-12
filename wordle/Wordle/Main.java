import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class Main {
    
    public static void main(String[] args) {
        //StringFixedArrayList mylist = new StringFixedArrayList(15000);
        String[] myList = new String[15000];
        
        File inputFile = new File("C:/Users/roypo/Desktop/wordle.txt");
        
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
            myList[count] = word;
            count = count + 1;
        }
        System.out.printf("The mylist count is " + count + "\n");
        Scanner scanner = new Scanner(System.in);
        String hint = scanner.next();
        String[] HintArray = hint.split("");
        String[] HintArrayofArrays = new String[HintArray.length / 3];
        int index = 0;
        for (int i = 0; i < HintArrayofArrays.length; i++) {
            String letter = "";
            for(int j = 0; j < 3; j++) {
                letter += HintArray[index];
                
                index++;               
            }
            HintArrayofArrays[i] = letter;
        }
        // int indexTwo = 0;
        //String[] ThreeChars = new String[3];
        //for(String char : HintArray[]) {
        System.out.print(Arrays.toString(HintArrayofArrays));
            
            //}
            
            //for (String[] letters: HintArrayofArrays) {
                //for (String Letters2: letters) {
                    //System.out.print(Letters2 + " ");
                    //}
                    //System.out.println();
                    //}
                    //System.out.println(Arrays.toString(HintArrayofArrays));
                    String[] check = new String[150000];
                    StringFixedArrayList TakeAway = new StringFixedArrayList(15000);
                    System.out.println();
                    int coorectcount = 0;
                    for (int i = 0; i < myList.length - 1; i++) {
                        if(myList[i] == null) {
                            break;
                        }    
                        //for (int b = 0; b < myList.length; b++) {      
                            Boolean WordGood = true; 
                            Boolean WordAccepted = true;
                            for(int a = 0; a < HintArrayofArrays.length; a++) {
                                //if(HintArrayofArrays[a][0].contains("\\*") && ! mylist.get(i).matches(HintArrayofArrays[a][a + 1] + "..")); {                                    
                                    if( HintArrayofArrays[a].contains("_")) {
                                        if(myList[i].contains((String.valueOf(HintArrayofArrays[a].charAt(1))))) {
                                        
                                            WordGood = false;
                                            
                                            break;
                                        }
                                    }
                                    if(HintArrayofArrays[a].contains("*")) {
                                    //if(LetterIsInString(myList[i], HintArrayofArrays)) {
                                       if( ! myList[i].contains((String.valueOf(HintArrayofArrays[a].charAt(1))))) {

                                           WordGood = false;

                                           break;
                                       
                                    }
                                       if(HintArray[a].contains("|") && myList[i].contains(HintArray[1])) {
                                        WordAccepted = true;
                                        //if( ! myList[i].matches((String.valueOf(HintArrayofArrays[a].charAt(1))))) {
                                            
                                            //WordGood = false;
 
                                            //break;
                                        //}

                                    }
                                    
                                   
                                } 
                                if(WordGood) {
                                    TakeAway.add(myList[i]);
                                    System.out.println(myList[i]);
                                    coorectcount = coorectcount + 1;
                                }                            
                            }
                            System.out.println(coorectcount);
                    }
                            //if(HintArrayofArrays[a][0].contains("|") && ListString.matches(HintArrayofArrays[a][a + 1] + "..")) {
                                
                                //}
                                //System.out.println(Arrays.toString(AnswerArray));
                                //}
                                
                            
                         //public static boolean LetterIsInString(String listitem, String[] hints) {
                            // boolean zeroth = ! listitem.contains((String.valueOf(hints[0].charAt(1))));
                             //boolean first = ! listitem.contains((String.valueOf(hints[1].charAt(1))));
                            // boolean second = ! listitem.contains((String.valueOf(hints[2].charAt(1))));
                             //boolean third = ! listitem.contains((String.valueOf(hints[3].charAt(1))));
                             //boolean fourth = ! listitem.contains((String.valueOf(hints[4].charAt(1))));

                            
                             //return zeroth && first && second && third && fourth;
                         //}
                        }
                                                  
                        
                        
                    
                    