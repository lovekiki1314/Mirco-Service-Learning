package MainService.security.jwt;


import MainService.Service.ArticleService;
import MainService.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = ArticleService.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User: '" + username + "' not found.");
        } else {
            return new JwtUser(user.getId(), user.getUsername(), user.getPassword(), user.getAuthorities(), user.isEnabled());
        }
    }
}