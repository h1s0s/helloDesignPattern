package designpattern.adapter;

public class AdapterPattern {
	//어댑터 패턴

	//서로 다른 인터페이스를 가진 클래스들을 연결하기 위한 패턴입니다.
	//호환되지 않는 두개의 클래스를 연결하기 위해 중간 계층(어댑터)를 생성하는 디자인 패턴

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
