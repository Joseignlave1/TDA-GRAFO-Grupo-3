import java.lang.reflect.Array;
import java.util.*;

public class PruebaGrafo {

    public static void main(String[] args) {
        /*

              TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_1.txt","./src/conexiones_1.txt",
                false, TGrafoDirigido.class);

            Object[] etiquetasarray = gd.getEtiquetasOrdenado();

            Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
            UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
            Double[][] mfloyd = gd.floyd();
            UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
            for (int i = 0; i < etiquetasarray.length; i++) {
                System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
            }
            System.out.println();
            System.out.println("Centro del grafo: " + gd.centroDelGrafo());
         */

//        //Ejercicio 1
//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt", "./src/conexiones.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        boolean[][] mWarshall = gd.warshall();
//        UtilGrafos.imprimirMatrizWarshall(mWarshall, gd.getVertices(), "Matriz luego de Warshall");
//
//        gd.bpf();
        /*
             TCaminos todosLosCaminos = gd.todosLosCaminos("Montevideo","Rio_de_Janeiro");

             todosLosCaminos.imprimirCaminosConsolaYCostoTotal();
         */



        /*

        ArrayList<TVertice> vertices = new ArrayList<>();
        ArrayList<TArista> aristas = new ArrayList<>();

        TVertice vertice1 = new TVertice("Artigas");
        TVertice vertice2 = new TVertice("Canelones");
        TVertice vertice3 = new TVertice("Durazno");

        TVertice vertice4 = new TVertice("Florida");
        TVertice vertice5 = new TVertice("Montevideo");
        TVertice vertice6 = new TVertice("Punta del Este");
        TVertice vertice7 = new TVertice("Rocha");
        vertices.add(vertice1);
        vertices.add(vertice2);
        vertices.add(vertice3);
        vertices.add(vertice4);
        vertices.add(vertice5);
        vertices.add(vertice6);
        vertices.add(vertice7);

        TArista arista = new TArista("Artigas", "Rocha", 400);
        TArista arista1 = new TArista("Canelones", "Artigas", 500);
        TArista arista2 = new TArista("Canelones", "Colonia", 200);
        TArista arista3 = new TArista("Canelones", "Durazno", 170);
        TArista arista4 = new TArista("Canelones", "Punta del Este", 90);
        TArista arista5 = new TArista("Colonia", "Montevideo", 180);
        TArista arista6 = new TArista("Montevideo", "Artigas", 700);
        TArista arista7 = new TArista("Montevideo", "Canelones", 30);
        TArista arista8 = new TArista("Montevideo", "Punta del Este", 130);
        TArista arista9 = new TArista("Punta del Este", "Rocha", 90);
        TArista arista10 = new TArista("Rocha", "Montevideo", 270);
        TArista arista11 = new TArista("Florida", "Durazno", 60);

        aristas.add(arista);
        aristas.add(arista1);
        aristas.add(arista2);
        aristas.add(arista3);
        aristas.add(arista4);
        aristas.add(arista5);
        aristas.add(arista6);
        aristas.add(arista7);
        aristas.add(arista8);
        aristas.add(arista9);
        aristas.add(arista10);
        aristas.add(arista11);

        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(grafoDirigido.getVertices());
        UtilGrafos.imprimirMatrizMejorado(matriz, grafoDirigido.getVertices(), "matriz Ejercicio 1");

        Double[][] matrizFloyd = grafoDirigido.floyd();
        UtilGrafos.imprimirMatrizMejorado(matrizFloyd, grafoDirigido.getVertices(), "Matriz de costos mínimos FLOYD");
         */

        /*
            Preguntas ejercicio1:

            El costo de volar de Montevideo a Rio de Janeiro es:
            a. 1980.
            b. 3780.-Correcto
            c. 1000.
            d. 980.

            El costo de volar de Montevideo a Curitiba es:
            a. 2580-Correcto
            b. 3780.
            c. 1980.
            d. Ninguna de las anteriores

            3. Los servicios de mantenimiento se instalan en:
            a. Montevideo
            b. Punta del Este
            c. Curitiba -Correcto
            d. Porto Alegre

            Supongo que se referirá al centro el grafo
         */

        /*
          Ejercicio 2:
            Ejecutando esta funcionalidad del programa desarrollado, responde (y verifica manualmente!!!!):
            • ¿Existen conexión(es) entre Montevideo y Curitiba? SI
            • ¿Existen conexión(es) entre Porto Alegre y Santos? SI
         */

        //Ejercicio 3:

        /*
            1)
            TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt","./src/conexiones.txt",
            false, TGrafoDirigido.class);

            Object[] etiquetasarray = gd.getEtiquetasOrdenado();

            Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
            UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
            Double[][] mfloyd = gd.floyd();
            UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
            for (int i = 0; i < etiquetasarray.length; i++) {
                System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
            }
            System.out.println();
            System.out.println("Centro del grafo: " + gd.centroDelGrafo());

            boolean[][] mWarshall = gd.warshall();
            UtilGrafos.imprimirMatrizWarshall(mWarshall,gd.getVertices(), "Matriz luego de Warshall");

            gd.bpf();

            2)
            El orden de tiempo de ejecución es O(n + m) donde n es el número de vértices y m el número de aristas.

            3)
            Se visitan todos los vértices del grafo siempre y cuándo el grafo sea conexo, si no es conexo se visitarán todos los vértices alcanzables desde el
            vértice inicial(teniendo en cuénta la implementación de bpf que recibe un vértice inicial por parámetro)

            En el caso de que el grafo no sea conexo, lo que haría sería agregar a una lista los vértices alcanzables por visitar, a medida que los voy visitando
            los elimino de la lista, cuándo la lista este vacía, entonces busco los vértices que restan del grafo sin visitar, estos vendrían a ser los vértices del otro
            subgrafo, selecciono otro vértice inicial, los agrego a la lista y  a medida que los voy visitando los elimino, cuándo la lista esté vacía entonces quiere decir que visité el subgrafo restante.

            4)

            Primero iteraría sobre los adyacentes de ese vértice destino, en un bucle que vaya iterando sobre cada vértice su adyacente, guardando en una lista
            las etiquetas de los vértices para así formar el camino, el bucle finalizaría cuándo la etiqueta de uno de los vértices sea igual al vértice de destino
            indicando que se ha completado el camino.

            finalmente devolvería la lista con todos los posibles vértices desde el vértice de origen hasta el vértice de destino.
         */


        /*
                    //Kruskal

        ArrayList<TVertice> vertices = new ArrayList<>();
        vertices.add(new TVertice("Artigas"));
        vertices.add(new TVertice("Canelones"));
        vertices.add(new TVertice("Durazno"));
        vertices.add(new TVertice("Florida"));
        vertices.add(new TVertice("Montevideo"));
        vertices.add(new TVertice("Punta del Este"));
        vertices.add(new TVertice("Rocha"));

        ArrayList<TArista> aristas = new ArrayList<>();
        aristas.add(new TArista("Artigas", "Rocha", 400));
        aristas.add(new TArista("Canelones", "Artigas", 500));
        aristas.add(new TArista("Canelones", "Colonia", 200));
        aristas.add(new TArista("Canelones", "Durazno", 170));
        aristas.add(new TArista("Canelones", "Punta del Este", 90));
        aristas.add(new TArista("Colonia", "Montevideo", 180));
        aristas.add(new TArista("Montevideo", "Artigas", 700));
        aristas.add(new TArista("Montevideo", "Canelones", 30));
        aristas.add(new TArista("Montevideo", "Punta del Este", 130));
        aristas.add(new TArista("Punta del Este", "Rocha", 90));
        aristas.add(new TArista("Rocha", "Montevideo", 270));
        aristas.add(new TArista("Florida", "Durazno", 60));

        TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);

        TGrafoNoDirigido arbolExpansionMinima = grafoNoDirigido.Kruskal();

        System.out.println("Aristas del Árbol de Expansión Mínima:");
        for (TArista arista : arbolExpansionMinima.getLasAristas()) {
            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
        }
         */

        //KEVIN BACON


//
//        TGrafoNoDirigido grafoNoDirigido = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/actores.csv", "./src/en_pelicula.csv",
//                false, TGrafoNoDirigido.class);
//
//
//        String[] actores = {"John_Goodman", "Tom_Cruise", "Jason_Statham", "Lukas_Haas", "Djimon_Hounsou", "Harrison_Ford"};
//
//        for (String actor : actores) {
//            int numBacon = grafoNoDirigido.numBacon(actor);
//            System.out.println("El número de Bacon de " + actor + " es: " + numBacon);
//        }

        //BEA

//        TGrafoNoDirigido grafoNoDirigido = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/actores.csv", "./src/en_pelicula.csv",
//                false, TGrafoNoDirigido.class);
//
//        String etiquetaOrigen = "Kevin_Bacon";
//        Collection<TVertice> visitadosDesdeOrigen = grafoNoDirigido.bea(etiquetaOrigen);
//
//        System.out.println("Vértices visitados desde " + etiquetaOrigen + ":");
//        for (TVertice vertice : visitadosDesdeOrigen) {
//            System.out.println(vertice.getEtiqueta());
//        }
//
//        Collection<TVertice> visitadosEnTodoElGrafo = grafoNoDirigido.bea();
//
//        System.out.println("Vértices visitados en todo el grafo:");
//        for (TVertice vertice : visitadosEnTodoElGrafo) {
//            System.out.println(vertice.getEtiqueta());
//        }

        //PUNTOS DE ARTICULACIÓN


//        ArrayList<TVertice> vertices = new ArrayList<>();
//        vertices.add(new TVertice("Artigas"));
//        vertices.add(new TVertice("Canelones"));
//        vertices.add(new TVertice("Durazno"));
//        vertices.add(new TVertice("Florida"));
//        vertices.add(new TVertice("Montevideo"));
//        vertices.add(new TVertice("Punta del Este"));
//        vertices.add(new TVertice("Rocha"));
//
//        ArrayList<TArista> aristas = new ArrayList<>();
//        aristas.add(new TArista("Artigas", "Rocha", 400));
//        aristas.add(new TArista("Canelones", "Artigas", 500));
//        aristas.add(new TArista("Canelones", "Colonia", 200));
//        aristas.add(new TArista("Canelones", "Durazno", 170));
//        aristas.add(new TArista("Canelones", "Punta del Este", 90));
//        aristas.add(new TArista("Colonia", "Montevideo", 180));
//        aristas.add(new TArista("Montevideo", "Artigas", 700));
//        aristas.add(new TArista("Montevideo", "Canelones", 30));
//        aristas.add(new TArista("Montevideo", "Punta del Este", 130));
//        aristas.add(new TArista("Punta del Este", "Rocha", 90));
//        aristas.add(new TArista("Rocha", "Montevideo", 270));
//        aristas.add(new TArista("Florida", "Durazno", 60));
//
//        TGrafoNoDirigido grafoNoDirigido = new TGrafoNoDirigido(vertices, aristas);
//
//        LinkedList<TVertice> puntosArticulacion = grafoNoDirigido.puntosArticulacion();
//
//        // Imprimir los puntos de articulación
//        System.out.println("Puntos de articulación en el grafo:");
//        for (TVertice vertice : puntosArticulacion) {
//            System.out.println(vertice.getEtiqueta());
//        }


        //CLASIFICAR ÁRCOS DEL ÁRBOL

        /*
        TVertice vA = new TVertice("A");
        TVertice vB = new TVertice("B");
        TVertice vC = new TVertice("C");
        TVertice vD = new TVertice("D");
        TVertice vE = new TVertice("E");

        TArista aristaAB = new TArista("A", "B", 1);
        TArista aristaAC = new TArista("A", "C", 1);
        TArista aristaBD = new TArista("B", "D", 1);
        TArista aristaCD = new TArista("C", "D", 1);
        TArista aristaDE = new TArista("D", "E", 1);

        Collection<TVertice> vertices = Arrays.asList(vA, vB, vC, vD, vE);
        Collection<TArista> aristas = Arrays.asList(aristaAB, aristaAC, aristaBD, aristaCD, aristaDE);

        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);


        List<TArista> arcosArbol = new LinkedList<>();
        List<TArista> arcosRetroceso = new LinkedList<>();
        List<TArista> arcosAvance = new LinkedList<>();
        List<TArista> arcosCruzados = new LinkedList<>();

        grafoDirigido.clasificarArcos("A", arcosArbol, arcosRetroceso, arcosAvance, arcosCruzados);

        System.out.println("Arcos de Árbol:");
        for (TArista arista : arcosArbol) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos de Retroceso:");
        for (TArista arista : arcosRetroceso) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos de Avance:");
        for (TArista arista : arcosAvance) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }

        System.out.println("Arcos Cruzados:");
        for (TArista arista : arcosCruzados) {
            System.out.println(arista.getEtiquetaOrigen() + " -> " + arista.getEtiquetaDestino());
        }
         */
//        List<List<TVertice>> componentesFuertementeConexos = grafoDirigido.encontrarComponentesFuertementeConectados();
//
//        System.out.println("Componentes fuertemente conexos del grafo");
//
//        for(List<TVertice> componente : componentesFuertementeConexos) {
//            for(TVertice vertice : componente) {
//                System.out.println(vertice.getEtiqueta() + "");
//            }
//            System.out.println();
//        }
//
//        List<TVertice> ordenTopologico = grafoDirigido.ordenarTopologico();
//
//        System.out.println("Orden topológico del grafo:");
//        for (TVertice vertice : ordenTopologico) {
//            System.out.print(vertice.getEtiqueta() + " ");
//        }


//
//        String[] lineasTareas = ManejadorArchivosGenerico.leerArchivo("src/tareas.txt", false);
//        List<TVertice> vertices = new ArrayList<>();
//        for (String linea : lineasTareas) {
//            String[] partes = linea.split(" ");
//            String etiqueta = partes[1];
//            vertices.add(new TVertice(etiqueta));
//        }
//
//        String[] lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("./src/precedencias.txt", false);
//        List<TArista> aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(" ");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 1.0));
//        }
//
//        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
//
//        LinkedList<String> ordenParcial = grafoDirigido.ordenParcial();
//
//        grafoDirigido.listarTareas(ordenParcial);
//        ManejadorArchivosGenerico.escribirArchivo("orden.txt", ordenParcial.toArray(new String[0]));
//
//        lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("./src/precedencias2.txt", false);
//        aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(" ");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 1.0));
//        }
//
//        grafoDirigido = new TGrafoDirigido(vertices, aristas);
//        ordenParcial = grafoDirigido.ordenParcial();
//        grafoDirigido.listarTareas(ordenParcial);
//        ManejadorArchivosGenerico.escribirArchivo("orden2.txt", ordenParcial.toArray(new String[0]));



//           String[] lineasTareas = ManejadorArchivosGenerico.leerArchivo("src/tareasTA6.txt", false);
//        List<TVertice> vertices = new ArrayList<>();
//        for (String linea : lineasTareas) {
//            String[] partes = linea.split(",");
//            String etiqueta = partes[0];
//            vertices.add(new TVertice(etiqueta));
//        }
//
//        String[] lineasPrecedencias = ManejadorArchivosGenerico.leerArchivo("src/precedenciasTA6.txt", false);
//        List<TArista> aristas = new ArrayList<>();
//        for (String linea : lineasPrecedencias) {
//            String[] partes = linea.split(",");
//            String origen = partes[0];
//            String destino = partes[1];
//            aristas.add(new TArista(origen, destino, 0));
//        }
//
//        TGrafoDirigido grafoDirigido = new TGrafoDirigido(vertices, aristas);
//
//        LinkedList<String> ordenParcial = grafoDirigido.ordenParcial();
//
//        grafoDirigido.listarTareas(ordenParcial);

        //UT7_TA3

//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos.txt", "./src/conexiones.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        boolean[][] mWarshall = gd.warshall();
//        UtilGrafos.imprimirMatrizWarshall(mWarshall, gd.getVertices(), "Matriz luego de Warshall");
//
//        gd.bpf();

//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_1.txt","./src/conexiones_1.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        gd.bpfConEtiquetaVerticeInicial("Asuncion");




//        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("./src/aeropuertos_2.txt", "./src/conexiones_2.txt",
//                false, TGrafoDirigido.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        TCaminos todosLosCaminos = gd.todosLosCaminos("Buenos_Aires","Montevideo");
//
//        todosLosCaminos.imprimirCaminosConsolaYCostoTotal();
//
//
//        TCamino caminoCritico = todosLosCaminos.caminoCritico();
//        System.out.println("Camino crítico: " + caminoCritico.imprimirEtiquetas());
//        System.out.println("Costo total del camino crítico: " + caminoCritico.getCostoTotal());
//
//        todosLosCaminos.imprimirHolgurasConsola();


//        TVertice verticeB = new TVertice("B");
//        TVertice verticeD = new TVertice("D");
//        TVertice verticeE = new TVertice("E");
//        TVertice verticeA = new TVertice("A");
//        TVertice verticeC  = new TVertice("C");
//        TVertice verticeF  = new TVertice("F");
//        TVertice verticeG  = new TVertice("G");
//
//        TArista aristaBD = new TArista("B", "D", 0);
//        TArista aristaBE = new TArista("B", "E", 0);
//        TArista aristaBA = new TArista("B", "A", 0);
//        TArista aristaEC = new TArista("E", "C", 0);
//        TArista aristaCF = new TArista("C", "F", 0);
//        TArista aristaCG = new TArista("C", "G", 0);
//
//        Collection<TVertice> vertices = new ArrayList<>();
//        vertices.add(verticeA);
//        vertices.add(verticeB);
//        vertices.add(verticeC);
//        vertices.add(verticeD);
//        vertices.add(verticeE);
//        vertices.add(verticeF);
//        vertices.add(verticeG);
//
//        LinkedList<TArista> aristas = new LinkedList<>();
//        aristas.add(aristaBD);
//        aristas.add(aristaBE);
//        aristas.add(aristaBA);
//        aristas.add(aristaEC);
//        aristas.add(aristaCF);
//        aristas.add(aristaCG);
//
//        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//        Collection<TVertice> bosqueAbarcador = grafo.beaDesdeVerticeInicial("B");
//
//        for (TVertice vertice : bosqueAbarcador) {
//            System.out.println(vertice.getEtiqueta());
//        }


        //Kruskal UT8_PD2
//        TVertice verticeA = new TVertice("A");
//        TVertice verticeB = new TVertice("B");
//        TVertice verticeC = new TVertice("C");
//        TVertice verticeD = new TVertice("D");
//        TVertice verticeE  = new TVertice("E");
//
//        TArista aristaAB = new TArista("A", "B", 1);
//        TArista aristaAC = new TArista("A", "C", 5);
//        TArista aristaBC = new TArista("B", "C", 2);
//        TArista aristaBD = new TArista("B", "D", 4);
//        TArista aristaCD = new TArista("C", "D", 3);
//        TArista aristaCE = new TArista("C", "E", 6);
//        TArista aristaDE = new TArista("D", "E", 7);
//
//        Collection<TVertice> vertices = new ArrayList<>();
//        vertices.add(verticeA);
//        vertices.add(verticeB);
//        vertices.add(verticeC);
//        vertices.add(verticeD);
//        vertices.add(verticeE);
//
//        LinkedList<TArista> aristas = new LinkedList<>();
//        aristas.add(aristaAB);
//        aristas.add(aristaAC);
//        aristas.add(aristaBC);
//        aristas.add(aristaBD);
//        aristas.add(aristaCD);
//        aristas.add(aristaCE);
//        aristas.add(aristaDE);
//
//        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//
//        TGrafoNoDirigido arbolExpansionMinima = grafo.Kruskal();
//
//        System.out.println("Aristas del Árbol de Expansión Mínima:");
//        for (TArista arista : arbolExpansionMinima.getLasAristas()) {
//            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
//        }

        //Kruskal UT8_PD2

        // 1 2 Y 3
//        TVertice verticeA = new TVertice("A");
//        TVertice verticeB = new TVertice("B");
//        TVertice verticeC = new TVertice("C");
//        TVertice verticeD = new TVertice("D");
//        TVertice verticeE  = new TVertice("E");
//        TVertice verticeF  = new TVertice("F");
//
//        TArista aristaAB = new TArista("A", "B", 4);
//        TArista aristaAF = new TArista("A", "F", 2);
//        TArista aristaBC = new TArista("B", "C", 6);
//        TArista aristaBF = new TArista("B", "F", 3);
//        TArista aristaCD = new TArista("C", "D", 8);
//        TArista aristaCE = new TArista("C", "E", 5);
//        TArista aristaDE = new TArista("D", "E", 1);
//        TArista aristaEF = new TArista("E", "F", 7);
//
//        Collection<TVertice> vertices = new ArrayList<>();
//        vertices.add(verticeA);
//        vertices.add(verticeB);
//        vertices.add(verticeC);
//        vertices.add(verticeD);
//        vertices.add(verticeE);
//        vertices.add(verticeF);
//        LinkedList<TArista> aristas = new LinkedList<>();
//        aristas.add(aristaAB);
//        aristas.add(aristaAF);
//        aristas.add(aristaBC);
//        aristas.add(aristaBF);
//        aristas.add(aristaCD);
//        aristas.add(aristaCE);
//        aristas.add(aristaDE);
//        aristas.add(aristaEF);
//        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//
//        TGrafoNoDirigido arbolExpansionMinima = grafo.Kruskal();
//        TGrafoNoDirigido AAM = grafo.Prim();
//
//
//        System.out.println("Aristas del Árbol de Expansión Mínima KRUSKAL:");
//        for (TArista arista : arbolExpansionMinima.getLasAristas()) {
//            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
//        }
//
//        System.out.println("Aristas del Árbol de Expansión Mínima PRIM:");
//        for (TArista arista : AAM.getLasAristas()) {
//            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
//        }

        /*
            Estructuras de datos utilizadas para la implementación de Kruskal:

            TGrafoNoDirigido:

            Representa el grafo no dirigido.

            Contiene los vértices (Map<Comparable, TVertice> vertices) y las aristas (TAristas lasAristas).

            TAristas:

            Representa un conjunto de aristas.

            Se utiliza tanto para almacenar las aristas del grafo original (aristasSinOrdenar) como las aristas ordenadas por costo (aristasOrdenadas).

            TArista:

            Representa una arista del grafo con atributos como etiquetaOrigen, etiquetaDestino y costo.

            TVertice:

            Representa un vértice del grafo con atributos como etiqueta y métodos para la gestión de adyacentes.

            Tiempo de ejecución

            O(E(V+E))
         */

        /*
            5) Sí, se podrían realizsar modificaciónes para qué el algoritmo tuviera un orden de tiempo de ejecución de O(ElogE).

            6) El consumo de memoria es muy importante y un elemento a tener muy en cuenta si se trabaja con grafos grandes.



         */

//                //Ejercicio 2 UT8_PD4
//                TVertice verticeA = new TVertice("A");
//                TVertice verticeB = new TVertice("B");
//                TVertice verticeC = new TVertice("C");
//                TVertice verticeD = new TVertice("D");
//                TVertice verticeE  = new TVertice("E");
//                TVertice verticeF  = new TVertice("F");
//
//                TArista aristaAB = new TArista("A", "B", 4);
//                TArista aristaAF = new TArista("A", "F", 2);
//                TArista aristaBC = new TArista("B", "C", 6);
//                TArista aristaBF = new TArista("B", "F", 3);
//                TArista aristaCD = new TArista("C", "D", 8);
//                TArista aristaCE = new TArista("C", "E", 5);
//                TArista aristaDE = new TArista("D", "E", 1);
//                TArista aristaEF = new TArista("E", "F", 7);
//
//                Collection<TVertice> vertices = new ArrayList<>();
//                vertices.add(verticeA);
//                vertices.add(verticeB);
//                vertices.add(verticeC);
//                vertices.add(verticeD);
//                vertices.add(verticeE);
//                vertices.add(verticeF);
//                LinkedList<TArista> aristas = new LinkedList<>();
//                aristas.add(aristaAB);
//                aristas.add(aristaAF);
//                aristas.add(aristaBC);
//                aristas.add(aristaBF);
//                aristas.add(aristaCD);
//                aristas.add(aristaCE);
//                aristas.add(aristaDE);
//                aristas.add(aristaEF);
//                TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//                System.out.println(grafo.estanConectadosConEtiquetaVertices("A","B"));
//
//
//                //PEDIRLE AYUDA AL PROFE PARA ARREGLAR MÉTODO DE ESTÁNCONECTADOS PASANDOLE LOS VÉRTICES POR PARÁMETRO.



//        TGrafoRedElectrica gd = (TGrafoRedElectrica) UtilGrafos.cargarGrafo("./src/barrio.txt","./src/distancias.txt",
//                false,  TGrafoRedElectrica.class);
//
//        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
//
//        Double[][] matriz = UtilGrafos.obtenerMatrizCostos(gd.getVertices());
//        UtilGrafos.imprimirMatrizMejorado(matriz, gd.getVertices(), "Matriz");
//        Double[][] mfloyd = gd.floyd();
//        UtilGrafos.imprimirMatrizMejorado(mfloyd, gd.getVertices(), "Matriz luego de FLOYD");
//        for (int i = 0; i < etiquetasarray.length; i++) {
//            System.out.println("excentricidad de " + etiquetasarray[i] + " : " + gd.obtenerExcentricidad((Comparable) etiquetasarray[i]));
//        }
//        System.out.println();
//        System.out.println("Centro del grafo: " + gd.centroDelGrafo());
//
//        TAristas resultado = gd.mejorRedElectrica();
//
//
//        System.out.println("Resultado ");
//
//        double cantidadTotalCableado = 0;
//        for(TArista arista : resultado) {
//             cantidadTotalCableado += arista.getCosto();
//        }
//        System.out.println("Cantidad Total del cableado" + " " + cantidadTotalCableado);
//
//        List<String> lineas = new ArrayList<>();
//        lineas.add("Cantidad total cableado" + " " + cantidadTotalCableado);
//        for(TArista arista : resultado) {
//            String linea = arista.getEtiquetaOrigen() + " " + arista.getEtiquetaDestino() + " " + arista.getCosto();
//            System.out.println(linea);
//            lineas.add(linea);
//        }
//
//        String[] lineasArchivo = lineas.toArray(new String[0]);
//        ManejadorArchivosGenerico.escribirArchivo("./src/redelectrica.txt", lineasArchivo);


//
//        TGrafoNoDirigido grafo = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/vert2.txt","./src/ari2.txt",
//                false, TGrafoNoDirigido.class);
//
//        TGrafoNoDirigido arbolExpansionMinima = grafo.Kruskal();
//        TGrafoNoDirigido AAM = grafo.Prim();
//
//
//        System.out.println("Aristas del Árbol de Expansión Mínima KRUSKAL:");
//        for (TArista arista : arbolExpansionMinima.getLasAristas()) {
//            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
//        }
//
//        System.out.println("Aristas del Árbol de Expansión Mínima PRIM:");
//        for (TArista arista : AAM.getLasAristas()) {
//            System.out.println(arista.getEtiquetaOrigen() + " - " + arista.getEtiquetaDestino() + " : " + arista.getCosto());
//        }


        // LEER CUIDADOSAMENTE LA CONSIGNA DE ESTE TRABAJO, PUBLICADA EN LA TAREA PARCIAL2_PARTE3
        // LOS COMENTARIOS DEL PRESENTE ARCHIVO NO SUSTITUYEN LO INDICADO EN LA LETRA DE LA TAREA

//        TGrafoRedDatos redDatos = (TGrafoRedDatos) UtilGrafos.cargarGrafo("./src/servidores.txt","./src/enlaces.txt",
//                false, TGrafoRedDatos.class);
//
//        // cargar grafo con SERVIDORES y ENLACES
//        //redDatos = (TGrafoRedDatos)UtilGrafos.cargarGrafo...
//
//        String servidor1 = "BUF";
//        String servidor2 = "DFW";
//        LinkedList<TVertice> ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
//        escribirRutaEnArchivo("./src/rutas.txt", servidor1, servidor2, ruta);
//
//        servidor2 = "LAS";
//        ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
//        escribirRutaEnArchivo("./src/rutas.txt", servidor1, servidor2, ruta);
//
//        servidor2 = "MIA";
//        ruta = redDatos.rutaMenosSaltos(servidor1, servidor2);
//        escribirRutaEnArchivo("./src/rutas.txt", servidor1, servidor2, ruta);
//    }
//    private static void escribirRutaEnArchivo(String nombreArchivo, String servidor1, String servidor2, LinkedList<TVertice> ruta) {
//        if (ruta == null) {
//            System.out.println("No existe una ruta entre " + servidor1 + " y " + servidor2);
//            return;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Ruta desde ").append(servidor1).append(" hasta ").append(servidor2).append(":");
//        for (TVertice vertice : ruta) {
//            sb.append(" ").append(vertice.getEtiqueta());
//        }
//        sb.append("\n\n");
//
//        ManejadorArchivosGenerico.escribirArchivo(nombreArchivo, new String[]{sb.toString()});

//        //Ejercicio 2 UT8_PD4
//                TVertice verticeA = new TVertice("A");
//                TVertice verticeB = new TVertice("B");
//                TVertice verticeC = new TVertice("C");
//                TVertice verticeD = new TVertice("D");
//                TVertice verticeE  = new TVertice("E");
//                TVertice verticeF  = new TVertice("F");
//
//                TArista aristaAB = new TArista("A", "B", 4);
//                TArista aristaAF = new TArista("A", "F", 2);
//                TArista aristaBC = new TArista("B", "C", 6);
//                TArista aristaBF = new TArista("B", "F", 3);
//                TArista aristaCD = new TArista("C", "D", 8);
//                TArista aristaCE = new TArista("C", "E", 5);
//                TArista aristaDE = new TArista("D", "E", 1);
//                TArista aristaEF = new TArista("E", "F", 7);
//
//                Collection<TVertice> vertices = new ArrayList<>();
//                vertices.add(verticeA);
//                vertices.add(verticeB);
//                vertices.add(verticeC);
//                vertices.add(verticeD);
//                vertices.add(verticeE);
//                vertices.add(verticeF);
//                LinkedList<TArista> aristas = new LinkedList<>();
//                aristas.add(aristaAB);
//                aristas.add(aristaAF);
//                aristas.add(aristaBC);
//                aristas.add(aristaBF);
//                aristas.add(aristaCD);
//                aristas.add(aristaCE);
//                aristas.add(aristaDE);
//                aristas.add(aristaEF);
//                TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices, aristas);
//
//                System.out.println(grafo.estanConectadosConEtiquetaVertices("A","B"));
//                System.out.println(grafo.estanConectados(verticeA,verticeB));

        // 1 - Cargar el Grafo
        TGrafoRedDatos grafo = UtilGrafos.cargarGrafo("./src/dispositivos.txt", "./src/conexionesParcial2023.txt", false, TGrafoRedDatos.class);

        // 2 - Verificar que los componentes se encuentren conectados
        boolean conectados = grafo.conectados("CS10","CS60");
        boolean conectados1 = grafo.conectados("CS30","CS80");
        boolean conectados2 = grafo.conectados("CS80","CS90");
        System.out.println("Existe una conexión entre los nodos? CS10 - CS60" + " " + conectados);
        System.out.println("Existe una conexión entre los nodos? CS30 - CS80" + " " + conectados1);
        System.out.println("Existe una conexión entre los nodos? CS80 - CS90" + " " + conectados2);

        // 3 - Leer y cargar archivo mediciones.txt
//        TDato[] datos = PruebaGrafo.cargarMediciones("./src/main/mediciones.txt");
//
//        // 4 - Obtener dato de mayor medicion.
//        TMedidor medidor = new TMedidor();
//        TDato mayorMedicion = medidor.obtenerMayorMedicion(datos);

        // 5 - Emitir archivo de salida salida.txt
        // COMPLETAR CÓDIGO
        // ManejadorArchivosGenerico.escribirArchivo("src/main/java/salida.txt", vector con lineas del archivo);

        TClasificador clasificador = new TClasificador();

        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Vector original:");
        clasificador.imprimirVector(datos);
        System.out.println();

        // Prueba del método de Inserción
        int[] datosInsercion = datos.clone();
        clasificador.clasificar(datosInsercion, TClasificador.METODO_CLASIFICACION_INSERCION);
        System.out.println("Vector ordenado por Inserción:");
        clasificador.imprimirVector(datosInsercion);
        System.out.println();

        // Prueba del método de Shell
        int[] datosShell = datos.clone();
        clasificador.clasificar(datosShell, TClasificador.METODO_CLASIFICACION_SHELL);
        System.out.println("Vector ordenado por Shell:");
        clasificador.imprimirVector(datosShell);
        System.out.println();

        // Prueba del método de Burbuja
        int[] datosBurbuja = datos.clone();
        clasificador.clasificar(datosBurbuja, TClasificador.METODO_CLASIFICACION_BURBUJA);
        System.out.println("Vector ordenado por Burbuja:");
        clasificador.imprimirVector(datosBurbuja);
        System.out.println();

        // Prueba del método de Quicksort
        int[] datosQuickSort = datos.clone();
        clasificador.clasificar(datosQuickSort, TClasificador.METODO_CLASIFICACION_QUICKSORT);
        System.out.println("Vector ordenado por Quicksort:");
        clasificador.imprimirVector(datosQuickSort);
        System.out.println();

        // Prueba del método de HeapSort
        int[] datosHeapSort = datos.clone();
        clasificador.ordenarPorHeapSort(datosHeapSort);
        System.out.println("Vector ordenado por HeapSort:");
        clasificador.imprimirVector(datosHeapSort);
        System.out.println();

        // Verificación del orden ascendente
        System.out.println("Verificación de orden ascendente:");
        System.out.println("Inserción: " + clasificador.verificarOrdenAscendente(datosInsercion));
        System.out.println("Shell: " + clasificador.verificarOrdenAscendente(datosShell));
        System.out.println("Burbuja: " + clasificador.verificarOrdenAscendente(datosBurbuja));
        System.out.println("Quicksort: " + clasificador.verificarOrdenAscendente(datosQuickSort));
        System.out.println("HeapSort: " + clasificador.verificarOrdenAscendente(datosHeapSort));
    }
    private static TDato[] cargarMediciones(String rutaAlArchivo) {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(rutaAlArchivo, false);

        TDato[] mediciones = new TDato[lineas.length];
        for (int i = 0; i < lineas.length; i++) {
            String[] datos = lineas[i].split(",");
            mediciones[i] = new TDato(Double.parseDouble(datos[1]), Integer.parseInt(datos[0]));
        }

        return mediciones;
    }
}
