public class findlargestnumberamongthreenumbersusingnestedif{
   public static void main(String[] args) {

      int num1 = 10, num2 = 20, num3 = 7;
        
      if(num1 >= num2) {
			
	  if(num1 >= num3)
		/* This will only execute if conditions given in both
		 * the if blocks are true, which means num1 is greater
		 * than num2 and num3
		 */
		System.out.println(num1+" is the largest Number");
	  else
	        /* This will only execute if the condition in outer if
		 * is true and condition in inner if is false. which
		 * means num1 is grater than num2 but less than num3.
		 * which means num3 is the largest
		 */
		System.out.println(num3+" is the largest Number");
      } 
      else {
			
	  if(num2 >= num3)
		/* This will execute if the condition in outer if is false
		 * and inner if is true which means num3 is greater than num1
		 * but num2 is greater than num3. That means num2 is largest
		 */
		System.out.println(num2+" is the largest Number");
	  else
		/* This will execute if the condition in outer if is false
		 * and inner if is false which means num3 is greater than num1
		 * and num2. That means num3 is largest
		 */
		System.out.println(num3+" is the largest Number");
      }
   }
}