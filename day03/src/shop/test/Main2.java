package shop.test;

import shop.dto.ItemDto;
import shop.frame.SmService;
import shop.service.ItemService;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start Application ...");
        SmService<ItemDto, Integer> smService;
        smService = new ItemService();

        System.out.println("1. Item register");
        ItemDto itemDto = new ItemDto(444, "Item_4", 4.40);
        smService.register(itemDto);
        System.out.println();

        System.out.println("2. Item select All");
        List<ItemDto> items = null;
        items = smService.get();
        for (ItemDto item : items) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("3. Item delete");
        int id = 100;
        smService.remove(id);
        System.out.println();

        System.out.println("4. Item select");
        int id1 = 222;
        ItemDto myInfo = null;
        myInfo = smService.get(id1);
        System.out.println(myInfo);
        System.out.println();

        System.out.println("End Application ...");
    }
}
