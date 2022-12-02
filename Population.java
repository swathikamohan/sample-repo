import java.util.*;
class Population
{
	HashMap<String,Integer>dataList=new HashMap<>();
	String maxPopulation()
	{
		String name="";
		int max=(Collections.max(dataList.values()));
		for(Map.Entry<String, Integer> me:dataList.entrySet())
		{
			if(max==me.getValue())
			{
				 name=me.getKey();
			}
		}
		return name;
		
	}
	String minPopulation()
	{
		String name="";
	int min=Collections.min(dataList.values());
	for(Map.Entry<String, Integer> me:dataList.entrySet())
	{
		
		if(min==me.getValue())
		{
		
			
			name=me.getKey();
			
		}
		
	}
	return name;
		
	}
	long totalPopulation()
	{
		long sum=0l;
		for(Map.Entry<String, Integer> me: dataList.entrySet())
		{
			sum+=me.getValue();
		}
	   return sum;
	}
}