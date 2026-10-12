public class Demo4 {
    public static void main(String[] args){
        int[] a=new int[3];
        System.out.println(a[0]);
        //System.out.println(a[3]);
        int[] b={1,2,3};
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        for(int i:b){
            System.out.println(i);
        }
    }
}
