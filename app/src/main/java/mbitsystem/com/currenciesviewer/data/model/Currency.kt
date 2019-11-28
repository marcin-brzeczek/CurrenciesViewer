package mbitsystem.com.currenciesviewer.data.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Currency(var name: String, var value:Double)