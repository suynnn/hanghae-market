package org.hanghae.hanghaetest.controller;

import lombok.RequiredArgsConstructor;
import org.hanghae.hanghaetest.dto.ItemRegisterDto;
import org.hanghae.hanghaetest.dto.ItemRespDto;
import org.hanghae.hanghaetest.entity.Item;
import org.hanghae.hanghaetest.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class ItemApiController {

    private final ItemService itemService;

    @PostMapping
    public ItemRespDto itemRegister(@RequestBody ItemRegisterDto itemRegisterDto) {

        return itemService.registerItem(itemRegisterDto);
    }

    @GetMapping
    public List<ItemRespDto> itemFindAll() {
        return itemService.getItemList();
    }
}
