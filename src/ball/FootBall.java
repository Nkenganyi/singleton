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
public class FootBall extends Ball {
    
    private  static FootBall footBall;
    
    private FootBall(){
    
    }
    
    public static FootBall getInstance(){
        
        if(footBall == null){
            footBall = new FootBall();
        }
        
        return footBall;
    }
}
