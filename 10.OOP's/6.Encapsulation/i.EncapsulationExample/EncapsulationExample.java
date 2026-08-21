/*
# What is Encapsulation? 

Encapsulation is the process of bundling data (fields) and methods (functions) that operate 
on the data into a single unit, typically a class. It restricts direct access to some of the object’s 
components and protects the object from unintended interference. 
Key Features of Encapsulation 
1. Data Hiding: Prevents external access to sensitive data by declaring fields as private. 
2. Controlled Access: Provides access to the data using getter and setter methods. 
3. Improved Security: Protects data from unauthorized access or modification. 
4. Modularity: Encapsulation helps in creating self-contained, reusable classes

*/
class Car{
    //Private Variable
    private String brand; //Encapsulation: restrict direct access
    
    //public getter method
    public String getBrand(){
        return brand; //controlled access
    }
    //public setter method
    public void setBrand(String brand){
        this.brand= brand; //Controlled modification
    }
}
public class EncapsulationExample{
    public static void main(String[] args){
        //creating an object of Car class
        Car car1 =new Car();

        //Set value using setter
        car1.setBrand("Toyota");

        //Get value using getter
        System.out.println("Brand: "+ car1.getBrand());
    }
}
/*
Output:-
Brand: Toyota
*/