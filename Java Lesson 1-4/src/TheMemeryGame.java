
public class TheMemeryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Program is testing both strings and calculations. 
		
		System.out.println("Hello, World!");
		System.out.println(2+3);
		
		//computers make decisions and calculations
		
		//Variables in java have a name and a value.
		//the name doesnt change but the value can
		
		//bus program
		
		int passengers;
		passengers = 0;
		passengers = passengers + 5;
		passengers = passengers - 3;
		passengers = passengers - 1 + 5;
		
		
		//Displaying variable
		// 
		
		System.out.println("This many passengers: "+ passengers);
		
		//Multiple variables

		int stops;
		int fare;
		stops = 0; 
		fare = 0;
		stops = stops + 1;
		fare = fare + 5;
		stops = stops +1;
		fare = fare + 3;
		stops = stops + 1;
		fare = fare +7;
		System.out.println(stops);
		System.out.println(fare);		
		
		
		/*
		Strings, are variables that java can have a 
		lot of change on making string variables very cool 
		you can count the numbers of letters in a string
		it can change the string into all capitol letters */
		
		String driver;
		driver = "Austin"; //String literal.
		System.out.println(driver);

		//driver = Austin;    /.would drive computer crazy lol
		
		
		//You cant count the letters of a string
		//This instruction would count the number of letters 
		
		int letters = driver.length(); 
		System.out.println(letters);
		
		driver = "Hamish";
		driver = driver.toUpperCase(); //you have to decalre the variable to the action 
		System.out.println(driver);
		
		// String Concatanation
		//Chaining strings together to create longer strings
		
		String driverFirstName = "Hamish";
		String driverLastName = "Blake";
		
		String driverFullName = driverFirstName + " " + driverLastName;
		
		System.out.println(driverFullName);
		
		System.out.println("The bus made $" + fare + " after " +stops+ " stops");
		
		
		//Quiz 14
		
		
		
	}

}
