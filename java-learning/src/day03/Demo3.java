package day03;
//StringBuilder

/*反面教材实验：用`String s = ""; for(1到5000){ s += "a"; }` 拼字符串，再换`StringBuilder` 的`append` 做同样的事，跑完在 IDEA 里各自看耗时（`System.currentTimeMillis()` 前后夹一下）。

- 体会 String 不可变的代价：每次`+=` 都是新建对象、老对象进垃圾桶
- 结论刻进脑子： 循环里拼字符串，一律 StringBuilder
*
*
* */
public class Demo3 {
    public static void main(String[] args) {
        String s="";
        long start = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            s+= "a";
        }
        long end = System.currentTimeMillis();
        System.out.print(end-start+"ms");
        StringBuilder sb = new StringBuilder();
        start=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            sb.append("a");
        }
        end=System.currentTimeMillis();
        System.out.print(end-start+"ms");

    }

}
