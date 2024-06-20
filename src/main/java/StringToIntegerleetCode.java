public class StringToIntegerleetCode {
    public static void main(String args[]) {
        String s="-91283472332";
        String m=s.trim();
        StringBuilder sb=new StringBuilder();
        String s1=String.valueOf(s.charAt(0));
        boolean flag=true;

        if(Character.isAlphabetic(m.charAt(0))){
            sb=new StringBuilder("0");

        }else{

            sb.append(m.charAt(0));

            for(int i=1;i<m.length();i++){
                if(String.valueOf(m.charAt(i)).equals(" ") || String.valueOf(m.charAt(i)).equals("+") || String.valueOf(m.charAt(i)).equals("-") || String.valueOf(m.charAt(i)).equals(".") || Character.isAlphabetic(m.charAt(i))){//s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'
                    break;
                }else{
                    sb.append(m.charAt(i));
                }



            }
        }

        if(sb.toString().equals("-") || sb.toString().equals("+") ) {
            sb=new StringBuilder("0");

        }
        Integer c=(int)Double.parseDouble(sb.toString());
        if(c>=Integer.MAX_VALUE ){
            c=Integer.MAX_VALUE;
        }
        if(c<=Integer.MIN_VALUE){
            c=Integer.MAX_VALUE;
        }
        System.out.println("final append "+c);
    }

}
