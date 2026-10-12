public class Demo3 {
    public static void main(String[] args) {
        int result=0;
        for(int i = 1; i <= 100; i++){
            result+=i;
        }
        System.out.println(result);
        result=0;
        int j=1;
        while(j<=100){
            result+=j++;

        }
        System.out.println(result);
        result=0;
        j=1;
        do{
            result+=j++;
        }while(j<=100);
        System.out.println(result);


    }
}
