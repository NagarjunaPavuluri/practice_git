import java.util.*;
class customer implements Comparable<customer>{
    String name;
    int age;
    long accnum;
    customer(String name,int age,long accnum){
        this.name=name;
        this.age=age;
        this.accnum=accnum;
    }
    //based on the age we are sorting here this code wont be availabe to us when we are working with 3rd party services
    public int compareTo(customer c){
        if(this.age>c.age){
            return 1;
        }else return -1;
    }



}

public class MyClass {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l= Arrays.asList(1,4,2,89,45,3,67,1);
        Collections.sort(l);
        System.out.println(l);//here list contains normal integers so they can work with collections.sort() with out any error
        //now we will what if they contain obj as a type

        List<customer> cu;
        cu=Arrays.asList(new customer("nag",25,23432),
                new customer("raj",50,54678),
                new customer("bhu",24,23445),
                new customer("kali",44,54672));

        //here we already implimented the sorting for the in customer class so when we call sort method it sorts based on that i.e is age
        System.out.println("before sorting ");
        for(customer cd:cu){
            System.out.println(cd.age);
        }
        Collections.sort(cu);
        System.out.println("After sorting ");
        for(customer cd:cu){
            System.out.println(cd.age +"andacc num "+cd.accnum);
        }

        //so now i want to compare based on the account number here comparator need to use because we are writting our own logic

        Comparator<customer> cc=new Comparator<customer>() {
            public int compare(customer c1,customer c2){
                if(c1.accnum>c2.accnum){
                    return 1;
                }else return -1;
            }

        };
        /*Comparator<customer> cc1=(c1,c2)->{if(c1.accnum>c2.accnum) return 1;
        else return -1;};*/  //this using lambda
        System.out.println("before sorting of comparator");
        for(customer cd:cu){
            System.out.println(cd.age +"andacc num "+cd.accnum);
        }
        Collections.sort(cu,cc);
        System.out.println("after sorting of comparator");
        for(customer cd:cu){
            System.out.println(cd.age +"andacc num "+cd.accnum);
        }
    }
}
