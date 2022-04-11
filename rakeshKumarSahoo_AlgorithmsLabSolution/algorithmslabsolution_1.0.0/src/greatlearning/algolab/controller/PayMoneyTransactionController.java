package greatlearning.algolab.controller;

import java.util.Scanner;

public class PayMoneyTransactionController {
	Scanner scanner=new Scanner(System.in);
	public void payMoneyProccesser(int[] transactionArray,int noOfTarget) {
		
		for(int i=1;i<=noOfTarget;i++) {
			System.out.println("\nEnter the value of target: ");
			int targetValue=scanner.nextInt();
			
			//Print The Target Achieve Details
			transactionExtractor(transactionArray,targetValue);
		}
	}
	private void transactionExtractor(int[] transactionArray, int targetValue) {
		boolean flag=false;
		int sum=0;
		for(int i=0;i<transactionArray.length;i++) {
			sum += transactionArray[i];
			if(sum >= targetValue) {
				System.out.println("Target achieved after "+(i+1)+" transactions");
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Given target is not achieved.");
		}
	}
}
