/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ball.Ball;
import factory.BallFactory;

/**
 *
 * @author nkeng
 */
public class Application {
    
    public static void main(String [] args){
        
        Ball ball = null;
        
        for (int i = 1; i < 4; i++) {
            if(i == 1){
                ball = BallFactory.getInstance("cricket");
            }else if(i == 2){
                 ball = BallFactory.getInstance("football");
            }else{
                 ball = BallFactory.getInstance("tennis");
            }
        }
        
        ball.start();
    }
}
