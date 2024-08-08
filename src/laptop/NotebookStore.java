package laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NotebookStore {
    public void addlaptop(laptop laptop){
        laptops.add(laptop);
    }
    private final List<laptop> laptops;

    public NotebookStore(){
        this.laptops = new ArrayList<laptop>();
    }

    public List<laptop> getLaptops() {
        return laptops;
    }
    public List<laptop> filterLaptops(Map<String, Object> param){
        List<laptop>filteredLaptops = new ArrayList<>(laptops);
        if (param.containsKey("ram")) {
            int ramMin = (int) param.get("ram");
            filteredLaptops.removeIf(laptop -> laptop.getRam()< ramMin);
        }
        if (param.containsKey("storoge")) {
            int storogeMin = (int) param.get("storoge");
            filteredLaptops.removeIf(laptop -> laptop.getStorage()< storogeMin);
        }
        if (param.containsKey("opSystem")) {
             String opSystem = (String) param.get("opSystem");
            filteredLaptops.removeIf(laptop -> !laptop.getOpSystem().equalsIgnoreCase(opSystem));
        }

        return filteredLaptops;

    }
}
