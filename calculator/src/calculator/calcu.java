package calculator;
import java.util.Scanner;


public class calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num1,num2;
double ans;
char op;
Scanner reader = new Scanner(System.in);
System.out.println("\nenter two num :");

num1 = reader.nextDouble();
num2 = reader.nextDouble();
System.out.println("\nenter an operator :");
op = reader.next().charAt(0);
switch(op) {
case '+' : ans=num1+num2;
break;
case '-' : ans=num1-num2;
break;
case '*' : ans=num1*num2;
break;
case '/' : ans=num1/num2;
break;
default:System.out.println("error");
return;
}
System.out.println("\nresult is:\n");
System.out.println(num1 + " " + op + " " + num2 + "="+ ans);

	}

}
