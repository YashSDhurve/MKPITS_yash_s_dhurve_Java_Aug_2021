import java.io.InputStream;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;

   public class InputStreamReaderEx2 {
        public static void main(String[] args) {
            try  {
                InputStream stream = new FileInputStream("file1.txt");
                Reader reader = new InputStreamReader(stream);
                int data = reader.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = reader.read();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
