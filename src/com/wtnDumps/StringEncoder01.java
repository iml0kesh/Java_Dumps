package com.wtnDumps;
import java.util.*;
public class StringEncoder01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String s[] = {input1,input2,input3};
        String s1first="",s1middle="",s1last="",s2first="",s2middle="",s2last="",s3first="",s3middle="",s3last="";
        int i=0;int n=0;
        for(i=0;i<3;i++){
            if(s[i].length()%3==0){
                n=0;
                n=s[i].length()/3;
                s1first = s1first+s[i].substring(0,n);
                s1middle = s1middle+s[i].substring(n,s[i].length()-n);
                s3last = s3last+s[i].substring(s[i].length()-n);
            }
            if(s[i].length()%3==1){
                n=0;
                n = s[i].length()/3;
                s2first = s2first+s[i].substring(0,n);
                s2middle = s2middle+s[i].substring(n,s[i].length()-n);
                s2last = s2last+s[i].substring(s[i].length()-n,s[i].length());
            }
            if(s[i].length()%3==2){
                n=0;
                n = s[i].length()/3;
                s3first = s3first+ s[i].substring(0,n+1);
                s3middle = s3middle + s[i].substring(n+1,s[i].length()-n-1);
                s3last = s3last + s[i].substring(s[i].length()-n-1,s[i].length());
            }
        }
//        Output1: FRONT part of input 1 + FRONT part of input 2 + FRONT part of input 3
        System.out.println(s1first + s2first + s3first);

//        Output2: MIDDLE part of input1 + MIDDLE part of input2 + MIDDLE part of input3
        System.out.println(s1middle + s2middle + s3middle);

//        Output3: END part of the input1 + END part of input2 + END part of input3
        System.out.println(s1last + s2last + s3last);

//        Output3 should become “NNYHAN”.Final Result – The three output strings after applying the above three steps
        System.out.println((s1last + s2last + s3last).toUpperCase());
    }
}
