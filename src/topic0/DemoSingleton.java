package topic0;



public class DemoSingleton {

	public static void main(String[] args) {
		SingletonDBConnection aConnection = SingletonDBConnection.getInstance();
		
		System.out.println(aConnection.getConnection());

	}

}
