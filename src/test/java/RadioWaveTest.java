import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioWaveTest {
    @Test
    public void shouldSetPrevUnderLimit(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(17);
        radioWave.prev();
        int expected= 9;
        int actual=radioWave.getNumberRadio();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldSetNext(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(17);
        radioWave.next();
        int expected= 1;
        int actual=radioWave.getNumberRadio();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldIncreaseValue(){
        RadioWave radioWave=new RadioWave();
        radioWave.valueRadio=56;
        radioWave.increaseValue();
        int expected=57;
        int actual=radioWave.getValueRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldDecreaseValue(){
        RadioWave radioWave=new RadioWave();
        radioWave.valueRadio=56;
        radioWave.decreaseValue();
        int expected=55;
        int actual=radioWave.getValueRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNumberRadioLessNull(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(-5);
        int expected=0;
        int actual=radioWave.getValueRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNumberRadio(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(5);
        int expected=5;
        int actual=radioWave.getNumberRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextUnderLimit(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(9);
        radioWave.next();
        int expected= 0;
        int actual=radioWave.getNumberRadio();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldSetPrev(){
        RadioWave radioWave=new RadioWave();
        radioWave.setNumberRadio(8);
        radioWave.prev();
        int expected= 7;
        int actual=radioWave.getNumberRadio();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldIncreaseValueUnderLimit(){
        RadioWave radioWave=new RadioWave();
        radioWave.valueRadio=100;
        radioWave.increaseValue();
        int expected=100;
        int actual=radioWave.getValueRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldDecreaseValueLessLimit(){
        RadioWave radioWave=new RadioWave();
        radioWave.valueRadio=0;
        radioWave.decreaseValue();
        int expected=0;
        int actual=radioWave.getValueRadio();
        Assertions.assertEquals(expected,actual);
    }
}
