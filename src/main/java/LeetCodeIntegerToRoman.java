public class LeetCodeIntegerToRoman {
    public static void main(String args[]) {
        //StringBuilder sb=new StringBuilder();
        int x=1994;
        System.out.println(conversion(x));
    }
    public static StringBuilder conversion(int x){
        StringBuilder sb=new StringBuilder();
        if(x>=1000 && x<=3999){
            if(x==1000){
                return sb.append("M");
            }
            else{
                sb.append("M");
                return sb.append(conversion(x-1000));
            }
        }
        if(x>=500 && x<1000){
            if(x>=900 && x<=999){
                sb.append("CM");
                return sb.append(conversion(x-900));
            }else{
                sb.append("D");
                return sb.append(conversion(x-500));
            }
        }
        if(x>=100 && x<500){
            if(x>=400 && x<=499){
                sb.append("CD");
                return sb.append(conversion(x-400));
            }else{
                sb.append("C");
                return sb.append(conversion(x-100));
            }
        }
        if(x>=50 && x<100){
            if(x>=90 && x<=99){
                sb.append("XC");
                return sb.append(conversion(x-90));
            }else{
                sb.append("L");
                return sb.append(conversion(x-50));
            }
        }
        if(x>=10 && x<50){
            if(x>=40 && x<=49){
                sb.append("XL");
                return sb.append(conversion(x-40));
            }else{
                sb.append("X");
                return sb.append(conversion(x-10));
            }
        }
        if(x>=5 && x<10){
            if(x==9){
                return sb.append("IX");
            }
            else{
                sb.append("V");
                return sb.append(conversion(x-5));
            }
        }
        if(x>=1 && x<5){
            if(x==4){
                return sb.append("IV");
            }
            else{
                sb.append("I");
                return sb.append(conversion(x-1));
            }
        }
        return sb;
    }
}
