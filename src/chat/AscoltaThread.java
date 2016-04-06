package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class AscoltaThread implements Runnable {
    
    Socket socket;
    ServerSocket server;
    JFrameChat frame;
    String nomeUtente;
    
    public AscoltaThread(JFrameChat frame, ServerSocket server, String nomeUtente){
        this.server = server;
        this.frame = frame;
        this.nomeUtente = nomeUtente;
    }
    
    public boolean scrivi(String msg){
        boolean r = true;
        try{
            PrintStream writer = new PrintStream(socket.getOutputStream());
            writer.println(msg);
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Error! No Client connected!");
            r = false;
        }
        return r;
    }
    
    @Override
    public void run(){
        while (true){
            try{
                System.out.println("Server waiting…");
                socket = server.accept();
                System.out.println("Client connected...");
                this.scrivi(this.nomeUtente);
                
                LeggiThread leggi = new LeggiThread(frame, socket);
                Thread t = new Thread(leggi);
                t.start();
                
                Thread.sleep(10);
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
            catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
            }
        }
    }
}
