package ksj.practice.algorithm.hackerrank.practice.interviewprepare.warmup;


public class JavaRegexIp {

    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        Hello.IP
//        while(in.hasNext()){
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }
        String[] IpList = {

                "259.259.259.259",
                "266.266.266.266",
                "255.255.255.255",
                "555.555.555.555",
                "666.666.666.666",
                "249.249.249.249",
                "249.249.249.256",
        };
        for (String IP : IpList) {

            System.out.println(IP + " : " + IP.matches(new MyRegex().pattern));
        }

    }

}


class MyRegex {

    public String pattern;

    public MyRegex() {
        this.pattern = "^((?:2[0-4]\\d|25[0-5]|[0-1]?\\d?\\d)\\.){3}(?:2[0-4]\\d|25[0-5]|[0-1]?\\d?\\d)$";
    }


}
//Write your code here