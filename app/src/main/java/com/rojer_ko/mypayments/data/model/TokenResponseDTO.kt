package com.rojer_ko.mypayments.data.model

import com.google.gson.annotations.SerializedName

data class TokenResponseDTO(
	@SerializedName("token")
	val token: String
)