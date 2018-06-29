package topic0;

public class DemoAbstractFactory {
	private enum DatabaseType {
		MYSQL, SQLSERVER, MONGODB;
	}

	public static void main(String[] args) {

		DatabaseType databaseType = DatabaseType.MONGODB;
		ConnectionFactory connectionFactory = getConnectionFactory(databaseType);

		Application application = new Application(connectionFactory);
		application.start();

	}

	private static ConnectionFactory getConnectionFactory(DatabaseType databaseType) {
		switch (databaseType) {

		case MYSQL:
			return new MySqlConnectionFactory();
		case SQLSERVER:
			return new SqlServerConnectionFactory();
		case MONGODB:
			return new MongoDBConnectionFactory();
		default:
			return new MongoDBConnectionFactory();
		}
	}

}
