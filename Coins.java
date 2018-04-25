public class Coins {
    private int quaters;
    private int dimes;
    private int nickels;
    private int pennies;




    //constructors
    public Coins() {
        this.quaters = 0;
        this.dimes=0;
        this.nickels=0;
        this.pennies=0;
    }

    public Coins(int quaters, int dimes, int nickels, int pennies) {
        this.quaters = quaters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }


    //getters
    public int getQuaters() {
        return this.quaters;
    }

    public int getDimes() {
        return this.dimes;
    }

    public int getNickels() {
        return this.nickels;
    }

    public int getPennies() {
        return this.pennies;
    }




    //setters
    public void setQuaters(int quaters) {
        this.quaters = quaters;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }


    //methods

    //Converting int to string format method
    public String toString() {
        return String.format("%02d, %02d, %02d, %02d",
                this.quaters, this.dimes, this.nickels, this.pennies);
    }

     //Comparing two coins object and check if they are equals
        public boolean equals(Coins that){

            return this.quaters == that.quaters
                    && this.dimes == that.dimes
                    && this.nickels == that.nickels
                    && this.pennies == that.pennies;
        }

        //Converting the amount of coin to Dollar
        public double toDolar(){
            double result = (this.quaters*0.25)+(this.dimes*0.10)+(this.nickels*0.05)+(this.pennies*0.01);
            double resultRound = Math.round(result*100)/100.00;
            return  resultRound;

        }

    //Converting the amount of coin to Quarter
        public double toQuaters(){
            return (int) this.toDolar()/0.25;
        }
    //Converting the amount of coin to Dimes
        public double toDimes(){
          return (int) this.toDolar()/0.10;
        }
    //Converting the amount of coin to Nickles
        public double toNickles(){
            return (int) this.toDolar()/0.05;
        }

    //Converting the amount of coin to Pennies
        public double toPennies(){
            return (int) this.toDolar()/0.01;
        }



    }
