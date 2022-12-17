package order;

public class idCounter {
    static int id;
    public static idCounter thisidCounter = new idCounter();
    private idCounter() {
        id = 0;
    }
    public static idCounter getIdCounter() {
        return thisidCounter;
    }
    public int getId(){
        this.id++;
        return id;
    }
}
