package Test_0330;

/*
身份证分组
 题目描述
18位身份证的编码规则是：
前1、2位数字表示：所在省（直辖市、自治区）的代码
第3、4位数字表示：所在地级市（自治州）的代码
第5、6位数字表示：所在区（县、自治县、县级市）的代码；
第7—14位数字表示：出生年、月、日；
第15、16位数字表示：所在地的派出所的代码；
第17位数字表示性别：奇数表示男性，偶数表示女性；
第18位数字是校检码，用来检验身份证的正确性。
用户在输入身份证的过程中经常会输入错误，为了方便用户正确输入需要在输入过程中对用户的输入按照 6+8+4 的格式进行分组，实现一个方法接收输入过程中的身份证号，返回分组后的字符
输入描述:
输入数据有多行，每一行是一个输入过程中的身份证号
输出描述:
分组后的字符串
示例1
输入
5021
502104 198803
5021041988033084
502104198803308324
输出
5021
502104 198803
502104 19880330 84
502104 19880330 8324
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//        while(sc.hasNext()){
//           list.add(sc.nextLine());   
//        }
//        String s;
//        for(int i=0; i<list.size(); i++){
//            s = list.get(i);
//            if(s.length()>6 && s.charAt(6)!=' '){
//            	s = s.substring(0,6)+" "+s.substring(6);
//            }
//            if(s.length()>15 && s.charAt(15)!=' '){
//            	s = s.substring(0,15)+" "+s.substring(15);
//            }
//            System.out.println(s);
//        }
//    }
//}
/*
 * Fibonacci数列
 * 题目描述
Fibonacci数列是这样定义的：
F[0] = 0
F[1] = 1
for each i ≥ 2: F[i] = F[i-1] + F[i-2]
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
输入描述:
输入为一个正整数N(1 ≤ N ≤ 1,000,000)
输出描述:
输出一个最小的步数变为Fibonacci数"
示例1
输入
15
输出
2
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int f1 = 0;
//        int f2 = 1;
//        while(f2 < N){
//            int temp = f1 + f2;
//            f1 = f2;
//            f2 = temp;
//        }
//        System.out.println(Math.min(f2-N,N-f1));
//    }
//}

/*
小易喜欢的单词
 题目描述
小易喜欢的单词具有以下特性：
1.单词每个字母都是大写字母
2.单词没有连续相等的字母
3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
例如：
小易不喜欢"ABBA"，因为这里有两个连续的'B'
小易不喜欢"THETXH"，因为这里包含子序列"THTH"
小易不喜欢"ABACADA"，因为这里包含子序列"AAAA"
小易喜欢"A","ABA"和"ABCBA"这些单词
给你一个单词，你要回答小易是否会喜欢这个单词（只要不是不喜欢，就是喜欢）。
输入描述:
输入为一个字符串，都由大写字母组成，长度小于100
输出描述:
如果小易喜欢输出"Likes",不喜欢输出"Dislikes"
示例1
输入
AAA
输出
Dislikes
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
       System.out.println(solution());
    }
    public static String solution(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.toUpperCase() != s){
            return "Dislikes";
        }
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return "Dislikes";
            }
        }
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && j!=s.length()-1){
                   if(i+1<s.length()){
                       int k = i+1;
                       for(; k<j; k++){
                           String t = s.substring(j+1);
                           if(t.contains(s.substring(k,k+1))){
                               return "Dislikes";
                           }
                       }
                   }
                }
            }
        }
        return "Likes";
    }
}
