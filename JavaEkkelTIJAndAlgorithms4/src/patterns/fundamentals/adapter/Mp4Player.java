package patterns.fundamentals.adapter;

/**
 * Created by nugusbayevkk on 2/6/17.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("play Mp4 on " + filename);
    }
}
