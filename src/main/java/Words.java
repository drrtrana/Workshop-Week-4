public class Words {
    public static String separateWords(String s) {
        String answer = s.charAt(0) + "";
        int i = 1;
        while(i < s.length()){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                answer += " " + s.charAt(i);
            }
            else {
                answer += s.charAt(i);
            }
            i++;
        }

        return answer;
    }
}
