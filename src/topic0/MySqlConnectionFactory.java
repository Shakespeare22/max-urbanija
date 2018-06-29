package topic0;

public class MySqlConnectionFactory implements ConnectionFactory {

	@Override
	public Connection getConnection() {

		return new MySqlConnection();
	}

}
