package patterns.adapter.players;

import patterns.adapter.interfaces.AdvancedMediaPLayer;

public class Mp4Player implements AdvancedMediaPLayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
