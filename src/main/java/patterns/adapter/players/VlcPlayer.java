package patterns.adapter.players;

import patterns.adapter.interfaces.AdvancedMediaPLayer;

public class VlcPlayer implements AdvancedMediaPLayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
