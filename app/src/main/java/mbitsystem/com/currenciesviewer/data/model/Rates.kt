package mbitsystem.com.currenciesviewer.data.model

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import mbitsystem.com.currenciesviewer.data.network.RatesDeserializer

@JsonDeserialize(using = RatesDeserializer::class)
data class Rates(val currencies: List<Currency>)