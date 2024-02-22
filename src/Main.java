public class Main {
    public static void main(String[] args) {
        EmployeeDictionary dict = new EmployeeDictionary();
        dict.add(new Employee(1L,"123","Иван", 10));
        dict.add(new Employee(2L,"456","Егор", 10));
        dict.add(new Employee(3L,"789","Денис", 12));
        dict.add(new Employee(4L,"123","Мария", 12));
        dict.add(new Employee(5L,"456","Олег", 8));

        for (Employee e: dict.getByExpirence(10)) {
            System.out.println(e);
        }
        System.out.println();

        for (String name: dict.getNameByTelephoneNumber("123")) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println(dict.getByEmployeeNumber(2L));


    }
}