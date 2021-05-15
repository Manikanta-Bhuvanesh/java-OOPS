interface GenericQueuable<T>{
	public void insertEnd(T e);
	public void removeBegin();
	public void printQueue();
	public boolean isQueueEmpty();
}
class GenericQueue<T> implements GenericQueuable<T>{
	int front,rear;
	int max;
	T a[];
	GenericQueue(int max){
		this.max=max;
		front=rear=0;
		a=(T[]) new Object[max];
	}
	public void insertEnd(T e){
		if(rear==max){
			System.out.println("Queue is full");
		}
		else{
			a[rear]=e;
			rear++;
		}
	}
	public void removeBegin(){
		if(front==rear){
			System.out.println("Queue is empty");
		}
		else{
			for(int j=0;j<rear-1;j++){
			    a[j]=a[j+1];
			}
			rear--;
		}
	}
	public void printQueue(){
		for(int i=front;i<rear;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public boolean isQueueEmpty(){
		if(rear==front){
			return true;
		}
		else{
			return false;
		}
	}
}
public class GenericQueueDemo{
	public static void main(String[] args) {
		GenericQueue<Person> g = new GenericQueue<Person>(3);
		Person p1=new Person("guru","thota","vijayawada",502355,9555560461L);
		Person p2=new CollegeEmployee("lokesh","nara","hyderabad",500001,9755552147L,64,800000,"ECE");
		Person p3=new Faculty("nilesh","kota","guntur",522001,7555799528L,54,1100000,"CSE",true);
		Person p4=new Student("ron","weasly","agiripalli",521211,9014914993L,"CSE",8.89);
		g.insertEnd(p1);
		g.insertEnd(p2);
		g.insertEnd(p3);
		g.printQueue();
		g.removeBegin();
		g.insertEnd(p4);
		g.printQueue();
	}
}