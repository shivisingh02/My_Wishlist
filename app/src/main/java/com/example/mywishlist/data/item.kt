package com.example.mywishlist.data

enum class Priority{
    High,
    Medium,
    Low
}
data class Item(
    val title:String,
    val website:String,
    val img: String = "",

)