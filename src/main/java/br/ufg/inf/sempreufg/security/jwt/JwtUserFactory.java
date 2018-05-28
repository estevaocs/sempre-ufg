package br.ufg.inf.sempreufg.security.jwt;

import br.ufg.inf.sempreufg.entity.enums.ProfileEnum;
import br.ufg.inf.sempreufg.entity.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(user.getId(), user.getEmail(), user.getPassword(),
                mapToGranteAuthorities(user.getProfile()));
    }

    private static Collection<GrantedAuthority> mapToGranteAuthorities(ProfileEnum profileEnum) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
        return authorities;
    }
}
