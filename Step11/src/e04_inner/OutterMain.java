package e04_inner;

import e04_inner.Outter.Inner;
import e04_inner.OutterStaticInnerClass.InnerStaticClass;

public class OutterMain {

	public static void main(String[] args) {
		//Inner 클래스는 Outter 클래스가 생성이 되어야 생성할 수 있다.
//		Inner inner = new Inner(20);
		Outter outter1 = new Outter(10);
		Outter outter2 = new Outter(20);
		
		Inner inner1 = outter1.new Inner(100);
		inner1.printInner();
		Inner inner2 = outter1.new Inner(200);
		inner2.printInner();
		
		Inner inner3 = outter2.new Inner(300);
		Inner inner4 = outter2.new Inner(400);
		inner3.printInner();
		inner4.printInner();
		
		OutterStaticInnerClass osc = new OutterStaticInnerClass(300);
		InnerStaticClass isc = new InnerStaticClass(50);
		System.out.println(isc.sum());
		
	}

}
