package com.example.bookshelf.security;

import com.example.bookshelf.model.Usuario;
import com.example.bookshelf.repository.ususarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

    @Autowired
    private ususarioRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario u = ur.findByLogin(username);

        if(u == null) {
            throw new UsernameNotFoundException("Usuário não cadastrado.");
        }

        return u;
    }
}