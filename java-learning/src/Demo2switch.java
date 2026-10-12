import java.util.Scanner;

public class Demo2switch {
    public static void main(String[] args){
        while(true){
            Scanner sc=new Scanner(System.in);
            int month=sc.nextInt();
            String season = switch (month){
                //case 3,4,5->"春";
                //case 6,7,8->"夏";
//                case 9,10,11->"秋";
//                case 12,1,2->"冬";
                case 3,4,5:yield"春";
                case 6,7,8:yield"夏";
                case 9,10,11:yield "秋";



                case 12,1,2: {
                    yield "冬";
                }
                default :{
                    System.out.println("checking...");
                    yield "非法";
                }
            };
            System.out.println(season);
            if(season=="非法"){
                return ;
            }
//            switch (month){
//                case 3,4,5:
//                    System.out.println("春");
//                    break;
////                case 3: case 4: case 5:
////                    System.out.println("春");
////                    break;
//                case 6: case 7: case 8:
//                    System.out.println("夏");
//                    break;
//                case 9: case 10: case 11:
//                    System.out.println("秋");
//                    break;
////                case 12: case 1: case 2:
////                    System.out.println("冬");
////                    break;
//                case 12,1,2:
//                    System.out.println("冬");
//                    break;
//                default:
//                    System.out.println("Exit");
//                    return;
////                case -1:
////                    System.out.println("Exit");
////                    return;
//
//
//            }

        }
    }
}
