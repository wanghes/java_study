public class DataArray02{
	public static void main(String[] args){
		int[] in1 = {1,2,3,4,5,6,7,8,9};
		int[] in2 = {11,22,33,44,55,66,77,88,99};
		int[] in3 = {11,22,33,0,44,55,0,0,66,77,88,99,0};
		selfArrayCopy(in1,3,in2,1,3);
		print(in2);
		System.out.println("");
		System.out.println("------------------");

		System.arraycopy(in1,3,in2,1,3);
		print(in2);

		System.out.println("");
		deleteZero(in3);
	}

	public static void deleteZero(int[] temp){
		int[] newArr = new int[9];
		int incre = 0;
		for(int i = 0; i < temp.length; i++){
			if(temp[i]==0){
				continue;
			}

			newArr[incre++] = temp[i];
		    //System.out.println(incre);
		}
		print(newArr);
		System.out.println("");
	}

	public static void selfArrayCopy(int[] s, int s1, int[] o, int s2, int len){
		for(int i = 0; i<len; i++){
			o[s2+i] = s[s1+i];
		}
	}

	public static void print(int[] temp){
		for(int i = 0; i < temp.length; i++){
			System.out.print(temp[i]+"\t");
		}
	}
}