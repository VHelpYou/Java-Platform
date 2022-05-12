package ss.training.java.collections.examples.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
	     users.add(new User(1,"Rajeev", 25));
	     users.add(new User(2,"John", 34));
	     users.add(new User(3,"Steve", 29));
	     users.add(new User(4,"Chtehan", 29));
	     
	     users.sort((user1, user2) -> {
            return user1.getAge() - user2.getAge();
        });
	     
	}
	 
     
}

 class User implements Comparable<User> {
	private int id;
	private String name;
	private int age;

	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		boolean isSame = false;
		if (obj instanceof User) {
			User user = (User) obj;
			if (this.id == user.id && this.age == user.age && this.name.equals(user.name)) {
				isSame = true;
			}
		}
		return isSame;
	}

	@Override
	public int compareTo(User o) {
		return this.getAge() - o.getAge();
	}
	
	
	

}


