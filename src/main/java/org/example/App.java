package org.example;

import com.google.gson.Gson;
import java.util.Collections;
import java.util.Map;

/**
 * json
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Map<String, String> human = Map.of(
                "name",
                "Vik",
                "lastName",
                "Pupkin"
        );

        Gson gson = new Gson();
        final String json = gson.toJson(human);
        System.out.println(json);


    }
}
