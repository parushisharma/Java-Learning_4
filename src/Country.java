public class Country  {

	//variable fields.
	private String name;
	private  SubscriptionYear[] subscriptions;
	private  int c;
	
	// set up 
	public Country(String country, int numberOfYears) {
	    this.name = country;
	    this.subscriptions = new SubscriptionYear[numberOfYears];
	    this.c = 0;
	}
	
	//
	public void addSubscriptionYear(int year, double countryData) {
		SubscriptionYear years = new SubscriptionYear(year,countryData);
		this.subscriptions[this.c] = years; 
		this.c++;
	}

	
	//adds the subscription. NEED HELP GETTING STARTED WITH THIS.
	public double getNumSubscriptionsForPeriod(int syear, int eyear) {
		double subscription = 0;
	    for (int i = 0; i < subscriptions.length ; i++ ) {
	    	if (subscriptions[i].getYear() >= syear && subscriptions[i].getYear() <= eyear) {
	    		subscription = subscriptions[i].getSubscription() + subscription;
	    	}
	    }
		
		return subscription;
	}
	
	
	//overrides the toString method and prints out the countries.
	public String toString()
	{
	    String result="";
	    result += "\n"+this.name;
	    
	    for( int i = 0; i<subscriptions.length; i++ ) {
	    
	        result+="\t"+ subscriptions[i].getSubscription();
	                
	    }
	    return result;
	}
	
	
	//returns countryName
	 public String getName() {
	    return this.name;
	}
	//overrides the equals method and returns country name if found
	public boolean equals(Object obj) {
	    return this.name.equalsIgnoreCase(((Country) obj).getName());
	}
	public boolean isEmpty() {
	    return (subscriptions == null);
	}
	
}