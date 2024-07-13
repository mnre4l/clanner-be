package ru.mntreal.clanner.be;

import org.springframework.boot.SpringApplication;

public class TestClannerBeApplication {

	public static void main(String[] args) {
		SpringApplication.from(ClannerBeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
