package flowers;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket extends Item{
    private List<FlowerPack> flowers = new ArrayList<FlowerPack>();


    public FlowerBucket(){

    }

    public FlowerBucket(FlowerPack fp){
        this.flowers.add(fp);
    }

    public FlowerBucket(List<FlowerPack> f){
            this.flowers.addAll(f);
    }

    public void addToBucket(FlowerPack flowerpack){
        flowers.add(flowerpack);
    }
    @Override
    public double getPrice(){
        double price = 0;
        for (FlowerPack el : this.flowers){
            price += el.getPrice();
        }
        return price;
    }

    /*
    public void removeFromBucket(Flower flower){
        for (FlowerPack el : this.flowers){
            if(el.getFlower() == flower){
                this.flowers.remove(el);
                System.out.println("Deleted succesfuly!");
                System.out.println(flower);
            }
        }
        System.out.println("There is no such flower in the bucket");
        return;
    }
    */

    public String toString(){
        String result = new String("");
        for (FlowerPack el : flowers){
            result += el.tuString() + "\n";
        }
        return result;
    }

    public String getDescription(){
        return "FlowerBucket";
    }
}
