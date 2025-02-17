
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testin {
	
	public static void main(String[] args) {
		
	String	str = "jdjdhzieyIkekdjuoooa";
	     
	      String [] arr = str.split("");
	      
	       Map<String, Long> map       =Stream.of(arr).filter(e->
	                  e.contains("a")||e.contains("e")||e.contains("i")||e.contains("o")||e.contains("u")
	            		   ).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       
	       map.forEach((k,v)->System.out.println(k+" :  "+v));
	}

}
