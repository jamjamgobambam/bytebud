package com.codedotorg;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ByteBud {

    /** The text box that displays the conversation */
    private TextArea conversation;

    /** The label to tell the user where to type */
    private Label inputLabel;

    /** The text box for the user to enter their response */
    private TextField inputField;

    /**
     * ByteBud constructor.
     * Initializes the conversation TextArea, inputLabel and inputField.
     */
    public ByteBud() {
        conversation = new TextArea();
        conversation.setWrapText(true);

        inputLabel = new Label("Type here:");
        inputField = new TextField();
    }
    
    /**
     * Starts the application.
     * It sets the title of the primary stage and shows the main scene.
     *
     * @param primaryStage The primary stage of the application.
     */
    public void startApp(Stage primaryStage) {
        primaryStage.setTitle("ByteBud");
        showMainScene(primaryStage);
    }

    /**
     * Displays the main scene of the application.
     * It sets the action for the input field, creates the layout for the scene,
     * and then sets and shows the scene on the provided primary stage.
     *
     * @param primaryStage The primary stage on which the scene is to be set and shown.
     */
    public void showMainScene(Stage primaryStage) {
        setInputFieldAction();

        HBox inputLayout = new HBox(inputLabel, inputField);
        VBox layout = new VBox(conversation, inputLayout);
        Scene mainScene = new Scene(layout, 300, 300);
        
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    /**
     * Sets an action on the input field. When an action is performed on the input
     * field (when the user presses Enter), the following steps are executed:
     * 1. The text from the input field is retrieved and stored in a variable.
     * 2. The conversation text area is appended with the user's input.
     * 3. A response is generated based on the user's input.
     * 4. The conversation text area is appended with the generated response.
     * 5. The input field is cleared for the next input.
     */
    private void setInputFieldAction() {
        inputField.setOnAction(event -> {
            String input = inputField.getText();
            conversation.appendText("You: " + input + "\n");
            String response = getResponse(input);
            conversation.appendText("ByteBud: " + response + "\n");
            inputField.clear();
        });
    }

    /**
     * Processes the user's input and returns a response.
     * The input text is first converted to lower case to ensure case-insensitive matching.
     * If the input text doesn't match any of the predefined phrases, a default message is
     * returned indicating that the bot didn't understand the input.
     *
     * @param inputText The user's input text.
     * @return A string containing the bot's response.
     */
    private String getResponse(String inputText) {
        

        return "";
    }

}
