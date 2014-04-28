// Element Class
public class Element
{
	private int atomicNum;
	private double atomicWeight;
	private String elementName;
	
	// creates the element
	public Element(String name, double mass, int number)
	{
		elementName = name;
		atomicWeight = mass;
		atomicNum = number;
	}
	
	public Element(String name)
	{
		PerTable list = new PerTable();
		Element x = list.lookup(name);
		if (! (list.lookup(name) == null))
		{
			elementName = x.getName();
			atomicWeight = x.getWeight();
			atomicNum = x.getNumber();
		}
	}
	
	public double getWeight()
	{
		return atomicWeight;
	}
	
	public int getNumber()
	{
		return atomicNum;
	}
	
	public String getName()
	{
		return elementName;
	}
}