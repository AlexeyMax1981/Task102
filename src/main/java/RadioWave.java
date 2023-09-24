public class RadioWave {
    private int numberRadio;
    public int valueRadio;
    public int quantityRadio=10;
    public RadioWave(int quantityRadio){
        this.quantityRadio=quantityRadio;
    }
    public RadioWave(){

    }


    public int getNumberRadio() {

        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > quantityRadio-1) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void next() {
        if (numberRadio ==quantityRadio-1) {
            numberRadio = 0;
        } else {
            numberRadio++;
        }
    }

    public void prev() {
        if (numberRadio == 0) {
            numberRadio = quantityRadio-1;
        } else {
            numberRadio--;
        }
    }

    public void increaseValue() {
        if (valueRadio == 100) {
            return;
        }
        valueRadio++;
    }

    public void decreaseValue() {
        if (valueRadio == 0) {
            return;
        }
        valueRadio--;
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
