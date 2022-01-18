public class MySingleTone {
	private static MySingleTone instance = null;
	private MySingleTone() {
		instance = new MySingleTone();
	}
	
	public MySingleTone getInstance() {
		if(instance == null) {
			instance = new MySingleTone();
		}
		return instance;
	}
}

