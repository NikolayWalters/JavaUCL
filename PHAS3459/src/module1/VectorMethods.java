package module1;

public class VectorMethods {
	public VectorMethods() { }
	//dot product method
	public double dotProductMethod(double x1, double x2, double y1, double y2, double z1, double z2) {
		double dotProduct;
		dotProduct = (x1*x2)+(y1*y2)+(z1*z2);
		return dotProduct;
	}
	// magnitude calculations
	public double magnitudeMethod(double x, double y, double z) {
		double magnitude;
		magnitude = Math.sqrt((x*x)+(y*y)+(z*z));
		return magnitude; 
	}
	//angle between two vectors
	public double angleMethod(double x1, double x2, double y1, double y2, double z1, double z2) {
		double angle;
		double magnitude1 = magnitudeMethod(x1,y1,z1);
		double magnitude2 = magnitudeMethod(x2,y2,z2);
		angle = Math.acos((dotProductMethod(x1,x2,y1,y2,z1,z2)/(magnitude1*magnitude2))); 
		return angle;
	}
			
			public static void main(String[] args) {
				VectorMethods vm = new VectorMethods();
				//defining vector parameters as specified
				double xinput1 = 1.0;
				double yinput1 = 2.0;
				double zinput1 = 3.0;
				double xinput2 = 4.0;
				double yinput2 = 5.0;
				double zinput2 = 6.0;
				//calculating dot product for two vectors given
				double dotproduct = vm.dotProductMethod(xinput1, xinput2, yinput1, yinput2, zinput1, zinput2);
				System.out.println("The dot product of the two vectors is: "+dotproduct);
				System.out.println("The magnitude of the first vector is: "+(vm.magnitudeMethod(xinput1, yinput1, zinput1)
						+" and the magnitude of the second vector is: "+(vm.magnitudeMethod(xinput2, yinput2, zinput2))));
				
				double xinput11 = 2.0;
				double yinput11 = 3.0;
				double zinput11 = 4.0;
				double xinput22 = 1.0;
				double yinput22 = 3.0;
				double zinput22 = 2.0;
				// calculating the angle between two vectors
				System.out.println("The angle between the two vectors is: "+(Math.toDegrees(vm.angleMethod(xinput11, xinput22, yinput11, yinput22, zinput11, zinput22))));
				double xinput111 = 2.0;
				double yinput111 = 3.0;
				double zinput111 = 4.0;
				double xinput222 = 0.0;
				double yinput222 = 0.0;
				double zinput222 = 0.0;
				System.out.println("The angle between the two vectors is: "+(Math.toDegrees(vm.angleMethod(xinput111, xinput222, yinput111, yinput222, zinput111, zinput222))));
				System.out.println("The NaN result can be observed, since we are dividing by a magnitude zero vector.");
			}

}

