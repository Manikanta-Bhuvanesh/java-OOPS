import java.util.*; 
class Queue1
{
Scanner sc=new Scanner(System.in);
int n;
String msg;
boolean run = false; 
synchronized int recvMessage()
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
System.out.print("User2: ");
msg=sc.nextLine();
run = true;
System.out.println();
run=false;
notify();
return n;
}
synchronized void sendMessage(int n)
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
System.out.print("User1: ");
msg=sc.nextLine();
run = true;
System.out.println();
notify();
}
}
class User1 implements Runnable
{
Queue1 que;
Thread t;
User1(Queue1 que)
{
this.que=que;
t=new Thread(this, "User1");
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
que.sendMessage(i++);
}
}
}
class User2 implements Runnable
{
Queue1 que;
Thread t;
User2 (Queue1 que)
{
this.que = que;
t=new Thread (this,"User2");
}
public void run ()
{
while(true)
{
que.recvMessage();
}
}
}
public class Message{
public static void main(String args[])
{
Queue1 que =new Queue1();
User1 u1 = new User1 (que);
User2 u2 = new User2 (que);
u1.t.start();
u2.t.start();
}
}