import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDictionary {

    private Map<Long, Employee> employeeMap;

    public EmployeeDictionary() {
        employeeMap = new HashMap<Long, Employee>();
    }

    public void add(Employee employee) {
        employeeMap.put(employee.getEmployeeNumber(), employee);
    }

    public List<Employee> getByExpirence(Integer expirence) {
        return employeeMap
                .entrySet()
                .stream()
                .filter((e) -> e.getValue().getExperience() == expirence)
                .forEach((e) -> e.getValue()).

    }


}
