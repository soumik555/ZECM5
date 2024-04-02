package Split;

public class Split {
	
	public static void main(String[] args) {

          String arr[]= {"one","two","three","two,","one","two"};
          
          for(int i=0;i<arr.length;i++)
          {
        	  int count=0;
        	  for(int j=0;j<arr.length;j++)
        	  {
        		  if(arr[i].equals(arr[j]))
        		  {
        			  count++;
        			  
        		  }
        		  
        	  }
        	  if(count==1)
        	  {
        		  System.out.println(arr[i]+ " is  repeated for " + count + " times");
        		  
        	  }
        	  
          }
         
}
	
}

