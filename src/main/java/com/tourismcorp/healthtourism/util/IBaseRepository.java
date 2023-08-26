package com.tourismcorp.healthtourism.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface IBaseRepository<T> extends JpaRepository<T, Long> {
    Optional<T> findByUUID(UUID uuid);
}
