package JavaProgram;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachJava{

	public static void main(String[] args) {
		
		ArrayList<Integer> numb = new ArrayList<Integer>();
		numb.add(21);
		numb.add(33);
		numb.add(41);
		numb.add(57);
		numb.add(30);
		numb.add(30);
		numb.add(72);
		numb.add(-45);
		
		System.out.println(numb);
		
		List<Integer> numb1 = numb.stream().map(i -> i+10).collect(Collectors.toList());
		numb1.stream().forEach(i -> System.out.println(i + " "));
		
		System.out.println(" ");
		numb.stream().forEach(System.out::println);

	}


}



