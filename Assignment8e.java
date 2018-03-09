import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment8e {

    public static void main(String [] args){

        List<String> shoppingList = new ArrayList<>();
        int userChoice=0;
        String listItem;
        Scanner scan = new Scanner(System.in);

        //Presenting options
        while (userChoice != 6) {
            System.out.println("-------------------------");
            System.out.println("     Shopping List");
            System.out.println("-------------------------");
            System.out.println();
            System.out.println("1) Add Item");
            System.out.println("2) Change Item");
            System.out.println("3) Delete Item");
            System.out.println("4) Output List");
            System.out.println("5) Clear List");
            System.out.println("6) Exit");
            System.out.println("Enter your choice : ");
            userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Insert the item´s name :");
                        listItem = scan.next();
                        shoppingList.add(listItem) ;
                    System.out.println("Press 6 to back to menu.");
                    scan.nextInt();

                    break;

                case 2:
                    System.out.println("Which item do you want to change");
                    String item = scan.next();
                    int pos = shoppingList.indexOf(item);
                    if(pos == -1){
                        System.out.println("This item it's not in the list.");
                    }
                    shoppingList.remove(pos);
                    System.out.println("Enter the new item");
                    String change = scan.next();
                    shoppingList.add(pos, change);

                    break;

                case 3:
                    System.out.println("which item do you want to delete");
                    String delete = scan.next();
                    int poss = shoppingList.indexOf(delete);

                    if(poss == -1){
                        System.out.println("This item it's not in the list.");
                    } else {
                        shoppingList.remove(poss);
                    }

                    break;

                case 4:

                        System.out.println(shoppingList);

                    break;

                case 5:

                        shoppingList.clear();
                        System.out.println("Your shopping cart is empty");
                    break;

                default:
                    System.out.println("Please choose one of the menu options.");
                    break;
            }



        }

    }
}
