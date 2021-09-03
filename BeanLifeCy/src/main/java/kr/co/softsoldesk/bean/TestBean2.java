package kr.co.softsoldesk.bean;

public class TestBean2 {
	public TestBean2() {
		System.out.println("testbean2의 생성자");
	}
	
	public void default_init() {
		System.out.println("testbean2의 init 메서드");
	}
	
	public void default_destroy() {
		System.out.println("testbean2의 destroy메서드");
	}
}
