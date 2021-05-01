import java.util.Scanner;

public class Assignment_Part3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int number, key = 0, i, counter = 0, result;
        double value, result1;
        char[] array,array1;
        char character, character1, option, select, temp;
        String input, input1, input2, input3;
        
        do
        {
            System.out.println("Java Assignment Part 3 Questions Set");
            System.out.println("-------------------------------------");
            System.out.println("32. Write a program to remove the 2nd letter from a string.");
            System.out.println("33. Write program to add 0th letter in the beginning of a string.");
            System.out.println("34. Write program to exchange first two letters in string.");
            System.out.println("35. Write a program to exchange 4th and 10th letter in a string.");
            System.out.println("36. Write program to insert a letter between 1st and 2nd letter.");
            System.out.println("37. Write a program, which reads a string and finds string after the first x.Let the input string is pwsxtpbcderxrtxgt then output is tpbcderxrtxgt.");
            System.out.println("38. Write program to replace first x by y.");
            System.out.println("39. Write program to output the location of second x.");
            System.out.println("40. Write program to print the string between 1st and 2nd x.");
            System.out.println("41. Write program to find string before 2nd x.");
            System.out.println("42. Write program to delete the string between 1st and 2nd x.");
            System.out.println("43. Write a program to exchange the string between 1st and 2nd x, with the string before 1st x.");
            System.out.println("44. Write program to exchange neighbours of first x.");
            System.out.println("45. Write program to find 2nd location of 0th letter.");
            System.out.println("46. Write program, which will delete 1st y immediately after 1st x.");
            System.out.println("47. Write program to exchange neighbours of first x.");
            System.out.println("48. Write program to replace first occurrence of right neighbor of 2nd x by left neighbor of 1st x.");
            System.out.println("49.Write program, which reads a string. Let x and y be respectively left and right neighbours of the second occurrence of the 0th letter.Find the substring between first occurrence of y and(first occurrence of x after first occurrence of y).");
            System.out.println("50. Read two strings.Print lexicographically bigger string first and smaller later.");
            System.out.println("51. Read two string. Print 1 if first string is bigger, 2 if second string is bigger, 0 if both are same.");
            System.out.println("52. Read three strings.Print 1 if first string is biggest, 2 if second string is biggest, 3 if 3rd string is biggest, 0 if all are same, -1 if 1st and 2nd string are biggest, -2 if 2nd and 3rd string are biggest, -3 if 1st and 3rd string are biggest.");
            System.out.println("53. Write program to print second word.");
            System.out.println("54. Write program to delete second word.");
            System.out.println("55. Write program to exchange first and second word.");
            System.out.println("56. Write program to exchange first letters of first two words.");
            System.out.println("57. Write program to exchange last letters of first two words.");
            System.out.println("58. Write program to find the location of first letter in second word.");
            System.out.println("59. Write program to find location of first letter of first word in second word.");
            System.out.println("60. Write program to which contains a function square() such that square(3) returns 9, square(0.2) returns 0.04.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ");
            System.out.print("Please choose any of the above to proceed > ");
            int choose = sc.nextInt();

            switch (choose)
            {
                case 32:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    String removeSecond = input.substring(0, 1) + input.substring(2);
                    System.out.println("The string after removing second letter from it is > " + removeSecond);
                    break;
                case 33:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter the letter you want to add at the 0th position > ");
                    char letter = sc.next().charAt(0);
                    String addZero = letter + input.substring(0);
                    System.out.println("The string after adding a letter at 0th position is > " + addZero) ;
                    break;
                case 34:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    array = input.toCharArray();
                    for (i = 0; i < 1; i++)
                    {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                    input = new String(array);
                    System.out.println("The string after exchanging 1st and 2nd letter is > "+input);
                    break;
                case 35:
                    break;
                case 36:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter the character/letter you want to insert between 1st and 2nd letter > ");
                    character = sc.next().charAt(0);
                    input1 = input.substring(0, 1) + character + input.substring(1);
                    System.out.println("The string after inserting "+character+" between 1st and 2nd letter is "+input1);
                    break;
                case 37:
                	System.out.println("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter the character/letter after which you want to show the string > ");
                    character = sc.next().charAt(0);
                    for (i = 0; i < input.length(); i++)
                    {
                        if(input.charAt(i) == character)
                        {
                            key = i;
                            break;
                        }
                    }
                    input1 = input.substring(key+1);
                    System.out.println("The string after "+character+" is "+input1);
                    break;
                case 38:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter the character/letter you want to replace/exchange > ");
                    character = sc.next().charAt(0);
                    System.out.print("Enter the character/letter to be replaced in the string > ");
                    character1 = sc.next().charAt(0);
                    input1 = input.replace(character, character1);
                    System.out.println(input1);
                    break;
                case 39:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter the character/letter whose location of its 2nd occurence in a string is to be shown > ");
                    character = sc.next().charAt(0);
                    for (i = 0; i < input.length(); i++)
                    {
                        if (input.charAt(i) == character)
                        {
                            key = i;
                        }
                    }
                    input1 = input.substring(key);
                    array1 = input1.toCharArray();
                    i = 0;
                    while (array1[i] != character)
                    {
                        counter += 1;
                        i++;
                    }
                    System.out.println(counter + 1);
                    break;
                case 40:
                    break;
                case 41:
                    break;
                case 42:
                    break;
                case 43:
                    break;
                case 44:
                    break;
                case 45:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    character = input.charAt(0);
                    input1 = input.substring(1);
                    i = 0;
                    while(input1.charAt(i) != character)
                    {
                        counter += 1;
                        i++;
                    }
                    System.out.println(counter+1);
                    break;
                case 46:
                    break;
                case 47:
                    break;
                case 48:
                    break;
                case 49:
                    break;
                case 50:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter another String > ");
                    input1 = sc.nextLine();
                    if (input.length() > input1.length())
                    {
                    	System.out.println("First string is bigger.");
                    	System.out.println(input);
                    	System.out.println(input1);
                    }
                    if (input.length() < input1.length())
                    {
                    	System.out.println("Second string is bigger.");
                    	System.out.println(input1);
                    	System.out.println(input);
                    }
                    if (input.length() == input1.length())
                    {
                    	System.out.println("Both the strings are equal.");
                    	System.out.println(input+" "+input1);
                    }
                    break;
                case 51:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter another String > ");
                    input1 = sc.nextLine();
                    if(input.length() > input1.length())
                    {
                    	System.out.println("First string is bigger.");
                    	System.out.println("1");
                    }
                    if (input.length() < input1.length())
                    {
                    	System.out.println("Second string is bigger.");
                    	System.out.println("2");
                    }
                    if (input.length() == input1.length())
                    {
                    	System.out.println("Both the strings are equal.");
                    	System.out.println("0");
                    }
                    break;
                case 52:
                	System.out.print("Enter a String > ");
                    input = sc.nextLine();
                    System.out.print("Enter second String > ");
                    input1 = sc.nextLine();
                    System.out.print("Enter third String > ");
                    input2 = sc.nextLine();
                    if ((input.length() > input1.length()) && (input.length() > input2.length()))
                    {
                    	System.out.println("First string is bigger.");
                    	System.out.println("1");
                    }
                    if ((input.length() < input1.length()) && (input2.length() < input1.length()))
                    {
                    	System.out.println("Second string is bigger.");
                    	System.out.println("2");
                    }
                    if ((input.length() == input1.length()) && (input.length() == input2.length()) && (input1.length() == input2.length()))
                    {
                    	System.out.println("All the three strings are equal.");
                    	System.out.println("0");
                    }
                    if((input.length() > input2.length()) && (input1.length() > input2.length()))
                    {
                    	System.out.println("First and second string are bigger.");
                    	System.out.println("-1");
                    }
                    if ((input1.length() > input.length()) && (input2.length() > input.length()))
                    {
                    	System.out.println("Second and third string are bigger.");
                    	System.out.println("-2");
                    }
                    if ((input.length() > input1.length()) && (input2.length() > input1.length()))
                    {
                    	System.out.println("First and third string are bigger.");
                    	System.out.println("-3");
                    }
                    break;
                case 53:
                	input = "Ram Prasad Dey";
                    input = input.trim();
                    int index = input.indexOf('P');
                    input1 = input.substring(0, index);
                    System.out.println("First Name of " + input + " is " + input1);
                    int index1 = input.indexOf('D');
                    input2 = input.substring(4, index1);
                    System.out.println("Second Name of " + input + " is " + input2);
                    break;
                case 54:
                	
                    break;
                case 55:
                    input = "Ram Prasad Dey";
                    input1 = input.substring(0, 4);
                    System.out.println(input1);
                    input2 = input.substring(4, 7);
                    System.out.println(input2);
                    input3 = input.substring(11);
                    System.out.println(input3);
                    System.out.println("After exchanging 1st and 2nd word of " + input + " is " + (input2 + "" + input1 + "" + input3) + ".");
                    break;
                case 56:
                    input = "Ram Prasad Dey";
                    String empty = input;
                    array1 = input.toCharArray();
                    char temp1 = array1[0];
                    array1[0] = array1[4];
                    array1[4] = temp1;
                    input = new String(array1);
                    System.out.println("After exchanging first letters of first two words in " + empty + " is " + input);
                    break;
                case 57:
                    input = "Ram Prasad Dey";
                    String empty1 = input;
                    char[] array2 = input.toCharArray();
                    char temp2 = array2[2];
                    array2[2] = array2[9];
                    array2[9] = temp2;
                    input = new String(array2);
                    System.out.println("After exchanging last letters of first two words in " + empty1 + " is " + input);
                    break;
                case 58:
                    break;
                case 59:
                    break;
                case 60:
                	System.out.print("Will you enter an integer or a double value (i/d)?? ");
                    select = sc.next().charAt(0);
                    if(select=='i'||select=='I')
                    {
                    	System.out.print("Enter an integer > ");
                        number = sc.nextInt();
                        result = SquareI(number);
                        System.out.println("Square of " + number + " is > " + result);
                    }
                    else if(select == 'd' || select == 'D')
                    {
                    	System.out.print("Enter a double value > ");
                        value = sc.nextDouble();
                        result1 = SquareD(value);
                        System.out.println("Square of " + value + " is > " + result1);
                    }
                    break;
                default:
                	System.out.println("Wrong Input.");
                    break;
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Do you want to Continue ? (Y/N) ?");
            option = sc.next().charAt(0);
            sc.close();
        } while (option == 'y' || option == 'Y');
	}
	static int SquareI(int number)
    {
        return (number * number);
    }
    static double SquareD(double value)
    {
        return (value * value);
    }
}
