package structural.adapter.impl;

public class DemoAdapter {

    public static void main(String[] args) {
        TomadaTresPinos t3 = new TomadaTresPinos();
        TomadaDoisPinos t2 = new TomadaDoisPinos();

        AdaptadorDoisPinosParaTresPinos adapter = new AdaptadorDoisPinosParaTresPinos(t3);

        adapter.conectarNaTomadaDeDoisPinos();
    }

}
