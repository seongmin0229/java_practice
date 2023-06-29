package prob03;

public class Tank{
	private boolean mode;
	void changeMode() {
		/* 공격모드를 변환한다. */
		this.mode = this.mode ? false : true; 
	}
}
