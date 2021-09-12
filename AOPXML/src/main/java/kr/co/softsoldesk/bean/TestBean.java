package kr.co.softsoldesk.bean;

public class TestBean {
	
	/*
	 * public void method1() { System.out.println("method1 호출"); }
	 */
	/*public int method1(int a) {
		//System.out.println("method1 호출"+a);
		return a;
	}*/
	
	//ERROR 코드 (afterReturing이 안돼야 함)
	public int method1() {
		System.out.println("method1 호출");
		int a1=10/0;
		return 100;
	}
}
