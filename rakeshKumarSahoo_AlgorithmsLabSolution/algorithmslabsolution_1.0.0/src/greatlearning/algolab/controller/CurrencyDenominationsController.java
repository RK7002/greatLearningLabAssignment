package greatlearning.algolab.controller;

import greatlearning.algolab.driver.AlgoLabDriver;

public class CurrencyDenominationsController {
	
	public void currencyDenominationsProccesser(int[] denominationsArray,int targetAmount) {
		//Sorting The denominationsArray in descending way.
		int amount=targetAmount;
		new AlgoLabDriver().mergSortImplementor(denominationsArray,0,denominationsArray.length-1);
	
		int noteCounterArr[]=new int[denominationsArray.length];
		try {
			for(int i=0;i<denominationsArray.length;i++) {
				if(targetAmount>=denominationsArray[i]) {
					noteCounterArr[i]=targetAmount/denominationsArray[i];
					targetAmount-=(denominationsArray[i]*noteCounterArr[i]);
				}
			}
			if(targetAmount>0) {
				System.out.println("\nExact Target Amount $"+amount+" can not be given with the highest denomination available currently.");
				
				// The Below commented part is, how the traveler can manage the situation where he is unable to pay the exact target amount.
				// He can add the lowest currency available with the rest amount for which he didn't have the denominations. 
				
			/*	int lowestDenomination=denominationsArray[denominationsArray.length-1];
				int lowAmountAvailable=0;
				for (int i = 0; i < noteCounterArr.length; i++) {
					lowAmountAvailable+=denominationsArray[i]*noteCounterArr[i];
				}
				int shortageAmount=amount-lowAmountAvailable;
				int newAmount=lowAmountAvailable+lowestDenomination;
				
				System.out.println("\nYour Target Amount is: $"+amount
								   +"\nAmount Shortage From Your Target Amount is: $"+shortageAmount
								   +"\nYou Can Add the lowest denomination from your available currency i.e. (+$"+lowestDenomination+")"
								   +"\nIn order to Pay A Close Higher Denomination, Now The Updated Target Amount is: "
								   	+" [($"+amount+" - $"+shortageAmount+") + $"+lowestDenomination+"] i.e. $"+newAmount);
				
				System.out.println("Now Your payment approach in order to give min. no of notes for $"+newAmount+" will be: ");
				noteCounterArr[noteCounterArr.length-1]=1;
				printDenomination(denominationsArray,noteCounterArr);
			*/
			}else {
				System.out.println("\nYour payment approach in order to give min no of notes will be: ");
				printDenomination(denominationsArray,noteCounterArr);
			}
		} catch (Exception e) {
			System.out.println("\n"+e+" :: '0' currency denomination is not allowed.");
		}	
	}
	void printDenomination(int[] denominationsArray,int[] noteCounterArr) {
		for (int i = 0; i < denominationsArray.length; i++) {
			if (noteCounterArr[i] != 0) {
				System.out.println(denominationsArray[i] + ":" + noteCounterArr[i]);
			}
		}
	}
}