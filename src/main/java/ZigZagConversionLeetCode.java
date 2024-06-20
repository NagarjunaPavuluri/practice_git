public class ZigZagConversionLeetCode {
    public static void main(String [] args){
        int r=4;
        String s="PAYPALISHIRING";
        StringBuilder sb[]=new StringBuilder[r];
        StringBuilder fsb=new StringBuilder();
        for(int i=0;i<r;i++){
            sb[i]=new StringBuilder();
        }
        int j=0;
        int c=1;
        for(int i=0;i<s.length();i++){
            sb[j].append(s.charAt(i));
            System.out.println("j value is "+j+"and sb arrays are "+sb[j]);
            if(j==0){
                c=1;
            }
            if(j==r-1){
                c=0;
            }
            if(c==1){
                j++;
            }else{
                j--;
            }

        }
        for(StringBuilder b:sb){
            fsb.append(b);
        }
        System.out.println("the final result is "+fsb);
    }

}
