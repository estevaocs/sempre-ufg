package br.ufg.inf.sempreufg.service;

import br.ufg.inf.sempreufg.entity.model.User;
import org.springframework.data.domain.Page;

public interface UserService {

    User findByEmail(String email);

    User createOrUpdate(User user);

    User findById(String id);

    void delete(String id);

    Page<User> findAll(int page, int count);

}
