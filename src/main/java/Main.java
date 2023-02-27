import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.controller.SpeakingClock;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hour = reader.readLine();

        SpeakingClock speakingClock = new SpeakingClock(hour);
        speakingClock.solve();
    }
}
