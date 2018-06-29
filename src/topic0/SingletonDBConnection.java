package topic0;


public class SingletonDBConnection {
	
	private static SingletonDBConnection instance = null;

    private String connection;
    private String url = "databaseUrl";
    private String username = "root";
    private String password = "toor";

    private SingletonDBConnection(){
            this.connection = url+" "+username+" "+password;
    }

    public String getConnection() {
        return connection;
    }

    public static SingletonDBConnection getInstance() {
        if (instance == null) {
        	instance = new SingletonDBConnection();
        }
        return instance;
    }

	
}
