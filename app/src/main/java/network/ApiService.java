package network;


import model.Photo;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("v2/list")
    Call<List<Photo>> getPhotos();
}
