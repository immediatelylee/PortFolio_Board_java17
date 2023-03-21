package com.example.PortFolio_Board_Java17.repository;

import com.example.PortFolio_Board_Java17.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
