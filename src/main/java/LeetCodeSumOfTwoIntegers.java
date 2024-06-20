class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return Caluclation(l1,l2);

    }
    public ListNode Caluclation(ListNode l1,ListNode l2){
        ListNode firstNode=null;
        ListNode temp=null;
        ListNode prevNode=null;
        int sum=0;
        int r1=0;
        int r2=0;

        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+r2;
            r1=sum%10;
            r2=sum/10;
            temp =new ListNode(r1);
            if(firstNode!=null)
            {
                prevNode.next = temp;
            }else{
                firstNode=temp;
            }
            prevNode=temp;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode ll= firstNode;

        while(l1!=null){
            sum=l1.val+r2;
            r1=sum%10;
            r2=sum/10;
            temp=new ListNode(r1);
            prevNode.next=temp;
            prevNode=temp;
            l1=l1.next;

        }
        while(l2!=null){
            sum=l2.val+r2;
            r1=sum%10;
            r2=sum/10;
            temp=new ListNode(r1);
            prevNode.next=temp;
            prevNode=temp;
            l2=l2.next;

        }
        if(r2!=0){
            temp=new ListNode(r2);
            prevNode.next=temp;
        }
        return firstNode;
    }

}
public class LeetCodeSumOfTwoIntegers{
    public static void main(String []args){
        //List<Integer> l=new LinkedList<>();
        ListNode l1=new ListNode(9);

        ListNode l12 =new ListNode(9);
        l1.next=l12;
        ListNode l13=new ListNode(9);
        l12.next=l13;
        ListNode l14,l15,l16,l17;
        l14=new ListNode(9);
        l13.next=l14;
        l15=new ListNode(9);
        l14.next=l15;
        l16=new ListNode(9);
        l15.next=l16;
        l17=new ListNode(9);
        l16.next=l17;


        ListNode l2=new ListNode(9);
        ListNode l21 =new ListNode(9);
        l2.next=l21;
        ListNode l22=new ListNode(9);
        l21.next=l22;
        ListNode l23 =new ListNode(9);
        l22.next=l23;


        Solution s=new Solution();
        ListNode l3=s.addTwoNumbers(l1,l2);
        print(l3);

    }
    public static void print(ListNode l1){
        while(l1!=null){
            System.out.println(l1.val);
            l1=l1.next;
        }
    }

}

