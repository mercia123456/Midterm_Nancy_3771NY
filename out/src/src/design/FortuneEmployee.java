package src.design;

import databases.ConnectDB;

import java.util.*;



public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {


		String mission = "We guide you towards your dream";
		String vision = "Be a great place to work where people are inspired to be the best they can be.";

		EmployeeInfo employee1 = new EmployeeInfo("Mr. Hasan", 101);
		EmployeeInfo employee2 = new EmployeeInfo("Ms. Aarti", 102);
		EmployeeInfo employee3 = new EmployeeInfo("Ms. S Kaur", 103);
		EmployeeInfo employee4 = new EmployeeInfo("Ms. Mehzabin", 104);
		EmployeeInfo employee5 = new EmployeeInfo("Mr. J Islam", 105);

		employee1.assignDepartment("HR");
		employee2.assignDepartment("IT");
		employee3.assignDepartment("Finance");
		employee4.assignDepartment("R&D");
		employee5.assignDepartment("Sales & Marketing");

		employee1.setSalary(9000);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(10000);
		employee2.calculateSalary(employee2.getSalary());
		employee3.setSalary(10000);
		employee3.calculateSalary(employee3.getSalary());
		employee4.setSalary(8500);
		employee4.calculateSalary(employee4.getSalary());
		employee5.setSalary(7500);
		employee5.calculateSalary(employee5.getSalary());

		employee1.describeCompany();
		employee1.describeCompany(mission, vision);

		employee1.setPerformance(5);
		double bonus101 = employee1.calculateEmployeeBonus(employee1.getSalary(), employee1.getPerformance());
		employee2.setPerformance(4);
		double bonus102 = employee2.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());
		employee3.setPerformance(3);
		double bonus103 = employee3.calculateEmployeeBonus(employee3.getSalary(), employee3.getPerformance());
		employee4.setPerformance(2);
		double bonus104 = employee4.calculateEmployeeBonus(employee4.getSalary(), employee4.getPerformance());
		employee4.setPerformance(1);
		double bonus105 = employee4.calculateEmployeeBonus(employee5.getSalary(), employee5.getPerformance());

		EmployeeInfo.calculateEmployeePension(employee1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord101 = new ArrayList<Object>();
		employeeRecord101.add(employee1.employeeName());
		employeeRecord101.add(employee1.calculateSalary(employee1.getSalary()));
		employeeRecord101.add(bonus101);

		List<Object> employeeRecord102 = new ArrayList<Object>();
		employeeRecord102.add(employee2.employeeName());
		employeeRecord102.add(employee2.calculateSalary(employee2.getSalary()));
		employeeRecord102.add(bonus102);

		employeeInfo.put(101, employeeRecord101);
		employeeInfo.put(102, employeeRecord102);

		ConnectDB con = new ConnectDB();

		con.createTableFromStringToMySql("employee_record", "employee_id", "employee_info");

		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list = new ArrayList<>();
				list.add(obj.toString());
				list.add(obj1.toString());
				con.InsertDataFromArrayListToMySql(list, "employee_record", "employee_id");
			}

		}
		System.out.println("Reading from database");
		List<String> empRec = con.readDataBase("employee_record", "employee_id", "employee_info");
		for (String emp : empRec) {
			System.out.println(emp);
		}


	}

}
		





