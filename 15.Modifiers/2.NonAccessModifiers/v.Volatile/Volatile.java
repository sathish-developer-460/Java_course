/*
 * i. Ensures visibility of changes toa variable across threads.
 * ii. Prevents threads from caching the value of the variable; always fetches
 * the latest value from memory.
 */

class Example {
    volatile boolean flag = true;
}