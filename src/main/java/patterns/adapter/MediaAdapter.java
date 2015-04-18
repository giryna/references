package patterns.adapter;

import patterns.adapter.interfaces.AdvancedMediaPLayer;
import patterns.adapter.interfaces.MediaPlayer;
import patterns.adapter.players.Mp4Player;
import patterns.adapter.players.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPLayer advancedMediaPLayer;

    public MediaAdapter(String audioType){
        switch (audioType.toLowerCase()){
            case "vlc":
                advancedMediaPLayer = new VlcPlayer();
                break;
            case "mp4":
                advancedMediaPLayer = new Mp4Player();
                break;
            default:
                throw new IllegalArgumentException("Illegal type specified");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()){
            case "vlc":
                advancedMediaPLayer.playVlc(fileName);
                break;
            case "mp4":
                advancedMediaPLayer.playMp4(fileName);
                break;
            default:
                throw new IllegalArgumentException("Illegal audio type specified");
        }

    }
}
