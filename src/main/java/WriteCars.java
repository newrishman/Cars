import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteCars {
    public static void main(String[] args) {

        List<Cars> carsList = new ArrayList<>();

        carsList.add(new Cars(270, 176, "A-class"));
        carsList.add(new Cars(274, 205, "C-class"));
        carsList.add(new Cars(276, 213, "E-class"));
        carsList.add(new Cars(278, 222, "S-class"));

        carShow(carsList);
        writeCars(carsList);
    }

    private static void carShow(List<Cars> list) {
        for (Cars cars : list) {
            System.out.println("Mercedes " + cars);
        }
    }

    public static void writeCars(List<Cars> list) {

        Cars[] mercedes = {list.get(0), list.get(1), list.get(2), list.get(3)};

        try {
            ObjectOutputStream mb = new ObjectOutputStream(new FileOutputStream("mercedes.bin"));
            mb.writeObject(mercedes);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
