public class DataDemo03{
    public static void main(String[] args){
        int x = 3;
        int y = 2;
        char oper = '/';
        switch(oper){
            case '+':{
                System.out.println("x+y="+(x+y));
                break;
            }
            case '-': {
                System.out.println("x-y="+(x-y));
                break;
            }
            case '*':{
                System.out.println("x*y="+(x*y));
                break;
            }
            case '/':{
                System.out.println("x/y="+(x/y));
                break;
            }
            default:{
                System.out.println("未知的操作！");
                break;
            }
        }
    }
} 
