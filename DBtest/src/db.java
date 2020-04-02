
public class db {

	public static void main(String[] args) {
		
		dbconnect connect = new dbconnect();
		connect.getData();
		connect.insertData();
		connect.getData();
		connect.close();

	}

}
