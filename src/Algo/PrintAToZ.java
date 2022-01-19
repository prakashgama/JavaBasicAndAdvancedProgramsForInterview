package Algo;
class PrintAToZ
{
 
    public static void main(String[] args)
    {
        // Declare the variables
        char i;
 
        // Display the alphabets
        System.out.printf("The Alphabets from A to Z are: \n");
 
        // Traverse each character
        // with the help of for loop
        for (i = 'A'; i <= 'Z'; i++)
        {
 
            // Print the alphabet
            System.out.printf("%c ", i);
        }
 
    }
}