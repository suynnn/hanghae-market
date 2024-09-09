package org.hanghae.hanghaetest.service;

import lombok.RequiredArgsConstructor;
import org.hanghae.hanghaetest.dto.ItemRegisterDto;
import org.hanghae.hanghaetest.dto.ItemRespDto;
import org.hanghae.hanghaetest.entity.Item;
import org.hanghae.hanghaetest.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemRespDto registerItem(ItemRegisterDto itemRegisterDto) {
        Item item = new Item(itemRegisterDto);

        itemRepository.save(item);

        ItemRespDto itemRespDto = ItemRespDto.builder()
                .id(item.getId())
                .username(item.getUsername())
                .title(item.getTitle())
                .content(item.getContent())
                .price(item.getPrice())
                .build();

        return itemRespDto;
    }
}
