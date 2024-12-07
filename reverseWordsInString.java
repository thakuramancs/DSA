public class reverseWordsInString {
    public String reverseWords(String s1) {
        String s=s1.trim();
        String nst="";
        int i=s.length()-1;
        int j=s.length();
        while(i>=0)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                nst=nst+s.substring(i+1,j)+" ";
                while(s.charAt(i)==' ')
                {
                    i--;
                }
                j=i+1;
                i=j;
            }
            i--;
        }
        nst=nst+s.substring(0,j);
        return nst;
    }
} 
