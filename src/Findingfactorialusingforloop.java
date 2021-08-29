public class Findingfactorialusingforloop {

    public static void main(String[] args) {

    	//We will find the factorial of this number
        int number = 5;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}