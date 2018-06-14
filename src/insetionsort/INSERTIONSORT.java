package insetionsort;

import java.util.Scanner;

public class INSERTIONSORT {
	int n;
	int[] k;
	Scanner in;
	
	public INSERTIONSORT() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INSERTIONSORT insert = new INSERTIONSORT();
		insert.input();
		insert.caculate();

	}
	
	public void input() {
		in = new Scanner(System.in);
		n = in.nextInt();
		k = new int[n];
		for(int i = 0; i < n; i++) {
			k[i] = in.nextInt();
		}
	}
	
	public void caculate() {
		for(int i = 1; i < n; i++) {
			int tmp = k[i];
			int j = i - 1;
			while(j >= 0 && tmp < k[j]) {
				k[j + 1] = k[j];
				j--;
			}
			k[j + 1] = tmp;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(k[i] + " ");
		}
	}

}
