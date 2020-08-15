package connect_to_sql;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect_db {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nirf","root","");
                       
                        
		}catch(Exception e){System.out.println(e);}
		return con;
	}
public static void main(String arg[])
{
   getConnection();
}
}
