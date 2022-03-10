package sljavaproject;

import java.util.Scanner;

public class CalculatorDev {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		System.out.println("Enter num1:");
		System.out.println("Enter num2:");
		Scanner input=new Scanner(System.in);
		num1=input.nextInt();
		num2=input.nextInt();
		String operator = null;
		System.out.println("Enter operator");
		operator=input.next();
		if(operator.equals("+")) {
			System.out.println("Result:"+ (num1+num2));
		}
		if(operator.equals("-")) {
			System.out.println("Result:"+ (num1-num2));
		}
		if(operator.equals("/")) {
			System.out.println("Result"+ (num1/num2));
		}
		if(operator.equals("*")) {
			System.out.println("Result:"+ (num1*num2));
			
		}
		}
	}

