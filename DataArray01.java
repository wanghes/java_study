public class DataArray01{
    public static void main(String[] args){
        int score[] = null;
        score = new int[3];
        
        System.out.println(score[1]);
        System.out.println(score.length);
    
    	int score2[] = {11,2,23,4,5};
    	java.util.Arrays.sort(score2);
    	print(score2);
    }

    public static void print(int[] temp){
    	for(int i=0; i<temp.length; i++){
    		System.out.print(temp[i]+"\t");
    	}
    }
}
