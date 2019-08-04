/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohelloworld;

/**
 *
 * @author khanh
 */
public class ConCho {
    
    public static int a = 1;
    private int tuoi;
    private float chieuDai;

    public ConCho(int tuoi, float chieuDai) {
        this.tuoi = tuoi;
        this.chieuDai = chieuDai;
    }
    
    public static void tongTuoiChieuDai (){
        float c = tuoi + chieuDai;
    }
    
    
    public static void main(String[] args) {
        ConCho conCho1 = new ConCho(1, 10);
        
        ConCho conCho2 = new ConCho(2, 5);
        
        conCho1.a = 2;
        conCho2.a = 3;
        
        System.out.println(conCho1.a);
        System.out.println(conCho2.a);
    }
    
    
    
    
    
}
