package org.hanghae.hanghaetest.controller;

import lombok.RequiredArgsConstructor;
import org.hanghae.hanghaetest.dto.ItemRegisterDto;
import org.hanghae.hanghaetest.dto.ItemRespDto;
import org.hanghae.hanghaetest.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class ItemApiController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<ItemRespDto> itemRegister(@RequestBody ItemRegisterDto itemRegisterDto) {

        return ResponseEntity.ok(itemService.registerItem(itemRegisterDto));
    }

    @GetMapping
    public ResponseEntity<List<ItemRespDto>> itemFindAll() {
        return ResponseEntity.ok(itemService.getItemList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemRespDto> itemUpdate(@PathVariable("id") Long id,
                                  @RequestBody ItemRegisterDto itemRegisterDto) {
        return ResponseEntity.ok(itemService.updateItem(id, itemRegisterDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> itemDelete(@PathVariable("id") Long id) {
        itemService.deleteItem(id);

        Map<String, String> response = new HashMap<>();
        response.put("msg", "삭제완료");

        return ResponseEntity.ok(response);
    }
}
