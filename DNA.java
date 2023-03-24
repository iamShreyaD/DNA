/*
 * Shreya B Deshpande
 * This project is done through Codecademy 'Learn: Java'
 * This program determines whether there is a protein in a strand of DNA (which is composed of a series of nucleaotides A, C, G, T)
 */

public class DNA {

	public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";

		String dna = dna1;

		System.out.println(dna.length());

		int start = dna.indexOf("ATG");
		System.out.println(start);
		int stop = dna.indexOf("TGA");
		System.out.println(stop);

		if (start != -1 && stop != -1 && (stop - start) % 3 == 0)
		{
			String protein = dna.substring(start, stop+3);
			System.out.println("Protein: " + protein);
		}
		
		else
		{
			System.out.println("No protein.");
		}
  
  }
 
}