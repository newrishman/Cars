import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadCars {
    public static void main(String[] args) {
        try {
            ObjectInputStream mb = new ObjectInputStream(new FileInputStream("mercedes.bin"));
            Cars[] mercedes = (Cars[]) mb.readObject();

            System.out.println("All Mercedes: " + Arrays.toString(mercedes));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
