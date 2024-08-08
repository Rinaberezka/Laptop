import laptop.NotebookStore;
import laptop.laptop;


import java.nio.file.NotLinkException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotebookStore store = new NotebookStore();
        store.addlaptop(new laptop("Dell", "NewMult", 128, 260, "Windows"));
        store.addlaptop(new laptop("Lenovo","12LP",256,500,"Linux"));

        Map<String, Object> param = new HashMap<>();
        System.out.println("Введите цифры параметров фильтрации:(0 для завершения ввода)");
        System.out.println("1 - озу");
        System.out.println("2 - hd");
        System.out.println("3 - oc");
        System.out.println("4 - brand");
        while (true){
            int choice = scanner.nextInt();


            if(choice==0){
                break;
            }
            switch (choice){
                case 1:
                    System.out.print("minRam");
                    int ram = scanner.nextInt();
                    param.put("ram",ram);
                    break;
                case 2:
                    System.out.print("HD");
                    int storoge = scanner.nextInt();
                    param.put("storoge", storoge);
                    break;
                case 3:
                    System.out.print("os");
                    String os = scanner.nextLine();
                    param.put("opSystem", os);
                    break;
                case 4:
                    System.out.print("brand");
                    String brand = scanner.nextLine();
                    param.put("brand", brand);
                    break;
                default:
                    System.out.println("not correct choice");
            }

        }
        List<laptop> filteredLaptops = store.filterLaptops(param);
        if (filteredLaptops.isEmpty()) {
            System.out.println("param not found");
        }else {
            System.out.println("found: ");
            for (laptop laptop:filteredLaptops) {
                System.out.println(laptop);
            }
        }
        scanner.close();
        }

    }


