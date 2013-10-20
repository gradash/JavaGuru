package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tictactoe {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		
		// поле
					char[][] field =
					{   { '+', '+', '+' },
					    { '+', '+', '+' },
					    { '+', '+', '+' } };
					

    	// человек
				        int x;
				        int y;
				        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				        
				        System.out.println("Enter y (1..3):");
				        x = Integer.parseInt(br.readLine())-1;
				        System.out.println("Enter x (1..3):");
				        y = Integer.parseInt(br.readLine())-1;
				        
				        while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2
				                || y < 0 || y > 2) {
				            System.out.println("Enter x:");
				            x = Integer.parseInt(br.readLine())-1;
				            System.out.println("Enter y:");
				            y = Integer.parseInt(br.readLine())-1;
				        }
				        field[x][y] = 'X';
				    
				    
		 // компьютер
				    
				        int a = (int) (Math.random() * 3);
				        int b = (int) (Math.random() * 3);
				        while (field[a][b] == '0' || field[a][b] == 'X') {
				            a = (int) (Math.random() * 3);
				            b = (int) (Math.random() * 3);
				        }
				        field[a][b] = '0';
				    }
				    
				    
				    
				    
	
		
						
	}
	
