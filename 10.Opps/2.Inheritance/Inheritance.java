//4. My code with constructors function & Methods to creating Class & objects.

//Creating Owner class (Parent)
class Owner {
    String ownerName = "Animuthyam";
    int age = 24;
    int num = 123;

    public void boom() {
        System.out.println("Boomm will executed here."); // Boomm will executed here.
    }
}

// creating ChaiShop class (Child)
class ChaiShop extends Owner {
    String branchName;
    int cupsSold;
    int pricePerCup;
    int numberOfEmplpyees;
    int previousOrderCount;
    int currentOrderCount;

    // creating constructor function
    public ChaiShop(String branchName, int cupsSold, int pricePerCup, int numberOfEmplpyees) {
        this.branchName = branchName;
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
        this.numberOfEmplpyees = numberOfEmplpyees;

    }

    // writing a method || functions
    public void display() {
        getRevenue();
        // System.out.println(branchName);
        // System.out.println(cupsSold);
        // System.out.println(pricePerCup);
        // System.out.println(numberOfEmplpyees);
        // System.out.println(previousOrderCount);
        // System.out.println(currentOrderCount);

    }

    // writing a method to get revenue
    public void getRevenue() {
        // System.out.println(branchName + " revenue : " + previousOrderCount + "prev" +
        // " + " + currentOrderCount + "current"
        // + " = " + (previousOrderCount + currentOrderCount) + "cupsSold" + " * " +
        // pricePerCup + "pricePerCup" + " = "
        // + "Total: " + (cupsSold * pricePerCup));
        // or
        // System.out.println(branchName + " revenue : " + previousOrderCount+ "prev" +
        // " + "+ currentOrderCount + "current" + " = " +(cupsSold) + "cupsSold" + " *
        // "+ pricePerCup + "pricePerCup" + " = " + "Total: " + (cupsSold * pricePerCup)
        // );

        // Bahubali Adda revenue : 10prev + 10current = 20cupsSold * 5pricePerCup =
        // Total: 100
        // JalsaKottu revenue : 20prev + 5current = 25cupsSold * 7pricePerCup = Total:
        // 175
        // pokiriJaaga revenue : 30prev + 3current = 33cupsSold * 10pricePerCup = Total:
        // 330
        // Pushpa Adda revenue : 40prev + 8current = 48cupsSold * 15pricePerCup = Total:
        // 720

    }

    // writing a method || every order chai count will be increase
    public void chaiOrder(int orderCount) {
        this.previousOrderCount = cupsSold; //// save old total
        this.currentOrderCount = orderCount; //// just this order's count
        this.cupsSold += orderCount; //// update the total
        // System.out.println("cupsSold : " + previousOrderCount + "Prev" + " + " +
        // currentOrderCount + "Current" + " = "
        // + cupsSold + "CupsSold");
        // or
        // System.out.println("cupsSold : " + previousOrderCount +"Prev" + " + " +
        // currentOrderCount + "Current" + " = " +
        // (previousOrderCount+currentOrderCount) + "CupsSold");
        // cupsSold : 10Prev + 10Current = 20CupsSold
        // cupsSold : 20Prev + 5Current = 25CupsSold
        // cupsSold : 30Prev + 3Current = 33CupsSold
        // cupsSold : 40Prev + 8Current = 48CupsSold
    }
}

// creating XeroxShop class (Child)
class XeroxShop extends Owner {
    String branchName;
    int papersSold;
    int pricePerPaper;

    // creating constructor function
    public XeroxShop(String branchName, int papersSold, int pricePerPaper) {
        this.branchName = branchName;
        this.papersSold = papersSold;
        this.pricePerPaper = pricePerPaper;

    }

    public void display() {
        System.out.println(branchName);// JalsaKottu
        System.out.println(papersSold);// 30
        System.out.println(pricePerPaper);// 5
    }
}

// class Main { // or
class InheritanceExample1 {
    public static void main(String[] args) {
        // creating four objects(branch1)
        ChaiShop branch1 = new ChaiShop("Bahubali Adda", 10, 5, 2);
        branch1.chaiOrder(10);
        branch1.display();
        // branch1.getRevenue();
        branch1.boom(); // calling the Parent method from the ChaiOrder class child
        // creating new object (xbranch1)
        XeroxShop xbranch1 = new XeroxShop("Jalsaakottu", 30, 5);
        xbranch1.display();
        xbranch1.boom(); // //calling the Parent method from the XeroxShop class child
        System.out.println(branch1.ownerName);// Animuthyam
        System.out.println(branch1.num);// 123
        System.out.println(xbranch1.ownerName);////Animuthyam
        System.out.println(xbranch1.num);// 123

        // creating new object
        Owner o1 = new Owner();
        o1.boom();
    }
}