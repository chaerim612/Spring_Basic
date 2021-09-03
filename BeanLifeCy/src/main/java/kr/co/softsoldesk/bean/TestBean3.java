package kr.co.softsoldesk.bean;

public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	
	public void bean1_init() {
		System.out.println("testbean3의 init 메서드");
	}
	
	public void bean1_destroy() {
		System.out.println("testbean3의 destroy메서드");
	}
	
	public void default_init() {
		System.out.println("testbean3의 init 메서드");
	}
	
	public void default_destroy() {
		System.out.println("testbean3의 destroy메서드");
	}
}
