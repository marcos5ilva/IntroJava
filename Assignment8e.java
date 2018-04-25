import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment8e {

    public static void main(String [] args){

        List<String> shoppingList = new ArrayList<>();
        int userChoice=0;
        String userChoiceStr;
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
            System.out.println("Enter your number choice from 1 to 6 : ");

            //Receiving user option
            userChoiceStr = scan.nextLine();

            //Converting user option into int
            userChoice = Integer.parseInt(userChoiceStr);

                switch (userChoice) {
                    //Inserting a new item
                    case 1:
                        System.out.println("Insert the item's name :");
                        listItem = scan.nextLine();
                        shoppingList.add(listItem);
                        System.out.println("Press 6 to back to menu.");
                        scan.nextLine();

                        break;

                    //Modifying an item on the list
                    case 2:

                        //Printing the list of items
                        System.out.println("Shopping list: " + shoppingList);
                        System.out.println("Which item do you want to change");
                        String item = scan.nextLine();
                        int pos = shoppingList.indexOf(item);

                        //Checking if the item is in the list
                        if (pos == -1) {
                            System.out.println("This item it's not in the list.");
                        }
                        shoppingList.remove(pos);
                        System.out.println("Enter the new item");
                        String change = scan.nextLine();
                        shoppingList.add(pos, change);

                        break;

                    //Deleting an item from the list
                    case 3:
                        //Printing the list of items
                        System.out.println("Shopping list: " + shoppingList);

                        //Requiring the item the user want to delete
                        System.out.println("which item do you want to delete");
                        String delete = scan.nextLine();
                        int poss = shoppingList.indexOf(delete);

                        //Checking if the item is in the list
                        if (poss == -1) {
                            System.out.println("This item it's not in the list.");
                        } else {
                            shoppingList.remove(poss);
                        }

                        break;

                    case 4:
                        //Printing the list of items
                        System.out.println("Shopping list: " + shoppingList);
                        System.out.println("Press 6 to back to menu.");
                        scan.nextLine();

                        break;

                    //Clearing the list of items
                    case 5:

                        shoppingList.clear();
                        System.out.println("Your shopping cart is empty");
                        System.out.println("Press 6 to back to menu.");
                        scan.nextLine();
                        break;

                    default:
                        System.out.println("Please choose one of the menu options.");
                        break;
                }




        }

    }
}
