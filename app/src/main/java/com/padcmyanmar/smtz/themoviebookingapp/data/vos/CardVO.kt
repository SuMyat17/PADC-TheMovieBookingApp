package com.padcmyanmar.smtz.themoviebookingapp.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "cards")

data class CardVO (
    var isSelected: Boolean? = null,
    @SerializedName("id")
    @PrimaryKey
    val id : Int,
    @SerializedName("card_holder")
    @ColumnInfo(name = "card_holder")
    val cardHolder : String?,
    @SerializedName("card_number")
    @ColumnInfo(name = "card_number")
    val cardNumber : String?,
    @SerializedName("expiration_date")
    @ColumnInfo(name = "expiration_date")
    val expirationDate : String?,
    @SerializedName("card_type")
    @ColumnInfo(name = "card_type")
    val cardType : String?,

    @SerializedName("name")
    @ColumnInfo(name = "name")
    val name : String?,
    @SerializedName("description")
    @ColumnInfo(name = "description")
    val description : String?,
        )