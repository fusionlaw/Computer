/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;

/**
 *
 * @author jefy
 */
public class Computer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("请输入第一个参数：");
            float num1 = in.nextFloat();
            System.out.println("请输入操作符：");
            String operation = in.next();
            System.out.println("请输入第二个参数：");
            float num2 = in.nextFloat();
            String result = Float.toString(Operation.Operation(num1, num2, operation));
            System.out.println("结果为："+result);
        }catch(Exception ex){
            System.out.println("你的输入有错："+ex.getMessage());
        }
    }

}
