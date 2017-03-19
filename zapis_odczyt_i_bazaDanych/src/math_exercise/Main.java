package math_exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost/test_db";
	private static final String USERNAME = "daniel";
	private static final String PASSWORD = "blablabla1";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName(JDBC_DRIVER);

			connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			statement = (Statement) connection.createStatement();
			String sql = "Select first_name, email, age FROM STUDENTS";
			ResultSet results = statement.executeQuery(sql);
			
			while (results.next() )
			{
				String firstName = results.getString("first_name");
				String email = results.getString("email");
				int age = results.getInt("age");

System.out.println("Name "+firstName+" email "+email+" age "+age);
			}
			results.close();
			//statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

		}
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter("C:\\Users\\Daniel\\Desktop\\file.txt"));
		// bufferedWriter.write("witaj");
		// bufferedWriter.write(System.lineSeparator());
		// bufferedWriter.write("world");
		// bufferedWriter.close();

		// try {
		// BufferedReader reader = new BufferedReader(new
		// FileReader("C:\\Users\\Daniel\\Desktop\\file.txt"));
		// String line = reader.readLine();
		// while (line != null) {
		// System.out.println(line);
		// line = reader.readLine();
		// }
		// reader.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// System.out.println("error");
		// }
		//
	}
}
