/*
 * i. Prevents a variable from being serialized.
 * ii. Means while storing an object in afile, if we make a variable ransient,
 * it will not store that value in life.
 * iii. we can make sensitive data transient.
 * 
 * 
 * 
 * 6. Transient Modifier 
• Description: The transient modifier excludes variables from being serialized. 
 */
import java.io.*;

class Car implements Serializable{
    String brand;
    transient int speed; //won't be serialized

    Car(String brand, int speed){
        this.brand = brand;
        this.speed= speed;
    }
}