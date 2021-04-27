import java.util.*;

public class Assignment_Part1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int number, number1, key, result;
		char option;
        
        do {
        	System.out.println("Java Assignment Part 1 Questions Set");
        	System.out.println("-------------------------------------");
        	System.out.println("1. Write a program to print the kth digit of a given number from last.");
        	System.out.println("2. Write a program to print the first digit of a number.");
        	System.out.println("3. Write a program to print the second digit of a number.");
        	System.out.println("4. Write a program to print the sum of all the digits of a number.");
        	System.out.println("5. Write a program to find the sum of products of all consecutive digits of a number.");
        	System.out.println("6. Write a program which takes two numbers and find the sum of products of corresponding digits of both the numbers.");
        	System.out.println("7. Write a program to print the positional values of the digits of a given number.");
        	System.out.println("8. Write a program to find the sum of all the even digits of a number.");
        	System.out.println("9. Write a program to find the number of digits present in a number.");
        	System.out.println("10. Write a program to find the number of even digits present in a number.");
        	System.out.println("11. Write a program to find the last even digit in a given number.");
        	System.out.println("12. Write a program to print the digit immediately before the last even digit.");
        	System.out.println("13. Write a program to print the digit immediately after the last even digit of a given number.");
        	System.out.println("14. Write a program to print the last digit a number, which is multiple of 3.");
        	System.out.println("15. Write a program to print the second last even digit of a number.");
        	System.out.println("16. Write a program to read a number from user and split it after last odd digit. Input 3 times.");
        	System.out.println("17. Write a program which finds the sum of numbers formed by consecutive digits.");
        	System.out.println("18. Write a program to find the sum of numbers formed by exchanging consecutive digits.");
        	System.out.println("----------------------------------------------------------------------------------------------------------------------");
        	System.out.println(" ");
        	System.out.print("Please choose any of the above to proceed > ");
            int choose = sc.nextInt();
            
            switch (choose)
            {
                case 1:
                	System.out.print("Enter the number > ");
                    number = sc.nextInt();
                    System.out.print("Enter the key/kth digit from last > ");
                    key = sc.nextInt();
                    result = KthDigitFromLast(number, key);
                    System.out.println(key + "th digit from last is " + result);
                    break;
                case 2:
                	System.out.print("Enter the number > ");
                    number = sc.nextInt();
                    result = FirstDigit(number);
                    System.out.println("The first digit of " + number + " is " + result);
                    break;
                case 3:
                	System.out.print("Enter the number > ");
                    number = sc.nextInt();
                    result = SecondDigit(number);
                    if(result == -1)
                    	System.out.println("There can't be a 2nd digit in a single digit number");
                    else
                    	System.out.println("The second digit of " + number + " is " + result);
                    break;
                case 4:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SumOfDigits(number);
                    System.out.println("The sum of all the digits of "+number+" is "+result);
                    break;
                case 5:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SumOfProducts(number);
                    System.out.println("The sum of products of all the digits of " + number + " is " + result);
                    break;
                case 6:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    System.out.print("Enter another number > ");
                    number1 = sc.nextInt();
                    result = SumOfProductsOfTwoNumbers(number, number1);
                    System.out.println("The sum of products of all the corresponding digits of " + number + " and "+number1+" is " + result);
                    break;
                case 7:
                    break;
                case 8:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SumOfEvenDigits(number);
                    System.out.println(result);
                    break;
                case 9:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = CountOfDigits(number);
                    System.out.println("So there is total no. of "+result+" digits in "+number);
                    break;
                case 10:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = CountOfEvenDigits(number);
                    System.out.println("So there is total no. of " + result + " even digits in " + number);
                    break;
                case 11:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = LastEvenDigit(number);
                    System.out.println("The last even digit in "+number+" is "+result);
                    break;
                case 12:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = BeforeLastEvenDigit(number);
                    System.out.println("The immediate no. before last even digit in " + number + " is " + result);
                    break;
                case 13:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = AfterLastEvenDigit(number);
                    System.out.println("The immediate no. after last even digit in " + number + " is " + result);
                    break;
                case 14:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = MultipleOfThree(number);
                    System.out.println("The last digit which is multiple of 3 in " + number + " is " + result);
                    break;
                case 15:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SecondLastEvenDigit(number);
                    System.out.println("The 2nd last even digit in " + number + " is " + result);
                    break;
                case 16:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    SplitAfterLastOdddigit(number);
                    break;
                case 17:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SumOfConsecutiveDigits(number);
                    System.out.println("The sum of numbers formed by consecutive digits of " + number + " is " + result);
                    break;
                case 18:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = SumOfExchangedConsecutiveDigits(number);
                    System.out.println("The sum of numbers formed by exchanging consecutive digits of " + number + " is " + result);
                    break;
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Do you want to Continue ? (Y/N) ? ");
            option = sc.next().charAt(0);
        } while (option=='y'|| option=='Y');
        
        sc.close();
	}
	static int KthDigitFromLast(int number, int key)
    {
        int remainingDigits = 0;
        int remainder;
        remainingDigits = number / 10;
        for (int i = 1; i < (key - 1); i++)
        {
            remainingDigits = remainingDigits / 10;
        }
        remainder = remainingDigits % 10;
        return remainder;
    }
    static int FirstDigit(int number)
    {
        while (number >= 10)
        {
            number = number / 10;
        }
        return number;
    }
    static int SecondDigit(int number)
    {
        if(number >= 10 && number <= 99)
        	return (number % 10);
        else if(number <= 9)
        	return -1;
        else {
        	while (number >= 100)
            	{
                	number = number / 10;
            	}
            	return (number % 10);
        }
    }
    static int SumOfDigits(int number)
    {
        int remainder;
        int sum = 0;
        while (number != 0)
        {
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        return sum;
    }
    static int SumOfEvenDigits(int number)
    {
        int sum = 0;
        int remainder;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 2 == 0)
                sum = sum + remainder;
            number = number / 10;
        }
        return sum;
    }
    static int CountOfDigits(int number)
    {
        int counter = 0;
        int remainder;
        while (number != 0)
        {
            remainder = number % 10;
            counter++;
            number = number / 10;
        }
        return counter;
    }
    static int CountOfEvenDigits(int number)
    {
        int remainder;
        int counter = 0;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 2 == 0)
                counter++;
            number = number / 10;
        }
        return counter;
    }
    static int LastEvenDigit(int number)
    {
        int remainder = 0;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 2 == 0)
            {
                number = number % 10;
                break;
            }
            number = number / 10;
        }
        return remainder;
    }
    static int BeforeLastEvenDigit(int number)
    {
        int remainder;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 2 == 0)
            {
                number = number / 10;
                number = number % 10;
                break;
            }
            number = number / 10;
        }
        return number;
    }
    static int AfterLastEvenDigit(int number)
    {
        int remainder;
        int temp = 0;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 2 == 0)
            {
                number = number % 10;
                break;
            }
            temp = remainder;
            number = number / 10;
        }
        return temp;
    }
    static int MultipleOfThree(int number)
    {
        int remainder = 0;
        while (number != 0)
        {
            remainder = number % 10;
            if (remainder % 3 == 0)
            {
                number = number % 10;
                break;
            }
            number = number / 10;
        }
        return remainder;
    }
    static int SecondLastEvenDigit(int number)
    {
    	int remainder, sum = 0;
    	while(number != 0)
    	{
    		remainder = number % 10;
    		if(remainder % 2 == 0)
    			sum = (sum * 10) + remainder;
    		number /= 10;
    	}
    	// System.out.println(sum);
    	while(sum != 0) {
    		remainder = sum / 10;
    		if(remainder % 2 == 0)
    		{
    			number = sum / 10;
                if (remainder % 2 == 0)
                {
                    number = sum / 10;
                    break;
                }
    		}
    	}
		return (number % 10);
    }
    static int SumOfConsecutiveDigits(int number)
    {
        int remainder;
        int sum = 0;
        while (number >= 10)
        {
            remainder = number % 100;
            sum = sum + remainder;
            number = number / 10;
        }
        return sum;
    }
    static int SumOfExchangedConsecutiveDigits(int number)
    {
        int sum = 0;
        int reverse = 0;
        int remainder, remainder1;
        while (number != 0)
        {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        while (reverse >= 10)
        {
            remainder1 = reverse % 100;
            sum = sum + remainder1;
            reverse = reverse / 10;
        }
        return sum;
    }
    static int SumOfProducts(int number)
    {
        int sum = 0;
        int product = 1;
        int temp;
        int remainder, remainder1;

        temp = number;
        while(temp!=0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            remainder1 = temp % 10;
            product = remainder * remainder1;
            sum = sum + product;
        }
        return sum;
    }
    static int SumOfProductsOfTwoNumbers(int number, int number1)
    {
        int sum = 0;
        int temp1, temp2;
        int product = 1;
        int remainder, remainder1;

        temp1 = number;
        temp2 = number1;
        while(temp1!=0 && temp2!=0)
        {
            remainder = temp1 % 10;
            temp1 = temp1 / 10;
            remainder1 = temp2 % 10;
            temp2 = temp2 / 10;
            product = remainder * remainder1;
            sum = sum + product;
        }
        return sum;
    }
    static void SplitAfterLastOdddigit(int number) 
    {
    	int remainder, temp1 = 0, temp2 = 0, sum = 0, lastOddDigit = 0;
    	while(number != 0)
    	{
    		remainder = number % 10;
    		if(remainder % 2 != 0)
    		{
    			lastOddDigit = remainder;
    			temp2 = (temp2 * 10) + remainder;
    			temp1 = number / 10;
    			break;
    		}
    		temp2 = (temp2 * 10) + remainder;
    		number /= 10;
    	}
    	while(temp2 !=0)
    	{
    		remainder = temp2 % 10;
    		sum = (sum * 10) + remainder;
    		temp2 /= 10;
    	}
    	System.out.println("The two numbers after spliting "+ number +" after last odd digit "+ lastOddDigit +" are "+ temp1 +" and "+ sum);
    }
}
