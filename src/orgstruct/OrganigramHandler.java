package orgstruct;

public class OrganigramHandler {

  public static String getChainOfCommand(Employee employee) {
    String chain = employee.getName() + " [" + employee.getRole()+ "]";
    //base case
    if(employee.getSuperior() == null) {
      return chain;
    }
    //recursion
    chain += " -> " + getChainOfCommand(employee.getSuperior());
    return chain;
  }

  public static String processHierarchy(Employee employee) {

    if(employee.getSubordinates().isEmpty()) {
      return "- ["+employee.getRole()+"] "+employee.getName()+System.lineSeparator();
    }

    String hierarchy = "+ ["+employee.getRole()+"] "+employee.getName()+System.lineSeparator();
    for(Employee e : employee.getSubordinates()) {
      hierarchy += processHierarchy(e);
    }
    return hierarchy;

  }

}
