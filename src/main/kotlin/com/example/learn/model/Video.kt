package com.example.learn.model

import jakarta.persistence.*

@Entity
@Table(name = "video")
class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( updatable = false)
    var id: Long? = null
    var title: String? = null
    var description: String? = null
    var duration: Int? = null
    @Column(name = "youtuber_id")
    var youtuberId: Long? = null
}