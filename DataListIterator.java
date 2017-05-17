import java.util.*;
public class DataListIterator{
	public static void main(String[] args){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java1");
		a1.add("java2");
		a1.add("java3");
		a1.add("java4");

		System.out.println("原集合是："+a1);
		   /*在迭代过程中准备添加或者删除元素*/
		Iterator it = a1.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (obj.equals("java2")){
				it.remove();
				System.out.println("obj:"+obj);
			}
		}
		System.out.println("原集合是："+a1);

		 //只有List的listIterator有增，删，改，查这些功能，因为只有List有索引
        ListIterator li = a1.listIterator();
        while (li.hasNext()){
          if(li.next().equals("java3")){
          	li.set("java006");
          }
          //li.add("java009");
        }   
        System.out.println("原集合是："+a1);

        Collection coll = new HashSet();  
		coll.add("Tody");  
		coll.add("is");  
		coll.add("Sunday.");  
		  System.out.println(coll);  
		// Output all elements by iterator  
		Iterator it2 = coll.iterator();  
		while(it2.hasNext()) {  
		    System.out.print(it2.next() + " ");  
		}  
	}
}