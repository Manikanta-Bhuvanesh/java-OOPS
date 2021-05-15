import java.util.*;
class Queue
{
int n;
boolean run = false;
synchronized int get()
{
while(!run)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println("Produced " + n);
run=false;
notify();
return n;
}
synchronized void set(int n)
{
while(run)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println(e);
}
this.n = n;
run = true;
System.out.println("Consumed " + n);
notify();
}
}
class Producer implements Runnable
{
Queue q;
Thread t;
Producer(Queue q)
{
this.q=q;
t=new Thread(this, "Producer");
}
public void run()
{
int i = 0;
while (true)
{
if(i>5)
{
System.exit(0);
}
q.set(i++);
}
}
}
class Consumer implements Runnable
{
Queue q;
Thread t;
Consumer (Queue q)
{
this.q = q;
t=new Thread (this,"Consumer");
}
public void run ()
{
while(true)
{
q.get();
}
}
}
class Sell
{
public static void main(String args[])
{
Queue q =new Queue();
Producer p = new Producer (q);
Consumer c = new Consumer (q);
p.t.start();
c.t.start();
}
}