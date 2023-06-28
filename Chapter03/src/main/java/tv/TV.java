package tv;

public class TV {
	private int channel;	// 1 - 255
	private int volume;	// 0 - 100
	boolean power;
	
	public TV(int channer, int volume, boolean power) {
		this.channel = channer;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		on = on ? false : true;
	}
	
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		this.volume = (volume + 1) % 100;
	}
	
	public void channel(int channel) {
		
	}
	
	public void channel(boolean up) {
		
	}
	
	public void status() {
		System.out.println(
				"TV[power" + (power ? "on" : "off") + 
				", channer=" + channel + 
				", volume=" + volume + "]");
	}
}
