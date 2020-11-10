package ksj.practice.algorithm.hackerrank.practice.interviewprepare.warmup;


import java.util.Scanner;

/*
정규식으로 IP인지 체크하는 문제

앞부분
2 [0~4] [숫자]
25 [0~5]
[0~1] [숫자] [숫자]
.
3번반복

마지막 (. 없음)
2 [0~4] [숫자]
25 [0~5]
[0~1] [숫자] [숫자]
 */
public class JavaRegexIp {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
//        String[] IpList = {
//                "259.259.259.259",
//                "266.266.266.266",
//                "255.255.255.255",
//                "555.555.555.555",
//                "666.666.666.666",
//                "249.249.249.249",
//                "249.249.249.256",
//        };
//        for (String IP : IpList) {
//            System.out.println(IP + " : " + IP.matches(new MyRegex().pattern));
//        }
    }
}
class MyRegex {

    public String pattern;
    public MyRegex() {
        this.pattern = "^((?:2[0-4]\\d|25[0-5]|[0-1]?\\d?\\d)\\.){3}(?:2[0-4]\\d|25[0-5]|[0-1]?\\d?\\d)$";
    }
}