import java.util.*;

public class Assignment_Part2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int number, result;
        int row, column;
        char option;
        
        do
        {
            System.out.println("Java Assignment Part 2 Questions Set");
            System.out.println("-------------------------------------");
            System.out.println("19. Write a program to find the smallest number in an array.");
            System.out.println("20. Write a program to find the largest number in an array.");
            System.out.println("21. Write a program to print the no. of even numbers in an array.");
            System.out.println("22. Write a program to count the number of occurences of a given number in an array.");
            System.out.println("23. Write a program to check whether the number is a palindrome number or not.");
            System.out.println("24. Write a program to merge two arrays in a new array in ascending order.");
            System.out.println("25. Write a program to find the sum two 3x3 matrices.");
            System.out.println("26. Write a program to find the product of two 3x3 matrices.");
            System.out.println("27. Write a program to find the transpose of a given matrix.");
            System.out.println("28. Write a program to implement Binary search.");
            System.out.println("29. Write a program to implement Bubble sort.");
            System.out.println("30. Write a program to implement Selection sort.");
            System.out.println("31. Write a program to implement Insertion sort.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println(" ");
            System.out.print("Please choose any of the above to proceed > ");
            int choose = sc.nextInt();

            switch (choose)
            {
                case 19:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    result = SmallestNumber(number);
                    System.out.println("The smallest number is " + result);
                    break;
                case 20:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    result = LargestNumber(number);
                    System.out.println("The Largest number is " + result);
                    break;
                case 21:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    result = EvenCount(number);
                    System.out.println("Number of even numbers in the given array is " + result);
                    break;
                case 22:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    result = OccurrenceNumber(number);
                    System.out.println("The number has occurred "+result+" no. of times in the given array.");
                    break;
                case 23:
                	System.out.print("Enter a number > ");
                    number = sc.nextInt();
                    result = IsPalindrome(number);
                    if (result == 1)
                    	System.out.println(number + " is a palindrome number.");
                    else
                    	System.out.println(number + " is not a palindrome number.");
                    break;
                case 24:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                	number = sc.nextInt();
                	int[] array = new int[number];
                	System.out.println("Enter the elements into the array > ");
                    for (int i = 0; i < number; i++)
                    {
                        array[i] = sc.nextInt();
                    }
                	System.out.println("Given array >");
                	printArray(array);
                	sortM(array, 0, array.length - 1);
                	System.out.println("Sorted array >");
                	printArray(array);
                    break;
                case 25:
                    row = 3;
                    column = 3;
                    AddMatrix(row, column);
                    break;
                case 26:
                    row = 3;
                    column = 3;
                    MultiplyMatrix(row, column);
                    break;
                case 27:
                	System.out.print("Enter the no. of rows > ");
                    row = sc.nextInt();
                    System.out.print("Enter the no. of columns > ");
                    column = sc.nextInt();
                    TransposeMatrix(row, column);
                    break;
                case 28:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    result = BinarySearch(number);
                    if (result == 0)
                    	System.out.println("Number not found");
                    else
                    	System.out.println("Number found at location " + result);
                    break;
                case 29:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                    number = sc.nextInt();
                    BubbleSort(number);
                    break;
                case 30:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                	number = sc.nextInt();
                	array = new int[number];
                	System.out.println("Enter the elements into the array > ");
                    for (int i = 0; i < number; i++)
                    {
                        array[i] = sc.nextInt();
                    }
                	System.out.println("Given array >");
                	printArray(array);
                	sortS(array);
                	System.out.println("Sorted array >");
                	printArray(array);
                    break;
                case 31:
                	System.out.print("Enter the no. of elements you want to enter into array > ");
                	number = sc.nextInt();
                	array = new int[number];
                	System.out.println("Enter the elements into the array > ");
                    for (int i = 0; i < number; i++)
                    {
                        array[i] = sc.nextInt();
                    }
                	System.out.println("Given array >");
                	printArray(array);
                	sortI(array);
                	System.out.println("Sorted array >");
                	printArray(array);
                    break;
		default:
                	System.out.println("Wrong Input");
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Do you want to Continue ? (Y/N) ? ");
            option = sc.next().charAt(0);
        } while (option == 'y' || option == 'Y');
	}
	static int SmallestNumber(int number)
    {
        int minimum = 0;
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        minimum = array[0];
        for (int i = 0; i < number; i++)
        {
            if (minimum > array[i])
                minimum = array[i];
        }
        return minimum;
    }
    static int LargestNumber(int number)
    {
        int maximum = 0;
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        maximum = array[0];
        for (int i = 0; i < number; i++)
        {
            if (maximum < array[i])
                maximum = array[i];
        }
        return maximum;
    }
    static int EvenCount(int number)
    {
        int counter = 0;
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < number; i++)
        {
            if (array[i] % 2 == 0)
                counter++;
        }
        return counter;
    }
    static int OccurrenceNumber(int number)
    {
        int counter = 0;
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number you are looking for its no. of occurrence >");
        int key = sc.nextInt();
        for (int i = 0; i < number; i++)
        {
            if (key == array[i])
                counter++;
        }
        return counter;
    }
    static int IsPalindrome(int number)
    {
        int remainder;
        int reverse = 0;
        int temp = number;
        while (number != 0)
        {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        if (reverse == temp)
            return 1;
        else
            return 0;
    }
    static void sortM(int array[], int start, int end)
    {
        if (start < end) {
            // Find the middle point
            int mid = start + (end - start)/2;
 
            // Sort first and second halves
            sortM(array, start, mid);
            sortM(array, mid + 1, end);
 
            // Merge the sorted halves
            merge(array, start, mid, end);
        }
    }
    static void merge(int array[], int start, int mid, int end) 
    {
    	int subarr1 = mid - start + 1;
        int subarr2 = end - mid;

        int tempL[] = new int[subarr1];
        int tempR[] = new int[subarr2];

        for (int i = 0; i < subarr1; ++i)
            tempL[i] = array[i + start];
        for (int j = 0; j < subarr2; ++j)
            tempR[j] = array[mid + 1 + j];
 
        int i = 0, j = 0;

        int temp = start;
        while (i < subarr1 && j < subarr2) {
            if (tempL[i] <= tempR[j]) {
                array[temp] = tempL[i];
                i++;
            }
            else {
                array[temp] = tempR[j];
                j++;
            }
            temp++;
        }

        while (i < subarr1) {
            array[temp] = tempL[i];
            i++;
            temp++;
        }

        while (j < subarr2) {
            array[temp] = tempR[j];
            j++;
            temp++;
        }
    }
    static void AddMatrix(int row, int column)
    {
        int[][] arrayA = new int[row][column];
        int[][] arrayB = new int[row][column];
        int[][] arrayC = new int[row][column];

        System.out.println("Enter the elements into 1st matrix > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayA[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Enter the elements into 2nd matrix > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }
        System.out.println("The addition of two 3x3 matrices is > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
            	System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void MultiplyMatrix(int row, int column)
    {
        int[][] arrayA = new int[row][column];
        int[][] arrayB = new int[row][column];
        int[][] arrayC = new int[row][column];
        int sum = 0;

        System.out.println("Enter the elements into 1st matrix > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements into 2nd matrix > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                for (int k = 0; k < row; k++)
                {
                    sum = sum + (arrayA[i][j] * arrayB[i][j]);
                }
                arrayC[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("The multiplication of two 3x3 matrices is > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
            	System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void TransposeMatrix(int row, int column)
    {
        int[][] arrayA = new int[row][column];
        System.out.println("Enter the elements into the matrix > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                arrayA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A > ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
            	System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix A > ");
        for (int i = 0; i < column; i++)
        {
            for (int j = 0; j < row; j++)
            {
            	System.out.print(arrayA[j][i] + " ");
            }
            System.out.println();
        }
    }
    static int BinarySearch(int number)
    {
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Array > ");
        for (int i = 0; i < number; i++)
        {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the number you are searching for > ");
        int key = sc.nextInt();
        int minimum = 0;
        int mid = 0;
        int maximum = number - 1;
        while (minimum <= maximum)
        {
            mid = (minimum + maximum) / 2;
            if (array[mid] == key)
                break;
            else if (array[mid] > key)
                maximum = mid - 1;
            else
                minimum = mid + 1;
        }
        if (minimum <= maximum)
            return (mid + 1);
        else
            return 0;
    }
    static void BubbleSort(int number)
    {
        int temp = 0;
        int[] array = new int[number];
        System.out.println("Enter the elements into the array > ");
        for (int i = 0; i < number; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Array before sorting > ");
        for (int i = 0; i < number; i++)
        {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (number - 1); i++)
        {
            for (int j = 0; j < (number - i - 1); j++)
            {
                if (array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting > ");
        for (int i = 0; i < number; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void sortS(int array[])
    {
    	for (int i = 0; i < array.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
    static void sortI(int array[])
    {
    	for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    static void printArray(int array[])
    {
    	for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
