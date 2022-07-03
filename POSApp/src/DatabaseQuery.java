import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQuery {
	Connection conn=null;
	Statement stmt;
	String databaseName="Restaurant";
	String url="jdbc:mysql://localhost:3306/"+databaseName;
	
	String username="root";
	String password="Malolos_21!";
	public int ConnectionCount(String category) throws ClassNotFoundException, SQLException {
		
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,username,password);
		
		 stmt = conn.createStatement();
		
		 String query="select count(*) from `menu` where `menu_category`=?;";
		 
		 PreparedStatement pstmt=conn.prepareStatement(query);
		 pstmt.setString(1, category);
		 ResultSet rs = pstmt.executeQuery();
		 rs.next();
	    int count = rs.getInt(1);
	    //System.out.println(count);
	    return count;
				
				
		
		}
	
	public List<String> MenuName(String category) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,username,password);
		
		 stmt = conn.createStatement();
		 String name="";
		List<String> menuName=new ArrayList<>();
		
		
		
		 String query="select `menu_name` from `menu` where `menu_category`=?";
		 PreparedStatement pstmt=conn.prepareStatement(query);
		 pstmt.setString(1, category);
		 
		 
		// ResultSet rs = stmt.executeQuery(query);
		 ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			
			
		menuName.add(rs.getString("menu_name"));
		}
		return menuName;
		
		//System.out.println(rs.toString());
		//return rs.toString();
	   // int count = rs.getInt(1);
	    //System.out.println(count);
	    //return rs.toString();
		
	}
	
	
	public double getPrice(String menuName) throws SQLException, ClassNotFoundException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection(url,username,password);
		
		 stmt = conn.createStatement();
		
		 String query="select `menu_price` from `menu` where `menu_name`=?";
		 
		 PreparedStatement pstmt=conn.prepareStatement(query);
		 pstmt.setString(1, menuName);
		 ResultSet rs = pstmt.executeQuery();
		 rs.next();
	    double price = rs.getDouble(1);
	    //System.out.println(count);
	    return price;
		
		
	}
	
	
	

}
