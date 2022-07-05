package Integer;

import java.util.Arrays;

public class finbonanci {


    public static String longestCommonPrefix(String[] strs) {

        if (strs == null) return null;
        if (strs.length == 0) return "";

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last  = strs[strs.length - 1].toCharArray();

        int i = 0, len = Math.min(first.length, last.length);
        while (i < len && first[i] == last[i]) i++;
        System.out.println(strs[0].substring(0, i));
        return strs[0].substring(0, i);


    }

    public static void main(String[] args) {

     /*   int n1=0,n2=1;

        int n3=0;
        int count =10;

        for (int i = 0;i<count ; i++) {

            n3 = n1 + n2;
            System.out.print(" " +n3);
            n1 = n2;
            n2=n3;

        }
*/
String[] a ={"flower","flow","fligth"};
        System.out.println(a.length);
longestCommonPrefix(a);
    }
}
