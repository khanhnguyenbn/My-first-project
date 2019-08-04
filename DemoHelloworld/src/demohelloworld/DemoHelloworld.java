/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohelloworld;

import java.util.Random;

/**
 *
 * @author khanh
 */
public class DemoHelloworld {

    /**
     * @param args the command line arguments
     */
    
    public static void cauTrucSwitchCase(){
        int a =11;
        switch(a){
            case 1:
                System.out.println("Đây là số 1");
                break;
            case 2:
                System.out.println("Đây là số 2");
                break;
            case 3:
                System.out.println("Đây là số 3");
                break;
            case 4:
                System.out.println("Đây là số 4");
                break;
            case 5:
                System.out.println("Đây là số 5");
                break;
            
            default:
                System.out.println("Ko có trong hệ thống");
        }
    }
    public static void giaiPTB2(double a, double b, double c){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("pt có vô số nghiệm");
                }
                else{
                    System.out.println("pt vô nghiệm");
                }
            }
            else{
                System.out.println("pt co nghiệm duy nhât x = " + -c/b);
            }
        }
        else 
        {
           double delta = b*b - 4*a*c;
            System.out.println(delta);
            double candelta = Math.sqrt(delta);
            System.out.println(candelta);
           if(delta > 0){
               double x1 = (candelta - b)/(2*a);
               double x2 = (-b - candelta)/(2*a);
               System.out.println("pt có 2 nghiệm phân biệt x1, x2 là" + x1  +  " " + x2);
           }
           else if(delta < 0)
                System.out.println("pt vô nghiệm");
           else{
               System.out.println("pt có nghiệm kép x là" + -b/(2*a));
           }
        }
    }
    
    public static boolean kiemTraSoCP(int n){
        for (int i = 2; i <= n/2; i++) {
            if(i*i == n){
                return true;
            }
        }
        return false;
    }
    
    public static void inSNT(int n){
        
        for (int i = 2; i <= n; i++) {
            int check = 0;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                  check++;
                }      
            }
            if(check == 0)
                System.out.println(i + " ");
            check = 0;
        }
    }
    
    
    public static void inN (int n){
        if(n == 0)
            return;
        inN(n-1);
        System.out.println(n);
    }
    
    public static boolean kiemTraSCP (int a) {
        if(a == 0) return false;
        else {
            double cb2 = Math.sqrt(a);
            if ((cb2 - (int)cb2) > 0)
                return false;
            return true;
        }
    }
    
    public static boolean kiemTraSNT (int a){
        
        if (a < 2){
            return true;
        }
        else {
            System.out.println("vao mđ else");
            while (a > 0){
                int i = a % 10;
                if (i > 1) return false;
                a = a / 10;
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        
//         System.out.println(kiemTraSNT(31));
//        System.out.println(kiemTraSCP(49));
//        inN(5);
        
//        giaiPTB2(3, 6, 2);
//        System.out.println(kiemTraSCP(256));
        
//        inSNT(30);
        cauTrucSwitchCase();
        
        
    }
    
}
