package patterns.adapter;

import patterns.adapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toLowerCase()){
            case "vlc":
            case "mp4":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                throw new IllegalArgumentException("Illegal audio type specified");

        }
    }
}
