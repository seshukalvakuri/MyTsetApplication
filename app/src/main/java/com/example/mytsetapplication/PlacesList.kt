package com.example.mytsetapplication

class PlacesList(var placename:String, var placedescription:String) {
    fun getplaceNames(): String {
        return placename
    }

    fun getplaceDescription() : String{
        return placedescription
    }
}