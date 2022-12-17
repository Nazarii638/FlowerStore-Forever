package store;

public class Connection {
    String url;
    public static Connection thisConnection = null;
    private Connection(String url) {
        this.url=url;
    }
    public static Connection getConnection(String url) {
        if (thisConnection == null)
            thisConnection = new Connection(url);
        return thisConnection;
    }
}
