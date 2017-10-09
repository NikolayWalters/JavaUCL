package module1;

public class AlgorithmControl {
	
	public static void loop() {
		// loop that prints out integers from 1 to 10
		for (int i = 1; i<= 10; i++) {
			System.out.println(i);
		}
	}
	public static void decrement() {
		//loop that prints out integers from 5 to -12
		int j = 5;
		while ( j >= -12 ) {
			System.out.print(j+", ");
			j--;
		}
	}
	// prints out values from 2.4 to 8.8 in a step of 0.2
	public static void increment() {
		for(double k = 2.4; k<=8.8; k +=0.2) {
			System.out.println(k);
		}
	}
	//timer that calculates the number of times a while loop is compiled
	public static void timer() {
		long timeNow = System.currentTimeMillis();   // returns the current time in milliseconds
		int loopCount = 0;   //initialising loop counter
		long timeEnd = timeNow + 10000;  //loop will run for 10000 milliseconds
		while (System.currentTimeMillis() <= timeEnd) { //condition for ending the loop
			loopCount +=1;
			if (loopCount%100 == 0) {   //condition for printing out only every 100 loops executed
				System.out.println(loopCount);
			
			}
		}
		System.out.println("Total number of loops "+ loopCount);
	}
	public static void timerMod(long maxTime, int loopSteps) {  //modified timer that includes built in variables
		long timeNow = System.currentTimeMillis();
		int loopCountMod = 0;
		long timeEnd = timeNow + maxTime;   //allows the time step to be adjusted in the main body
		while (System.currentTimeMillis() <= timeEnd) {
			loopCountMod +=1;
			if (loopCountMod%loopSteps == 0) {  //condition for loop step
				System.out.println(loopCountMod);
			}
		}
		System.out.println("Total number of loops "+loopCountMod);
	}
	//delete this?
	public static void timerModLast(long maxTime, int loopSteps) { //one last timer, but this time for 
		long timeNow = System.currentTimeMillis();
		int loopCountModLast = 0;
		long timeEnd = timeNow + maxTime;
		while (System.currentTimeMillis() <= timeEnd) {
			loopCountModLast +=1;
			if (loopCountModLast%loopSteps == 0) {
				System.out.println(loopCountModLast);
			}
		}
		System.out.print("Total number of loops "+loopCountModLast+";      ");
	}
	public static void main(String[] args) { 
		//loop();
		//decrement();
		//increment();
		//timer();
		//timerMod(8000, 1000); 
		////////timerMod(8000, 40000);
		//timerModLast(8000, 40000);
		System.out.println("10 seconds and 100 loops per step produce a total of 152260242 loops");
		System.out.println("8 seconds and 1000 loops per step produce a total of 526678540 loops");
		System.out.println("8 seconds and 40000 loops per step produce a total of 830405390 loops");

		System.out.println("Increasing the time period increases the number of loops executed as expected,"
				+"since algorithm is run for longer. Increasing the number of loops completed before printing it"
				+"also increases the number of loops executed. This could be due to algorithm having to perform less"
				+"operations per unit time, thus speeding up the computation process."); 
	}

}