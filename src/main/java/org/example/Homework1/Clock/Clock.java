package org.example.Homework1.Clock;

public class Clock implements Readable{
    private int hh;
    private int mm;
    private int ss;

    public void setHh(int hh) {
        this.hh = hh;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }

    public void tick(){
        this.ss = ss + 1;
        normalDateTime();
    }

    private void normalDateTime(){
        if (this.ss == 60){
            this.ss = 0;
            this.mm = mm + 1;
        }

        if (this.mm == 60){
            this.mm = 0;
            this.hh = hh + 1;
        }

        if (this.hh == 24){
            this.hh = 0;

        }

    }

    @Override
    public void Readable() {
        System.out.println("Текущее время: " + hh +":"+mm+":"+ss);
    }
}


