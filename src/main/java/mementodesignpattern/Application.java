package mementodesignpattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String input = scanner.next();
            if(input.equals(":list")){
                System.out.println(inputText.getText());
            }else if(input.equals(":undo")){
                InputText snapshot = snapshotHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            }else{
                snapshotHolder.pushSnapShot(inputText);
                inputText.append(input);
            }
        }
    }
}
