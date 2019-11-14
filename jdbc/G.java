//update your entry
import java.sql.*;

import java.io.Console;

class G{
	public static void main(String[] args){
		  Console c = System.console();
			try{
					Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
					String query ="update users set email=? where user_id=?";

					PreparedStatement pst = con.prepareStatement(query);

					System.out.println("enter your new Email : ");
					String newemail = c.readLine();
					pst.setString(1,newemail);

					System.out.println("enter your userId : ");
					int userId =Integer.parseInt(c.readLine());
					pst.setInt(2,userId);

					pst.executeUpdate();

					con.close();
			}catch(ClassNotFoundException | SQLException e){
					e.printStackTrace();
			}
	}
}