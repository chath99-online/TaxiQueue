import java.util.*;

class TaxiQueue{
	public int rear;
	public int front;
	public int size=10;
	String[] taxid = new String[size];
	
	public TaxiQueue(){
		front =-1;
		rear = -1;
	}
	public boolean isEmpty(){
		if(front==-1){
			return true;
		} else{
			return false;
		}
	}
	public boolean isFull(){
		if(front ==0 && rear==size-1){
			return true;
		} else {
			return false;
		}
	}
	public void enQueue(String x){
		if(isFull()){
	  		System.out.println("The Queue is full");
	  	} else {
	  		if(front==-1){
	  			front=0;
	  		}
	  		rear++;
	  		taxid [rear] = x;
	  		System.out.println("The taxi "+x+" is inserted.");
	  	}
	}
	public String deQueue(){
		String x;
	  	if(isEmpty()){
	  		System.out.println("The Queue is empty.");
	  		return("0");
	  	} else{
	  		x = taxid [front];
	  		if(front >= rear){
	  			front=-1;
	  			rear=-1;
	  		} else{
	  			front++;
	  			size--;
	  			
	  			
	  		}
	  		System.out.println("The inserted taxi deleted");
	  		return(x);
	  	}	
	}
	public String getFront(){

		return(taxid[front]);
	}
	public void printQueue(){
		int i;
	  	if(isEmpty()){
	  		System.out.println("The Queue is empty");
	  	} else {
	  		
	  		for(i=front; i<= rear; i++){
	  			System.out.println(taxid[i]+" ");
	  		}
	  	}
	}

}
public class MMCTaxiQueue{
	public static void main(String [] args){
		TaxiQueue tq = new TaxiQueue();
		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the taxi ids:");
		for(int i=0; i<5; i++){
			
			x= sc.nextLine();
			tq.enQueue(x);
		}
		System.out.println("Taxis:");
		tq.printQueue();
		
		
			tq.deQueue();
			tq.deQueue();
		
		System.out.println("Waiting Taxis:");
		tq.printQueue();
		tq.getFront();
	}
}
