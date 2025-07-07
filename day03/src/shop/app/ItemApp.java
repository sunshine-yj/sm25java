package shop.app;

import shop.dto.ItemDto;
import shop.frame.SmService;
import shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class ItemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmService<ItemDto, Integer> itemService = new ItemService();

        while(true){
            System.out.println("i. Insert");
            System.out.println("u. Update");
            System.out.println("d. Delete");
            System.out.println("q. Quit");
            System.out.println("s. Search");
            System.out.println("sa. Search All");

            System.out.print("Enter Command: ");
            String cmd = sc.nextLine();

            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(cmd.equals("i")){
                System.out.println("Insert...");

                System.out.print("Input ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Input Name: ");
                String name = sc.nextLine();

                System.out.print("Input Price: ");
                double price = sc.nextDouble();

                ItemDto itemDto = new ItemDto(id, name, price);
                itemService.register(itemDto);
                System.out.println();

            }else if(cmd.equals("s")){
                System.out.println("Search...");

                System.out.print("Input ID: ");
                int id = sc.nextInt();

                ItemDto myInfo = null;
                myInfo = itemService.get(id);
                System.out.println(myInfo);
                System.out.println();

            }else if(cmd.equals("sa")) {
                System.out.println("Search All...");

                List<ItemDto> items = null;
                items = itemService.get();
                for(ItemDto item : items){
                    System.out.println(item);
                }
                System.out.println();

            }else if(cmd.equals("d")){
                System.out.println("Delete...");

                System.out.print("Input ID: ");
                int id = sc.nextInt();
                itemService.remove(id);
                System.out.println();

            }else if(cmd.equals("u")){
                System.out.println("Update...");

                System.out.print("Input New ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Input New Name: ");
                String name = sc.nextLine();

                System.out.print("Input New Price: ");
                double price = sc.nextDouble();

                ItemDto itemDto = new ItemDto(id, name, price);
                itemService.modify(itemDto);
                System.out.println();

            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
