package edu.monmouth.problemSet2;

public class MusicalInstrument {
	private String name;
	private String type;
	private int numberOfKeysorStrings;
	final String UNKNOWNNAME = "UNKNOWNNAME";
	final String UNKNOWNTYPE = "UNKNOWNTYPE";
	final int UNKNOWNKEYSORSTRINGS = -1;
	final int LOWERLIMIT = 0;
	final int UPPERLIMIT = 100;

	public MusicalInstrument() 
	{
		setName(UNKNOWNNAME);
		setType(UNKNOWNTYPE);
		setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) 
	{
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.length() == 0) 
		{
			this.name = UNKNOWNNAME;
		}
		else 
		{
			this.name = name;
			
		}
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		if(type.toLowerCase().equals("woodwind") || type.toLowerCase().equals("string") || type.toLowerCase().equals("brass") || type.toLowerCase().equals("keyboard") || type.toLowerCase().equals("percussion"))
		{
			this.type = type;
	}
	else if(type == null || type.length() == 0)
	{
		this.type = UNKNOWNTYPE;
	}
	else
	{
		this.type = UNKNOWNTYPE;
	}
}
	public int getNumberofKeysorStrings()
	{
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings)
	{
		if((numberOfKeysorStrings <= UPPERLIMIT && numberOfKeysorStrings >= LOWERLIMIT)) 
	{
			this.numberOfKeysorStrings = numberOfKeysorStrings;
	}
	else
	{
		this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
	}
}
}


