/*
8. Strictfp Modifier 
• Description: The strictfp modifier ensures consistent floating-point calculations 
across platforms. 
• Calculations strictly conform to IEEE 754, ensuring consistent results. 
*/

strictfp class Calculator{
    double add(double a, double b){
        return a+b;
    }
}