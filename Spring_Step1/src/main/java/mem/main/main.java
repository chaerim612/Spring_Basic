package mem.main;

import mem.bean.HelloWorld;
import mem.bean.HelloWorldEn;
import mem.bean.HelloWorldKo;

public class main{
	public static void main(String[] args) {
		HelloWorldEn hello1=new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorldKo hello2=new HelloWorldKo();
		callMethod(hello2);
		
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
