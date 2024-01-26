package org.example.refactor1;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ArticleRepositoryMem implements ArticleRepository {
  private final List<Article> articles =
      List.of(
          new Article("Clean Architecture", "9780134494166"),
          new Article("Scrum in der Praxis", "9783864902581"),
          new Article("Professionell entwickeln mit Java EE 7", "9783836220040"),
          new Article("Refactoring", "9780201485677"),
          new Article("Halbleiter-Schaltungstechnik", "9783540561842"));

  public List<Article> findAll() {
    return articles;
  }

  List<Article> findByTitle(String title) {
    // todo
    return null;
  }
}
