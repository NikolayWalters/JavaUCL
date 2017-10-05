package module1;

public class VectorMethods {
	public VectorMethods() { }
	
	public double dotProductMethod(double x1, double x2, double y1, double y2, double z1, double z2) {
		double dotProduct;
		dotProduct = (x1*x2)+(y1*y2)+(z1*z2);
		return dotProduct;
	}
	
	public double magnitudeMethod(double x, double y, double z) {
		double magnitude;
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
				double xinput1 = 1.0;
				double yinput1 = 2.0;
				double zinput1 = 3.0;
				double xinput2 = 4.0;
				double yinput2 = 5.0;
				double zinput2 = 6.0;
				double dotproduct = vm.dotProductMethod(xinput1, xinput2, yinput1, yinput2, zinput1, zinput2);
				System.out.println("The dot product of the two vectors is: "+dotproduct);
				System.out.println("The magnitude of the first vector is: "+(vm.magnitudeMethod(xinput1, yinput1, zinput1)
						+" and the magnitude of the second vector is: "+(vm.magnitudeMethod(xinput2, yinput2, zinput2))));
	}

}
