public class SubscriptionYear {
	
	private int year;
	private double subscriptions;
	//SubscriptionYear next;
	
	
	//stores the year and it's statistical data.
	public SubscriptionYear(int year,double subscriptions) {
	    setYear(year);
	    setSubscription(subscriptions);
	   // this.next = null;
	}
	
	//sets the year
	public void setYear(int Year) {
	    this.year= Year;
	}
	
	//sets the subscriptions .
	public void setSubscription(double value) {
	    this.subscriptions = value;
	}
	
	//gets the year
	public int getYear() {
	    return year;
	}   
	
	 //gets the subscriptions 
	public double getSubscription() {
	    return subscriptions;
	}
	
	public String toString() {
	    return "Number of Subscriptions: "+subscriptions;
	}
	/*
	//sets the node
	public void setNode(SubscriptionYear next) {
	    this.next = next;
	}
	
	// pulls next subscription year 
	public SubscriptionYear getNext() {
	    return this.next;
	}
	*/
}