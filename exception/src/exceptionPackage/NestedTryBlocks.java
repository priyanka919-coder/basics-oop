package exceptionPackage;

import org.w3c.dom.ls.LSOutput;

public class NestedTryBlocks {
    public static void main(String[] args) {
        try{
            System.out.println("First line try");
            try{
                System.out.println("Inside 1st try block");
                int a=15;
                int res=15/15;
                System.out.println(res);
                try {
                    String s= "Vakula";
                    System.out.println(s.length());
                    try {
                        int[] arr={1,4,5,6,7};
                        System.out.println(arr[5]);

                        try{
                            System.out.println("Innermost try block");
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

        System.out.println("I am outside try catch block");
    }


}
