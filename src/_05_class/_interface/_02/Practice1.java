package _05_class._interface._02;

import _05_class._access_modifier._pack2.C;

interface Music {
    void play(String name);
    void stop(String name);
}

class Mp3Player implements Music {
    @Override
    public void play(String name) {
        System.out.println("MP3 플레이어에서 '" + name + "' 음악을 재생합니다.");
    }

    @Override
    public void stop(String name) {
        System.out.println("MP3 플레이어에서 '" + name + "' 음악을 정지합니다.");
    }
}

class CdPlayer implements Music {
    @Override
    public void play(String name) {
        System.out.println("CD 플레이어에서 '" + name + "' 음악을 재생합니다.");
    }

    @Override
    public void stop(String name) {
        System.out.println("CD 플레이어에서 '" + name + "' 음악을 정지합니다.");
    }
}

public class Practice1 {

    public static void main(String[] args) {
        Mp3Player mp3 = new Mp3Player();
        CdPlayer cd = new CdPlayer();

        System.out.println("==== MP3 Player ====");
        mp3.play("아이유 블루밍");
        mp3.stop("아이유 블루밍");

        System.out.println("==== CD Player ====");
        cd.play("아이유 꽃갈피");
        cd.stop("아이유 꽃갈피");
    }

}
