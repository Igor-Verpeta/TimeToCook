package dev;
import java.awt.Color;




import dev.DataModel.Reminder;
import dev.DataModel.Reminder.RemindTask;
import dev.DataModel.RingStove;

public class ButtonController implements IActionListener {

	private DataModel dataModel = new DataModel(); // модель данных
    private RingStove ringStove = dataModel.new RingStove();
 
    
	private IButton button; // абстрактный view (кнопка)
    
        
    @Override
    public void action() {
    	
    	dataModel.createStove(4, false);
		ringStove.ringOn(3);
		button.setForeground(Color.red);
		dataModel.setButton(button);
		
    	
       // button.setText(dataModel.getLabel());
        
        
        
    }
    
    public void setButton(IButton button){
        this.button = button;
    }

	
	
	
}
