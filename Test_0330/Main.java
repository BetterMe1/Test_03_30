package Test_0330;

/*
���֤����
 ��Ŀ����
18λ���֤�ı�������ǣ�
ǰ1��2λ���ֱ�ʾ������ʡ��ֱϽ�С����������Ĵ���
��3��4λ���ֱ�ʾ�����ڵؼ��У������ݣ��Ĵ���
��5��6λ���ֱ�ʾ�����������ء������ء��ؼ��У��Ĵ��룻
��7��14λ���ֱ�ʾ�������ꡢ�¡��գ�
��15��16λ���ֱ�ʾ�����ڵص��ɳ����Ĵ��룻
��17λ���ֱ�ʾ�Ա�������ʾ���ԣ�ż����ʾŮ�ԣ�
��18λ������У���룬�����������֤����ȷ�ԡ�
�û����������֤�Ĺ����о������������Ϊ�˷����û���ȷ������Ҫ����������ж��û������밴�� 6+8+4 �ĸ�ʽ���з��飬ʵ��һ������������������е����֤�ţ����ط������ַ�
��������:
���������ж��У�ÿһ����һ����������е����֤��
�������:
�������ַ���
ʾ��1
����
5021
502104 198803
5021041988033084
502104198803308324
���
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
 * Fibonacci����
 * ��Ŀ����
Fibonacci��������������ģ�
F[0] = 0
F[1] = 1
for each i �� 2: F[i] = F[i-1] + F[i-2]
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...����Fibonacci�����е������ǳ�ΪFibonacci��������һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����
��������:
����Ϊһ��������N(1 �� N �� 1,000,000)
�������:
���һ����С�Ĳ�����ΪFibonacci��"
ʾ��1
����
15
���
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
С��ϲ���ĵ���
 ��Ŀ����
С��ϲ���ĵ��ʾ����������ԣ�
1.����ÿ����ĸ���Ǵ�д��ĸ
2.����û��������ȵ���ĸ
3.����û�����硰xyxy��(�����x��yָ�Ķ�����ĸ�����ҿ�����ͬ)�����������У������п��ܲ�������
���磺
С�ײ�ϲ��"ABBA"����Ϊ����������������'B'
С�ײ�ϲ��"THETXH"����Ϊ�������������"THTH"
С�ײ�ϲ��"ABACADA"����Ϊ�������������"AAAA"
С��ϲ��"A","ABA"��"ABCBA"��Щ����
����һ�����ʣ���Ҫ�ش�С���Ƿ��ϲ��������ʣ�ֻҪ���ǲ�ϲ��������ϲ������
��������:
����Ϊһ���ַ��������ɴ�д��ĸ��ɣ�����С��100
�������:
���С��ϲ�����"Likes",��ϲ�����"Dislikes"
ʾ��1
����
AAA
���
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
