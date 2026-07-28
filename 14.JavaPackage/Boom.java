/*No need to import and export Boom class because of this is a root file so,
//we can access Boom class in anywhere without import and export */

//MyClass.java, Boom.java both files are existed in same Folder.

/* Owner.Java has ownername Now how to access it in 
 Myclass.Java which will have ChaiShop to extend it. 
 */

/* Owner class and variables should be public inorder 
    to access in Myclass.Java  */

// Using above diagram lets understand about packages. 

/* If a file does not have any package, then it will be 
    default package means. That folder itself is a 
    package. And it can’t be accessed from any other package.
*/

class Boom {
    int a = 2;
}