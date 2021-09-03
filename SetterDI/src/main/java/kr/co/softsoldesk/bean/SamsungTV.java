package kr.co.softsoldesk.bean;

public class SamsungTV implements TV {
	private AppleSpeaker speaker;
	private int price;

	public SamsungTV() {
		
	}

	public void powerOn() {
		System.out.println("SamsungTV---켜진다.");
		System.out.println("가격 : "+price);

	}

	public void powerOff() {
		System.out.println("SamsungTV---꺼진다.");

	}

	public void VolumeUp() {
		speaker.volumeUp();

	}

	public void VolumeDown() {
		speaker.volumeDown();

	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
