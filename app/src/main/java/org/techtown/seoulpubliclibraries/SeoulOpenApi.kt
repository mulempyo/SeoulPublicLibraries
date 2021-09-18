package org.techtown.seoulpubliclibraries

import org.techtown.seoulpubliclibraries.data.Library
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

class SeoulOpenApi {
    companion object{
        val DOMAIN = "http://openAPI.seoul.go.kr:8088"
        val API_KEY = "55764d4e426b776a3131346f7662516a"
    }
}
interface SeoulOpenService{
    @GET("{api_key}/json/SeoulPublicLibraryInfo/1/200")
    fun getLibrary(@Path("api_key") key: String): Call<Library>
}