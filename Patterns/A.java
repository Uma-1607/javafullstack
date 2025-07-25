/*import java.util.scanner;
class A
{
public static void main(String []args)
{
int i,j;
for(i=0;i<=6;i++){
for(j=0;j<=6;j++){
System.out.print("*");
}
System.out.println();
}
}
}
Output:
*******
*******
*******
*******
*******
*******
********/


/*class A
{
public static void main(String []args)
{
for( int i=1;i<6;i++)
{
for (int j=1;j<6;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}
Output:
11111
22222
33333
44444
55555*/

/*class A
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}
Output:
12345
12345
12345
12345
12345*/

/*class A
{
public static void main(String[] args){
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(n++ + " ");
}
System.out.println();
}
}
}Output:
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25*/


/*class A
{
public static void main(String []args){
int n=1;
for(int i=1;i<=5;i++){
for(int j=0;j<5;j++)
{
System.out.print(n + " ");
n=n+2;
}
System.out.println();
}
}
}
Output:
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49*/

/*class A
{
public static void main(String []args){
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print((j%2==0)?"1":"0");
}
System.out.println();
}
}
}
Output:
10101
10101
10101
10101
10101*/

/*class A
{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*" +" ");
}
System.out.println();
}
}
}
Output:
     *
   * *
  * * *
 * * * *
* * * * **/

/*class A{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}
Output:
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10*/

/*class A
{
public static void main(String[]args){
int n=1;
for(int i=1;i<=5;i++)
{
System.out.println();
for(int j=1;j<=5;j++)
{
System.out.print(n +" ");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}
Output:
1 2 3 4 5

6 7 8 9 1

2 3 4 5 6

7 8 9 1 2

3 4 5 6 7*/

/*class A{
public static void main(String[]args){
String str="INDIA";
for(int i=1;i<=str.length();i++){
System.out.println(str.substring(0,i));
}
}
}
Output:
I
IN
IND
INDI
INDIA*/

/*class A{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
Output:
    *
   ***
  *****
 *******
**********/

/*class A {
    public static void main(String[] args) {
        int n = 4;
for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Output:
 *
  * * *
 * * * * *
* * * * * * *
 * * * * *
  * * *
   **/

/*class A {
    public static void main(String[] args) {
        int n = 4;
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
           if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
             System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
Output:
 *
  * *
 *   *
*     *
 *   *
  * *
   **/

/*class A{
public static void main(String[] args) {
int n = 5;
 for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
 if (i == 1 || i == n || j == 1 || j == n)
System.out.print("* ");
 else
 System.out.print(" ");
}
System.out.println();
}
}
}
Output:
* * * * *
*    *
*    *
*    *
* * * * **/

