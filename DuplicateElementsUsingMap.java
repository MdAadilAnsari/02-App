import java.util.*;
public class DuplicateElementsUsingMap{

	public static void main(String[] args){

		int[] arr = {1,2,5,5,6,6,7,2,2};

		Map<Integer,Integer> map = new HashMap<>();

                     	           for(int number : arr){

			  Integer count = map.get(number);

			  if(count==null){
				map.put(number,1);
			   }
			   else{
				count = count+1;
				map.put(number,count);
			          }
			}

		                Set<Map.Entry<Integer, Integer>> se = map.entrySet();
			System.out.print("Duplicate elements are : ");
			for(Map.Entry<Integer, Integer> me : se){
			{
				if(me.getValue()>1){
				       System.out.print(me.getKey()+",");
				}
			}
		}
	}
}
