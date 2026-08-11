/*MultiLevel Inheritance:-
Ex:- Owner - ChaiShop - Room 
*/
//creating Owner Class (Owner class is the Parent class)
class Owner {
    String ownerName = "Animuthyam";
    int age = 21;
    int num = 123;

    void fun() {
        System.out.println("Fun Method :" + 2);
    }
}

// creating ChaiShop class (ChaiShop is the child Class to the Owner class)
// (ChaiShop is the Parent class to the Room Class)
// It contains Owner data
class ChaiShop extends Owner {
    String branchName = "Bahubali Adda";
}

// creating a Room Class (Room Class is the child Class to the Owner class)
// (Room is the Child class to the ChailShop Class)
// EX:-Grand Father -> Father -> Son
// it contains ChaiShop, Owner data
class Room extends ChaiShop {
    int roomNumber = 3;

    int noOfChairs = 2;
    boolean isAcRoom; // attribute
}

// class Main{ // or
class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        // creating four objects(branch1)
        Room room1 = new Room();
        System.out.println("RoomNumber of Room Class :" + room1.roomNumber); // RoomNumber of Room Class :3
        System.out.println("NoOfChairs of Room Class :" + room1.noOfChairs); // NoOfChairs of Room Class :2
        System.out.println("OwnerName of Owner Class From Room Class :" + room1.ownerName);
        // OwnerName of Owner Class From Room Class :Animuthyam
        System.out.println("branchName of the ChaiShop Class From the Room Class :" + room1.branchName);
        // branchName of the ChaiShop Class From the Room Class :Bahubali Adda

    }
}