public class LeetCodeRomanToInteger {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("MMMCMXCIX");
//System.out.println(sb.charAt(0));
        long sum=0;
        for(int i=0;i<sb.length();i++){
            String s1=Character.toString(sb.charAt(i));
            StringBuilder s= new StringBuilder(s1);
            if(i<sb.length()-1){
                String s2=String.valueOf(sb.charAt(i+1));
                if((s1.equals("I") && s2.equals("V")) || (s1.equals("I") && s2.equals("X")) ){
                    s.append(s2);
                    i=i+1;
                }
                else if((s1.equals("X") && s2.equals("L")) || (s1.equals("X") && s2.equals("C")) ){
                    s.append(s2);
                    i=i+1;
                }
                else if((s1.equals("C") && s2.equals("D")) || (s1.equals("C") && s2.equals("M")) ){
                    s.append(s2);
                    i=i+1;
                }

            }
            switch (s.toString()){
                case "I":sum+=1;
                    break;
                case "IV":sum+=4;
                    break;
                case "V" :sum+=5;
                    break;
                case "IX":sum+=9;
                    break;
                case "X":sum+=10;
                    break;
                case "XL":sum+=40;
                    break;
                case "L":sum+=50;
                    break;
                case "XC":sum+=90;
                    break;
                case "C":sum+=100;
                    break;
                case "CD":sum+=400;
                    break;
                case "D":sum+=500;
                    break;
                case "CM":sum+=900;
                    break;
                case "M":sum+=1000;
                    break;

            }
            s=new StringBuilder();
        }
        System.out.println(sum);
    }
}
