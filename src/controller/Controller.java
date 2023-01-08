package controller;

import java.util.ArrayList;
import model.*;

public class Controller {

    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {

        }
    }


}
