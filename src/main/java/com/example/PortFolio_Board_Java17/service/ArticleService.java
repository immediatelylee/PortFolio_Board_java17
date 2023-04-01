package com.example.PortFolio_Board_Java17.service;

import com.example.PortFolio_Board_Java17.domain.type.SearchType;
import com.example.PortFolio_Board_Java17.dto.ArticleDto;
import com.example.PortFolio_Board_Java17.dto.ArticleUpdateDto;
import com.example.PortFolio_Board_Java17.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional // springframework의 Transactional사용
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {
    }

    public void deleteArticle(long articleId) {
    }
}
