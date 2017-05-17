import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class DataArray04{
	public static void main(String[] args){
		String[] a1 = {"1","2","3"};
		String[] a2 = {"3","2","1"};
		String[] a3 = new String[]{"1","2","3"};
		List listA = Arrays.asList(a3); //将数组作为list
		Arrays.sort(a1); 
		Arrays.sort(a2); 
		System.out.println("listA:"+listA);
		int[] arrayB = {1,2,3}; 
        List listB = java.util.Arrays.asList(arrayB);
        System.out.println("listB: " + listB);

		Integer[] arrayC = {1,2,3};
        List listC = java.util.Arrays.asList(arrayC);
        System.out.println("listC: " + listC);
		if(Arrays.equals(a1,a2)){
			System.out.println("两个数组的元素值相同");
		}else{
			System.out.println("两个数组的元素值不相同");
		}

		String[] array;
		List<String> list = new ArrayList<String>();
		list.add("testA");
        list.add("testB");
        list.add("testC");
        //list.remove(1);
        list.set(1,"flash");
        System.out.println("获取list的第一个值："+list.get(0));
        System.out.println("list: " + list);


        String[] strings = new String[list.size()];
        array = list.toArray(strings);
        for(int i=0; i<array.length; i++){
        	System.out.print(array[i]+',');
        }
        System.out.println("");
	}
}