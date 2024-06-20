public class LongestPalindromicSubstring {
    public static void main(String args[]) {
        StringBuilder s=new StringBuilder("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa");
        StringBuilder finstr=new StringBuilder();
        StringBuilder cstr=new StringBuilder();
        int count=0;
        int j=0;
        while(j<s.length()){
            System.out.println("------------j-------"+j);
            for(int i=s.length()-1;i>j;i--){
                String q=Character.toString(s.charAt(j));
                System.out.println("q is   "+q);
                String p=Character.toString(s.charAt(i));
                System.out.println("p is   "+p);
                if(q.equals(p)){

                    System.out.println("true at "+i);
                    StringBuilder sub=new StringBuilder(s.substring(j,i+1));
                    System.out.println("sub value  "+sub);
                    String subc=String.valueOf(sub);
                    String subR= String.valueOf(sub.reverse());

                    System.out.println("subr value  "+subR);
                    if(subc.equals(subR) && finstr.length()<sub.length()){
                        System.out.println("sub and sub are equal");
                        count=1;
                        finstr=new StringBuilder(sub);
                        System.out.println("finstr  "+finstr);
                    }
                }
            }
            j++;
        }
        if(count==0){
            System.out.println("count   "+count);
            String c=Character.toString(s.charAt(0));
            finstr=new StringBuilder(c);
            System.out.println("s.charat(0)"+c);
        }
        System.out.println("finstr value at the end "+finstr);
    }
}