public class Source {
public static void main(String[] args) {
	Population obj=new Population();
	obj.dataList.put("India", 26382898);
	obj.dataList.put("USA", 92732);
	obj.dataList.put("Uk", 92732);
	obj.dataList.put("China", 26382898);
	obj.dataList.put("Irak", 92732);
	String max=obj.maxPopulation();
	String min=obj.minPopulation();
	long total=obj.totalPopulation();
	System.out.println(max);
	System.out.println(min);
	System.out.println(total);
	}
}