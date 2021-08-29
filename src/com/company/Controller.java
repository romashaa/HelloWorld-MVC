package com.company;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setText(inputTextWithScanner(sc));

    }

    public String inputTextWithScanner(Scanner sc) {
        boolean helloIsHere = false;
        view.printMessage(View.INPUT_TEXT_DATA);
        while (true) {
            if (sc.hasNext(HELLO) && !helloIsHere) {
                helloIsHere = true;
                model.setText(HELLO);
                view.printMessageAndText(View.OUR_TEXT, model.getText());
            } else if (sc.hasNext(WORLD) && helloIsHere) {
                model.setText(HELLO + " " + WORLD);
                view.printMessageAndText(View.OUR_TEXT, model.getText());
                break;

            } else {
                if (model.getText() == null) {
                    model.setText(" ");
                }
                view.printMessage(View.WRONG_INPUT_TEXT_DATA + View.INPUT_TEXT_DATA);
                view.printMessageAndText(View.OUR_TEXT, model.getText());
                sc.next();
            }
        }
        return sc.nextLine();
    }
}
