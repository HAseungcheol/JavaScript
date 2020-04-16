package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {

	private String firstName;
	private int salary;

	public Employee(String firstName, int salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", salary=" + salary + "]";
	}

}

public class ScannerExample {
	static List<Employee> list = new ArrayList<>();

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		}catch (SQLException e) {
				e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
}
	
	public static void inputEmp(Employee emp) {
	//	list.add(emp);
		Connection con = getConnection();
		
		String sql = "insert into emps values (?,?)";
				try {
				PreparedStatement pstmt = con.prepareStatement(sql); //PreparedStatement SQL문장 준비
				pstmt.setString(1, emp.getFirstName());
				pstmt.setInt(2, emp.getSalary());
				pstmt.executeUpdate();
				int r = pstmt.executeUpdate(); //executeUpdate 업데이트문  실행
				System.out.println(r+"건 입력됨");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}
	public static List<Employee> getEmpList(){
	//	return list;
		Connection con = getConnection(); 
		String sql = "select first_name, salary from emps";
		try {
			PreparedStatement pstmt= con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			list.add(new Employee(rs.getString("first_name"),rs.getInt("salary")));
		}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static void deleteDBEmp(String name) {
		Connection conn = getConnection(); 
		String sql = "delete from emps where first_name=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int result = pstmt.executeUpdate();
			System.out.println(result+"삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Hong", 1000);
		emp.equals("Hello");

		list.add(emp);
		list.add(new Employee("Hwang", 2000));

		List<String> strList = new ArrayList<>();
		strList.add("Hello");
		strList.add(new String("Nice"));
		strList.add("Good");

		String[] strAry = new String[10];
		Integer[] intAry = new Integer[10];

		Scanner scn = new Scanner(System.in);
		int menu = 0;
		while (true) {
			System.out.println("1:입력,2:출력,3:삭제,4:종료");
			menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {

				System.out.println("이름입력:");
				String name = scn.nextLine();
				System.out.println("연봉입력:");
				int salary = scn.nextInt();
				Employee emps = new Employee(name, salary);
				inputEmp(emps);
			
			} else if (menu == 2) {		//조회
				List<Employee> returnList = getEmpList();
				
				for (Employee emps :returnList)
					System.out.println(emps);
			}else if (menu == 3) {  //삭제
				System.out.println("이름입력:");
				String name = scn.nextLine();
				deleteDBEmp(name);
			
			
			}else if (menu == 4) {		//종료
				break;
			}
		}

	}

}
