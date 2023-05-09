package it.pokèmon.basics.PokeInfos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import it.pokèmon.basics.Pokèmon;

@SuppressWarnings("serial")
public class InfoPanel extends JPanel{
    private Pokèmon p;
    private Image artwork;
    private JButton[] moves;
    private JLabel nome = new JLabel();
    private JLabel lvl = new JLabel();
    private Dimension labelSize = new Dimension(100, 30);
    private Dimension moveSize = new Dimension(100, 30);

    InfoPanel(Pokèmon p){
        setArtworkProperties();
        setLabelsProperties();
        setMovesProperties();
        setPanelProperties();
    }

    public void setPokemon(Pokèmon p){
        this.p = p;
    }

    public Pokèmon getPokemon(){
        return this.p;
    }

    private void setArtworkProperties(){
        artwork = new ImageIcon(new ArtworkFinder(this.p).getArtwork()).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(artwork, 75, 20, null);
    }

    private void setMovesProperties(){
        moves = new JButton[p.getMovesNumber()];
        for(int i = 0; i < moves.length; i++){
            moves[i] = new JButton();
            moves[i].setText(p.moves.get(i).getNome());
            moves[i].setPreferredSize(moveSize);
            moves[i].setBorder(new RoundedBorder(15));
            switch(moves.length){
                case 1:
                    moves[i].setBounds(125, 400, 100, 30);
                    break;
                case 2:
                    if(i == 0){
                        moves[i].setBounds(125, 400, 100, 30);
                    }else{
                        moves[i].setBounds(125, 440, 100, 30);
                    }
                    break;
                case 3:
                    switch(i){
                        case 0:
                            moves[i].setBounds(125, 400, 100, 30);
                            break;
                        case 1:
                            moves[i].setBounds(125, 440, 100, 30);
                            break;
                        case 2:
                            moves[i].setBounds(125, 480, 100, 30);
                            break;
                    }
                    break;
                case 4:
                    switch(i){
                        case 0:
                            moves[i].setBounds(125, 400, 100, 30);
                            break;
                        case 1:
                            moves[i].setBounds(125, 440, 100, 30);
                            break;
                        case 2:
                            moves[i].setBounds(125, 480, 100, 30);
                            break;
                        case 3:
                            moves[i].setBounds(125, 520, 100, 30);
                            break;
                    }
                    break;
            }
            switch(p.moves.get(i).getType()){
	            case NORMALE:
	                moves[i].setBackground(Color.white);
	                break;
	            case FUOCO:
	                moves[i].setBackground(new Color(242, 144, 72));
	                break;
	            case LOTTA:
	            	moves[i].setBackground(new Color(190, 55, 95));
	                break;
	            case ACQUA:
	            	moves[i].setBackground(Color.blue);
	                break;
	            case VOLANTE:
	            	moves[i].setBackground(new Color(127, 155, 211));
	                break;
	            case ERBA:
	            	moves[i].setBackground(Color.green);
	                break;
	            case VELENO:
	            	moves[i].setBackground(new Color(159, 95, 191));
	                break;
	            case ELETTRO:
	            	moves[i].setBackground(Color.yellow);
	                break;
	            case TERRA:
	            	moves[i].setBackground(new Color(201, 106, 54));
	                break;
	            case PSICO:
	            	moves[i].setBackground(new Color(229, 94, 100));
	                break;
	            case ROCCIA:
	            	moves[i].setBackground(new Color(181, 167, 122));
	                break;
	            case GHIACCIO:
	            	moves[i].setBackground(Color.cyan);
	                break;
	            case COLEOTTERO:
	            	moves[i].setBackground(new Color(136, 182, 40));
	                break;
	            case DRAGO:
	            	moves[i].setBackground(new Color(10, 104, 185));
	                break;
	            case SPETTRO:
	            	moves[i].setBackground(new Color(72, 96, 163));
	                break;
	            case BUIO:
	            	moves[i].setBackground(Color.black);
	            	moves[i].setForeground(Color.white);
	                break;
	            case ACCIAIO:
	            	moves[i].setBackground(new Color(85, 135, 155));
	                break;
	        }
            moves[i].setVisible(true);
        }
    }

    private void setLabelsProperties(){
        nome.setText(p.getNome());
        nome.setPreferredSize(labelSize);
        nome.setBounds(125, 300, 100, 30);
        lvl.setText("" + p.getLevel());
        lvl.setPreferredSize(labelSize);
        lvl.setBounds(125, 340, 100, 30);
    }

    private void setPanelProperties(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(600, 350));
        switch(p.getType1()){
            case NORMALE:
                this.setBackground(Color.white);
                break;
            case FUOCO:
                this.setBackground(new Color(242, 144, 72));
                break;
            case LOTTA:
                this.setBackground(new Color(190, 55, 95));
                break;
            case ACQUA:
                this.setBackground(Color.blue);
                break;
            case VOLANTE:
                this.setBackground(new Color(127, 155, 211));
                break;
            case ERBA:
                this.setBackground(Color.green);
                break;
            case VELENO:
                this.setBackground(new Color(159, 95, 191));
                break;
            case ELETTRO:
                this.setBackground(Color.yellow);
                break;
            case TERRA:
                this.setBackground(new Color(201, 106, 54));
                break;
            case PSICO:
                this.setBackground(new Color(229, 94, 100));
                break;
            case ROCCIA:
                this.setBackground(new Color(181, 167, 122));
                break;
            case GHIACCIO:
                this.setBackground(Color.cyan);
                break;
            case COLEOTTERO:
                this.setBackground(new Color(136, 182, 40));
                break;
            case DRAGO:
                this.setBackground(new Color(10, 104, 185));
                break;
            case SPETTRO:
                this.setBackground(new Color(72, 96, 163));
                break;
            case BUIO:
                this.setBackground(Color.black);
                nome.setForeground(Color.white);
                lvl.setForeground(Color.white);
                break;
            case ACCIAIO:
                this.setBackground(new Color(85, 135, 155));
                break;
        }
        for(int i = 0; i < moves.length; i++){
            this.add(moves[i]);
        }
        nome.setVisible(true);
        lvl.setVisible(true);
        this.add(nome);
        this.add(lvl);
        this.setVisible(true);
    }
}