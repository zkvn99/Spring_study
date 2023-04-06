package idusw.springboot.boardthymeleaf.repository;

import idusw.springboot.boardthymeleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
