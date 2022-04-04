package model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class Users(
    @SerializedName("message")
    @Expose
    var message: String? = null
) {
    @SerializedName("documentation_url")
    @Expose
    var documentationUrl: String? = null
}