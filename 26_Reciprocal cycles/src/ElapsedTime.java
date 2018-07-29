
public class ElapsedTime {
	private static ElapsedTime instance = null;
	private ElapsedTime() {}
	private long start = 0;
	private long end = 0;
	
	public static ElapsedTime getInstance() {
		if(instance == null) instance = new ElapsedTime();
		
		return instance;
	}
	
	public void start() {
		start = System.nanoTime();
	}
	
	public void end() {
		end = System.nanoTime();
	}
	
	public void printElapsed() {
		long elapsed = end - start;
		long seconds = elapsed / 1_000_000_000;
		elapsed %= 1_000_000_000;
		long millis = elapsed / 1_000_000;
		elapsed %= 1_000_000;
		long micros = elapsed / 1_000;
		elapsed %= 1_000;
		long nanos = elapsed;
		
		System.out.println(String.format("[Seconds: %3d, Millis: %3d, Micros: %3d, Nanos: %3d]", seconds, millis, micros, nanos));
	}
}
