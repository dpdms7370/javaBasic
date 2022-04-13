package digdo;

public class DaoExmple {
	
	public static void dbWork(DataAccessObject dao) {
		dao.delete();
		dao.select();
		dao.update();
		dao.delete();
		}
	
	

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
