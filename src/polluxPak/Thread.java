package polluxPak;

public class Thread {
	private Agents pollux;
	private Etat courant;

	public Thread() {
		// TODO Auto-generated constructor stub
	}
	public Thread(Etat etatCourant, Agents a){
		pollux = a; 
		courant = etatCourant;
	}

	public void run(){
		switch(courant.getNum()){
		case 1: 
			


		case 2:
			pollux.getEspace().getZone();
			int idx=pollux.getEspace().getIJ()[0];
			pollux.moteurs.tournerR(true,180);
			pollux.moteurs.l1.startSynchronization();
			while(pollux.getColor()=="none") {
				pollux.moteurs.l1.forward();
				pollux.moteurs.r1.forward();
			}
			pollux.moteurs.r1.stop();
			pollux.moteurs.l1.stop();
			pollux.moteurs.l1.endSynchronization();
			pollux.moteurs.tourner(true,1);
			pollux.moteurs.l1.startSynchronization();
			pollux.moteurs.l1.forward();
			pollux.moteurs.r1.forward();
			while(pollux.getDistance()>0.2) {
				if(pollux.detectionPallet()) {
					
				}
				
			}
			pollux.moteurs.r1.stop();
			pollux.moteurs.l1.stop();
			pollux.moteurs.l1.endSynchronization();
			
			



		case 3:

		case 4:

		case 5:



		case 6:

		case 7:

		case 8:

		case 9:
		}
	}
}

