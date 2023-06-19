package sec01.exam01;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    public boolean roll(){
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation){
            System.out.println(location + " Tire 수명:  + " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }else {
            System.out.println("*** "+ location + "Tire 펑크 ***");
            return false;
        }
    }
}
