package br.com.docker.exemplo.docker.repository;

import br.com.docker.exemplo.docker.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
