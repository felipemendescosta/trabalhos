package encapsulamentoo;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean  ligado;
    private boolean tocando;

  
    public int volume(int v){
        return 0;    
    }
    public boolean ligado(boolean l){
        return false;
     
    }
    public boolean tocando(boolean t){
        return false;
        
    }
    public void ControleRemoto(){
         this.volume = 50;
         this.ligado = true;
         this.tocando = true;     
    }
    
      public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() { 
        System.out.println("_____MENU_____");
        System.out.println("Esta ligado? " + getLigado());
        System.out.println("esta Tocando? " + getTocando());
        System.out.print("Volume: " + getVolume());
            for(int i = 0; i <= getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println(""); 
   }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            setVolume(getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0){
            setVolume(0);
    }
    }

    @Override
    public void play() {
        if(getLigado() && ! getTocando()){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
      if (getLigado() && getTocando())
          setTocando(false);
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getTocando()){
            setVolume(50);
        }
    }
       
}

