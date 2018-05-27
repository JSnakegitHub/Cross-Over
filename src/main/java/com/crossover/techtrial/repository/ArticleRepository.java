package com.crossover.techtrial.repository;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.crossover.techtrial.model.Article;

@Repository
@RepositoryRestResource(exported = false)
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

	List<Article> findTop10ByTitleContainingIgnoreCase(String title);

}
