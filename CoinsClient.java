public class CoinsClient {



    public static void main(String [] args) {

        //Instantiating the objects
        Coins coins = new Coins();
        Coins coins2 = new Coins(4,1,1,1);

        //Using Getters for coins
        coins.setQuaters(4);
        coins.setDimes(1);
        coins.setNickels(1);
        coins.setPennies(2);


        //Using Getters
        System.out.println("The amount of Quarters is: "+ coins.getQuaters());
        System.out.println("The amount of Quarters is: "+ coins.getDimes());
        System.out.println("The amount of Quarters is: "+ coins.getNickels());
        System.out.println("The amount of Quarters is: "+ coins.getPennies());

        //Using toDolar Method
        System.out.println("The total amount in Dollars is: "+ coins.toDolar());

        //Using toString Method
        System.out.println("toString Method Test: "+ coins.toString());

        //Using equals method
        System.out.println("equals Method Test: "+coins.equals(coins2));

    }
}
