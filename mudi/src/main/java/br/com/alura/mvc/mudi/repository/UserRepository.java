package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.User;

/**
*    create table users(
*    username varchar(50) not null primary key,
*    password varchar(200) not null,
*	 enabled boolean not null
*);
*
*create table authorities (
*    username varchar(50) not null,
*    authority varchar(50) not null,
*    constraint fk_authorities_users foreign key(username) references users(username)
*);
*create unique index ix_auth_username on authorities (username,authority);COPIAR CÓDIGO

 */

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByUsername(String username);

}