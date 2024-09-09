package org.hanghae.hanghaetest.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemRegisterDto {
    private String username;
    private String title;
    private String content;
    private Integer price;
}
