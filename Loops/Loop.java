1)/*class Loop
{
public static void main(String[] args) 
{
 for (int i = 0; i < 10; i++) 
{
     System.out.println("Bright It Career");
}
}
}
Output:
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career
Bright It Career*/

2)/*class Loop
{
public static void main(String[] args)
{
        int i = 1;
        while (i <= 20) 
{
            System.out.println(i);
            i++;
        }
    }
}
Output:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20*/


3)/*import java.util.Scanner;
class Loop
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);*/
/*int a=s.nextInt();
int target=a;
for(int i=0;i<=a;i++)
{
if(i==target)
{
System.out.println(i+"is equal to"+target);
}
else
{
System.out.println(i+"is not equal to"+target);
}
}
}
}
Output:
Enter value:
4
0is not equal to4
1is not equal to4
2is not equal to4
3is not equal to4
4is equal to4*/

4)/*System.out.println("even Numbers:");
for(int i=0;i<=20;i++)
{
if(i%2==0)
{
System.out.println(i+" ");
}
}
 System.out.println();
        System.out.println("Odd numbers :");
        for (int i=0;i<=20;i++)
 {
            if (i % 2 != 0) 
{
                System.out.print(i + " ");
            }
        }
}
}
Output:
Enter value:
even Numbers:
0
2
4
6
8
10
12
14
16
18
20

Odd numbers :
1 3 5 7 9 11 13 15 17 19*/

5)/*       System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = s.nextInt();
        int[] numbers = {num1, num2, num3};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
       {
            if (numbers[i] > largest)
       {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
}
}
Output:
Enter the first number: 16
Enter the second number: 53
Enter the third number: 49
The largest number is: 53*/

6)/*int i = 10;
while (i <= 100)
{
if (i % 2 == 0)
{
System.out.println(i);
}
i++;
}
}
}
Output:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/

7)/*int i = 1;
        do {
            System.out.println(i); 
            i++; 
        } while (i <= 10);
    }
}
Output:
1
2
3
4
5
6
7
8
9
10*/


  8)/*      System.out.print("Enter a number: ");
        int num = s.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
}
}
Output:
Enter a number: 119
119 is not an Armstrong number.*/

  9)/*    System.out.print("Enter a number: ");
        int num = s.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        boolean isPrime = true;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
}
}
Output:
Enter a number: 4
4 is not a prime number.*/

 10)/*     System.out.print("Enter a number: ");
        int num = s.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        int remainder;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
}
}
Output:
Enter a number: 14
14 is not a palindrome.*/


11)/*System.out.print("Enter a number: ");
int num = s.nextInt();
switch (num % 2)
{
case 0:
System.out.println(num + " is EVEN.");
break;
case 1:
System.out.println(num + " is ODD.");
break;
default:
System.out.println("Invalid input.");
}
}
}
Output:
Enter a number: 2
2 is EVEN.*/


12)/*System.out.print("Enter m or f: ");
char ch = s.next().charAt(0);
switch (ch)
{
case 'm':
System.out.println("Male");
break;
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Invalid input");
}
}
}
Output:
Enter m or f: m
Male*/

/*class Loop{
public static void main(String[] args)
{
int a = 10;
int b = 20;
int c = 30;
if (a > b && a > c)
{
System.out.println("Largest number is: " + a);
} else if (b > a && b > c)
{
System.out.println("Largest number is: " + b);
} else {
System.out.println("Largest number is: " + c);
}
}
}
Output:
Largest number is: 30*/