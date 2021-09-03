package kr.co.softsoldesk.bean;

public class SamsungTV implements TV {

	// 소니스피커, 가격
	private SonySpeaker SonySpeaker;
	private int price;

	public SamsungTV(SonySpeaker SonySpeaker,SonySpeaker SonySpeaker2) {
		this.price=SonySpeaker2.price;
		this.SonySpeaker=SonySpeaker;
		
		System.out.println("가격: "+price);
		
	}

	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성TV 전원 켜짐");

	}

	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성TV 전원 꺼짐");

	}

	public void VolumeUp() {
		// TODO Auto-generated method stub
		System.out.println(SonySpeaker.name+" 볼륨 높아짐");
	}

	public void VolumeDown() {
		// TODO Auto-generated method stub
		System.out.println(SonySpeaker.name+"볼륨 낮아짐");
	}

}
