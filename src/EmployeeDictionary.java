import java.util.HashMap;
import java.util.List;
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

    public Set<Employee> getByTelephoneNumber(String telephoneNumber) {
        return employeeSet
                .stream()
                .filter((e) -> e.getTelephoneNumber().equals(telephoneNumber))
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
