import ru.zeydie.hwido.HWIDOshi;
import ru.zeydie.hwido.gson.HWIDGSON;
import ru.zoom4ikdan4ik.gson.GsonFile;

import java.nio.file.Paths;

public class HWIDOshiTest {
    public static void main(String... args) {
        final HWIDGSON hwidgson = HWIDOshi.getHWIDGson();

        final GsonFile gsonFile = new GsonFile(Paths.get("oshi.json"));
        final String json = gsonFile.fromObjectToJson(hwidgson);

        gsonFile.writeJsonFile(json);

        System.out.println(gsonFile.fromObjectToJson(hwidgson));
    }
}
