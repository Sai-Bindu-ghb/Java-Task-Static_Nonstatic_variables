public class Department
{
	public static String departmentName= "HR";
	String employeeName;

	public static void main(String args[])
	{
		
		System.out.println("Department:"+Department.departmentName);
		Department department=new Department();
		department.employeeName="John";
		System.out.println("Employee 1:"+department.employeeName);
		Department department1=new Department();
		department1.employeeName="Alice";
		System.out.println("Employee 2:"+department1.employeeName);


		
		System.out.println("After Modification:");
		departmentName= "Marketing";
		System.out.println("Department:"+Department.departmentName);
		System.out.println("Employee 1:"+department. employeeName);
		System.out.println("Employee 2:"+department1. employeeName);


	}
}
		