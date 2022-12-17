package store;

import flowers.*;

import java.sql.SQLOutput;
import java.util.*;

public class Store {
    private List<Flower> assortment = new ArrayList<Flower>();
    private List<FlowerBucket> cart = new ArrayList<FlowerBucket>();
    private List<Flower> filtered = this.assortment;

    public Store(List<Flower> list){
        this.assortment.addAll(list);
    }

    public void showAssortment(){
        System.out.println("------------------OUR ASSORTMENT------------------");
        System.out.println("Flower:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIndex:");
        for(int i = 0; i<this.assortment.size(); i++){
            System.out.println(this.assortment.get(i)+"\t\t\t\tIndex:"+i);
        }
    }

    public void showCart(){
        if(cart.size() < 1){
            System.out.println("Cart is empty");
            return;
        }
        else {
            System.out.println("------------------CART------------------");
            for (FlowerBucket el : cart) {
                System.out.println(el);
            }
        }
    }

    public double getTotalPrice(){
        double sum = 0;
        for(FlowerBucket el : cart){
            sum+=el.getPrice();
        }
        return sum;
    }

    public void addToCart(FlowerBucket fb){
        this.cart.add(fb);
    }

    private void printResult(List<Flower> ls){
        System.out.println("------------------RESULT OF THE SEARCH------------------");
        for (Flower el : ls)
            System.out.println(el);
    }

    public void search(FlowerType ft){
        List <Flower> result = new ArrayList<Flower>();
        for (Flower el : this.filtered){
            if(el.getFlowerType() == ft)
                result.add(el);
        }
        printResult(result);
        this.filtered = result;
    }

    public void search(Color c){
        List <Flower> result = new ArrayList<Flower>();
        for (Flower el : this.filtered){
            if(el.getColor() == c)
                result.add(el);
        }
        printResult(result);
        this.filtered = result;
    }

    public void search(double sepalength){
        List <Flower> result = new ArrayList<Flower>();
        for (Flower el : this.filtered){
            if(el.getSepalLength() == sepalength)
                result.add(el);
        }
        printResult(result);
        this.filtered = result;
    }

    public void resetSearch(){
        this.filtered = this.assortment;
    }

    public FlowerBucket createBucket(int flowers){
        if(flowers<1){
            System.out.println("Can't create a bucket with "+flowers+" flowers");
            return new FlowerBucket();
        }
        else{
            Scanner sc = new Scanner(System.in);
            FlowerBucket fb = new FlowerBucket();
            int n = 0;
            int choice;
            while (n<flowers){
                Flower flower = chooseFlower(sc);
                System.out.println("How many do you want them in a the bucket? ");
                choice = sc.nextInt();
                while(choice<1 || choice > flowers-n){
                    System.out.println("Please, input natural number of flowers: ");
                    choice = sc.nextInt();
                }
                fb.addToBucket(new FlowerPack(flower, choice));
                n+=choice;
            }
            return fb;
        }
    }

    private Flower chooseFlower(Scanner sc){
        showAssortment();
        System.out.println("Input the index of flower: ");
        int choice = sc.nextInt();
        while (choice<0 || choice>assortment.size()){
            System.out.println("Please, input index of a flower:");
            choice = sc.nextInt();
        }
        return assortment.get(choice);
    }
}