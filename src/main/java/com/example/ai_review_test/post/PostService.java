package com.example.ai_review_test.post;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getPost(Long id) {
        return postRepository.findById(id).get();       // 버그 1: 없는 id면 예외
    }

    public void deletePost(Long postId, Long userId) {
        postRepository.deleteById(postId);              // 버그 2: 작성자 확인 없이 삭제
    }
}
