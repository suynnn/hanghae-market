package org.hanghae.hanghaetest.dto;

import lombok.*;

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
    public ItemRespDto(Long id, String username, String title, String content, Integer price) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.content = content;
        this.price = price;
    }
}
