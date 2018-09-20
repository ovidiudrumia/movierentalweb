package com.axp.movierentalweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovierentalwebApplicationTests {

	@Autowired
	MovieRepository movieRepository;

	@Test
	public void contextLoads() {
		assertThat(movieRepository.count()).isEqualTo(9);
	}

}
