import java.sql.*;

import java.io.Console;

class C{
	public static void main(String[] args){
		try{
			Console c = System.console();

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");
			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);

			System.out.println("enter user name");
			String userName = c.readLine();
			pst.setString(1,userName);

			System.out.println("enter your email");
			String email = c.readLine();
			pst.setString(2, email);

			System.out.println("enter your password");
			char[]  password = c.readPassword();
			pst.setString(3 ,new String(password));

			pst.executeUpdate();

			con.close();
		}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
	}
}
