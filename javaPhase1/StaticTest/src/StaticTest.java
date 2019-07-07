public class StaticTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("water1", 34500);
        staff[1] = new Employee("water2", 23450);
        staff[2] = new Employee("water3", 12300);

        for(Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary()
                + ",id=" + e.getId());
        }

        int next_id = Employee.getNextid();
        System.out.println("Next id=" + next_id);

    }
}

class Employee {
    private static int nextid = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s){
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextid;
        nextid++;
    }

    public static int getNextid() {
        return nextid;
    }

    public static void main(String[] args) {
        Employee e = new Employee("water", 34000);
        System.out.println(e.getName() + " " + e.getSalary());
    }


}
