package edu.monmouth;
//Eric Fomichev
//CS175
public class Donations 
{
	int numIndividual;
	double amtIndividual;
	int numBusiness;
	double amtBusiness;
	int numOther;
	double amtOther;
	
	public void processDonation(String cat, double amount)
	{
		if(cat.equals("individual")) 
		{
			if(amount>0) 
		{
				numIndividual++;
				}
			else 
			{
			numIndividual--;
			}
			amtIndividual += amount;
		}
		else if(cat.equals("business"))
		{
			if(amount>0)
			{
				numBusiness++;
			}
			else
			{
				numBusiness--;
				}
			amtBusiness += amount;
		}
		else if(cat.equals("other")) 
		{
			if(amount>0) 
			{
			numOther++;
			}
			else
			{
				numOther--;
			}
			amtOther += amount;
	}
		
		
		
	}

	public void getStatistics()
	{
		System.out.println("Individual : #:" + numIndividual +" $"+ amtIndividual);
      
        System.out.println("Business : #:" + numBusiness +" $"+ amtBusiness);
       
        System.out.println("Other : #:" + numOther +" $"+ amtOther);
	}
}


