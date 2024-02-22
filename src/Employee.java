public class Employee implements Comparable{

    private Long employeeNumber;

    private String telephoneNumber;

    private String name;

    private Integer experience;

    public Employee(Long employeeNumber, String telephoneNumber, String name, Integer experience) {
        this.employeeNumber = employeeNumber;
        this.telephoneNumber = telephoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeNumber != employee.employeeNumber) return false;
        if (experience != employee.experience) return false;
        if (!telephoneNumber.equals(employee.telephoneNumber)) return false;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (employeeNumber ^ (employeeNumber >>> 32));
        result = 31 * result + telephoneNumber.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + experience;
        return result;
    }

    @Override
    public String toString() {
        return "Сотрудник " + name +": " +
                "табельный номер: " + employeeNumber +
                ", номер телефона: " + telephoneNumber +
                ", опыт работы " + experience + " лет";
    }

    @Override
    public int compareTo(Object o) {
        return hashCode() - o.hashCode();
    }
}
