public final class MyFirstApp {
	
	private static final int INT_IN_BIN = 0b101;
	private static final int INT_IN_HEX = 0x9B;
	private static final float FLOAT_CONST = 5.5F;

	private MyFirstApp() {
	}

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		char c = 'g';
		System.out.println(c);
		float d = FLOAT_CONST;
		System.out.println(d);
		
		char v0 = 0;
		float v1 = 0;
		v1 = v0;
//      v0=v1;
		
		int k = INT_IN_HEX;
		System.out.println(k);
		int g = INT_IN_BIN;
		System.out.println(g);
	}

}
