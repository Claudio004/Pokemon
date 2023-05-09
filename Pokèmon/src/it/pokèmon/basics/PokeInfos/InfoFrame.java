package it.pokèmon.basics.PokeInfos;

import javax.swing.JFrame;
import it.pokèmon.basics.Pokèmon;

@SuppressWarnings("serial")
public class InfoFrame extends JFrame{
    private Pokèmon p;

    InfoFrame(Pokèmon p){
        this.p = p;
        setFrameProperties();
    }

    private void setFrameProperties(){
        this.setSize(600,350);
        this.setTitle("Pokèmon");
        this.setResizable(false);
        this.add(new InfoPanel(this.p));
        this.setVisible(true);
    }
}
