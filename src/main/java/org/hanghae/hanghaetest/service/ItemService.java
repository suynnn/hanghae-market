package org.hanghae.hanghaetest.service;

import org.hanghae.hanghaetest.dto.ItemRegisterDto;
import org.hanghae.hanghaetest.dto.ItemRespDto;

import java.util.List;

/**
 * 아이템 엔티티에 대한 서비스 클래스 입니다.
 */
public interface ItemService {

    ItemRespDto registerItem (ItemRegisterDto itemRegisterDto);

    List<ItemRespDto> getItemList();

    ItemRespDto updateItem(Long id, ItemRegisterDto itemRegisterDto);
}
