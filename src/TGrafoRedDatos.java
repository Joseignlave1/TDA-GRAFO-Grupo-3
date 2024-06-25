
import java.util.Collection;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
public class TGrafoRedDatos extends TGrafoNoDirigido implements IGrafoRedDatos, ITGrafoRedDatos{

    public TGrafoRedDatos(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public LinkedList<TVertice> rutaMenosSaltos(Comparable origen, Comparable destino) {
        TVertice verticeOrigen = this.buscarVertice(origen);
        TVertice verticeDestino = this.buscarVertice(origen);

        if(verticeOrigen == null || verticeDestino == null) {
            return null;
        }

        //Al principio marcamos todos los vértices como NO visitados
        for(TVertice v : this.getVertices().values()) {
            v.setVisitado(false);
        }

        LinkedList<TVertice> resultado = verticeOrigen.beaHastaDestino(destino);

        return  resultado;
    }

    @Override
    public boolean conectados(Comparable a, Comparable b) {
        TVertice v1 = buscarVertice(a);
        TVertice v2 = buscarVertice(b);

        if (v1 == null || v2 == null) {
            return false;
        }

        return bpfVerificandoConexion(v1, b);
    }
}