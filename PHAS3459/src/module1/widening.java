package module1;

public class widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ix = 123456789;
		 int iy = 123456788;
		 System.out.println(ix-iy);
		 // Widening conversions
		 float fx = ix;
		 float fy = iy;
		 System.out.println("To float conversion "+(fx-fy));
		 // What happens when you make
		 // these doubles instead of floats?
		 double fx1 = ix;
		 double fy1 = iy;
		 System.out.println("To double conversion "+(fx1-fy1));
	}

}
