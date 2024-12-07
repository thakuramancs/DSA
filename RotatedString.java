public class RotatedString {
        public boolean rotateString(String s, String goal) {
          String ns=s;
          for(int i=0;i<s.length();i++)
          {
           char c=ns.charAt(ns.length()-1);
           ns=ns.substring(0,ns.length()-1);
           ns=c+ns;
           if(ns.equals(goal))
              return true;
          } 
          return false;
        }
    }
