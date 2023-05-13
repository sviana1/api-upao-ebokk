package com.upao.ebook.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Table(name="reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title", nullable = false)
    private String title;
    @Column(name="comment", nullable = false)
    private String comment;
    @Column(name="rating", nullable = false)
    private Integer rating;
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @Column(name="update_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name="book_id", nullable = false)
    private Book book;

}
