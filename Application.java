// Java program to convert binary to octal
class GFG {
    // method to convert binary to decimal
    int binaryToDecimal(long binary)
    {
        // variable to store the decimal number
        int decimalNumber = 0, i = 0;
 
        // loop to extract the digits of the
        // binary number
        while (binary > 0) {
 
            // multiplying each digit of binary
            // with increasing powers of 2 towards
            // left
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
 
            // dividing the binary by 10
            // to remove the last digit
            binary /= 10;
        }
 
        // returning the converted decimal number
        return decimalNumber;
    }
 
    // function to convert decimal to octal
    int decimalToOctal(long binary)
    {
        // variable to store the decimal number
        // returned by the binaryToDecimal()
        int decimalNumber = binaryToDecimal(binary);
 
        // using the toOctalString() to convert
        // Integer to String of Octal Number
        String octalString
            = Integer.toOctalString(decimalNumber);
 
        // converting the String of octal number
        // to an Integer
        int octalNumber = Integer.parseInt(octalString);
 
        // returning the octal number
        return octalNumber;
    }
	#festure203 changes by Developer Ana august2024 for citiBank ApplicationExceptionpublic class MergeTwoArrays2 {
    public static void main(String[] args)
    {

        // first array
        int a[] = { 30, 25, 40 };
        // second array
        int b[] = { 45, 50, 55, 60, 65 };

        // determining length of first array
        int a1 = a.length;
        // determining length of second array
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i = i + 1) {
            // Storing the elements in 
            // the resultant array
            c[i] = a[i];
        }

        // Loop to concat the elements of second 
        // array into resultant array
        for (int i = 0; i < b1; i = i + 1) {

            // Storing the elements in the 
            // resultant array
            c[a1 + i] = b[i];
        }

        // Loop to print the elements of 
        // resultant array after merging
        for (int i = 0; i < c1; i = i + 1) {
            
            // print the element
            System.out.println(c[i]);
        }
    }
}

