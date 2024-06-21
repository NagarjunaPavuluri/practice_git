public class LeetCodeLongestCommonPrefix {
    public static void main(String[] args) {
        String []a={"car","cir"};
        int count=1;

        StringBuilder sb=new StringBuilder();

        int min=Integer.MAX_VALUE;
        for(String str:a){
            if(str.length()<min){
                min=str.length();
            }
        }
        if(min==0){
            System.out.println(min);
        }else{
            for(int i=0;i<min;i++){
                String c=Character.toString(a[0].charAt(i));
                boolean f=true;
                for(int j=1;j<a.length;j++){
                    String c1=Character.toString(a[j].charAt(i));
                    if(!c1.equals(c)){
                        f=false;
                        break;
                    }


                }
                if(f){
                    sb.append(c);
                }else{
                    break;
                }


            }
            System.out.println(sb +""+count);
        }
//sb.append(a[0].charAt(0));

    }
}
