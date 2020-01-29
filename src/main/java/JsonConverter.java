import com.google.gson.Gson;

public class JsonConverter {
    public static void main(String[] args) {
        String json = "{\n\"Baloto\":{\n\"BalotoId\":5,\n\"Numeros-Ganadores\":[2,45,34,23,7,5,13],\n\"Ganadores\":[\n{\n\"SorteoId\":23,\n\"Numeros\":[2,45,13]\n\n},\n{\n\"SorteoId\": 24,\n\"Numeros\": [ 34,23,5]\n}\n]\n\n}\n}";
        BalotoRevancha baloto = jsonToPojo(json);
        System.out.println("Id del baloto: "+baloto.baloto.balotoId);
        System.out.println("Los numeros ganadores son:");
        for(int i: baloto.baloto.numerosGanadores){
            System.out.println("\t"+i);
        }
        System.out.println("Los ganadores son");
        for(Ganador g: baloto.baloto.ganadores){
            System.out.println("SorteoId "+g.sorteoId);
            System.out.println("Numeros");
            for (int n: g.numeros){
                System.out.println("\t"+n);
            }
        }
        System.out.println("Pojo a Json");
        System.out.println("\t"+pojoToJson(baloto));
    }

    public static BalotoRevancha jsonToPojo(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, BalotoRevancha.class);
    }

    public static String pojoToJson(BalotoRevancha baloto){
        Gson gson = new Gson();
        return gson.toJson(baloto);
    }
}
