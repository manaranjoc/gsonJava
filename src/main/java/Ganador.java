import com.google.gson.annotations.SerializedName;

public class Ganador {
    @SerializedName("SorteoId")
    public int sorteoId;
    @SerializedName("Numeros")
    public int[] numeros;
}
