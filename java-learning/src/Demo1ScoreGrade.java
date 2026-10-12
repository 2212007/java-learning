import java.util.Scanner;

public class Demo1ScoreGrade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int score = sc.nextInt();
//        if(score>=90){
//            System.out.println('A');
//
//        }else if(score>=80){
//            System.out.println('B');
//        }else if(score>=70){
//            System.out.println('C');
//        }else if(score>=60){
//            System.out.println('D');
//        }else {
//            System.out.println("挂科");
//        }
        while (true){
            int score = sc.nextInt();
            if(score == -1){
                System.out.println("Exit");
                break;
            }
            if(score>=90){
                System.out.println('A');

            }else if(score>=80){
                System.out.println('B');
            }else if(score>=70){
                System.out.println('C');
            }else if(score>=60){
                System.out.println('D');
            }else {
                System.out.println("挂科");
            }
        }



    }

}
