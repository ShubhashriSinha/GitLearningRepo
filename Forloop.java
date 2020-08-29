/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment;
import java.util.*;
class assignment
{
    int count(String s){
        int c=0;
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='e'){
                c++;
            }
        }
        return c;
    }
}
/**
 *
 * @author user
 */
public class Homeassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        assignment ass=new assignment();
        System.out.println(ass.count(s));
        // TODO code application logic here
    }
    
}