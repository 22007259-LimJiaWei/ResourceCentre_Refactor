
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = super.toString();
		output = String.format("%-63s %-20d", output, os);
		// Write your codes here
		return output;
	}
}


