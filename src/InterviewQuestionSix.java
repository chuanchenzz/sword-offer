public class InterviewQuestionSix {

    public static void main(String[] args){
        String s = "We are happy!";
        System.out.print(replaceSpace(s));
    }

    public static String replaceSpace(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }
        char[] chars = s.toCharArray();
        int spaceCount = 0;
        for (Character c : chars){
            if(c == ' '){
                spaceCount++;
            }
        }
        char[] newChars = new char[chars.length + 2 * spaceCount];
        int j = 0;
        for (int i = 0;i < chars.length; i++){
            if(chars[i] != ' '){
                newChars[j++] = chars[i];
            }else {
                newChars[j++] = '%';
                newChars[j++] = '2';
                newChars[j++] = '0';
            }
        }
        return new String(newChars);
    }
}
