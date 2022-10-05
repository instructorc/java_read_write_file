public class Candy
{
	private String name; 
	private double price;
	
	public String getName(){ return name;}
	public double getPrice(){return price;}

	public Candy(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public String toString()
	{
		return "The name of the candy is " + name + " the price for this candy " + price;
	}

}
