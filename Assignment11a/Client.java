

public class Client {
    public static void main (String[] args){

        //Instantiating Team and Television Objects
        Team team1 = new Team();
        Team team2 = new Team();
        Television tv1 = new Television();
        Television tv2 = new Television();

        //Setting Teams Objects Names attributes
        team1.setName("Barcelona");
        team2.setName("Chelsea");

        //Setting Television Objects Brand and Price attributes
        tv1.setBrand("LG");
        tv1.setPrice(395);

        tv2.setBrand("Samsung");
        tv2.setPrice(420);

        //Using Team's getName method
        System.out.println("---- Testing Teams' methods ----");
        System.out.println("Team 1 Name: "+team1.getName());
        System.out.println("Team 2 Name: "+team2.getName());

        //Using Team's toString method
        System.out.println("Testing toString Method for Team 1: "+team1.toString());
        System.out.println("Testing toString Method for Team 2: "+team2.toString());

        //Using Team's equals method
        System.out.println("Are those Teams the same? : "+team1.equals(team2));
        System.out.println();

        //Using Televisions' toString method
        System.out.println("---- Testing Televisions' methods ----");
        System.out.println("Testing toString Method for TV 1: "+tv1.toString());
        System.out.println("Testing toString Method for TV 2: "+tv2.toString());

        // //Using  Televisions' getBrand and getPrice methods
        System.out.println("TV 1 Brand: "+tv1.getBrand());
        System.out.println("TV 1 Price: $"+tv1.getPrice());
        System.out.println("TV 2 Brand: "+tv2.getBrand());
        System.out.println("TV 2 Price: $"+tv2.getPrice());

        //Using Televisons' equals method
        System.out.println("Are those Television the same? : "+tv1.equals(tv2));

    }
}
