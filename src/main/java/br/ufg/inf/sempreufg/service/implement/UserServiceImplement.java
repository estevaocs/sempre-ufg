package br.ufg.inf.sempreufg.service.implement;

import br.ufg.inf.sempreufg.entity.model.User;
import br.ufg.inf.sempreufg.repository.UserRepository;
import br.ufg.inf.sempreufg.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {

    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User createOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.getOne(id);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<User> findAll(int page, int count) {
        Pageable pages = new QPageRequest(page,count);
        return userRepository.findAll(pages);
    }
}
