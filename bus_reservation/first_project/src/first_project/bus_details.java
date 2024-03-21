package first_project;

public class bus_details {
   private int bus_no;
   private boolean ac;
   private int capacity;
   
   public int getno() {
	   return bus_no;
   }
   public boolean ac() {
	   return ac;
   }
   public int getCapacity() {
	   return capacity;
   }
   public void setac(boolean a){
	   ac=a;
   }
   public void setCapacity(int c){
	   capacity=c;
   }
   
   
   bus_details(int no,boolean a,int c){
	   this.bus_no=no;
	   this.ac = a;
	   this.capacity=c;
	   
	   
   }
   public void DisplayInfo() {
	   System.out.println("Busno: "+bus_no+" AC/NONAC: "+ac+" Capacity: "+capacity);
	   System.out.println();
   }
   
}
