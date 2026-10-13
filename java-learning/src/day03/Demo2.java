package day03;
//String 基础 `String s = "hello, world";` 玩转 API：`length()` （ 带括号 ，跟数组区分）、`charAt(0)` 、
// `substring(7)` 、`indexOf('o')` 、`toUpperCase()` 。
//然后做 equals vs == 实验，先预测再跑：
/* 工具 1：`==` 在 Java 里对对象比的是“地址” C++ 的`string a == b` 比内容，因为 C++ 有运算符重载。Java 没有 运算符重载，`==` 对引用类型永远是最原生的比较——两个变量是否 指向同一个对象 （同一块内存地址）。

工具 2：字符串字面量池 Java 对 直接写出来的字面量 （`"ab"` 这种）有个复用机制：同样的字面量在整个程序里 只存一份 ，所有用到它的变量都指向池里那同一个对象。目的就是省内存。

工具 3：`new` 的语义`new String("ab")` = 无视池子， 强制在堆上造一个新对象 。内容可以和池里那个一模一样，但地址必然是新的。

工具 4（送你）：equals String 把`equals` 重写成了 比内容 。
*/
public class Demo2 {
    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        String c = new String("ab");
        System.out.println(a == b);      // 预测true
        System.out.println(a == c);      // 预测false
        System.out.println(a.equals(c)); // 预测ture
        String s = "hello world";
        System.out.println(s.length());//11
        System.out.println(s.charAt(0));//打印第n+1个字符——charAt(n) h
        System.out.println(s.indexOf('o'));//打印出现第一个这个字符'x'的下标；indexOf('x')  4
        System.out.println(s.substring(7));//截取从下标n到末尾的字串——substring(n) orld
        System.out.println(s.toUpperCase()); //打印大写形式——s.toUpperCase();
    }
}
