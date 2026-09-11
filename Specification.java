package sample;

public class Specification {
	
	private int RAM;
	private int Rom;
	public Specification(int rAM, int rom) {
		super();
		RAM = rAM;
		Rom = rom;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getRom() {
		return Rom;
	}
	public void setRom(int rom) {
		Rom = rom;
	}
	@Override
	public String toString() {
		return "Specification [RAM=" + RAM + ", Rom=" + Rom + "]";
	}
	
	
}
