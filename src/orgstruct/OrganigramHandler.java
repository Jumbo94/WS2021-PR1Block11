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
    // else
    String hierarchy = "+ ["+employee.getRole()+"] "+employee.getName()+System.lineSeparator();
    for(Employee e : employee.getSubordinates()) {
      hierarchy += processHierarchy(e);
    }
    return hierarchy;

  }

  public static String processHierarchy(Employee employee, String indent) {
    if(employee.getSubordinates().isEmpty()) {
      // Abbruchbedingung
      return indent + "- ["+employee.getRole()+"] "+employee.getName()+System.lineSeparator();
    }
    // else
    String hierarchy = indent + "+ ["+employee.getRole()+"] "+employee.getName()+System.lineSeparator();
    for(Employee e : employee.getSubordinates()) {
      // Wir verarbeiten die Mitarbeiter des aktuellen Mitarbeiters
      hierarchy += processHierarchy(e, indent + "  ");
    }
    return hierarchy;
  }

}
