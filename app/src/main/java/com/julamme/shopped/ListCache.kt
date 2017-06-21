package com.julamme.shopped

class ListCache {
    var listCache: MutableMap<String, List<String>> = HashMap()
    init {
        println("init in cache")
    }

    fun getFromCache(title : String) : List<String>? {
        return listCache.get(title)
    }
    fun addToCache(title : String, items : List<String>) {
        listCache.put(title, items)
    }
}