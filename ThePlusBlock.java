import java.util.Scanner;

public class ThePlusBlock {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int width, height, i, j;
		
		
		System.out.print(" Please enter the height : ");
		width = sc.nextInt();	
		
		System.out.print(" Please enter the width : ");
		height = sc.nextInt();		
        
        for (i = 0; i < width; i++) {
            for (j = 0; j < height; j++) {
                // center horizontal, center vertical
                if (i == width / 2 || j == height / 2)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
        
    }
}