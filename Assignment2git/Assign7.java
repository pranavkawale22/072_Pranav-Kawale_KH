import java.util.Scanner;
class Assign7 
{

public static void main(String agrs[]){

Scanner sc = new Scanner(System.in);

System.out.println("Input a number");

int i = sc.nextInt();
for (int j = 1;j <= 10;j++)
{

System.out.println( i + " * " + j + " = " + i*j );


}

}
}