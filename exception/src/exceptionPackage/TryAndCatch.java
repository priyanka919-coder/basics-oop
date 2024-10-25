package exceptionPackage;

public class TryAndCatch {


    public static void main(String[] args) {
        try{
            System.out.println("Inside try block first line");
            int a=10, res=5;
            res=res/0;
            System.out.println(res);

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Outside the block");
    }

}
