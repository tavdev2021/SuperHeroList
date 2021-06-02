package com.tavitodev.superherolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*


class HeroAdapter(val superhero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }


    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }


    class HeroHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(superHero: SuperHero){
            view.tvRealName.text = superHero.realName
            view.tvSuperHeroName.text = superHero.superHeroName
            view.tvPublisher.text = superHero.publisher
            Picasso.get().load(superHero.image).into(view.ivImage)
            view.setOnClickListener {
                Toast.makeText(view.context,"Este Super Heroe es ${superHero.superHeroName}",Toast.LENGTH_SHORT).show()
            }
        }
    }
}