/*
 * i. Ensures thread safety by allowing only one thread to access a block of
 * code or method at a time.
 * ii. Prevents race conditions in multi-threaded environment.
 */

class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;

    }
}

class SynchronizedExample {
    public static void main(String[] args) {
        Counter branch1 = new Counter();
        System.out.println(branch1.increment());

    }
}