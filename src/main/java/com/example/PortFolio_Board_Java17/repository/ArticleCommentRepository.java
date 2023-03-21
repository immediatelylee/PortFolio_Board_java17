package com.example.PortFolio_Board_Java17.repository;


import com.example.PortFolio_Board_Java17.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}