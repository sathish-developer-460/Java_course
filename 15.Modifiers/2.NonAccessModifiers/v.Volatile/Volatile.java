/*
 * i. Ensures visibility of changes toa variable across threads.
 * ii. Prevents threads from caching the value of the variable; always fetches
 * the latest value from memory.
 * 
 * 
 * 5. Volatile Modifier 
• Description: The volatile modifier ensures that a variable's value is always read from and written to main memory, not a thread's local cache.
 */

class SharedData {
    volatile boolean isRunning = true;

    void stopRunning(){
        isRunning = false;
    }
}