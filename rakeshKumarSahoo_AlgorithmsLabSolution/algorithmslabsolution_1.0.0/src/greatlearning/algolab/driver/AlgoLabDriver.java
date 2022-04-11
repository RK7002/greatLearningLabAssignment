package greatlearning.algolab.driver;

import java.util.Scanner;

public class AlgoLabDriver {
	Scanner sc=new Scanner(System.in);
	
	// Method For Take Array Input
	public int[] takeArrayInput(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	
	//Merge Sort Function
	public void mergSortImplementor(int[] denominationsArray,int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergSortImplementor(denominationsArray,left,mid);
			mergSortImplementor(denominationsArray,mid+1,right);
			merge(denominationsArray,left,mid,right);
		}
	}

	private void merge(int[] denominationsArray, int left, int mid, int right) {
		int leftArrayLength=mid-left+1;
		int rightArrayLength=right-mid;
		
		int leftArr[]=new int[leftArrayLength];
		int rightArr[]=new int[rightArrayLength];
		
		for(int i=0;i<leftArrayLength;i++) {
			leftArr[i]=denominationsArray[left+i];
		}
		for(int i=0;i<rightArrayLength;i++) {
			rightArr[i]=denominationsArray[mid+1+i];
		}
		
		int i=0,j=0,k=left;
		while(i<leftArrayLength && j<rightArrayLength) {
			if(leftArr[i]>=rightArr[j]) {
				denominationsArray[k]=leftArr[i];
				i++;
			}else {
				denominationsArray[k]=rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArrayLength) {
			denominationsArray[k]=leftArr[i];
			i++;k++;
		}
		while(j<rightArrayLength) {
			denominationsArray[k]=rightArr[j];
			j++;k++;
		}
	}
	//Merge Sort End
}
