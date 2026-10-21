package day09;

public class ExceptionBasic {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        //arr[5]=0;
        //int b=10/0;
        try{

            int b=10/0;
            arr[5]=0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception!");
            //e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds!");
        }


    }
}
