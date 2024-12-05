import com.example.ApiFetcher.DataModel
import retrofit2.http.GET

interface RetrofitApi {
    @GET("hiring.json")
    suspend fun getData(): List<DataModel>
}
