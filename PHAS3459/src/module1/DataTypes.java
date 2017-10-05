package module1;

public class DataTypes {

	public static void main(String[] args) {
		double doubVar = 10.0;
		System.out.println("The value of doubVar is "+doubVar);
		float floatVar = 10;
		int intVar = 10;
		long longVar = 10;
		byte byteVar = 10;
		System.out.println("The value of floatVar is "+floatVar);
		System.out.println("The value of intVar is "+intVar);
		System.out.println("The value of longVar is "+longVar);
		System.out.println("The value of byteVar is "+byteVar);
		
		System.out.println("doubVar value multiplied by itself is: "  +(doubVar*doubVar));
		System.out.println("floatVar value multiplied by itself is: "  +(floatVar*floatVar));
		System.out.println("intVar value multiplied by itself is: "  +(intVar*intVar));
		System.out.println("longVar value multiplied by itself is: "  +(longVar*longVar));
		System.out.println("byteVar value multiplied by itself is: "  +(byteVar*byteVar));
		
		float SumVar1 = byteVar + floatVar;
		System.out.println("Sensible comment " +SumVar1);
		//boolean booleanVar = false;
		//int intForBoolean = 1;
		//System.out.println(booleanVar+intForBoolean);
		System.out.println("Boolean cannot be combined with numbers even if it produces a sensible output (i.e. 0 or 1)");
		char charVar = 99;
		System.out.println("On its own charVar produces letter " +charVar+ " which has a decimal value of 99");
		System.out.println("But when summed with an integer (10) it produces a number "+(charVar+intVar));
		
		int j=1;
		int i;
		//j=i+1;
		//System.out.println("By adding 1 to an uninitialised iteger we get:"+(j)+". This suggests we cannot operate with variables that havent been inititalised") ;
		
		
		double doubleCast = 4.99;
		int intCast;
		intCast = (int) doubleCast;
		System.out.println("Double to integer conversion yields - "+ intCast+". So the decimal points were simply removed. i.e. the double wasn't rounded to integer.");
		
		
	}

}
