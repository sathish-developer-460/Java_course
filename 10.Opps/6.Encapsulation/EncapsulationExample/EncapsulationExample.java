/*
 * #Encapsulation
 * i. The process of wrapping data (variables) and methods (functions) into a
 * single unit (class) and restricting direct access to some of the object's
 * components.
 * ii. Uses getters and setters to achieve it.
 */

//1. Declares variables as private and methods as public.

class Employee {
    private String name = "Sathish";

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String newName) {
        this.name = newName;
    }
}

class EncapsulationExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        // System.out.println(employee1.name); // can't access private variable
        System.out.println(employee1.getName()); // Sathish
        employee1.setName("Sathya");
        System.out.println(employee1.getName());// Sathya
    }
}