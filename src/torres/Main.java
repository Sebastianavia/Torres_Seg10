package torres;


import java.util.Scanner;

import model.HanoiTowers;


public class Main {
	private static Scanner sc =new Scanner(System.in);
	private static HanoiTowers �;

	public static void main(String[] args) {
		� = new HanoiTowers();
		start();
	}
	public static void start() {
		int punt = sc.nextInt();
		sc.nextLine();
		int[] disks = new int[punt];
		int k=0;
		while(k<punt){
			disks[k]=sc.nextInt();
			sc.nextLine();
			k++;			
		}
		for (int i=0;i<disks.length;i++) {
			
			System.out.println(disks[i]+" "+0+" "+0);
			�.setTowers(disks[i]);
			�.hanoiTowers(disks[i]);	
			System.out.println("");

		}
	}
}



