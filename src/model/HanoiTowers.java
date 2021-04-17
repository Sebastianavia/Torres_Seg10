package model;

public class HanoiTowers {
	private int init;
	private int sec;
	private int ter;

	public HanoiTowers() {
		init=0;
		sec=0;
		ter=0;
	}
	public void hanoiTowers(int d) {
		hanoiTowers(d,"A","B","C");
	}
	
	public void setTowers(int d) {
		init=d;
		sec=0;
		ter=0;
	}
	
	private void hanoiTowers(int d, String o, String a, String des) {
			
		if(d==1){	
			hanoiTowers(o,des);
			System.out.println(init+" "+sec+" "+ter);
		}else{		
			hanoiTowers(d-1,o,des,a);
			hanoiTowers(o,des);
			System.out.println(init+" "+sec+" "+ter);
			hanoiTowers(d-1,a,o,des);
		}
	}
	
	private void hanoiTowers(String o, String des) {
		switch(o) {
		case "A":
			init--;
		break;
		case "B":
			sec--;
		break;	
		case "C":
			ter--;
		break;
		}
		switch(des) {
		case "A":
			init++;
		break;
		case "B":
			sec++;
		break;
		case "C":
			ter++;
		break;
		}
	}
}