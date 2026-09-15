public class Time {

	public static void main(String[] args) {
	
	int hour = 12;
	int minute = 40;
	int second = 30;
	
	System.out.print("number of seconds since midnight: ");
	System.out.println(hour*60*60 + minute*60 + second);
	
	int SecondsElapsed = hour*60*60 + minute*60 + second;
	int SecondsInADay = 24*60*60;
	
	System.out.print("number of seconds remaining in the day: ");
	System.out.println(SecondsInADay - SecondsElapsed);
	
	double PercentageOfTheDayElapsed = 100.0*SecondsElapsed/SecondsInADay;
	
	System.out.println("percetage of the day that has passed: " + PercentageOfTheDayElapsed + "%");
	
	hour = 13;
	minute = 10;
	second = 20;
	
	int TimeElapsedSinceBeginning = hour*60*60 + minue*60 + second
	
	System.out.println("elapsed time since I started working on this excercise: ")
	
	}

}
