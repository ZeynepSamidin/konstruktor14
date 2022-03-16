import java.util.Arrays;

public class Class {
    private int namber;
    private String word;
    private int[] array;

    public Class(int namber, String word, int[] array) {
        this.namber = namber;
        this.word = word;
        this.array = array;
    }

    public int getNamber() {
        return namber;
    }

    public void setNamber(int namber) {
        this.namber = namber;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

