package com.tavitodev.superherolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val superheros: List<SuperHero> = listOf(
        SuperHero("Spider Man", "Peter Parker", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        SuperHero("Daredevil", "Matthew Michael Murdock", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        SuperHero("Wolverine", "James Howlett", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        SuperHero("Batman", "Bruce Wayne", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        SuperHero("Thor", "Thor Odinson", "Marvel", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
        SuperHero("Flash", "Jay Garrick", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
        SuperHero("Green Lantern", "Alan Scott", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
        SuperHero("Wonder Woman", "Princess Diana", "DC", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"),
        SuperHero("Iron Man","Tony Stark","Marvel","https://www.entertainmentearth.com/news/wp-content/uploads/2014/10/iron-man-wrap.jpg"),
        SuperHero("Super Rana", "La Rana Rene", "Mi Creación", "https://yt3.ggpht.com/ytc/AAUvwnhDg-yrss-9kM2NgZj2r6lP1CQjUJJv7eagg08l=s900-c-k-c0x00ffffff-no-rj"),
        SuperHero("Harley Queen","Dr. Harleen Frances Quinzel","DC","https://aws.glamour.es/prod/designs/v1/assets/2056x2056/626441.jpg")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()

    }

    fun initRecycler(){
        rvSuperhero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superheros)
        rvSuperhero.adapter = adapter

    }
}