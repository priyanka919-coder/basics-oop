package exceptionPackage;

public class MultipleCatchBlocks{

    public static void main(String[] arg){
        try{

            int a=15;
            int res=0;
            res=a/0;
            System.out.println(res);
            int arr[]=  {1,2,3};
            System.out.println(arr[3]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }






}
