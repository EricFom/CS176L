package monmouth.edu;
//Eric Fomichev
//CS175L
import java.util.Arrays;
public class ArrayAssignment1 {

	public static void main(String[] args) 
	{
		double[] values = {25.3, 100.0, -1.0, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};

        
		String str = Arrays.toString(values).replace("[", "").replace("]", "").replace(",", "");
		System.out.println(str);
        	
        
        double max = Integer.MIN_VALUE;
        for (double integer : values) 
        {
            if (integer > max)
                max = integer;
		
        }
        System.out.println("The largest element in the array is " + max);
        
        int negativeCount;
        negativeCount = 0;
        for(int i=0; i < values.length; i++)
        	if(values[i] <0)
        	 negativeCount++;
        
        System.out.println("There are " + negativeCount + " negative numbers in the array");
	}

	
		
	}


	
