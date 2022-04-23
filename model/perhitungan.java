package model;

import interfaces.ContohInterfaces;

public class perhitungan implements ContohInterfaces {
    private int a;
    private int b;
    private int hasil;

    public perhitungan(int _a,int _b,int _hasil){
        this.a=_a;
        this.b=_b;
        _hasil=0;
        this.hasil=_hasil;
        printJudulClass("Print judul dalam Class Perhitunngan");
    
}

    private void printJudulClass(String string) {
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Dalam Interfaces");
        
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil=this.a+this.b;
        
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil=this.a * this.b;
        
    }
    //Method return dari hasilkali
    public int hasilkali( int _b, int _a) {
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.hasil;
       
    }
    
    //Method Return dari hasiltambah dengan parameter

    public int hasiltambah(int b2, int a1) {
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.hasil;
        
    }
}

  