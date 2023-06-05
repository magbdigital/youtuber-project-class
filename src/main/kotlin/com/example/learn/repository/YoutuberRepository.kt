package com.example.learn.repository


import com.example.learn.model.Youtuber
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface YoutuberRepository : JpaRepository<Youtuber,Long>{
    fun findById(id: Long?):Youtuber?

}