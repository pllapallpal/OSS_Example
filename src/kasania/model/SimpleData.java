package kasania.model;

public final class SimpleData {

    private final String labelData;
    private final String textFieldData;

    public SimpleData(String labelData, String textFieldData){
        this.labelData = labelData;
        this.textFieldData = textFieldData;
    }

    @Override
    public String toString() {
        return labelData + textFieldData;
    }
}
