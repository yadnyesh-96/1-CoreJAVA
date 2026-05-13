
import java.sql.*;
import java.util.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{

	// Method to establish connection with MySQL database
	public static Connection getConnection(){
		Connection con = null;
		
		try{
			// DriverManager is used to get connection object
            // URL format: jdbc:mysql://host:port/database
			
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/student_db",
                "root",
                "Mysql@123" 
			
			);
			
			System.out.println("Connected to Database");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}


public class StudentCRUD{
	static Scanner sc= new Scanner(System.in);
	
	public static void insertStudent(){
		try{
			
			Connection con = DBConnection.getConnection();
			
			// takes the input from user
			System.out.println("Enter Name:");
			String name = sc.next();
			
			System.out.println("Enter Age:");
			int age= sc.nextInt();
			
			System.out.println("Enter Course:");
			String course = sc.next();
			
			// SQL query with placeholders (?)
			String query = "INSERT INTO students(name,age,course) VALUES (?,?,?)";
			
			PreparedStatement ps = con.preparedStatement(query);
			
			
			// Setting values into placeholders
			ps.setString(1,name);
			ps.setInt(2,age);
			ps.setString(3,course);
			
			//Execute insert query
			ps.executeUpdate();
			
			System.out.println("Student Registered");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void viewStudents(){
		try{
			
			Connection con = DBConnection.getConnection();
			String query = "SELECT *FROM students";
			
			// Statement used for simple queries
            Statement st = con.createStatement();

            // ResultSet holds data returned from database
            ResultSet rs = st.executeQuery(query);
			
			while(re.next()){
				System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("course")
                );
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void updateStudent(){
		try{
			
			Connection con = DBConnection.getConnection();
			
			System.out.print("Enter ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new course: ");
            String course = sc.nextLine();
			
			String query = "UPDATE students SET course=? WHERE id=?";
			
			PreparedStatement ps = preparedStatement(query);
			
			ps.setString(1,course);
			ps.setInt(2,id);
			
			ps.executeUpdate();
			
			System.out.println("Record is Updated");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void deleteStudent(){
		
		try{
			
			Connection con = DBConnection.getConnection();
			
			System.out.println("Enter Student Id to delete:");
			int id = sc.nextInt();
			
			String query = "DELETE FROM students WHERE id=?";
			
			PreparedStatement ps = con.preparedStatement(query);
			
			ps.setInt(1,id);
			
			ps.executeUpdate();
			
			System.out.println("Data is Removed");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class StudentApplication{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		while(true){
		System.out.println("\n     Student Management System  ");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
			
			System.out.print("Choose option: ");
            int choice = sc.nextInt();
			
			switch (choice) {
                case 1:
                    StudentCRUD.insertStudent();
                    break;

                case 2:
                    StudentCRUD.viewStudents();
                    break;

                case 3:
                    StudentCRUD.updateStudent();
                    break;

                case 4:
                    StudentCRUD.deleteStudent();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
			
		}
	}
}