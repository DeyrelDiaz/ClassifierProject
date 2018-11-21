import java.io.File;
import java.util.HashMap;

public class KNN {
	
	private HashMap<String, Integer> allWords = new HashMap<String, Integer>(); 
	
	public KNN(File [] files) {
		tokenizeFiles(files);
		calculateKNNProbabilities();
	}

	public void tokenizeFiles(File [] files) {
		//declare an iterator to traverse through each word in a file
		 
		
		//a for loop to iterate over each file
		for(File textfile: files) {
			
		}
		
	}

	// These methods are going to return something, and they'll also take arguments.
	public void calculateKNNProbabilities() {
		
		
	}
}
