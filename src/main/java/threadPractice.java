class student extends employee implements Runnable{
    public student(int a, int b) {
        super(a, b);
    }

    public void run(){
        System.out.println("2 X 1 = "+ (2*1));
        System.out.println("2 X 2 = "+ (2*2));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2 X 3 = "+ (2*3));
        System.out.println("2 X 4 = "+ (2*4));
        multiply(3);
        System.out.println(currentThread().getName());
    }
    public void multiply(int n){
        System.out.println("3 X 1 = "+ (3*1));
        System.out.println("3 X 2 = "+ (3*2));
        System.out.println("3 X 3 = "+ (3*3));
        System.out.println(currentThread().getName());
        System.out.println("3 X 4 = "+ (3*4));
    }

}
class employee extends Thread{
    int a=10;
    int b=2;
    public employee(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void run(){
        System.out.println("1.sum of a+b is "+(a+b));
        System.out.println("2.product of a+b is "+(a*b));
        System.out.println("3.division of a+b is "+(a/b));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3.Modular division of a+b is "+(a%b));
        System.out.println(currentThread().getName());
    }

}
public class threadPractice {
    public static void main(String[] args) {
        employee e=new employee(10,3);
        student s=new student(9,3);
        Thread t=new Thread(s);
        t.start();
        e.start();
        t.setName("raji");
        e.setName("chinnu");
        Thread.currentThread().setName("Nag");
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

    }
}