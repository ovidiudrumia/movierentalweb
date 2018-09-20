package com.axp.movierentalweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface MovieRepository extends JpaRepository<Movie, Long> {
}