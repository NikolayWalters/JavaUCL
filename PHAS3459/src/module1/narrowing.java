package module1;

public class narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 short x = 1000;
		 // size = 16 bits
		 // in memory: x = 0000001111101000
		 byte y;
		 // size = 8 bits
		 // in memory: y = 00000000
		 //y = x;
		 // ILLEGAL: COMPILE ERROR (try it and see)
		 y = (byte) x;
		 // in memory: y = 11101000 (= -24!)
		 System.out.println(y);
		 
	}

}
