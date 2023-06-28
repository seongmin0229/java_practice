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
		this.power = on;
	}
	
	public void volume(int volume) {
		if(power) {
			if(volume < 0) {
				System.out.println("잘못된 음향입니다.");
			}else {
				this.volume = volume;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
	public void volume(boolean up) {
		if(power) 
			this.volume = (volume + 1) % 100;
		else
			System.out.println("전원이 꺼져있습니다.");
	}
	
	public void channel(int channel) {
		if(power) {
			if(channel <= 0) {
				System.out.println("잘못된 채널입니다.");
			}else {
				this.channel = channel;
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
	public void channel(boolean up) {
		if(power)
			this.channel = this.channel == 254 ? (channel + 1) % 255 + 1 : (channel + 1) % 255;
		else
			System.out.println("전원이 꺼져있습니다.");
	}
	
	public void status() {
		System.out.println(
				"TV[power" + (power ? "on" : "off") + 
				", channer=" + channel + 
				", volume=" + volume + "]");
	}
}
