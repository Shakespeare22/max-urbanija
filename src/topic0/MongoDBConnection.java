package topic0;

public class MongoDBConnection implements Connection{

	@Override
	public void connect() {
		System.out.println("Connecting to MongoDB database...");
	}
	
}
