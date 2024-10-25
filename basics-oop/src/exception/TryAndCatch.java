package exception;

public class TryAndCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block first");
            int a=5;
            int res=a/0;
            System.out.println(res);
            System.out.println("Inside try block last");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Outside try catch");
    }
}
