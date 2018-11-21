import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

import javax.lang.model.type.DeclaredType;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.sun.javafx.scene.traversal.TraversalContext;
import com.sun.javafx.webkit.ThemeClientImpl;

public class Classify {

	private File [] textFiles;
	
	public static void main(String[] args) {

		// Creating an object of type Classify seems a bit unnecessary.
		Classify main = new Classify();
		
		//depending on the number of arguments, the respective class will be created
		if (args.length == 3) {
			
			try {
				//sets the directory
				main.putFiles(args[2]);
			} catch (NullPointerException e) {
				//e.printStackTrace();
				System.out.println("Invalid file path. \n"
						+ "Check to make sure the directory name is correct.");
			}
			
			KNN kNN = new KNN(main.textFiles);		//three arguments means knn
			
		} else if(args.length == 2) {		//two arguments mean Naive Bayes
			
			NaiveBayes nB = new NaiveBayes();
			
		} else {
			System.out.println("Only enter 2 or 3 arguments");
		}
			
	}
	
	// Constructor for Classify if deemed necessary.
	public Classify() {

	}

	//this class grabs all the files in the training set
	public void putFiles(String path) {
		File textFilePath = new File(path);
		textFiles = textFilePath.listFiles();
		
		//checks to make sure every file in the directory is a .txt file
		for (int i=0; i<textFiles.length; i++) {
			
			//compares the Name of the files to the .txt extension
			if (!textFiles[i].toString().substring(textFiles[i].toString()
					.length() - 4, textFiles[i].toString().length()).contentEquals(".txt")) {
				
				System.out.println("Incorrect file path. \n"
				+ "Make sure to set the path to the folder where the training files are located.");
				
				break;
			}	
		}
	}
	
	// pls send help
}
