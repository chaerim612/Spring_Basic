package kr.co.softsoldesk.bean;

public class SoldeskTV implements TV{
	public SoldeskTV() {
		System.out.println("==>SolDeskTV 객체생성");
	}

	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SolDeskTV --- 전원을 켠다");
	}

	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SolDeskTV --- 전원을 끈다");
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("SolDeskTV --- 볼륨 업");
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("SolDeskTV --- 볼륨 다운");
	}

	
}
