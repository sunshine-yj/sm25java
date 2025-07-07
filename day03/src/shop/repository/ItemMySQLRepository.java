package shop.repository;

import shop.dto.ItemDto;
import shop.frame.SmRepository;

import java.util.ArrayList;
import java.util.List;

public class ItemMySQLRepository implements SmRepository<ItemDto, Integer> {

    @Override
    public void insert(ItemDto itemDto) {
        System.out.println("MySQL: Inserting Item Table");
        System.out.println("MySQL: " + itemDto);
    }

    @Override
    public void update(ItemDto itemDto) {
        System.out.println("MySQL: Updating Item Table");
        System.out.println("MySQL: " + itemDto);
    }

    @Override
    public void delete(Integer integer) {
        System.out.println("MySQL: Deleting Item Table");
        System.out.println("MySQL: " + integer);
    }

    @Override
    public List<ItemDto> selectAll() {
        System.out.println("MySQL: Selecting All Item Table");
        List<ItemDto> itemDto = new ArrayList<>();
        itemDto.add(new ItemDto(100, "Item_1", 1.00));
        itemDto.add(new ItemDto(200, "Item_2", 2.00));
        itemDto.add(new ItemDto(300, "Item_3", 3.00));
        return itemDto;
    }

    @Override
    public ItemDto select(Integer integer) {
        System.out.println("MySQL: Selecting Item Table");
        ItemDto itemDto = new ItemDto(555, "Item 5", 5.50);
        return itemDto;
    }
}
