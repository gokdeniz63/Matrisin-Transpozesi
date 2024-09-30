import java.util.*;
import java.lang.*;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;


 class  Sınıf {
	 private static Scanner tara;
	 
    public static void main(String[] args) {
    	
    	int A[][]= { {0,1,2,3},{4,5,6,7},{8,9,0,4} };
    	int B[][]=new int [4][3];
    	out.printf("A matrisi...:\n");
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<4; j++) {
    			
    			out.printf(" %d", A[i][j]);
    			B[j][i]=A[i][j];
    		}
    		out.printf("\n");
    		
    	}
    	out.print("B matrisi..\n");
    	for(int i=0; i<4; i++) {
    		for(int j=0; j<3; j++) {
    			out.printf(" %d",B[i][j]);
    		}
    		out.println();
    	}
    }
}
