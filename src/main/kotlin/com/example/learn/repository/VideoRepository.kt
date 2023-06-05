package com.example.learn.repository


import com.example.learn.model.Video
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface VideoRepository : JpaRepository<Video,Long>{

    @Query(nativeQuery = true)
    fun getTotalVideos(@Param ("youtuberId") youtuberId: Long?):Double?
}