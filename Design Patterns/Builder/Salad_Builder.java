
//Builder Design Pattern

class salad{
    private final boolean apple;
    private final boolean watermelon;
    private final boolean guava;
    private final boolean dates;

    # Salad contructor is private as to restrict direct access to salad contructor so thats salad_Builder is static method, users can build salad without knowing implementation of salad class
    private salad(saladBuilder builder){
        this.apple=builder.apple;
        this.watermelon=builder.watermelon;
        this.guava=builder.guava;
        this.dates=builder.dates;
    }
    public String toString(){
        return "Salad contain:"+ " apple "+this.apple+" watermelon "+this.watermelon+" guava "+this.guava+" dates "+this.dates; 
    }
    public boolean hasApple(){
        return this.apple;
    }
    public boolean hasWatermelon(){
        return this.watermelon;
    }
    public boolean hasGuava(){
        return this.guava;
    }
    public boolean hasDates(){
        return this.dates;
    }
    #Here SaladBuilder class is given access to users so thay they can build their own type of salad.
    public static class saladBuilder{
    boolean apple;
    boolean watermelon;
    boolean guava;
    boolean dates;
    public saladBuilder addApple(){
        this.apple=true;
        return this;
    }
    public saladBuilder addWatermelon(){
        this.watermelon=true;
        return this;
    }
    public saladBuilder addGuava(){
        this.guava=true;
        return this;
    }
    public saladBuilder addDates(){
        this.dates=true;
        return this;
    }
    public salad Build(){
        return new salad(this);
    }  
    }
}

public class Main {
    public static void main(String[] args) {
        salad sld=new salad.saladBuilder().addGuava().addDates().Build();
        System.out.print(sld.toString());
        
    }
}
