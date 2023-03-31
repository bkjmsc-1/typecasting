public class TypeCasting{
    public static void main(String[] args) {
        char a = 'A';
        int b = a;
        float c = a;   
        long d = a;
        double e = a;

    System.out.println("Implicit type casting");
    System.out.println("The value of the char variable a is : " + a);
    System.out.println("The value of the int b variable is: " + b);
    System.out.println("The value of the float c variable is: " + c);
    System.out.println("The value of the long d variable is: " + d);
    System.out.println("The value of the double d variable is: " + e);

    System.out.println("\n");

    System.out.println("Explicit type casting");    

        double x = 45.5;
        int y = (int)x;
        System.out.println("This is the value of x: " + x);
        System.out.println("This is the value of y: " + y);


    }
}