/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;
import org.json.JSONObject;

public class App {
    public String getGreeting() {
        JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
        System.out.println(jo);
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}