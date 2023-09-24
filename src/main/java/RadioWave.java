public class RadioWave {
    public int numberRadio;
    public int valueRadio;

    public int getNumberRadio() {

        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > 9) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void next() {
        if (numberRadio == 9) {
            numberRadio = 0;
        } else {
            numberRadio++;
        }
    }

    public void prev() {
        if (numberRadio == 0) {
            numberRadio = 9;
        } else {
            numberRadio--;
        }
    }

    public void increaseValue() {
        if (valueRadio == 100) {
            return;
        }
        valueRadio++;
        System.out.println(valueRadio);
    }

    public void decreaseValue() {
        if (valueRadio == 0) {
            return;
        }
        valueRadio--;
        System.out.println(valueRadio);
    }

    /*public void setValue(int newValueRadio){
        if (newValueRadio>100){
            return;
        }
        if(newValueRadio<0){
            return;
        }
        valueRadio=newValueRadio;
    }*/
    public int getValueRadio() {
        return valueRadio;
    }
}
