import java.sql.*;

import java.io.Console;

class F{
	public static void main(String[] args){
		Console c = System.console();
		System.out.println("enter your user_id");
		int userId = Integer.parseInt(c.readLine());
		try{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1?user=root&password=1234");

			String query = "select * from users where user_id=?";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1,userId);

			ResultSet rs = pst.executeQuery();

			while(rs.next()){
				System.out.println(rs.getInt("user_id")+"\t"+rs.getString("user_name")+"\t"+rs.getString("email")+"\t"+rs.getString("password")+"\n");
				//System.out.println(rs.getInt()+"\t"+rs.getString()+"\t"+rs.getString()+"\t"+rs.getSting()+"\n");
			}

			con.close();
		}catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();
		}
	}
}