package structural.adapter.impl;

public class AdaptadorDoisPinosParaTresPinos extends TomadaDoisPinos{

    private TomadaTresPinos tomadaTresPinos;

    public AdaptadorDoisPinosParaTresPinos(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }

    public void conectarNaTomadaDeDoisPinos(){
        tomadaTresPinos.ligarNaTomadaDeTresPinos();
    }
}
