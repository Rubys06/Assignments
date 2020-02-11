package examole;

public class Queeee {
	
	 
	  int capacity;
	 int arr[];
	 int front=0;
	 int rear=-1 ;
	 int currentSize = 0;
	 
	public Queeee(int i)
	{
	 
		arr=new int[i];
	 }
	 
	
	 public void enqueue(int data) {
	 if (isFull()) {
	 System.out.println("Queue is full");
	 } 
	 else 
	 {
	 rear++;
	 if(rear< (arr.length-1)){
	 //rear = 0;
	 
	 arr[rear] = data;
	 }
	 currentSize++;
	 System.out.println(data+ " added to the queue");
	 }
	 }
	 
	
	 public void dequeue( int j) 
	 {
	 if (isEmpty()) {
	 System.out.println("Queue is empty");
	 } else {
	 front++;
	 if(front == (arr.length)-1){
	 System.out.println(arr[front-1]+" removed ");
	 front = 0;
	 } else {
	 System.out.println(arr[front-1]+" removed ");
	 }
	 currentSize--;
	 }
	 }
	 
	 
	 public boolean isFull(){
	 if (currentSize == arr.length){
	 return true;
	 }
	 return false;
	 }
	 
	
	 public boolean isEmpty(){
	 
	 if (currentSize == 0){
	 return true;
	 }
	 return false;
	 }
	 
	 public static void main(String args[]){
	 
		 Queeee queue = new Queeee(5);
	 queue.enqueue(6);
	 queue.enqueue(5);
	 queue.dequeue(5);
	 queue.enqueue(3);
	 queue.enqueue(99);
	 queue.enqueue(56);

}
}
