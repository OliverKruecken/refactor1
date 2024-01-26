package org.example.refactor1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
  private final ArticleRepository articleRepositoryMem = new ArticleRepositoryMem();

  public Article searchByTitle(String name) {
    List<Article> all = articleRepositoryMem.findAll();

    if (name == null) {
      return null;
    }

    boolean found = false;
    int i = 0;
    while (i < all.size() && !found) {
      if (all.get(i).title().contains(name)) {
        found = true;
      }
      if (!found) {
        i++;
      }
    }
    if (found) {
      return all.get(i);
    } else {
      return null;
    }
  }
}
