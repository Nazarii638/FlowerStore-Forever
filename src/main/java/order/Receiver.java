package order;

public class Receiver implements User{
    int id;
    public Receiver(){
        this.id = idcounter.getId();
    }

    @Override
    public void update(String s){
        System.out.println(s);
    }

    @Override
    public int getId(){
        return this.id;
    }
}
