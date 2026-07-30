/*
 * i. Prevents a variable from being serialized.
 * ii. Means while storing an object in afile, if we make a variable ransient,
 * it will not store that value in life.
 * iii. we can make sensitive data transient.
 */
class Test implements java.io.Serializable {
    transient int tempt; // will not be serialized
}