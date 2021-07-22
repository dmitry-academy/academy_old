package by.academy.lesson7.oop;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
	int weight;

	public HeavyBox() {
		super();
	}

	public HeavyBox(int width, int height, int depth, int weight) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}

	public void printSomething() {
		System.out.println("Something!");
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(HeavyBox o) {
		return weight - o.getWeight();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeavyBox other = (HeavyBox) obj;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

}