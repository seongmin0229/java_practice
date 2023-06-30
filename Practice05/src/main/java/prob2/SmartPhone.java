package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		if(function.equals("음악")) {
			downloadMusic();
		}else if(function.equals("통화")) {
			super.execute(function);
		}else {
			executeApp();
		}
	}
	public void downloadMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	public void executeApp() {
		System.out.println("앱실행");
	}
	
}