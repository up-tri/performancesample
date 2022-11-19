package me.uptri.handson.performancesample.domain.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.uptri.handson.performancesample.domain.model.Post;

@Getter
@AllArgsConstructor
public class PostsResponse {
	private List<Post> posts;
}
