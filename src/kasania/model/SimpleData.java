package kasania.model;

public final class SimpleData {

    private final String labelData;
    private final String textFieldData;

    public SimpleData(String labelData, String textFieldData){
        this.labelData = labelData;
        this.textFieldData = textFieldData;
    }

    public SimpleData(String data){
        String[] strings = data.split(":");
        this.labelData = strings[0];
        this.textFieldData = strings[1];
    }

    public String getLabelData(){
        return labelData;
    }

    public String getTextFieldData(){
        return textFieldData;
    }

    @Override
    public String toString() {
        return labelData +":"+ textFieldData;
    }
}
