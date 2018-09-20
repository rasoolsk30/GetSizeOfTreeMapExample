import java.util.TreeMap;

public class GetSizeOfTreeMapExample {
	public static void main(String[] args) {
		   
	    //create TreeMap object
	    TreeMap<String, String> treeMap = new TreeMap<String, String>();
	   
	    /*
	      To get the size of TreeMap use
	      int size() method of TreeMap class. It returns the number of key value
	      pairs stored in TreeMap object.     
	    */
	    System.out.println("Size of TreeMap : " + treeMap.size());
	   
	    //add key value pairs to TreeMap using put method
	    treeMap.put("1","One");
	    treeMap.put("2","Two");
	    treeMap.put("3","Three");
	    System.out.println("Size of TreeMap after addition : " + treeMap.size());
	   
	    System.out.println("Size of TreeMap after removal : " + treeMap.size());
	  }
	}

