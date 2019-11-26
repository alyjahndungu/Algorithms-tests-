package ArrayDemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class byteArrayConvert {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
 //convert file to byte[]
		byte[] bFile=readBytesFromFile("E://dummy/details.txt");

	//java nio class
		//byte[] bFile=Files.readAllBytes(new File("E://dummy/details.txt"));

		/// save the byte[] into a file
	Path path=Paths.get("E://dummy/details.txt");
		Files.write(path, bFile);
		System.out.println("Done");

		//print bytes[]
		for(int i=0;i<bFile.length;i++){

			System.out.print((char) bFile[i]);

		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	private static byte[] readBytesFromFile(String filePath) {
		// TODO Auto-generated method stub


		FileInputStream fileInput=null;
		byte[] bytesArray=null;
		File file=new File(filePath);
		bytesArray=new byte[(int)file.length()];
		 //read file into bytes

			try {
				fileInput=new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileInput.read(bytesArray);
//				String s=new String(bytesArray);
//				   System.out.println(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally{
				 if(fileInput!=null){
					 try {
						 fileInput.read(bytesArray);
						fileInput.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			 }
		return bytesArray;

	}
	}



