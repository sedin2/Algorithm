package Leetcode;

public class Solution {
    public int reverse(int x) {
        int answer = 0;
        String[] str = Integer.toString(x).split("");

        StringBuilder tmp = new StringBuilder();
        if(!str[0].equals("-")&&!str[str.length-1].equals("0")){
            for(int i=str.length-1; i>=0; i--){
                tmp.append(str[i]);
            }
        }else if(!str[0].equals("-")&&str[str.length-1].equals("0")){
            for(int i=str.length-2; i>=0; i--){
                tmp.append(str[i]);
            }
        }else if(str[0].equals("-")&&!str[str.length-1].equals("0")){
            tmp.append("-");
            for(int i=str.length-1; i>0; i--){
                tmp.append(str[i]);
            }
        }else{
            tmp.append("-");
            for(int i=str.length-2; i>0; i--){
                tmp.append(str[i]);
            }
        }

        try{
            if(!tmp.toString().equals("")){
                answer = Integer.parseInt(tmp.toString());
                return answer;
            }
        }catch (NumberFormatException e){
            answer = 0;
        }catch (Exception e){
            answer = 0;
        }
        return answer;
    }
}