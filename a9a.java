import java.util.Scanner;

public class a9a {

    public static boolean isAbecedarian (String word) {
        //Method that checks if a word is abecederian
        boolean flag1 = false;

        //Comparing each word character with the next
        for (int i = 0; i < word.length()-1; i++) {

                if (word.charAt(i) <= word.charAt(i + 1)) {
                    flag1 = true;

                }else{
                    flag1 = false;
                    break;
                }
        }
        return flag1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("         CHECKING FOR ABECEDARIAN WORDS");
        System.out.println("------------------------------------------------");

        //Requiring the user word for checking
        System.out.println("Enter a word: ");
        String word = in.next();

        //Invoking isAbecedarian Method
        //Checking if the word is abecederian
        Boolean flag = isAbecedarian(word);

        //Print out the result of the test
        System.out.println(flag);

    }
}