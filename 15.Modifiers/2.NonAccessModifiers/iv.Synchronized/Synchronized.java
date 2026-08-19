/*
4. Synchronized Modifier 
• Description: The synchronized modifier ensures that only one thread can access a 
method or block at a time. 
• It is used to avoid race condition 

• Race Condition: 
A race condition occurs when two or more threads or processes try to access and 
modify the same resource (such as a variable or file) simultaneously, leading to 
unpredictable or incorrect results.
 */

class Counter {
    private int count = 0;

    synchronized void increment() { //Thread-safe
        count++;
    }
    int getCount(){
        return count;
    }
}

class SynchronizedExample {
    public static void main(String[] args) {
        Counter branch1 = new Counter();
        System.out.println(branch1.increment());

    }
}