package com.example.bookshelf.repository;

import com.example.bookshelf.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface ususarioRepository extends CrudRepository<Usuario, String> {
    
    public Usuario findByLogin(String login);
}
