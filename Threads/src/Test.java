import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

class Parent {
	public Parent() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Child");
	}
}

class Employee {
	int id;

	Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id % 5;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
}

public class Test {
	public static void main(String[] args) {
		Child c = new Child();

		List<Integer> list = Arrays.asList(10, 20, 30);

		Stream<Integer> stream = list.stream().filter(x -> x > 10);
		System.out.println(stream.count());
		// System.out.println(stream.count());

		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(15);
		Employee e3 = new Employee(10);

		map.put(e1, "A");
		map.put(e2, "B");
		map.put(e3, "C");

		System.out.println(map.size());

		System.out.println(map.get(new Employee(10)));

		Set<String> set = new TreeSet<>((a, b) -> a.length() - b.length());

		set.add("Java");
		set.add("Spring");
		set.add("Boot");
		set.add("API");

		System.out.println(set);
	}
}
