/**
 *  Tests the Country class by creating multiple objects.
 *  Creates one object of type CSVReader class, which reads input from a CSV file. Uses
 *  the attributes stored in CSVReader object to create objects of type Country class.
 *
 * @author Foothill College, Parushi Sharma 
 */
public class TestCountry {

	/**
	 * Includes test examples for class Country.
	 */
	public static void main(String[] args) 
	{
		// Create and set objects of type Country 
		//
		final String FILENAME = "resources/cellular.csv";	// Directory path for Mac OS X
		//final String FILENAME = "resources\\cellular.csv";	// Directory path for Windows OS (i.e. Operating System)
		final int NUM_COUNTRIES_TO_TEST = 3;			// Note: Include test cases in addition to 3
		//WHAT AM I SUPPOSED TO DO WITH THIS FINAL INT GIVEN? ^

		// Parses the CSV data file
		// NOTE: Handle all exceptions in the constructor.
		//       For full credit, do *not* throw exceptions to main. 
		CSVReader parser = new CSVReader(FILENAME);

		// Accessor methds only return values at instance variables.
		String [] countryNames = parser.getCountryNames();
		int [] yearLabels = parser.getYearLabels();
		double [][] parsedTable = parser.getParsedTable();		


		// TODO: Create the class Country to hold the data for one country 
		Country [] countries;
		//countries = new Country[NUM_COUNTRIES_TO_TEST];	// Note: Use this for initial testing of your implementation.

		// TODO: Create an array of Country objects
		// NOTE: Here, we are no longer using a 2D array of cellular data.
		//       Insead, each country will hold it's own cellular data.
		countries = new Country[countryNames.length];				 

		Country current;

		// Go through each country name parsed from the CSV file.
		for (int countryIndex = 0; countryIndex < countries.length; countryIndex++)
		{
			int numberOfYears = yearLabels.length;   // OR numberOfYears = dataTable[countryIndex].length;

			// Create a Country object
			// TODO: Create a class constructor which takes two arguments:
			//       1) a String for the name of the country
			//       2) an integer for the number of cellular data for each country
			// NOTE: Similar to the previous project we'll assume the data is clean with
			//       the same number of years of cellular data for all countries.
			current = new Country(countryNames[countryIndex], numberOfYears);

			// Go through each year of cellular data read from the CSV file.
			for (int yearIndex = 0; yearIndex < numberOfYears; yearIndex++)
			{
				double [] allSubscriptions = parsedTable[countryIndex];
				double countryData = allSubscriptions[yearIndex];

				// TODO: Create the class SubscriptionYear to hold two the data 
				//       for one cellular year:
				//       1) an integer for the year
				//       2) a double for the subscriptions for that year
				current.addSubscriptionYear(yearLabels[yearIndex], countryData);
			}

			// add the newly created country to the 1D array
			countries[countryIndex] = current;
		}


		double totalSubscriptions = countries[0].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[0] + " (1960 to 2012): %.2f \n", totalSubscriptions);
		// the output is:
		// Aruba (1960 to 2012): 1170.50


		totalSubscriptions = countries[100].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[100] + " (1960 to 2012): %.2f \n", totalSubscriptions);
		// the output is:
		// Hungary (1960 to 2012): 1246.58


		totalSubscriptions = countries[200].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[200] + " (1960 to 2012): %.2f \n", totalSubscriptions);
		// the output is:
		// Singapore (1960 to 2012): 1582.80


		// TODO: For full credit, include test cases in addition to those provided.
		totalSubscriptions = countries[20].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[20] + " (1960 to 2014): %.2f \n", totalSubscriptions);
		
		totalSubscriptions = countries[2].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[2] + " (1960 to 2014): %.2f \n", totalSubscriptions);
		
		totalSubscriptions = countries[78].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[78] + " (1960 to 2012): %.2f \n", totalSubscriptions);
		//
		// TODO: Also, make sure to test for other invalid requests.
		
		totalSubscriptions = countries[20].getNumSubscriptionsForPeriod(1960,2012);
		System.out.printf(countryNames[20] + " (1960 to 1890): %.2f \n", totalSubscriptions);
		
		//
	}
}
