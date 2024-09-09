package org.hanghae.hanghaetest.dto;

import lombok.*;
import org.hanghae.hanghaetest.entity.Item;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ItemRespDto {
    private Long id;
    private String username;
    private String title;
    private String content;
    private Integer price;

    @Builder
    public ItemRespDto(Item item) {
        this.id = item.getId();
        this.username = item.getUsername();
        this.title = item.getTitle();
        this.content = item.getContent();
        this.price = item.getPrice();
    }
}
