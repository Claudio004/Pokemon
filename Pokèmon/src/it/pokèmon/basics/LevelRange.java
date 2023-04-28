package it.pokèmon.basics;

public class LevelRange {
	private int range;
	
	public LevelRange(){
		
	}
	
	public int getRange(Pokèmon p) {
		getLevelRange(p);
		return this.range;
	}

	private void getLevelRange(Pokèmon p) {
		if(p.getLevel() <= 10) {
			this.range = 1;
		}else {
			if((p.getLevel() > 10) && (p.getLevel() <= 20)) {
				this.range = 2;
			}else {
				if((p.getLevel() > 20) && (p.getLevel() <= 30)) {
					this.range = 3;
				}else {
					if((p.getLevel() > 30) && (p.getLevel() <= 40)) {
						this.range = 4;
					}else {
						if((p.getLevel() > 40) && (p.getLevel() <= 50)) {
							this.range = 5;
						}else {
							if((p.getLevel() > 50) && (p.getLevel() <= 60)) {
								this.range = 6;
							}else {
								if((p.getLevel() > 60) && (p.getLevel() <= 70)) {
									this.range = 7;
								}else {
									if((p.getLevel() > 70) && (p.getLevel() <= 80)) {
										this.range = 8;
									}else {
										if((p.getLevel() > 80) && (p.getLevel() <= 90)) {
											this.range = 9;
										}else {
											this.range = 10;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
