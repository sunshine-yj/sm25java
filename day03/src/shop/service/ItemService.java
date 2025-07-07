package shop.service;

import shop.dto.ItemDto;
import shop.frame.SmRepository;
import shop.frame.SmService;
import shop.repository.ItemMySQLRepository;

import java.util.List;

public class ItemService implements SmService<ItemDto, Integer> {

    SmRepository<ItemDto, Integer> smRepository;

    public ItemService() {
        smRepository = new ItemMySQLRepository();
    }

    @Override
    public void register(ItemDto itemDto) {
        System.out.println("ItemService: 기본정보 저장");
        smRepository.insert(itemDto);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: EMAIL 전송");
        System.out.println("ItemService: 아이템 저장 완료");
    }

    @Override
    public void modify(ItemDto itemDto) {
        System.out.println("ItemService: 기본정보 수정");
        smRepository.update(itemDto);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: 아이템 정보 수정 완료");
    }

    @Override
    public void remove(Integer integer) {
        System.out.println("ItemService: 기본정보 제거");
        smRepository.delete(integer);
        System.out.println("ItemService: SMS 전송");
        System.out.println("ItemService: 아이템 정보 삭제 완료");
    }

    @Override
    public List<ItemDto> get() {
        List<ItemDto> itemDtos = null;
        itemDtos = smRepository.selectAll();
        return itemDtos;
    }

    @Override
    public ItemDto get(Integer integer) {
        ItemDto itemDto = null;
        itemDto = smRepository.select(integer);
        return itemDto;
    }
}
