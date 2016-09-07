package dev;

import java.awt.Button;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

public class DataModel {
	
	
	 private IButton button;
	
	 public void setButton(IButton button){
		 
	        this.button = button;
	    }

/*	private String label = "off";
	
	
	public void setLabel() { 
		if (this.label.equals("off"))
			this.label = "on";   
		else
			this.label = "off";
	}

	public String getLabel() {
		this.setLabel();
		return this.label;
	}*/
	
	
	
//	class Stove {

		public RingStove[] ringStovs;
		public Oven oven;

		public DataModel(){
			
		}
		
		public DataModel createStove(int countRingStove,boolean ovenPresent ){
			DataModel st = new DataModel();
			st.ringStovs = new RingStove[countRingStove];
			for(int i = 0; i < countRingStove; i++) {
				st.ringStovs[i] = st.new RingStove(i);
			}
			
			if(ovenPresent) {
				st.oven = st.new Oven(); 
			}
			
			return st;
		}
		
   class RingStove {

			int numberRing;
			boolean switchOnOff = false; 
			Reminder reminder = null;

			public RingStove() {}

			public RingStove(int numberRing) {
			this.numberRing = numberRing;

			}
			
	    public void ringOn(int seconds) {
				this.switchOnOff=true;
				System.out.println("Ring stove " +this.numberRing +1 + " is ON!");
				this.reminder=new Reminder(seconds);                                    
	    }
		public void ringOff() {
				this.switchOnOff=false;
			}

		}
	 
   class Oven {

			boolean switchOnOff= false;
			Reminder reminder = null;

			public void switchOn(int seconds){
	            this.switchOnOff = true;
			
				//System.out.println("OVEN IS ON");
	            this.reminder = new Reminder(seconds);
			
			}
			
			public void  switchOff() {
				this.switchOnOff = false;
			}
		}
	
	class Reminder {
	    Timer timer;

	    public Reminder(int seconds) {
	        timer = new Timer();
	        timer.schedule(new RemindTask(), seconds*1000);
		}

	    class RemindTask extends TimerTask {
	        public void run() {
	        	button.setForeground(Color.black);
	        	button.setText("OFF");
	        	
	            System.out.println("Time's up!");
	            
	            timer.cancel(); //Terminate the timer thread
	        }
	    }
	 }

}
