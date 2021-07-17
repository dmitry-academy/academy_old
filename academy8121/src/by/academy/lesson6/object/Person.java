package by.academy.lesson6.object;

public class Person {
	private String fullName;
	private int age;
	private boolean retired;

	public Person(String fullName, int age, boolean retired) {
		this.fullName = fullName;
		this.age = age;
		this.retired = retired;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Person person = (Person) o;

		if (getAge() != person.getAge()) {
			return false;
		}
		if (isRetired() != person.isRetired()) {
			return false;
		}
		return getFullName() != null ? getFullName().equals(person.getFullName()) : person.getFullName() == null;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person alalalalal");
		return builder.toString();
	}

}