package by.academy.lesson7.oop;

public class Box {
	double width;
	double height;
	double depth;

	public Box() {
		System.out.println("Конструирование объекта Вох");
		width = 10;
		height = 10;
		depth = 10;
	}

	Box(double depth, double height) {
		this();
		this.getVolume();
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(String str) {
		System.out.println("Стринговый конструктор");
	}

	Box(double len) {
		System.out.println("double конструктор");
		width = len;
		height = len;
		depth = len;
	}

	/**
	 * Подсчитать объем коробки
	 *
	 * @return Объем
	 */

	double getVolume() {
		return width * height * depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	/**
	 * Установить размер коробки
	 *
	 * @param w - ширина
	 * @param h - высота
	 * @param d - глубина
	 */
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(depth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}
}