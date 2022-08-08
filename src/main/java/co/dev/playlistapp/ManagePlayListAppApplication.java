package co.dev.playlistapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({"co.dev.usuarios.commons.models.entity"})
public class ManagePlayListAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagePlayListAppApplication.class, args);
	}

}
