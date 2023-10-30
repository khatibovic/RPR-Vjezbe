public class Sat {
    private int sati;
    private int minute;
    private int sekunde;

    public Sat(int sati, int minute, int sekunde) {
        this.Postavi(sati, minute, sekunde);
    }

    public void Postavi(int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }

    void Sljedeci() {
        this.sekunde++;
        if (this.sekunde==60) {
            this.sekunde=0;
            this.minute++; }
        if (this.minute==60) {
            this.minute=0;
            this.sati++; }
        if (this.sati==24) this.sati=0;
    }
    void Prethodni() {
        this.sekunde--;
        if (this.sekunde==-1) {
            this.sekunde=59;
            this.minute--; }
        if (this.minute==-1) {
            this.minute=59;
            this.sati--; }
        if (sati==-1) this.sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i = 0; i<pomak; i++) Sljedeci();
        else for (int i = 0; i<-pomak; i++) Prethodni();
    }

    @Override
    public String toString() {
        return this.sati+":"+this.minute+":"+this.sekunde;
    }
}
