class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
             Arrays.sort(strs);
             String s="";
             int index=0;
             for(int i=0;i<strs[0].length();i++)
             {
                if(strs[0].charAt(i)==(strs[strs.length-1]).charAt(i))
                     index++;
                else 
                   break;
             }
              return index==0?"":strs[0].substring(0,index);
    }
}