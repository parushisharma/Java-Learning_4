public class Country  {

	//variable fields.
	private String countryNames;
	private SubscriptionYear subscriptions;
	private int minYear;
	private int maxYear;

	public Country(String country) {
	    this.countryNames = country;
	    this.subscriptions = null;
	    this.maxYear = 0;
	    this.minYear = 9999;
	
	}

	public Country(String string, int numberOfYears) {
	// TODO Auto-generated constructor stub
	}
	//adds the subscription.
	public double getNumSubscriptionsForPeriod(int year, double subscription) {
	    SubscriptionYear newNode = new SubscriptionYear(year, subscription);
	    if(this.isEmpty()) {
	        newNode.setNode(subscriptions);
	        subscriptions = newNode;
	    }
	    else {
	        SubscriptionYear current = subscriptions;
	        while(current.getNext()!=null) {
	            current = current.getNext();
	        }
	        current.setNode(newNode);
	    }
		return subscription;
	}
	
	//need help implementing this function
	public void update(int minYear, int maxYear) {
	
	}
	
	//overrides the toString method and prints out the countries.
	public String toString()
	{
	    String result="";
	    result += "\n"+this.countryNames;
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
	    return this.countryNames;
	}
	//overrides the equals method and returns country name if found
	public boolean equals(Object obj) {
	    return this.countryNames.equalsIgnoreCase(((Country) obj).getName());
	}
	public boolean isEmpty() {
	    return (subscriptions == null);
	}
	
}