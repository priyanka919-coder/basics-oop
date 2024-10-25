package exceptionPackage;

public class GenericException {
    public static void main(String[] args) {
        try{

            int a=15;
            int res=0;
            res=a/15;
            System.out.println(res);
            int arr[]=  {1,2,3};
            System.out.println(arr[3]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
