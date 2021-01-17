public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee SalesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee SalesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(SalesExecutive1);
        headSales.add(SalesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for(Employee headEmployee: CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for(Employee employee: headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}

//output: 
// Employee :[ Name : John, dept : CEO, salary :30000 ]
// Employee :[ Name : Robert, dept : Head Sales, salary :20000 ]
// Employee :[ Name : Richard, dept : Sales, salary :10000 ]
// Employee :[ Name : Rob, dept : Sales, salary :10000 ]
// Employee :[ Name : Michel, dept : Head Marketing, salary :20000 ]
// Employee :[ Name : Laura, dept : Marketing, salary :10000 ]
// Employee :[ Name : Bob, dept : Marketing, salary :10000 ]
