package workWithFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class SendToWinner {

    public static void sendToy(String toy) throws IOException {
        try {
            FileWriter fw = new FileWriter("src/workWithFiles/GainedPrize.txt",
                    StandardCharsets.UTF_8, true);
            fw.write(toy);
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
