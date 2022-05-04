import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        StringFixedArrayList mylist = new StringFixedArrayList(15000);

        File inputFile = new File("/home/rpowell/Desktop/Texts/wordle.txt");

        Scanner scan = null;
        try {
            scan = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println(e);
            System.exit(1);
        }
        Scanner scanner = new Scanner(System.in);
        String hint = scanner.next();
        String[] HintArray = hint.split("");
        String[][] HintArrayofArrays = new String[HintArray.length][];
        int index = 0;
        for (int j = 0; j < HintArray.length; j+=3) {
            String[] CutArray = Arrays.copyOfRange(HintArray, j, j + 3);
            HintArrayofArrays[j] = new String[HintArray.length];
            //for (int i = 0; i < HintArray.length; i++) {
                HintArrayofArrays[j][index] = Arrays.toString(CutArray);
                index++;
            }
        //}

        for (String[] letters: HintArrayofArrays) {
            for (String Letters2: letters) {
                System.out.print(Letters2 + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < mylist.length(); i++) {

        }

    }
}