package day03;
//回文判断
// 写方法`boolean isPalindrome(String s)` ，判断 "level"、"abcba"、"ab" 是否回文。要求：字符串头尾比较，用`charAt` 。
//
//- 这是方法定义 + String API + 双指针三合一，写完喊我，不用贴代码
public class Demo4 {
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("a"));
    }
}

//commit 消息`D3: 方法+String demos + LC977`