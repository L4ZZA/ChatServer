package chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Arena, programmazione - Lazzarotto, programmazione - Solito, grafica
 */
public class MioServer{
    private int porta;
    private ServerSocket server;
    private Thread t;
    private String nomeUtente;
    AscoltaThread ascolta;
    JFrameChat frame;

    public MioServer (JFrameChat frame, int porta, String nomeUtente){
        this.porta = porta;
        if(!startServer())
            System.out.println("Errorr during Server creation");
        this.frame = frame;
        this.nomeUtente = nomeUtente;
    }

    private boolean startServer(){
        try{
            server = new ServerSocket(porta);   
        }
        catch (IOException e){
            System.out.println(e);
            return false;
        }
        System.out.println("Server created!");
        return true;
    }


    public void avvia(){
        ascolta = new AscoltaThread(frame, server, nomeUtente);
        t = new Thread(ascolta);
        t.start();
    }
    
    public boolean scrivi(String msg){
        boolean r = false;
        if(t.getState()==Thread.State.RUNNABLE){
            r = ascolta.scrivi(msg);
        }
        else{
            JOptionPane.showMessageDialog(null, "Errore! Thread not running!");
        }
        return r;
    }
}