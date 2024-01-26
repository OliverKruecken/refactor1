package org.example.refactor1;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

class ArticleServiceTest {
  private ArticleService articleService = new ArticleService();

  @Test
  void should_find_article_by_title() {
    var article = articleService.searchByTitle("EE 7");
    assertThat(article.ean()).isEqualTo("9783836220040");
  }

  @Test
  void should_not_fail_when_called_with_null() {
    var article = articleService.searchByTitle(null);
    assertThat(article).isNull();
  }

  @Test
  void should_not_fail_when_nothing_found() {
    var article = articleService.searchByTitle("DDD");
    assertThat(article).isNull();
  }
}
