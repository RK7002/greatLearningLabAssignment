package greatlearning.algolab.service;

import java.util.Scanner;
import greatlearning.algolab.controller.PayMoneyTransactionController;
import greatlearning.algolab.driver.AlgoLabDriver;

public class PayMoneyTransactionService {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int transactionArraySize=scanner.nextInt();
		
		int transactionArray[]=new int[transactionArraySize];
		
		//  Take the Array Input
		System.out.println("Enter the values of array: ");
		transactionArray=new AlgoLabDriver().takeArrayInput(transactionArray);
		
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int noOfTarget=scanner.nextInt();
		
		//Now The Rest Process i.e. target details printing will be done by it's respective controller.
		new PayMoneyTransactionController().payMoneyProccesser(transactionArray,noOfTarget);
		
		scanner.close();
	}
}
