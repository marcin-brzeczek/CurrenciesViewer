package mbitsystem.com.currenciesviewer.data.network

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.core.TreeNode
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.DoubleNode
import mbitsystem.com.currenciesviewer.data.model.Currency
import mbitsystem.com.currenciesviewer.data.model.Rates
import java.io.IOException

class RatesDeserializer @JvmOverloads constructor(valueClass: Class<*>? = null) :
    StdDeserializer<Rates>(valueClass) {
    @Throws(IOException::class, JsonProcessingException::class)
    override fun deserialize(jsonParser: JsonParser, context: DeserializationContext): Rates {
        val currencies = mutableListOf<Currency>()
        val node = jsonParser.codec.readTree<TreeNode>(jsonParser)
        node.fieldNames().forEach {
            val currency = Currency(name = it, value = (node.get(it) as DoubleNode).doubleValue())
            currencies.add(currency)
        }
        return Rates(currencies)
    }
}