package kg.examfinal.service;

import kg.examfinal.entity.Count;

import java.util.List;

public interface CountService {
    List<Count> getAll();
    Count create(Count count);
}
