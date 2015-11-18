package ostpc;
import java.util.Vector;
public class Program {
	public static void main(String[] args) {

		// Add two values to Vector.
		Vector<String> name = new Vector<>(5);
		
		name.addElement("Mike");
		name.addElement("John");
        name.clear();
		name.addElement("Kurt");
		name.addElement("Sam");
		name.addElement("Bill");
		for (String names : name) {
		    System.out.println(names);
		}
		System.out.println("We got " + name.get(1));
		System.out.println("We deleted " + name.remove(0));
		
		
		
}}
