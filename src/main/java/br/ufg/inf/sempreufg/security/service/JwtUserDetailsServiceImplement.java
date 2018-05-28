package br.ufg.inf.sempreufg.security.service;

import br.ufg.inf.sempreufg.entity.model.User;
import br.ufg.inf.sempreufg.security.jwt.JwtUserFactory;
import br.ufg.inf.sempreufg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImplement implements UserDetailsService {

    @Autowired
    private UserService  userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("Não foi encontrado nenhum usuário com o email " + email));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
