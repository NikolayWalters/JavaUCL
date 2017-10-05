package module1;

public class ConservingNumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is not allowed since it is
		// an attempt to do a "narrowing"
		// without a cast, since
		// LHS = float; RHS = double
			//float x = 100.0;
		// This is allowed:
		double xd = 100.0;
		// We can explicitly "cast" a
		// literal in two ways:
		// State the (cast) in front
		// of the number:
		float xx = (float) 100.0;
		// Add f to the end of the number:
		float xy = 100.0f;
		// For integers we do not have the
		// problem if we only use int &
		// long since a literal is an int:
		int ix = 100; // OK
		long iy = 100; // OK: widening
		long iz = 100L; // OK: specify long by
		 // adding L on the end
		char yyy = 200;
		System.out.println(yyy);
	}

}
