package order;

public class Sender implements User{
    int id;
    public Sender(){
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
