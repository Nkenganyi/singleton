/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

/**
 *
 * @author nkeng
 */
public class Tennis extends Ball{
    
    private static Tennis tennis;
    
    private Tennis(){
    
    }
    
    public static Tennis getInstance(){
    
        if(tennis == null){
            tennis = new Tennis();
        }
    
         return tennis;
    }
}
