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
public class Operation {
    
    private float num1;
    private float num2;

    public Operation() {
        
    }
    

//    public static float Operation(float num1,float num2,String operation) {
//        float result = 0;
//        switch (operation) {
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//        }
//        return result;
//    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float getResult(){
        float result = 0;
        return result;
    }
}
