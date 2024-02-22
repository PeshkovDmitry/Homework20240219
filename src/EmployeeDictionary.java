import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeDictionary {

    private Set<Employee> employeeSet = new TreeSet<>();

    public void add(Employee employee) {

        employeeSet.add(employee);
    }

    public Set<Employee> getByExpirence(Integer expirence) {
        return employeeSet
                .stream()
                .filter((e) -> e.getExperience().equals(expirence))
                .collect(Collectors.toSet());
    }

    public Set<String> getTelephoneNumberByName(String name) {
        return employeeSet
                .stream()
                .filter((e) -> e.getName().equals(name))
                .map(Employee::getTelephoneNumber)
                .collect(Collectors.toSet());
    }

    public Employee getByEmployeeNumber(Long employeeNumber) {
        return employeeSet
                .stream()
                .filter((e) -> e.getEmployeeNumber().equals(employeeNumber))
                .findAny()
                .get();
    }

}
