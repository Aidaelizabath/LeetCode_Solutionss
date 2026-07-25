class Solution {
    public int romanToInt(String s) {
        int sum =0;
        for(int i=0;i<s.length()-1;i++){
           int ch1 = m1(s.charAt(i));
           int ch2 = m1(s.charAt(i+1));
           if(ch1>=ch2){
            sum+=ch1;
           }
           else{
            sum-=ch1;
           }
        }
        sum+=m1(s.charAt(s.length()-1));
        return sum;
    }
    public static int m1(char ch){
        if(ch=='I'){return 1;}
        if(ch=='V'){return 5;}
        if(ch=='X'){return 10;}
        if(ch=='L'){return 50;}
        if(ch=='C'){return 100;}
        if(ch=='D'){return 500;}
        if(ch=='M'){return 1000;}
        return 0;
    }
}