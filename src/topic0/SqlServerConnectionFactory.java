package topic0;

public class SqlServerConnectionFactory implements ConnectionFactory{

	@Override
	public Connection getConnection() {
		return new SqlServerConnection();
	}

}
