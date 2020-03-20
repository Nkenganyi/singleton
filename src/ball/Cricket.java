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
public class Cricket extends Ball {
    
    private static Cricket cricket;
    
    private Cricket(){
    
    }
    
    public static Cricket getInstance(){
        
        if(cricket == null){
            cricket = new Cricket();
        }
        
        return cricket;
    }
    
}
