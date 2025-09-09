import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class CTRunner {
	public static void main(String[] args) throws IOException {
		File file = new File("part.txt");
		Scanner scan = new Scanner(file);
		ArrayList<CampObject> campObjects = new ArrayList<>();
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner lineScanner = new Scanner(line);
			if(line.contains("camsite")) {
				Campsite c = new Campsite (lineScanner.nextDouble());
				campObjects.add(c);
			}
			else {
				Trail t = new Trail (lineScanner.nextDouble(), lineScanner.nextDouble());
				campObjects.add(t);
			}
		}
		int area = 0;
		for(CampObject i : campObjects) {
			area += i.getArea();
		}
		scan.close();
		System.out.println("Park Area: " + area + ". Thats a Pretty Big Park!");
	}
}
