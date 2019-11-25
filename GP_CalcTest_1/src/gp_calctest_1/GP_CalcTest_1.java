/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gp_calctest_1;

/**
 *
 * @author daltonb3657
 */
public class GP_CalcTest_1 {

    
    public static void main(String[] args) {
        double wallLength=0, wallHeight=0, wallWidth=0, brickLength=0,
                brickHeight=0, brickCost=0,brickCostT=0, totalBrickL=0,
                totalBrickH=0, totalBrickO=0,concreteBags=0, concreteCost=0,
                concreteCostT=0;
        
        totalBrickL = wallLength / (brickLength+.5);
        totalBrickH = wallHeight / (brickHeight+.5);
        totalBrickO = totalBrickH*totalBrickL;
        totalBrickO = totalBrickO * wallWidth;
        totalBrickO = totalBrickO * 1.10;
        brickCostT = totalBrickO * brickCost;
        concreteBags = (totalBrickO*3.0)/100.0;
        concreteCostT = concreteBags*concreteCost;
        
        
    }
    
}
