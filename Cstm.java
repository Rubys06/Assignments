package examole;

 class Cstm implements  Stackk {
	int arr[];
	int head=-1;
	int size=0;
	Cstm(){
		 arr =new int[10];
	}
	Cstm(int size) {
	 arr=new int[size];
	}
	public boolean push(int i) {
		if(head<0)
			System.out.println("underflow");
		head++;
		if (head==arr.length)
		return false;
		else
			arr[head]=i;
		System.out.println(arr[head]);
		size++;
		return true;
		
		
	}
	public int pop() throws Exception {
		if(head==-1) throw new Exception();
		
		//else if(arr[head]== i)
		size--;	
		 
		  
		return arr[head--];
		
		//head--;
		
	}
	public int peek() throws Exception {
		if(head==-1) throw new Exception();
		
		else
			 return arr[head];
		
		
	}
	public int isEmpty() {
		if (head==-1)
			return 0;
		return head;
		
		
	}
	public int size() {
		return size;
		
	}

public static void main(String[] args) throws Exception {
	
	Cstm c= new Cstm(5);
	c.push(1);
	c.push(2);
	c.push(5);
	c.pop();
	//c.push(7);
	System.out.println(c.head);

}
}
