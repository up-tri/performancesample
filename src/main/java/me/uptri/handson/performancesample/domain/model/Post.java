package me.uptri.handson.performancesample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
	private int id;
	private String title;
	private String author;
}
