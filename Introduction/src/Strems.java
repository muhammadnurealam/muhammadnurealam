import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>names=new ArrayList<String>();
		
		/*names.add("Adam");
		names.add("Don");
		names.add("Smith");
		names.add("Arian");
		names.add("Alam");
		int count=0;
		
		for(int i=0; i<names.size();i++) {
		String actual=names.get(i);
		
		if(actual.startsWith("A")) {
			count++;
		}
		
		}
		System.out.println(count);*/
	

		names.add("Adam");
		names.add("Don");
		names.add("Smith");
		names.add("Arian");
		names.add("Alam");
		
		
	
	long co=names.stream().filter(k->k.startsWith("A")).count();
	System.out.println(co);
	
	long lambda=Stream.of("Adam","Don","Smith","arian","Alam").filter(s->s.startsWith("A")).count();
	System.out.println(lambda);
	
	names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	Stream.of("Adam","Kim","Kiron","muhammad").filter(p->p.endsWith("m")).map(f->f.toUpperCase()).forEach(s->System.out.println(s));
	
	List<String> res=Stream.of("Adam","Kim","muhammad").filter(p->p.startsWith("A")).map(f->f.toUpperCase()).sorted().collect(Collectors.toList());
	System.out.println(res);
	
	List<Integer> index= Arrays.asList(1,3,4,3,6,9);

	List<Integer> result=index.stream().distinct().sorted().collect(Collectors.toList());
	
	System.out.println(result.get(3));
	
	
	
	}
	
	
	

}
