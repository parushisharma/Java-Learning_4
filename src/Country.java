public class Country  {

	//variable fields.
	private String name;
	private SubscriptionYear subscriptions;
//	private double[] SubscriptionYear;
	

	public Country(String country, int numberOfYears) {
	    this.name = country;
	    this.subscriptions = null;
	    
	
	}
	public void addSubscriptionYear(int i, double countryData) {
	
	}

	
	//adds the subscription. NEED HELP GETTING STARTED WITH THIS.
	public double getNumSubscriptionsForPeriod(int year, double subscription) {
	    
		return subscription;
	}
	
	
	//overrides the toString method and prints out the countries.
	public String toString()
	{
	    String result="";
	    result += "\n"+this.name;
	    SubscriptionYear current = subscriptions;
	    while(current!=null)
	    {
	        result+="\t"+current.getSubscription();
	        current = current.getNext();        
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