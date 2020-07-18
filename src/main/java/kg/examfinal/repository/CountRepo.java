package kg.examfinal.repository;

import kg.examfinal.entity.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface CountRepo extends JpaRepository<Count,Long> {
    Count  countAllByCount(Integer count, LocalDateTime)
}
