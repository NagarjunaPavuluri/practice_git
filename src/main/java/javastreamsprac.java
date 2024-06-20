import java.util.*;
import java.util.stream.Stream;

class product{
    int id;
    String name;
    int price;

    public product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
}
class product1{
    int id;
    String name;
    int price;

    public product1(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;

    }
}

public class javastreamsprac {
    public static void main(String args[]) {
       /* List<Integer>l= Arrays.asList(1,56,43,7,25,2,5,0);
        int p[]={1,2,4,7,8,9,0,9};
        int sum1=Arrays.stream(p).sum();
        System.out.println(sum1);
        final List<Integer> result=l;
        for (int i = 0; i < result.size() - 1; i++) {
            int currentIndex = i;
            List<List<Integer>> re= IntStream.range(0, result.size() - 1 - i)
                    .mapToObj(j -> {

                        if (result.get(j) > result.get(j + 1)) {
                            // Swap elements
                            int temp = result.get(j);
                            result.set(j, result.get(j + 1));
                            result.set(j + 1, temp);
                        }
                        return result;
                    }).collect(Collectors.toList());

        }
        System.out.println(result);*/

        List<product> pr=new ArrayList<>();
        pr.add(new product(1,"lenovo",28000));
        pr.add(new product(2,"dell",32000));
        pr.add(new product(3,"hp",22000));
        List<product> pr1=new ArrayList<>();
        pr1.add(new product(1,"len",15000));
        pr1.add(new product(2,"de",20000));
        pr1.add(new product(3,"hphp",18000));

        List<List<product>> pl=Arrays.asList(pr,pr1);

        List<String>ps=pl.stream().flatMap(s->s.stream()).filter(t->t.price>18000).map(p->p.name).toList();
        System.out.println("ps is "+ps);
        List<String> veh= Arrays.asList("car","aeroplane","cycle","Bike","cycle","bike");
        pr.stream().filter(p->p.price>22000 && p.price<30000).forEach(s->System.out.println(s.name +" "+ s.price));
        List<String> c=veh.stream().distinct().limit(3).toList();
        System.out.println("count is "+ c);
        List<Integer>len=veh.stream().map(m->m.length()).toList();
        System.out.println(len);

        List <Integer>l1=Arrays.asList(1,2);
        List <Integer>l2=Arrays.asList(3,4);
        List <Integer>l3=Arrays.asList(5,6);

        List<List<Integer>> fl=Arrays.asList(l1,l2,l3);

        fl.stream().flatMap(x->x.stream().map(n->n*10)).forEach(System.out::println);

        List <Integer>lm=Arrays.asList(10,76,45,8,54,2,8,0);

       Optional<Integer>min=lm.stream().max((a, b)-> a.compareTo(b));
       System.out.println(min);

        List<Integer>pp=pl.stream().flatMap(s->s.stream().filter(k->k.price>18000).map(a->a.price)).toList();
        Optional min1=pp.stream().min((a,b)->a.compareTo(b));

        System.out.println("optional "+min1);

        //reduction
        List <String>sm=Arrays.asList("A","B","C","D");

        String sms=sm.stream().reduce("",(a,b)->a+b);
        System.out.println("reduction "+sms);
        sm.stream().sorted().forEach(System.out::print);//ascending
        System.out.println();
        sm.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);//descending same for integers

        //concat
        Stream<String >t1=sm.stream();
        Stream<String>t2=veh.stream();
       List<String>ftr= Stream.concat(t1,t2).toList();
       System.out.println();
        System.out.println(ftr);
    }
}