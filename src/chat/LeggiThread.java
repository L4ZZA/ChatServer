package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class LeggiThread implements Runnable {
    
    Socket socket;
    JFrameChat frame;
    
    public LeggiThread(JFrameChat frame, Socket socket){
        this.socket = socket;
        this.frame = frame;
    }
    
    @Override
    public void run(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            frame.setNomeOspite(reader.readLine());
            
            while(true){
                String msg = reader.readLine();
                msg = msg.replaceAll("#", " ");
                
                frame.visualizza(msg);
                
                Thread.sleep(10);
            }
            
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
 }
