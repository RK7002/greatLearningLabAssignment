package greatlearning.algolab.service;

import java.util.Scanner;
import greatlearning.algolab.controller.CurrencyDenominationsController;
import greatlearning.algolab.driver.AlgoLabDriver;

public class CurrencyDenominationsService {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations : ");
		int  denominationsArraySize=scanner.nextInt();
		
		int denominationsArray[]=new int[denominationsArraySize];
		
		//  Take the Array Input
		System.out.println("Enter the currency denominations value: ");
		denominationsArray=new AlgoLabDriver().takeArrayInput(denominationsArray);
		
		System.out.println("Enter the amount you want to pay: ");
		int targetAmount=scanner.nextInt();
		
		//Now The Rest Process i.e. currency denominations counter printing will be done by it's respective controller.
		new CurrencyDenominationsController().currencyDenominationsProccesser(denominationsArray,targetAmount);
		
		scanner.close();
	}
}
