/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package computer;

/**
 *
 * @author jefy
 */
public class Add extends Operation{

    @Override
    public float getResult() {
        float result = 0;
        result = this.getNum1()+this.getNum2();
        return result;
    }
    
}
