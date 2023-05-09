package it.pokèmon.basics.PokeInfos;

import it.pokèmon.basics.Pokèmon;

public class ArtworkFinder {
    private Pokèmon p;
    
    ArtworkFinder(Pokèmon p){
        this.p = p;
    }

    public String getArtwork(){
        String artwork = "";
        String path = "src\\it\\pokèmon\\basics\\PokeInfos\\artwork";
        switch(p.getNome()){
            case "Victini":
            	artwork = path + "Victini.png";
                break;
            case "Snivy":
            	artwork = path + "Snivy.png";
                break;
            case "Servine":
            	artwork = path + "Servine.png";
                break;
            case "Serperior":
            	artwork = path + "Serperior.png";
                break;
            case "Tepig":
            	artwork = path + "Tepig.png";
                break;
            case "Pignite":
            	artwork = path + "Pignite.png";
                break;
            case "Emboar":
            	artwork = path + "Emboar.png";
                break;
            case "Oshawott":
            	artwork = path + "Oshawott.png";
                break;
            case "Dewott":
            	artwork = path + "Dewott.png";
                break;
            case "Samurott":
            	artwork = path + "Samurott.png";
                break;
            case "Patrat":
            	artwork = path + "Patrat.png";
                break;
            case "Watchog":
            	artwork = path + "Watchog.png";
                break;
            case "Purrloin":
            	artwork = path + "Purrloin.png";
                break;
            case "Liepard":
            	artwork = path + "Liepard.png";
                break;
            case "Pansage":
            	artwork = path + "Pansage.png";
                break;
            case "Simisage":
            	artwork = path + "Simisage.png";
                break;
            case "Pansear":
            	artwork = path + "Pansear.png";
                break;
            case "Simisear":
            	artwork = path + "Simisear.png";
                break;
            case "Panpour":
            	artwork = path + "Panpour.png";
                break;
            case "Simipour":
            	artwork = path + "Simipour.png";
                break;
            case "Trubbish":
            	artwork = path + "Trubbish.png";
                break;
            case "Garbodor":
            	artwork = path + "Garbodor.png";
                break;
            case "Sigilyph":
            	artwork = path + "Sigilyph.png";
                break;
            case "Yamask":
            	artwork = path + "Yamask.png";
                break;
            case "Cofagrigus":
            	artwork = path + "Cofagrigus.png";
                break;
            case "Emolga":
            	artwork = path + "Emolga.png";
                break;
            case "Joltik":
            	artwork = path + "Joltik.png";
                break;
            case "Galvantula":
            	artwork = path + "Galvantula.png";
                break;
            case "Axew":
            	artwork = path + "Axew.png";
                break;
            case "Fraxure":
            	artwork = path + "Fraxure.png";
                break;
            case "Haxorus":
            	artwork = path + "Haxorus.png";
                break;
            case "Heatmor":
            	artwork = path + "Heatmor.png";
                break;
            case "Durant":
            	artwork = path + "Durant.png";
                break;
            case "Cryogonal":
            	artwork = path + "Cryogonal.png";
                break;
            case "Tornadus":
            	artwork = path + "Tornadus.png";
                break;
            case "Cobalion":
            	artwork = path + "Cobalion.png";
                break;
            case "Terrakion":
            	artwork = path + "Terrakion.png";
                break;
            case "Virizion":
            	artwork = path + "Virizion.png";
                break;
            case "Stunfisk":
            	artwork = path + "Stunfisk.png";
                break;
            case "Throh":
            	artwork = path + "Throh.png";
                break;
            case "Sawk":
            	artwork = path + "Sawk.png";
                break;
            case "Bouffalant":
            	artwork = path + "Bouffalant.png";
                break;
            case "Druddigon":
            	artwork = path + "Druddigon.png";
                break;
            case "Reshiram":
            	artwork = path + "Reshiram.png";
                break;
            case "Zekrom":
            	artwork = path + "Zekrom.png";
                break;
        }
        return artwork;
    }
}