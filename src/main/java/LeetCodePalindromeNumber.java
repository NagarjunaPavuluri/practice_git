public class LeetCodePalindromeNumber {
    public static void main(String args[]) {
      //System.out.println(Math.min(8,8));
      int arr[]={1,8,6,2,5,4,8,3,7};
      int l=0,r=arr.length-1;
      int farea=0;
      while(l!=r){
          int area=0;
          int length=0;
          int breadth=0;
          length=Math.min(arr[l],arr[r]);
          breadth=r-l;
          area=length*breadth;
          if(area>farea){
              farea=area;
          }
          if(arr[l]<arr[r]){
              l++;
          }else{
              r--;
          }
      }
      System.out.println(farea);
    }
}
