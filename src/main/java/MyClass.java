import java.util.HashMap;
import java.util.Iterator;

public class MyClass {
    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<>();
        hm.put("a","nag");
        hm.put("b","pavuluri");
        hm.put("c","bhu");
        //hm.put(2,"naag");
        hm.forEach((k, v)->System.out.println(k+" "+v));
        System.out.println(hm);
        Iterator<String> i=hm.keySet().iterator();
        Iterator<String> s=hm.values().iterator();
        while(i.hasNext() && s.hasNext()){
            //System.out.println("key is "+i.next()+" and value is "+s.next());
            System.out.println("Hash code for the key is "+i.next().hashCode());
            //i.next();
        }


    }
}
