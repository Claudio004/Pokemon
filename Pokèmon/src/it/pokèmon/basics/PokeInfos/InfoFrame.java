package it.pokèmon.basics.PokeInfos;

import javax.swing.JFrame;
import it.pokèmon.basics.Pokèmon;

@SuppressWarnings("serial")
public class InfoFrame extends JFrame{
    private Pokèmon p;

    public InfoFrame(Pokèmon p){
        this.p = p;
        setFrameProperties();
    }

    private void setFrameProperties(){
        this.setSize(350,600);
        this.setTitle("Pokèmon");
        this.setResizable(false);
        this.add(new InfoPanel(this.p));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
