package mbitsystem.com.currenciesviewer.data.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CurrenciesResponse(
    @JsonProperty("base")
    val base: String,
    @JsonProperty("date")
    val date: String,
    @JsonProperty("rates")
    val rates: ArrayList<Currency>
)