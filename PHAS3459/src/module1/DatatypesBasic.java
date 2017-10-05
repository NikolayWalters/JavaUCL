package module1;

public class DatatypesBasic {
	 // built-in integer data types
	 // range ([MIN,MAX])
	 byte ib; // 8-bits ([-128,+127])
	 short is; // 16-bits ([-32768,+32767])
	 int ii; // 32-bits ([~-2.1e9,+2.1e9])
	 long il; // 64-bits ([~-9e18,+9e18])
	 // built-in floating point (real) data types
	 // range +/- ([SMALLEST,LARGEST])
	 float fw; // 32-bits +/- ([1.4e-45,3.4e38])
	 double dw; // 64-bits +/- ([4.9e-324,1.8e308])
	 	//to represent integers, use int, unless dealing with numbers that may be large enough
	 	//to require a long.
	 	//to represent real numbers, use double, unless there are reasons of performance or
	    //limited storage in which case float may be more appropriate.
}
