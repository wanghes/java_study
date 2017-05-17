public class DataArray03{
	//测试可变参数数组
	public static void main(String[] args){
		System.out.print("不传递参数(func()):");
		func();
		System.out.print("\n传递一个参数（func(1)）:");
		func(1);
		System.out.print("\n传递多个参数（func(1,2,3,4,5)）");
		func(1,2,3,4,5);
		System.out.print("\n测试foreach\n");
		funcForeach(1,2,3,4,5);
		System.out.print("\n");
	}
	public static void func(int... args){
		for(int i = 0; i < args.length; i++){
			System.out.print(args[i]+"、");
		}
	}

	public static void funcForeach(int... args){
		for(int x : args){
			System.out.print(x+"、");
		}
	}
}