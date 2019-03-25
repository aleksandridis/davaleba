import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarReader {
    public static void reader(String filePath){
        List<Car> list=new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = in.readLine()) != null) {
                String[] tokens = str.split(";");
                String model=tokens[0];
                String transmission=tokens[1];
                String wheel=tokens[2];
                String interiorColor=tokens[3];
                Car car=new Car(model,transmission,wheel,interiorColor);
                list.add(car);

            }
            Collections.sort(list, new Comparator<Car>() {
                @Override
                public int compare(Car car1, Car car2)
                {

                    return  car1.getModel().compareTo(car2.getModel());
                }
            });
            for (Car car1 : list) {
                System.out.println(car1);
            }
        }
        catch (IOException e) {
            System.out.println("File Read Error");
        }

    }
}
