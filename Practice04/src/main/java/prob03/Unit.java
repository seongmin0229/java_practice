package prob03;

public abstract class Unit {
	protected int supply;
	protected int speed;
	protected int killedEnemyNum;
	// 현재 위치
	protected int x;
	protected int y;

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void stop() {
		/* 현재 위치에 정지 */
	}
}