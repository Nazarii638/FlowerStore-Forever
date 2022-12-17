package flowers;

public abstract class Item {
    /*
    private String description = "";
    private double price;
    public Item(){
        this.price = this.getPrice();
        this.description += this.getDescription() + "\n";
    }
     */
    public abstract String getDescription();
    public abstract double getPrice();
}
