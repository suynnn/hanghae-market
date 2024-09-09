package org.hanghae.hanghaetest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hanghae.hanghaetest.dto.ItemRegisterDto;

@Getter
@ToString
@Entity
@Table(name = "items")
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private Integer price;

    public Item(ItemRegisterDto itemRegisterDto) {
        this.username = itemRegisterDto.getUsername();
        this.title = itemRegisterDto.getTitle();
        this.content = itemRegisterDto.getContent();
        this.price = itemRegisterDto.getPrice();
    }
}
