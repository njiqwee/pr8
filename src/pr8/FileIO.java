package pr8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {
    public void saveCity(City city, String file) throws FileNotFoundException, IOException{
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(city);
    }
    public City loadCity(String file) throws FileNotFoundException, IOException, ClassNotFoundException{
	FileInputStream fis = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(fis);
	return (City)ois.readObject();
    }
}
