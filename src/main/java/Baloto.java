import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Baloto {
    @SerializedName("BalotoId")
    public int balotoId;
    @SerializedName("Numeros-Ganadores")
    public int[] numerosGanadores;
    @SerializedName("Ganadores")
    public List<Ganador> ganadores;
}
