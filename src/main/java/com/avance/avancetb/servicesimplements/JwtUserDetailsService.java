package com.avance.avancetb.servicesimplements;

import com.avance.avancetb.entities.Usuario;
import com.avance.avancetb.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUsuarioRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = repo.findOneByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("Usuario no existe: %s", username));
        }

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getRol().getNameRol()));
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getContrasena(),
                true, // enabled
                true, true, true,
                roles);
    }
}
