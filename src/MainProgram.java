import view.Client.MainFrameClient;
import view.Server.MainFrameServer;

import java.awt.*;

/**
 * Created by Jean-Pierre on 12.01.2017.
 */
public class MainProgram {

    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        MainFrameClient clientFrame = new MainFrameClient("Test-Client",50,50,1000,600);

        MainFrameServer  serverFrame = new MainFrameServer("Test-Server", 150,50,1000,600);
    }

}
