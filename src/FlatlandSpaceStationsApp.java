// My solution to the HackerRank.com problem "Flatland Space Stations."
// https://www.hackerrank.com/challenges/flatland-space-stations/problem

import java.util.Arrays;
import java.util.Scanner;

public class FlatlandSpaceStationsApp {
    static int flatlandSpaceStations(int n, int[] c) {
    	int[] minDists = new int[n];
    	
        for(int i = 0; i < n; i++) {
        	int minD = 100001;
        	for(int j = 0; j < c.length; j++) {
        		minD = Math.min(minD, Math.abs(i-c[j]));
        	}		
        	minDists[i] = minD;
        } 
        Arrays.sort(minDists);
        return minDists[n-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of cities, n (integer 1-10000): ");
        int n = in.nextInt();
        System.out.print("Enter the number of space stations, m (integer 1-n-100): ");
        int m = in.nextInt();
        int[] c = new int[m];
        for(int c_i = 0; c_i < m; c_i++){
            System.out.print("Enter the location of space station #"+(c_i)+", (integer 0-"+(n-1)+"): "); 
            c[c_i] = in.nextInt();
        }
        int result = flatlandSpaceStations(n, c);
        System.out.println(result);
        in.close();
    }
}
