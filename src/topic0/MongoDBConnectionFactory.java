package topic0;

public class MongoDBConnectionFactory implements ConnectionFactory{

	@Override
	public Connection getConnection() {
		return new MongoDBConnection();
	}
	
}
