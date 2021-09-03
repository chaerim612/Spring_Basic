package kr.co.softsoldesk.bean;

public class TestBean1 {
	public TestBean1() {
		System.out.println("testbean1의 생성자");
	}
	
	public void bean1_init() {
		System.out.println("testbean1의 init 메서드");
	}
	
	public void bean1_destroy() {
		System.out.println("testbean1의 destroy메서드");
	}
}
