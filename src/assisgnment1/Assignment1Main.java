package assisgnment1;

import assisgnment1.employees.Manager;
import assisgnment1.employees.Developer;
import assisgnment1.ulities.EmployeeUtilities;


public class Assignment1Main {
	    public static void main(String[] args) {
	        Manager m = new Manager();
	        m.setEmployeeId(1);
	        m.setName("Alice");
	        m.setSalary(90000);
	        m.setDepartment("HR");

	        Developer d = new Developer();
	        d.setEmployeeId(2);
	        d.setName("Bob");
	        d.setSalary(70000);
	        d.setProgrammingLanguage("Java");

	        EmployeeUtilities util = new EmployeeUtilities();
	        util.printEmployeeDetails(m);
	        util.printEmployeeDetails(d);

	        util.updateSalary(d, 80000);
	        System.out.println("After salary update:");
	        util.printEmployeeDetails(d);
	    }
	}
