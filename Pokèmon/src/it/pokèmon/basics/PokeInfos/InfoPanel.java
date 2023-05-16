package it.pokèmon.basics.PokeInfos;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import it.pokèmon.basics.Pokèmon;

@SuppressWarnings("serial")
public class InfoPanel extends JPanel{
    private Pokèmon p;
    private JButton[] moves;
    private JLabel nome = new JLabel();
    private JLabel lvl = new JLabel();
    private Dimension labelSize = new Dimension(100, 30);
    private Dimension moveSize = new Dimension(140, 30);

    InfoPanel(Pokèmon p){
    	this.p = p;
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

    private void setMovesProperties(){
        moves = new JButton[p.getMovesNumber()];
        for(int i = 0; i < moves.length; i++){
            moves[i] = new JButton();
            moves[i].setText(p.moves.get(i).getNome());
            moves[i].setPreferredSize(moveSize);
            moves[i].setBorder(new RoundedBorder(15));
            switch(moves.length){
                case 1:
                    moves[i].setBounds(105, 400, 140, 30);
                    break;
                case 2:
                    if(i == 0){
                        moves[i].setBounds(105, 400, 140, 30);
                    }else{
                        moves[i].setBounds(105, 440, 140, 30);
                    }
                    break;
                case 3:
                    switch(i){
                        case 0:
                            moves[i].setBounds(105, 400, 140, 30);
                            break;
                        case 1:
                            moves[i].setBounds(105, 440, 140, 30);
                            break;
                        case 2:
                            moves[i].setBounds(105, 480, 140, 30);
                            break;
                    }
                    break;
                case 4:
                    switch(i){
                        case 0:
                            moves[i].setBounds(105, 400, 140, 30);
                            break;
                        case 1:
                            moves[i].setBounds(105, 440, 140, 30);
                            break;
                        case 2:
                            moves[i].setBounds(105, 480, 140, 30);
                            break;
                        case 3:
                            moves[i].setBounds(105, 520, 140, 30);
                            break;
                    }
                    break;
            }
            moves[i].setBackground(null);
            switch(p.moves.get(i).getType()){
	            case NORMALE:
	                moves[i].setForeground(Color.white);
	                break;
	            case FUOCO:
	                moves[i].setForeground(new Color(242, 144, 72));
	                break;
	            case LOTTA:
	            	moves[i].setForeground(new Color(190, 55, 95));
	                break;
	            case ACQUA:
	            	moves[i].setForeground(Color.blue);
	                break;
	            case VOLANTE:
	            	moves[i].setForeground(new Color(127, 155, 211));
	                break;
	            case ERBA:
	            	moves[i].setForeground(Color.green);
	                break;
	            case VELENO:
	            	moves[i].setForeground(new Color(159, 95, 191));
	                break;
	            case ELETTRO:
	            	moves[i].setForeground(Color.yellow);
	                break;
	            case TERRA:
	            	moves[i].setForeground(new Color(201, 106, 54));
	                break;
	            case PSICO:
	            	moves[i].setForeground(new Color(229, 94, 100));
	                break;
	            case ROCCIA:
	            	moves[i].setForeground(new Color(181, 167, 122));
	                break;
	            case GHIACCIO:
	            	moves[i].setForeground(Color.cyan);
	                break;
	            case COLEOTTERO:
	            	moves[i].setForeground(new Color(136, 182, 40));
	                break;
	            case DRAGO:
	            	moves[i].setForeground(new Color(10, 104, 185));
	                break;
	            case SPETTRO:
	            	moves[i].setForeground(new Color(72, 96, 163));
	                break;
	            case BUIO:
	            	moves[i].setForeground(Color.white);
	                break;
	            case ACCIAIO:
	            	moves[i].setForeground(new Color(85, 135, 155));
	                break;
	        }
            moves[i].setFocusable(false);
        }
    }

    private void setLabelsProperties(){
        nome.setText(p.getNome());
        nome.setPreferredSize(labelSize);
        nome.setBounds(150, 300, 100, 30);
        lvl.setText("" + p.getLevel());
        lvl.setPreferredSize(labelSize);
        lvl.setBounds(160, 340, 100, 30);
    }

    private void setPanelProperties(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(350, 600));
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
        	if(this.getBackground().equals(moves[i].getForeground())) {
        		if(this.getBackground().equals(Color.white)) {
        			moves[i].setForeground(Color.black);
        		}else {
        			moves[i].setForeground(Color.white);
        		}
        	}
        	moves[i].setVisible(true);
            this.add(moves[i]);
        }
        nome.setVisible(true);
        lvl.setVisible(true);
        this.add(nome);
        this.add(lvl);
        this.repaint();
        this.setVisible(true);
    }
}