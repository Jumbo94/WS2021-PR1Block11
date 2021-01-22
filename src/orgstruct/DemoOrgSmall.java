package orgstruct;

public class DemoOrgSmall {

	public static void main(String[] args) {
		
		EmployeeManager em = new EmployeeManager();
		
		//create employees and build hierarchy
		//according to organigram in the exercise
		Employee ceo = new Employee(1, "Mitarbeiter 1", 7_500,
									"Management", "CEO");
		
		Employee cto = new Employee(2, "Mitarbeiter 2", 6_500,
									"Management", "CTO");
		cto.setSuperior(ceo);
		ceo.addSubordinate(cto);
		
		Employee dev1 = new Employee(3, "Mitarbeiter 3", 3_500,
									"Engineering", "Dev");
		dev1.setSuperior(cto);
		Employee dev2 = new Employee(4, "Mitarbeiter 4", 3_500,
									"Engineering", "Dev");
		dev2.setSuperior(cto);
		
		cto.addSubordinate(dev1);
		cto.addSubordinate(dev2);
		
		Employee hr = new Employee(5, "Mitarbeiter 5", 6_500,
									"Management", "HR");
		hr.setSuperior(ceo);
		ceo.addSubordinate(hr);
			
		//register all employees
		em.addEmployee(ceo);
		em.addEmployee(cto);
		em.addEmployee(hr);
		em.addEmployee(dev1);
		em.addEmployee(dev2);

		//TODO: try out your recursive methods from the OrganigramHandler
		String chainCeo = OrganigramHandler.getChainOfCommand(ceo);
		System.out.println("chainCeo = " + chainCeo);

		String chainCto = OrganigramHandler.getChainOfCommand(cto);
		System.out.println("chainCto = " + chainCto);

		String chainDev2 = OrganigramHandler.getChainOfCommand(dev2);
		System.out.println("chainDev2 = " + chainDev2);

		String ceoHierarchy = OrganigramHandler.processHierarchy(ceo);
		System.out.println(ceoHierarchy);

	}

}
