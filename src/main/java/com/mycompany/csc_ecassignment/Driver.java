package com.mycompany.csc_ecassignment;

/**
 *
 * @author johnf
 */
public class Driver {
    
    //initial getlargest function
    public static double getLargest (int[] arr) {
        double lrg, secLrg = 0;
        double sumLrg = 0;
        
        if (arr[0] > arr[1]){
            lrg = arr[0];
            secLrg = arr[1];
        }
        else {
            lrg = arr[1];
            secLrg = arr[0];
        }
        for (int i=2; i<arr.length; i++){
            if (arr[i] > lrg){
                secLrg = lrg;
                lrg = arr[i];
            }
            else if (arr[i] > secLrg) {
                secLrg = arr[i];
            }
        }
        
        sumLrg = lrg+secLrg;
        return sumLrg;
    }
    //initial getsmallest function
    public static double getSmallest (int[] arr) {
        double sml, secSml = 0;
        double sumSml = 0;
        
        if (arr[0] < arr[1]) {
            sml = arr[0];
            secSml = arr[1];
        }
        else {
            sml = arr[1];
            secSml = arr[0];
        }
        
        for (int i=2; i < arr.length; i++) {
            if (arr[i] < sml) {
                secSml = sml;
                sml = arr[i];
            }
            else if (arr[i] < secSml) {
                secSml = arr[i];
            }
        }
        
        sumSml = sml+secSml;
        return sumSml;
    }
    //initial function to get ratio
    public static double sumRatio (int[] arr) {
        double lrg = getLargest(arr);
        double sml = getSmallest(arr);
        double ratio = 0.0;
        
        ratio = lrg/sml;
        return ratio;
    }
    
    //combined function to do it all in one loop
    // O(n) => linear runtime
    public static double getRatio (int[] arr) {
        double sml = arr[0], secSml = arr[0];
        double lrg = arr[0], secLrg = arr[0];
        double sumLrg = 0, sumSml = 0;
        double ratio = 0;
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > lrg){
                secLrg = lrg;
                lrg = arr[i];
            }
            else if (arr[i] > secLrg) {
                secLrg = arr[i];
            }
            
            if (arr[i] < sml) {
                secSml = sml;
                sml = arr[i];
            }
            else if (arr[i] < secSml) {
                secSml = arr[i];
            }
        }
        
        sumLrg = lrg+secLrg;
        sumSml = sml+secSml;
        
        ratio = sumLrg / sumSml;
        
        return ratio;
    }
    
    public static void main(String[] args) {
       int[] a = {3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
       
       System.out.println(getRatio(a));
    }
}
