import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FileReaderTest {

	public static void main(String[] args) {
		//ScannerTest();
		fileReadTest();
	}
	
	public static void ScannerTest() {
		File file = new File("Story/StoryLine2.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}
	
	public static void fileReadTest() {
		Path path = Paths.get("Story/TextSheet.txt");
		List<String> story = new ArrayList<>();
		
		try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) {	// for eclipse, ANSI; for Editor, utf_8
			story = stream.toList();
			String[] BethLines = story.get(1).split(";");
			String[] YaroLines = story.get(3).split(";");
			String[] SistersLines = story.get(5).split(";");
			
			System.out.println(story.size());
			System.out.println(BethLines[0]);
			System.out.println(YaroLines[0]);
			System.out.println(SistersLines[0]);

	
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
