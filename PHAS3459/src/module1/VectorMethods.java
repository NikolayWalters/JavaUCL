package module1;

public class VectorMethods {
	public VectorMethods() { }
	
	public double dotProductMethod(double x1, double x2, double y1, double y2, double z1, double z2) {
		double dotProduct;
		x1 = 0;
		y1 = 0;
		z1 = 0;
		x2 = 0;
		y2 = 0;
		z2 = 0;
		dotProduct = (x1*x2)+(y1*y2)+(z1*z2);
		return dotProduct;
	}
	
	public double magnitudeMethod(double x, double y, double z) {
		double magnitude;
		x = 0;
		y = 0;
		z = 0;
		magnitude = Math.sqrt((x*x)+(y*y)+(z*z));
		return magnitude; 
	}
	
	public double angleMethod(double magnitude1, double magnitude2, double x1, double x2, double y1, double y2, double z1, double z2) {
		double angle;
		magnitude1 = magnitudeMethod(x1,y1,z1);
		magnitude2 = magnitudeMethod(x2,y2,z2);
		x1 = 0;
		y1 = 0;
		z1 = 0;
		x2 = 0;
		y2 = 0;
		z2 = 0;
		angle = Math.acos((dotProductMethod(x1,x2,y1,y2,z1,z2)/(magnitude1*magnitude2)));
		return angle;
	}
			
			public static void main(String[] args) {
				VectorMethods vm = new VectorMethods();
	}

}
