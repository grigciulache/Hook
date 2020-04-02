import java.sql.*;

public class dbconnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public dbconnect(){
		try {
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			st = con.createStatement();
		}catch(Exception Ex) {
			System.out.println(Ex);
		}
	}
	
	 public void getData() {
		 try {
		     String query = "select * from persons";
		     rs = st.executeQuery(query);
		     System.out.println("Records from Database");
		     while (rs.next()) {
		    	 String name = rs.getString("name");
		    	 String age = rs.getString("age");
		    	 System.out.println("Name: " + name + " Age: " + age);
		     }
		 } catch(Exception ex) {
		     System.out.println(ex);
		 }
	 }
	 public void insertData() {
		 try {
			 String name ="Tom";
			 String age = "47";
			 
		     // String query = "insert into persons values ('Tom','47');";
			 String query = "insert into persons values ('"+name+"','"+age+"');";
		     st.executeUpdate(query);
		     
		 } catch(Exception ex) {
		     System.out.println(ex);
		 }
	 }
	 public void close() {
		 try {
			 st.close();
			 con.close();
		     
		 } catch(Exception ex) {
		     System.out.println(ex);
		 }
	 }
	 


}
