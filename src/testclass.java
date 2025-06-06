import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class testclass {
  public static void main(String[] args) {
    String filePath = "/Users/ayushi/IdeaProjects/test/IP.txt";  // 🔁 Replace with your actual file path
    int blockCount = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;

      while ((line = br.readLine()) != null) {
        // Trim and split the line into words
        String[] parts = line.trim().split("\\s+");

        // Check if "Block" is the third part (index 2)
        if (parts.length >= 3 && parts[2].equalsIgnoreCase("Block")) {
          blockCount++;
        }
      }

      System.out.println("Total number of 'Block' entries: " + blockCount);

    } catch (IOException e) {
      System.err.println("Error reading the file: " + e.getMessage());
    }
  }
}
