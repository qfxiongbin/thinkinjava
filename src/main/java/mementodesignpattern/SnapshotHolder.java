package mementodesignpattern;

import java.util.Stack;

public class SnapshotHolder {

    private Stack<InputText> snapshots = new Stack<InputText>();

    public InputText popSnapshot(){
        return snapshots.pop();
    }

    public void pushSnapShot(InputText text){
        InputText deepCloneInputText = new InputText();
        deepCloneInputText.setText(text.getText());
        snapshots.push(deepCloneInputText);

    }
}
