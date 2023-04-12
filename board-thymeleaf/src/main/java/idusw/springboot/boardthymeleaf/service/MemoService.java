package idusw.springboot.boardthymeleaf.service;

import idusw.springboot.boardthymeleaf.domain.Memo;

import java.util.List;

public interface MemoService {
    Object create(Memo m);
    Memo read(Memo m);
    List<Memo> readList();
    int update(Memo m);
    int delete(Memo m);
    List<Memo> initialize();
}
