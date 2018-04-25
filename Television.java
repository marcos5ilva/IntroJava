public class Television {
    private String brand;
    private double price;



    //constructors
    public Television(){
        this.brand = "";
        this.price = 0;
    }
    public Television(String brand, int price){
        this.brand = brand;
        this.price = price;
    }


    //getters
    public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }


    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%2.2f",
                this.price);
    }

    public boolean equals(Television that){
        return this.brand.equals(that.brand) && this.price == that.price;
    }






}
