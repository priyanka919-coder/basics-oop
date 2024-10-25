package exception;

public class NullPointerException {
    public static void main(String[] args) {
        String s1="Priyanka";
        String s2= null;
        try{

            System.out.println(s1.length());

            System.out.println(s2.length());
            
        }
        catch(java.lang.NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

}
