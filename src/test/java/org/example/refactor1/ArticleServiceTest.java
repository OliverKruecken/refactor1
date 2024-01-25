package org.example.refactor1;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArticleServiceTest {
  private ArticleService articleService = new ArticleService();

  @Test
  void should_find_article_by_title() {
    var article = articleService.searchByTitle("EE 7");
    assertThat(article.ean()).isEqualTo("9783836220040");
  }
}
