package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;

    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할수없습니다. 최대음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }

    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 줄일수없습니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10줄입니다.");
        }
    }

    void showVolume() {
        System.out.println("현재음량:" + volume);
    }

}
