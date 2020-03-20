/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import ball.Ball;
import ball.Cricket;
import ball.FootBall;
import ball.Tennis;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nkeng
 */
public class BallFactory {
    
    public static Ball getInstance(String ballType){
        Ball ball = null;
        
        if(ballType.equalsIgnoreCase("tennis")){
            try {
                System.out.println("creating Tennis balls 30secs ");
                Thread.sleep(30000);
                ball = Tennis.getInstance();
            } catch (InterruptedException ex) {
                Logger.getLogger(BallFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(ballType.equalsIgnoreCase("football")){
            try {
                System.out.println("creating footballs 20secs ");
                Thread.sleep(20000);
                ball = FootBall.getInstance();
            } catch (InterruptedException ex) {
                Logger.getLogger(BallFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(ballType.equalsIgnoreCase("cricket")){
            try {
                System.out.println("creating cricket balls 10secs ");
                Thread.sleep(10000);
                ball = Cricket.getInstance();
            } catch (InterruptedException ex) {
                Logger.getLogger(BallFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    
        return ball;
    }
    
}
