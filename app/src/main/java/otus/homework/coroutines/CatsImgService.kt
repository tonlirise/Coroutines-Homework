package otus.homework.coroutines

import retrofit2.http.GET

interface CatsImgService {

    @GET("meow")
    suspend fun getCatImg(): Img
}