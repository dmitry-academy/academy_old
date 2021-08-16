package by.academy.seaport;

public class SeaPort {
	public static final Integer HARBOR_NUMBER = 6;
	public static final Integer HARBOR_CAPACITY = 100;
	public static final Integer INITIAL_CAPACITY = 0;

	public Harbor[] harbors = new Harbor[HARBOR_NUMBER];

	public SeaPort() {
		super();
		init();
	}

	public void init() {
		for (int i = 0; i < HARBOR_NUMBER; i++) {
			System.out.println("Harbor created: initial capacity(" + INITIAL_CAPACITY + "), max capacity("
					+ HARBOR_CAPACITY + ")");
			harbors[i] = new Harbor(0, HARBOR_CAPACITY);
		}
	}
}
