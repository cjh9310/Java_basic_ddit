package chapter9;

public class Anonymous_1 {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("자동차가 달립니다.");
		}
	};
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}		
		};
		localVar.run();
	}
	void method2(Vehicle v) {
		v.run();
	}
}
