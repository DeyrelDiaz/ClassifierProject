/*

import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;

import javax.lang.model.type.DeclaredType;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.sun.javafx.scene.traversal.TraversalContext;
import com.sun.javafx.webkit.ThemeClientImpl;

public class Team5Main {

	private static String folderPath = "";
	private File [] textFiles;
	
	public static void main(String[] args) {
	
		Team5Main main = new Team5Main();
		
		main.chooseFilePath();
		main.getFiles(folderPath);
		main.tokenizeFiles(textFiles);
		

	}
	
	//this class allows you to choose the file path
	public void chooseFilePath() {
		//prompts the user to declare the path
		JOptionPane.showMessageDialog(null, "Please choose a file from the training set!",
				"Choose Path", JOptionPane.INFORMATION_MESSAGE);
		try {
			//for choosing the image
			JFileChooser chooser = new JFileChooser();
			int returnVal = chooser.showOpenDialog(chooser);
			
			//if user selects the open option
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	//grabs the file path of a text document
		    	File f = chooser.getSelectedFile();
				folderPath = f.getAbsolutePath();
				
				//takes the file path and concatenates it to just reference the folder
				String folder = folderPath.substring(0,folderPath.lastIndexOf("\\")+1);
				folderPath = folder;
		    } 
		    
		    //if user selects the cancel option
		    if(returnVal == JFileChooser.CANCEL_OPTION) {
			    throw new NullPointerException();
			}
		    
		    
			
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No file choosen!", "No Path", JOptionPane.INFORMATION_MESSAGE);
			//e.printStackTrace();
		}
	}
	
	//this class grabs all the files in the training set
	public void getFiles(String path) {
		File textFilePath = new File(path);
		textFiles = textFilePath.listFiles();
		
		for (int i=0; i<textFiles.length; i++) {
			System.out.println(textFiles[i]);
		}
		
	}

}

*/
