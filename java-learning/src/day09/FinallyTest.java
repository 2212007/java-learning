package day09;

public class FinallyTest {
    public static void main(String[] args) {
//        //System.out.println(test());
//        try{
//            int b=10/0;
//        } catch (ArithmeticException e){
//            System.out.println("Arithmetic exception!");
//        } catch (Exception e){
//            System.out.println(e);
//        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static int test(){
        try{
            return 1;
        }finally{
            System.out.println("finally 执行了");
        }

    }

}
