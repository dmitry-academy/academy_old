package by.academy.lesson11.set;

public class WrongHashCat {

	private String username;

	public WrongHashCat() {
		super();
	}

	public WrongHashCat(String username) {
		super();
		this.username = username;
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((username == null) ? 0 : username.hashCode());
//		return result;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrongHashCat other = (WrongHashCat) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongHashCat [username=");
		builder.append(username);
		builder.append("]");
		return builder.toString();
	}

}
