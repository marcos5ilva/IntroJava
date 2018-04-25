public class Team {
private String name;

    //Constructors
    public Team(){
        this.name = " ";
    }

    public Team( String name){
        this.name = name;
    }


    //Getter
    public String getName()
    {
        return this.name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //equals method comparing object's name attribute
    public  boolean equals(Team that){
        return this.name.equals(that.name);
    }

    //toString method
    public String toString(){
        return  String.format (this.name);
    }



}
