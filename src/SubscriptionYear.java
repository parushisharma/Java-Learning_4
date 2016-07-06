public class SubscriptionYear {
	
	private int year;
	private double subscriptions;
	SubscriptionYear next;
	
	public SubscriptionYear(int year2, double subscription) {
		// TODO Auto-generated constructor stub
	}
	//stores the year and it's statistical data.
	public void addSubscriptionYear(int year,double subscriptions) {
	    setYear(year);
	    setSubscription(subscriptions);
	    this.next = null;
	}
	//sets the year
	public void setYear(int Year) {
	    this.year= Year;
	}
	//sets the cellular data.
	public void setSubscription(double value) {
	    this.subscriptions = value;
	}
	public int getYear() {
	    return year;
	}   
	 //returns the stat data
	public double getSubscription() {
	    return subscriptions;
	}
	public String toString() {
	    return "Number of Subscriptions: "+subscriptions;
	}
	//sets the node
	public void setNode(SubscriptionYear next) {
	    this.next = next;
	}
	public SubscriptionYear getNext() {
	    return this.next;
	}
}