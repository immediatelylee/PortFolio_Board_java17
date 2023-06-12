package com.example.PortFolio_Board_Java17.dto.request;


import com.example.PortFolio_Board_Java17.dto.ArticleDto;
import com.example.PortFolio_Board_Java17.dto.HashtagDto;
import com.example.PortFolio_Board_Java17.dto.UserAccountDto;

import java.util.Set;

public record ArticleRequest(
        String title,
        String content

) {

    public static ArticleRequest of(String title, String content) {
        return new ArticleRequest(title, content);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto, Set<HashtagDto> hashtagDtos) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                hashtagDtos
        );
    }

}

