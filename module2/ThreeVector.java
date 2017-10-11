package module2;

public class ThreeVector {

	// static double x; static double y; static double z;
	double x, y, z;

	public ThreeVector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double magnitude() {
		double magnitude;
		magnitude = Math.sqrt((x * x) + (y * y) + (z * z));
		return magnitude;
	}
	
	public ThreeVector.Unit() {
		ThreeVector.Unit = ThreeVector();
		ThreeVector.Unit = (double (x/magnitude), double (y/magnitude), double(z/magnitude));
		return ThreeVector.Unit;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeVector u1 = new ThreeVector(1, 2, 3);
		System.out.println(u1.magnitude());
	}

}
