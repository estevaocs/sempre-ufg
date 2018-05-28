package br.ufg.inf.sempreufg.repository;

import br.ufg.inf.sempreufg.entity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);

}
