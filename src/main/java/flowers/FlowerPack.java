package flowers;

public class FlowerPack extends Item{
    private Flower flower;
    private int amount;


    public FlowerPack (Flower flower, int amount){
        this.flower = flower;
        this.amount = amount >0? amount : 1;
    }
    @Override
    public double getPrice(){
        return this.flower.getPrice() * this.amount;
    }

    public Flower getFlower() {
        return flower;
    }

    @Override
    public String getDescription(){
        return "FlowerPack";
    }
    /*
    public void setAmount(int amount){
        this.amount = amount > 0 ? amount : 1;
    }

     */

    public String tuString(){
        return this.amount + " x " + this.flower.toString();
    }
}
