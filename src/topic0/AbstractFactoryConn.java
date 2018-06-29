package topic0;

public class AbstractFactoryConn {

	public AbstractFactoryConn() {

	}

	public static ConnectionsFactory getConnectionFactory(String type) {

		switch (type) {
		case "MySQL":
			return new MySQLConnectionFactory();
			break;
		case "Oracle":
			return new OracleConnectionFactory();
			break;
		case "MongoDB":
			return new MongoDBConnectionFactory();
			break;
		case "PostgreSQL":
			return new PostgreSQLConnectionFactory();
			break;
		default:
			return newMySQLConnectionFactory();
			break;
		}

	}

}
