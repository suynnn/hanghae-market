package org.hanghae.hanghaetest.service;

import lombok.RequiredArgsConstructor;
import org.hanghae.hanghaetest.dto.ItemRegisterDto;
import org.hanghae.hanghaetest.dto.ItemRespDto;
import org.hanghae.hanghaetest.entity.Item;
import org.hanghae.hanghaetest.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    @Override
    public ItemRespDto registerItem(ItemRegisterDto itemRegisterDto) {
        Item item = new Item(itemRegisterDto);

        itemRepository.save(item);

        ItemRespDto itemRespDto = new ItemRespDto(item);

        return itemRespDto;
    }

    @Override
    public List<ItemRespDto> getItemList() {
        return itemRepository.findAll().stream().map(ItemRespDto::new)
                .toList();
    }

    @Transactional
    @Override
    public ItemRespDto updateItem(Long id, ItemRegisterDto itemRegisterDto) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new RuntimeException("item not found"));
        item.updateItem(itemRegisterDto);

        return new ItemRespDto(item);
    }

    @Transactional
    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
