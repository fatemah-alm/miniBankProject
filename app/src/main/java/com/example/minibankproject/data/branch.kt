package com.example.minibankproject.data

enum class BranchType {
    MAIN, SUB, ATM
}

data class BranchModel(
    val id: String,
    val name:String,
    val address: String,
    val type: BranchType,
    val phone: String,
    val hours: String,
    val location: String,
    val imageUri: Int? = null ,
    )
