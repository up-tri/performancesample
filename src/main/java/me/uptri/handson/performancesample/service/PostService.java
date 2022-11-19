package me.uptri.handson.performancesample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import me.uptri.handson.performancesample.domain.model.Post;
import me.uptri.handson.performancesample.domain.response.PostsResponse;

@Service
public class PostService {
	public PostsResponse getPosts() {
		return new PostsResponse(
				List.of(
						new Post(1, "title1", "up-tri"),
						new Post(2, "title2", "up-tri"),
						new Post(3, "title3", "up-tri"),
						new Post(4, "title4", "up-tri"),
						new Post(5, "title5", "up-tri"),
						new Post(6, "title6", "up-tri")));
	}
}
