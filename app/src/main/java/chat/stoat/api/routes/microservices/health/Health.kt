package chat.stoat.api.routes.microservices.health

import chat.stoat.api.StoatHttp
import chat.stoat.api.StoatJson
import chat.stoat.core.model.schemas.HealthNotice
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

suspend fun healthCheck(): HealthNotice {
    // Self-hosted instance — no health notice service, return empty notice
    return StoatJson.decodeFromString(HealthNotice.serializer(), """{"notices":[]}""")
}