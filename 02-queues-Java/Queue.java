public class Queue{
	int[] storage = new int[20];
	int front;
	int rear;
	int size;
	public Queue(int head){
		front = 0;
		rear = 0;
		storage[rear++] = head;
	}
	
	public void enqueue(int new_ele){
		if(!isFull())
		{
			storage[rear]=new_ele;
			rear=(rear+1)%20; // used for circular 
			size++;
		}
	}

	//This method is use for checking the test cases
	// public void show()
	// {
	// 	for(int i=0;i<=size;i++)
	// 	{
	// 		System.out.println(storage[(front+i)%5]+ " ");	
	// 	}
	// }

	public int peek(){
		int frontValue=0;
		if(!isEmpty())
		{
			frontValue=storage[front];
		}
		return frontValue;
	}

	public int dequeue(){
		int data=storage[front];
		if(!isEmpty())
		{
			front=(front+1)%20;
			size--;
		}
		return data;
	}

	public int sizeCheck()
	{
		return size;
	}

	public boolean isFull()
	{
		return sizeCheck()==20;
	}

	public boolean isEmpty()
	{
		return sizeCheck()==0;
	}
}